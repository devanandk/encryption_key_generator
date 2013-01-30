/*
 * LoginPortalAboutBox.java
 */

package loginportal;

import org.jdesktop.application.Action;

public class LoginPortalAboutBox extends javax.swing.JDialog {

    public LoginPortalAboutBox(java.awt.Frame parent) {
        super(parent);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
    }

    @Action public void closeAboutBox() {
        dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel appVendorLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(loginportal.LoginPortalApp.class).getContext().getResourceMap(LoginPortalAboutBox.class);
        setTitle(resourceMap.getString("title")); // NOI18N
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(loginportal.LoginPortalApp.class).getContext().getActionMap(LoginPortalAboutBox.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N

        appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
        appTitleLabel.setText(resourceMap.getString("Application.title")); // NOI18N
        appTitleLabel.setName("appTitleLabel"); // NOI18N

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setText(resourceMap.getString("versionLabel.text")); // NOI18N
        versionLabel.setName("versionLabel"); // NOI18N

        appVersionLabel.setText(resourceMap.getString("Application.version")); // NOI18N
        appVersionLabel.setName("appVersionLabel"); // NOI18N

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setText(resourceMap.getString("vendorLabel.text")); // NOI18N
        vendorLabel.setName("vendorLabel"); // NOI18N

        appVendorLabel.setText(resourceMap.getString("Application.vendor")); // NOI18N
        appVendorLabel.setName("appVendorLabel"); // NOI18N

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setText(resourceMap.getString("homepageLabel.text")); // NOI18N
        homepageLabel.setName("homepageLabel"); // NOI18N

        appHomepageLabel.setText(resourceMap.getString("Application.homepage")); // NOI18N
        appHomepageLabel.setName("appHomepageLabel"); // NOI18N

        appDescLabel.setText(resourceMap.getString("appDescLabel.text")); // NOI18N
        appDescLabel.setName("appDescLabel"); // NOI18N

        imageLabel.setIcon(resourceMap.getIcon("imageLabel.icon")); // NOI18N
        imageLabel.setName("imageLabel"); // NOI18N

        homepageLabel1.setFont(homepageLabel1.getFont().deriveFont(homepageLabel1.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel1.setText(resourceMap.getString("homepageLabel1.text")); // NOI18N
        homepageLabel1.setName("homepageLabel1"); // NOI18N

        appHomepageLabel1.setText(resourceMap.getString("appHomepageLabel1.text")); // NOI18N
        appHomepageLabel1.setName("appHomepageLabel1"); // NOI18N

        appHomepageLabel2.setText(resourceMap.getString("appHomepageLabel2.text")); // NOI18N
        appHomepageLabel2.setName("appHomepageLabel2"); // NOI18N

        appHomepageLabel3.setText(resourceMap.getString("appHomepageLabel3.text")); // NOI18N
        appHomepageLabel3.setName("appHomepageLabel3"); // NOI18N

        appHomepageLabel4.setText(resourceMap.getString("appHomepageLabel4.text")); // NOI18N
        appHomepageLabel4.setName("appHomepageLabel4"); // NOI18N

        appHomepageLabel5.setText(resourceMap.getString("appHomepageLabel5.text")); // NOI18N
        appHomepageLabel5.setName("appHomepageLabel5"); // NOI18N

        appHomepageLabel6.setText(resourceMap.getString("appHomepageLabel6.text")); // NOI18N
        appHomepageLabel6.setName("appHomepageLabel6"); // NOI18N

        homepageLabel2.setFont(homepageLabel2.getFont().deriveFont(homepageLabel2.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel2.setText(resourceMap.getString("homepageLabel2.text")); // NOI18N
        homepageLabel2.setName("homepageLabel2"); // NOI18N

        appVendorLabel1.setText(resourceMap.getString("appVendorLabel1.text")); // NOI18N
        appVendorLabel1.setName("appVendorLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appTitleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homepageLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(appHomepageLabel6)
                                    .addComponent(appHomepageLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(versionLabel)
                                    .addComponent(vendorLabel)
                                    .addComponent(homepageLabel)
                                    .addComponent(homepageLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(appVendorLabel1)
                                    .addComponent(appHomepageLabel2)
                                    .addComponent(appHomepageLabel1)
                                    .addComponent(appHomepageLabel3)
                                    .addComponent(appHomepageLabel4)
                                    .addComponent(appVersionLabel)
                                    .addComponent(appVendorLabel)
                                    .addComponent(appHomepageLabel)))
                            .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(appTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(versionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homepageLabel)
                            .addComponent(appVendorLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appVersionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appVendorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appHomepageLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homepageLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appHomepageLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appHomepageLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appHomepageLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appHomepageLabel4)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appHomepageLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appHomepageLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homepageLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap())
            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    // End of variables declaration//GEN-END:variables
    
}