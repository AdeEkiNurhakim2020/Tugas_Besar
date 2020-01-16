/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dignote;

/**
 *
 * @author Ade Eki Nurhakim
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atasPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        txtMenuUtamaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sampingPanel = new javax.swing.JPanel();
        btnkalkulator = new javax.swing.JButton();
        btngame = new javax.swing.JButton();
        bawahPanel = new javax.swing.JPanel();
        txtCatatanLabel = new javax.swing.JLabel();
        txtWorkLabel = new javax.swing.JLabel();
        btncatatan = new javax.swing.JButton();
        btnwork = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuUtama");
        setBackground(new java.awt.Color(255, 255, 255));

        atasPanel.setBackground(new java.awt.Color(0, 0, 255));

        txtMenuUtamaLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        txtMenuUtamaLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuUtamaLabel.setText("Menu Utama");

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_logo.png")); // NOI18N

        javax.swing.GroupLayout atasPanelLayout = new javax.swing.GroupLayout(atasPanel);
        atasPanel.setLayout(atasPanelLayout);
        atasPanelLayout.setHorizontalGroup(
            atasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtMenuUtamaLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        atasPanelLayout.setVerticalGroup(
            atasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atasPanelLayout.createSequentialGroup()
                .addGroup(atasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(atasPanelLayout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(28, 28, 28)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(atasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMenuUtamaLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sampingPanel.setBackground(new java.awt.Color(0, 0, 255));
        sampingPanel.setForeground(new java.awt.Color(0, 0, 255));

        btnkalkulator.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_kalkulator.png")); // NOI18N
        btnkalkulator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkalkulatorActionPerformed(evt);
            }
        });

        btngame.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_game.png")); // NOI18N

        javax.swing.GroupLayout sampingPanelLayout = new javax.swing.GroupLayout(sampingPanel);
        sampingPanel.setLayout(sampingPanelLayout);
        sampingPanelLayout.setHorizontalGroup(
            sampingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sampingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sampingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        sampingPanelLayout.setVerticalGroup(
            sampingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sampingPanelLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnkalkulator, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btngame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        bawahPanel.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout bawahPanelLayout = new javax.swing.GroupLayout(bawahPanel);
        bawahPanel.setLayout(bawahPanelLayout);
        bawahPanelLayout.setHorizontalGroup(
            bawahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bawahPanelLayout.setVerticalGroup(
            bawahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        txtCatatanLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        txtCatatanLabel.setForeground(new java.awt.Color(0, 0, 255));
        txtCatatanLabel.setText("Catatan");

        txtWorkLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        txtWorkLabel.setForeground(new java.awt.Color(255, 255, 51));
        txtWorkLabel.setText("Pekerjaan");

        btncatatan.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_note.png")); // NOI18N
        btncatatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncatatanActionPerformed(evt);
            }
        });

        btnwork.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_work.png")); // NOI18N
        btnwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bawahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sampingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncatatan)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtCatatanLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnwork)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtWorkLabel)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(atasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sampingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnwork)
                            .addComponent(btncatatan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCatatanLabel)
                            .addComponent(txtWorkLabel))))
                .addGap(13, 13, 13)
                .addComponent(bawahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkalkulatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkalkulatorActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Kalkulator().setVisible(true);
    }//GEN-LAST:event_btnkalkulatorActionPerformed

    private void btncatatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncatatanActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Notepad().setVisible(true);
    }//GEN-LAST:event_btncatatanActionPerformed

    private void btnworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnworkActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnworkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atasPanel;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JButton btncatatan;
    private javax.swing.JButton btngame;
    private javax.swing.JButton btnkalkulator;
    private javax.swing.JButton btnwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel sampingPanel;
    private javax.swing.JLabel txtCatatanLabel;
    private javax.swing.JLabel txtMenuUtamaLabel;
    private javax.swing.JLabel txtWorkLabel;
    // End of variables declaration//GEN-END:variables
}
