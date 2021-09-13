
package HRT;

public class EvidencijaZaposlenika extends javax.swing.JFrame {

    public EvidencijaZaposlenika() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        unospodataka = new javax.swing.JButton();
        zaposlenici = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Evidencija zaposlenika");
        jLabel1.setAlignmentX(0.5F);

        unospodataka.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unospodataka.setText("UNOS PODATAKA");
        unospodataka.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        unospodataka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unospodatakaActionPerformed(evt);
            }
        });

        zaposlenici.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zaposlenici.setText("ZAPOSLENICI");
        zaposlenici.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zaposlenici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zaposleniciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zaposlenici, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unospodataka, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(unospodataka)
                .addGap(59, 59, 59)
                .addComponent(zaposlenici)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unospodatakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unospodatakaActionPerformed

        new UnosPodataka().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_unospodatakaActionPerformed

    private void zaposleniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zaposleniciActionPerformed
        new Zaposlenici().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_zaposleniciActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvidencijaZaposlenika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton unospodataka;
    private javax.swing.JButton zaposlenici;
    // End of variables declaration//GEN-END:variables
}
