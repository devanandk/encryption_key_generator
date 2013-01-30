/*
 * LoginPortalView.java
 */

package loginportal;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.sql.Statement; 
import java.util.prefs.*;


/**
 * The application's main frame.
 */
public class LoginPortalView extends FrameView {

    Connection connection = null;  
     ResultSet resultSet = null;  
     Statement statement = null;
     PreparedStatement insertStatement=null;
     Preferences algorithmPreferences;
     int cipherbaseToUse;
     int cTableToUse;
     int cTableIndexToUse;

    public LoginPortalView(SingleFrameApplication app) {
        super(app);

        initComponents();
        
        // status bar initialization - message timeout, idle icon and busy animation, etc
        //ResourceMap resourceMap = getResourceMap();
        
        try 
     {  
         Class.forName("org.sqlite.JDBC");  
         connection = DriverManager.getConnection("jdbc:sqlite:userinfodb.db");  
         statement = connection.createStatement();  
         
     } 
     catch (Exception e) 
     {  
         System.out.println(e.getMessage());
     }
     
        
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = LoginPortalApp.getApplication().getMainFrame();
            aboutBox = new LoginPortalAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        LoginPortalApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        UserNameTextBox = new javax.swing.JTextField();
        PasswordTextBox = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        ClearDataMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();

        mainPanel.setName("mainPanel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(loginportal.LoginPortalApp.class).getContext().getResourceMap(LoginPortalView.class);
        PasswordLabel.setText(resourceMap.getString("PasswordLabel.text")); // NOI18N
        PasswordLabel.setName("PasswordLabel"); // NOI18N

        UserNameLabel.setText(resourceMap.getString("UserNameLabel.text")); // NOI18N
        UserNameLabel.setName("UserNameLabel"); // NOI18N

        UserNameTextBox.setText(resourceMap.getString("UserNameTextBox.text")); // NOI18N
        UserNameTextBox.setToolTipText(resourceMap.getString("UserNameTextBox.toolTipText")); // NOI18N
        UserNameTextBox.setName("UserNameTextBox"); // NOI18N

        PasswordTextBox.setText(resourceMap.getString("PasswordTextBox.text")); // NOI18N
        PasswordTextBox.setName("PasswordTextBox"); // NOI18N

        LoginButton.setText(resourceMap.getString("LoginButton.text")); // NOI18N
        LoginButton.setName("LoginButton"); // NOI18N
        LoginButton.setPreferredSize(new java.awt.Dimension(51, 23));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ResetButton.setText(resourceMap.getString("ResetButton.text")); // NOI18N
        ResetButton.setName("ResetButton"); // NOI18N
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        infoLabel.setText(resourceMap.getString("infoLabel.text")); // NOI18N
        infoLabel.setName("infoLabel"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(PasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(UserNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLabel))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(infoLabel)
                .addContainerGap())
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        ClearDataMenuItem.setText(resourceMap.getString("ClearDataMenuItem.text")); // NOI18N
        ClearDataMenuItem.setName("ClearDataMenuItem"); // NOI18N
        ClearDataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearDataMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(ClearDataMenuItem);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(loginportal.LoginPortalApp.class).getContext().getActionMap(LoginPortalView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String newKey ="";
        String oldKey ="";
        String userid ="";
        int userNameFlag = 0;
        int authenticateLogin=0;
        String selectAllUserInfo = " select userid, username, password from userinfo where"
                + " username ='"+UserNameTextBox.getText().toString()+"'";
        String selectAllKeysForCurrentUser = "select password from previouskeylist where"
                + "userid = ("+ "select userid from userinfo where username = "+UserNameTextBox.getText().toString()+")";
        String insertNewKey = "insert into previouskeylist values (?,?)";
        String updateUserinfoTable = "update table userinfo set password = ? where userid =?";
        
        EncryptionKeyGenerator keyGenerator;
        loadPreferences();
        keyGenerator = new EncryptionKeyGenerator(cipherbaseToUse, cTableToUse, cTableIndexToUse);
        
        if(UserNameTextBox.getText().equalsIgnoreCase(""))
        {
            infoLabel.setText("Username field cannot be left blank");
        }
        else if(PasswordTextBox.getText().equalsIgnoreCase(""))
        {
            infoLabel.setText("Password field cannot be left blank");
        }
        else
        {
        try
        {
            resultSet = statement.executeQuery(selectAllUserInfo);
          userNameFlag = 1;
            while(resultSet.next())
            { 
                
                if(resultSet.getString("username").equals(UserNameTextBox.getText().toString()))
                { 
                    userNameFlag=0;
                    if(resultSet.getString("password").equals(PasswordTextBox.getText().toString()))
                    {
                        infoLabel.setText("Username \""+resultSet.getString("username")+"\" exists in database \""
                                +PasswordTextBox.getText().toString()+"\" is a valid password");
                        oldKey = PasswordTextBox.getText().toString();
                        userid = resultSet.getString("userid");
                        authenticateLogin = 1;
                        break;
                    }
                    else
                    {
                        infoLabel.setText("Please check the Password you have entered");
                        break;
                    }
                }
                else
                {
                    userNameFlag=1;
                }
                
                

            }
           
            if(userNameFlag == 1)
            {
                
                infoLabel.setText("Please check the username you have entered");
               
            }
            else if(authenticateLogin==1)
            {
                newKey = keyGenerator.getNewKey(oldKey);
                resultSet = statement.executeQuery("select password from previouskeylist where userid = "+userid);
                while(resultSet.next())
                {
                    if(resultSet.getString("password").equals(newKey))
                    {
                        newKey= keyGenerator.getNewKey(newKey);
                    }
                }
                insertStatement = connection.prepareStatement(insertNewKey);
                insertStatement.setString(1, userid);
                insertStatement.setString(2, newKey);
                insertStatement.addBatch();
                connection.setAutoCommit(false);
                insertStatement.executeBatch();
                connection.setAutoCommit(true);
                
                insertStatement = connection.prepareStatement("update userinfo set password ='"+ newKey+"'"
                        + " where userid ="+ userid);
                insertStatement.execute();
                
                savePreferences(EncryptionKeyGenerator.getAlgorithmSettings());
                
                infoLabel.setText("You have successfully logged in");
               
                
                 JFrame loggedIn; 
            JFrame mainFrame = LoginPortalApp.getApplication().getMainFrame();
            loggedIn = new LoggedInView();
            loggedIn.setLocationRelativeTo(mainFrame);
     
        LoginPortalApp.getApplication().show(loggedIn);
        mainFrame.dispose();
                }  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
}//GEN-LAST:event_LoginButtonActionPerformed

    private void loadPreferences()
    {
        algorithmPreferences =  Preferences.userNodeForPackage(this.getClass());
        cipherbaseToUse = algorithmPreferences.getInt("cipherbaseToUse", 1);
        cTableToUse = algorithmPreferences.getInt("cTableToUse", 1);
        cTableIndexToUse = algorithmPreferences.getInt("cTableIndexToUse",0);
    }
    
    private void savePreferences(int[] settings)
    {
        algorithmPreferences = Preferences.userNodeForPackage(this.getClass());
        
        algorithmPreferences.putInt("cipherbaseToUse", settings[0]);
        algorithmPreferences.putInt("cTableToUse", settings[1]);
        algorithmPreferences.putInt("cTableIndexToUse", settings[2]);
    }
    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ClearDataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearDataMenuItemActionPerformed
        // TODO add your handling code here:
        
        String resetUserPassword = "update userinfo set password = 'abcdefgh' where username = 'administrator'";
        String resetPreviousKeys = "delete from previouskeylist where userid = 101";
        algorithmPreferences = Preferences.userNodeForPackage(this.getClass());
        
        algorithmPreferences.putInt("cipherbaseToUse", 1);
        algorithmPreferences.putInt("cTableToUse", 1);
        algorithmPreferences.putInt("cTableIndexToUse", 0);
        try
        {
            statement.executeUpdate(resetUserPassword);
            statement.executeUpdate(resetPreviousKeys);
            infoLabel.setText("User Data cleared...");
        }
        catch(Exception e)
        {
            infoLabel.setText(e.getMessage());
        }
    }//GEN-LAST:event_ClearDataMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ClearDataMenuItem;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextBox;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JTextField UserNameTextBox;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    private JDialog aboutBox;
}
