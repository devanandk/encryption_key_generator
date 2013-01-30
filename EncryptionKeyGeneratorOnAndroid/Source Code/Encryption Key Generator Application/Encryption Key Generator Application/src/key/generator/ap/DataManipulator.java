package key.generator.ap;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class DataManipulator {
	private static final  String DATABASE_NAME = "EncryptionKeyGenerator.db";
	private static final int DATABASE_VERSION = 1;
	static final String TABLE_NAME = "PreviousKeyList";
	private static Context context;
	static SQLiteDatabase db;

	private SQLiteStatement insertStmt;
	
    private static final String INSERT = "insert into "
		+ TABLE_NAME + " (keyValue) values (?)";

	public DataManipulator(Context context) {
		DataManipulator.context = context;
		OpenHelper openHelper = new OpenHelper(DataManipulator.context);
		DataManipulator.db = openHelper.getWritableDatabase();
		this.insertStmt = DataManipulator.db.compileStatement(INSERT);

	}
	public long insert(String keyValue) {
		this.insertStmt.bindString(1, keyValue);
		return this.insertStmt.executeInsert();
	}

	public void deleteAll() {
		db.delete(TABLE_NAME, null, null);
	}
	
	public String getLastEntry()
	{
		Cursor cursor = db.query(TABLE_NAME, new String[] {"keyID","KeyValue"}, 
						null, null, null, null, "keyID desc");
		
		if(cursor.getCount()==0) 
			return "abcdefgh";
		cursor.moveToFirst();
		String val = cursor.getString(1);
		Log.d("DataManipulator", "Last key successfully retrieved");
		cursor.close();
		return val;
	}

	public boolean CheckIfExists(String newKey)
	{

		List<String[]> list = new ArrayList<String[]>();
	
		Cursor cursor = db.query(TABLE_NAME, new String[] {"keyValue"},
				null, null, null, null, null); 
		if(cursor.getCount()==0)
			return false;
		int x=0;
		if (cursor.moveToFirst()) {
			do {
				String[] b1=new String[]{cursor.getString(0)};
				list.add(b1);

				x=x+1;
			} while (cursor.moveToNext());
		}
		if (cursor != null && !cursor.isClosed()) {
			cursor.close();
		} 
		cursor.close();
		if(list.contains(newKey))
			return true;
		else
			return false;
	}


	public void delete(int rowId) {
		db.delete(TABLE_NAME, null, null); 
	}



	private static class OpenHelper extends SQLiteOpenHelper {

		OpenHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE " + TABLE_NAME + " (keyID INTEGER PRIMARY KEY AUTOINCREMENT, keyValue TEXT)");
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
			onCreate(db);
		}
	}



}
