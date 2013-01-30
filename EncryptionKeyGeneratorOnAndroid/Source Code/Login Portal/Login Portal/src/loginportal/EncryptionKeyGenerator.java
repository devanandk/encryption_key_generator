
package loginportal;

/**
 * @author Devanand
 *
 *	Class Name	:   EncryptionKeyGenerator
  
 *	Data Members	:
 *						* cipherBaseToUse 	: int - private, static
 *						* cTableToUse		: int - private, static
 *						* cTableIndex		: int - private, static
 *						* CTABLECOUNT		: int - private, static, final
 *						* FIRSTCTABLENO		: int - private, static, final
 *						* MAXCTABLEINDEX	: int - private, static, final
 *						* MINCTABLEINDEX	: int - private, static, final
 *						* CIPHERBASE1		: int - private, static, final
 *						* CIPHERBASE2		: int - private, static, final
 *						* MAXCIPHERBASEINDEX: int - private, static, final
 *						* cTable1			: int[] - private
 *						* cTable2			: int[] - private
 *						* cTable3			: int[] - private
 *						* cTable4			: int[] - private
 *						* cTable5			: int[] - private
 *						* cipherBase1		: char[] - private, static
 *						* cipherBase2		: char[] - private, static
 *
 *	Member Methods	:
 *						* getAlgorithmSettings()	: int[] - public, static
 *						* generate(String)			: String - private
 *						* getcTableindex()			: int - private
 *						* getIntVal(char)			: int - private
 *						* getCharVal(int)			: char - private
 *						* getNewKey(String)			: String - public
 *
 *	Description		:
 *	The EncryptionKeyGenerator class implements the core functionality of the encryption key generator application.
 *	It consists of all the methods and data members required to generate new the encryption key. The class uses an
 *	additive cipher algorithm that reads and input string (usually the previously generated key) and performs the
 *	key generation process. The general operation is given below:
 *	-------------------------------------------------------------
 *	Key Generation Algorithm
 *	-------------------------------------------------------------
 *	for each character in oldKey
 *	do
 *		intValue = getIntVal(character)
 *		intValue = intValue + getcTableIndex();
 *		if intValue > MAXCIPHERBASEINDEX
 *			intValue = intValue % MAXCIPHERBASEINDEX+1
 *		charValue = getCharVal(intValue)
 *		append charValue to NewKey
 *	done
 *	return NewKey
 *	-------------------------------------------------------------
 *	In the above algorithm
 *
 *	getIntVal()		- returns the position of the input character from cipherBase1[]
 *	getCharVal()	- returns the character at position intVal from cipherBase2[]
 *	
 */

public class EncryptionKeyGenerator {
    
		// cipherBaseToUse 	: int - private variable that stores the cipherBase number to be used next
		// cTableToUser 	: int - private variable that stores the current cTable to be Used
		// cTableIndex 		: int - private variable that stores the next index from the current cTable to be used
		//
		//--- 	These variables have to be initialized before running the key generation algorithm using the
		//	   	constructor for the class.
    private static int cipherBaseToUse=1;
    private static int cTableToUse=1;
    private static int cTableIndex=0;
    
    	// CTABLECOUNT			: int - final variable storing the number of cTables being used by the class
    	// FIRSTCTABLENO		: int - final variable storing the first cTable number. The value is set to 1
    	// MAXCTABLEINDEX		: int - final variable storing the total number of elements per cTable. This should be
    	//								increased to reflect the total number of variables in the array if the cTables
    	//								are modified.
    	// CIPHERBASE1			: int - final variable to represent the first CipherBase (cipherBase1[])
    	// CIPHERBASE2			: int - final variable to represent the second CipherBase (cipherBase2[])
    	// MAXCIPHERBASEINDEX	: int - final variable storing the total number of variables in the cipherBases
    	//								The value of this variable must be updated if the variables in the cipherBases
    	//								are modified.
    	//
    private static final int CTABLECOUNT = 5;
    private static final int FIRSTCTABLENO = 1;
    private static final int MAXCTABLEINDEX = 7;
    private static final int MINCTABLEINDEX = 0;
    private static final int CIPHERBASE1 = 1;
    private static final int CIPHERBASE2 = 2;
    private static final int MAXCIPHERBASEINDEX = 61;
        
    	// cTable1, cTable2, cTable3, cTable4, cTable5
    	// Type		: int[] - private
    	//
    	//---	These integer arrays are used to store random integer values that are used to perform the addition
    	//		operation during key generation. The value to be used is selected in sequence from the first index
    	//		to the last index of each cTable in order. This is done by the getcTableindex() method.
    	//
private int[] cTable1 = {13,     27,     35,     1,     47,     29,     60,     45};

private int[] cTable2 = {54,     33,     4,     37,     17,     11,     7,     21};

private int[] cTable3 = {30,     5,     42,     51,     6,     38,     19,     55};

private int[] cTable4 = {21,     25,     15,     31,     23,     28,     46,     50};

private int[] cTable5 = {2,     48,     39,     8,     61,     32,     3,     9};

		// cipherBase1, cipherBase2
		// Type		: char[] - private, static
		//
		//---	
		//	1.	The cipherBases are used by the key generation algorithm to get the integer value for each character
		//		of the input for performing addition with a cTable value. This operation is done by the getIntVal() method
		//
		//	2.	The second use for the cipherBases is to select a character value that will be appended to the new key
		//		using the integer value produced as output by the addition process as an index into the cipherBase. 
		//		This process is done by the getCharVal() method.
		//
private static char[] cipherBase1={
'n','O','p','Q','r','S','t','U','v','W','x','Y','z',
'A','b','C','d','E','f','G','h','I','j','K','l','M',
'N','o','P','q','R','s','T','u','V','w','X','y','Z',
'a','B','c','D','e','F','g','H','i','J','k','L','m',
'1','2','3','4','5','6','7','8','9','0'};

    private static char[] cipherBase2={
'a','b','c','d','e','f','g','h','i','j','k','l','m',
'A','B','C','D','E','F','G','H','I','J','K','L','M',
'n','o','p','q','r','s','t','u','v','w','x','y','z',
'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
'0','1','2','3','4','5','6','7','8','9'};

    //---	Parameterized constructor to initialize cipherBaseToUse, cTableToUse and cTableIndex
public EncryptionKeyGenerator(int CBtoUse, int CTtoUse, int CTindex)
   {
	 cipherBaseToUse = CBtoUse;
	 cTableToUse = CTtoUse;
	 cTableIndex = CTindex;
    } // End of constructor

	//---	getAlgorithmSettings() method returns the current values of cipherBaseToUse, cTableToUse and cTableIndex
	//		to the calling method. The method is used by the keyDisplayActivity to read the current settings and store
	//		them in the SharedPreferences. The settings is returned as an integer array of size 3
public static int[] getAlgorithmSettings()
{
	int[] Settings = new int[3];
	Settings[0] = cipherBaseToUse;
	Settings[1] = cTableToUse;
	Settings[2] = cTableIndex;
	return Settings;
} // End of getAlgorithmSettings() method

	//---	generate(String) method is the method that generates the new encryption key. The key generation algorithm
	//		defined above is implemented in this method. It returns a string containing the newly generated key as output.
private String generate(String oldKey)
{
       Character currentCharacter;	// used to store the current character being read
       String newKey="";			// used to store the new key being generated
       int currentValue;			// used to store the integer value for the current character for processing
       
       for(int currentIndex=0;currentIndex<oldKey.length();currentIndex++)	//	for each character(denoted by
    	   																	//	currentIndex) in oldKey
       {
           
           currentCharacter = oldKey.charAt(currentIndex);			// reading next character from old key
           
           currentValue = getIntVal(currentCharacter);				// getting integer equivalent of current character
           															// from cipherBase1 using getIntVal() method
           
           currentValue = currentValue + getcTableindex();			// adding retrieved integer value with next variable
           															// from cTable using getcTableindex() method

           if(currentValue > MAXCIPHERBASEINDEX)					// checking if result of addition does not exceed
           { 														// the MAXCIPHERBASEINDEX	
               currentValue = currentValue % MAXCIPHERBASEINDEX+1;	// if so, perform modulus to bring value within limit
           }														// the "+1" is done since the index starts from 0

           currentCharacter = getCharVal(currentValue);				// reading the character equivalent of the modified
           															// integer value from cipherBase2. This is done using
           															// the getCharVal() method

           newKey = newKey.concat(currentCharacter.toString());		// Appending the newly obtained character to the new key

       } // end of for loop
       
   return newKey; // return the newly generated key to the calling function
}	// end of generate() method

//--- getcTableindex() method is used to get the next value from the current cTable
private int getcTableindex()
{
	cTableIndex++;
	cTableToUse++;

if(cTableIndex > MAXCTABLEINDEX) 	// Check if the cTableIndex value exceeds maximum index value
{
cTableIndex =MINCTABLEINDEX;	 	// Set index to minimum cTable index value
}


if(cTableToUse > CTABLECOUNT)		// Check if the cTable number exceeds total number of cTables
{
cTableToUse = FIRSTCTABLENO;		// Set cTable to first one
}
switch(cTableToUse)					// return value from current index of current cTable in use
{
case 1: return cTable1[cTableIndex];

case 2: return cTable2[cTableIndex];

case 3: return cTable3[cTableIndex];

case 4: return cTable4[cTableIndex];

case 5: return cTable5[cTableIndex];
}
return 0;							// return 0 as default if switch case does not return value
} // End of getcTableindex() method


//--- 	getIntVal() method is used to get the integer index of the input character from
//		the current cipherBase to use
private int getIntVal(char character)
   {
       int charPositionInCipherbase=1;	// Variable used to find the index value from cipherBase
    if(cipherBaseToUse == CIPHERBASE1)	// if cipherBaseToUse is cipherBase1 do the following
    {     
    	cipherBaseToUse = CIPHERBASE2;	// update cipherBaseToUse
       for(char letter: cipherBase1)	// enhanced for loop - Iterate through all letters in cipherBase1
       {
           if(letter == character)		// If letter is equal to input character then
               return charPositionInCipherbase;	// Return current character index value
           else									// otherwise
               charPositionInCipherbase++;		// increment current index count
       }
       return 0;						//	if no value is returned, return 0 as default
    }
else									// if cipherBaseToUse is cipherBase2, do the following
{
cipherBaseToUse = CIPHERBASE1;			// update cipherBaseToUse
for(char letter: cipherBase2)			// enhanced for loop - Iterate through all letters in cipherBase2
       {							
           if(letter == character)		// if letter is equal to input character then
               return charPositionInCipherbase; // return current character index value
           else									// Otherwise
               charPositionInCipherbase++;		// increment current index count
       }
       return 0;						// if no value is returned, return 0 as default
}
   } // End of getIntVal() method



//---	getCharVal() method returns the character equivalent of the input integer
//		variable from the cipherBase. The cipherBase is chosen on the basis of the
//		current value of cipherBaseToUse variable.
private char getCharVal(int intValue)
{
if(cipherBaseToUse == CIPHERBASE1)	// if cipherBaseToUse is CIPHERBASE1, then
{     
	return cipherBase1[intValue];	// return character at index intValue from cipherBase1
}
else								// otherwise
{
return cipherBase2[intValue];		// return character at index intValue from cipherBase2
       }
} // End of getCharVal() method



//---	getNewKey() method calls the generate() method to produce a new encryption key
//		and returns it to the calling method as a string variable
   public String getNewKey(String prevKey)	// prevKey reads the input string to pass to the generate() method
   {
      return generate(prevKey);				// call to generate() method - returns newly generated key
   }	// End of getNewKey() method
   
}	// End of EncryptionKeyGenerator class
