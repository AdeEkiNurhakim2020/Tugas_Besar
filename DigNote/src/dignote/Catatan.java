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
public class Catatan extends javax.swing.JFrame {

    /**
     * Creates new form Catatan
     */
    public Catatan() {
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
        sampingPanel = new javax.swing.JPanel();
        g_kalkulatorLabel = new javax.swing.JLabel();
        g_gameLabel = new javax.swing.JLabel();
        txtKalkulatorLabel = new javax.swing.JLabel();
        txtGameLabel = new javax.swing.JLabel();
        bawahPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atasPanel.setBackground(new java.awt.Color(0, 0, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ade Eki Nurhakim\\Pictures\\Untitled-2.png")); // NOI18N

        txtMenuUtamaLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        txtMenuUtamaLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtMenuUtamaLabel.setText("Catatan");

        javax.swing.GroupLayout atasPanelLayout = new javax.swing.GroupLayout(atasPanel);
        atasPanel.setLayout(atasPanelLayout);
        atasPanelLayout.setHorizontalGroup(
            atasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addGap(152, 152, 152)
                .addComponent(txtMenuUtamaLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        atasPanelLayout.setVerticalGroup(
            atasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atasPanelLayout.createSequentialGroup()
                .addComponent(logoLabel)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(atasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMenuUtamaLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sampingPanel.setBackground(new java.awt.Color(0, 0, 255));
        sampingPanel.setForeground(new java.awt.Color(0, 0, 255));

        g_kalkulatorLabel.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_kalkulator.png")); // NOI18N

        g_gameLabel.setIcon(new javax.swing.ImageIcon("E:\\Tugas Besar\\Bahan\\icon_game.png")); // NOI18N

        txtKalkulatorLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        txtKalkulatorLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtKalkulatorLabel.setText("Kalkulator");

        txtGameLabel.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        txtGameLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtGameLabel.setText("Game");

        javax.swing.GroupLayout sampingPanelLayout = new javax.swing.GroupLayout(sampingPanel);
        sampingPanel.setLayout(sampingPanelLayout);
        sampingPanelLayout.setHorizontalGroup(
            sampingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtKalkulatorLabel)
            .addGroup(sampingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sampingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g_kalkulatorLabel)
                    .addComponent(g_gameLabel)
                    .addComponent(txtGameLabel)))
        );
        sampingPanelLayout.setVerticalGroup(
            sampingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sampingPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(g_kalkulatorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKalkulatorLabel)
                .addGap(18, 18, 18)
                .addComponent(g_gameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGameLabel)
                .addContainerGap(88, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bawahPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sampingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(atasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sampingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bawahPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atasPanel;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JLabel g_gameLabel;
    private javax.swing.JLabel g_gameLabel1;
    private javax.swing.JLabel g_kalkulatorLabel;
    private javax.swing.JLabel g_kalkulatorLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel sampingPanel;
    private javax.swing.JPanel sampingPanel1;
    private javax.swing.JLabel txtGameLabel;
    private javax.swing.JLabel txtGameLabel1;
    private javax.swing.JLabel txtKalkulatorLabel;
    private javax.swing.JLabel txtKalkulatorLabel1;
    private javax.swing.JLabel txtMenuUtamaLabel;
    // End of variables declaration//GEN-END:variables
}
