/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRT;

import java.awt.Toolkit;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lukab
 */
public class UnosPodataka extends javax.swing.JFrame {

    /**
     * Creates new form UnosPodataka
     */
    public UnosPodataka() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radnomjesto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ime = new javax.swing.JTextField();
        prezime = new javax.swing.JTextField();
        radnisati = new javax.swing.JTextField();
        provjeri = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        noviunos = new javax.swing.JButton();
        spremi = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Unos podataka");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ime:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Prezime:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Radni sati:");

        radnomjesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radnomjesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Snimatelj", "Voditelj", "Novinar", "Administrator" }));
        radnomjesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radnomjestoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Radno mjesto:");

        ime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imeActionPerformed(evt);
            }
        });

        prezime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prezimeActionPerformed(evt);
            }
        });

        radnisati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radnisatiActionPerformed(evt);
            }
        });

        provjeri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        provjeri.setText("Provjeri unos");
        provjeri.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        provjeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provjeriActionPerformed(evt);
            }
        });

        back1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        back1.setText("<");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        noviunos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noviunos.setText("Novi unos");
        noviunos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        noviunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noviunosActionPerformed(evt);
            }
        });

        spremi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spremi.setText("Spremi");
        spremi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spremi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spremiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(prezime)
                                    .addComponent(radnomjesto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ime, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radnisati, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(provjeri, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(spremi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(noviunos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(radnisati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radnomjesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(provjeri)
                                .addComponent(noviunos)
                                .addComponent(spremi))
                            .addComponent(jLabel6))))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        new EvidencijaZaposlenika().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back1ActionPerformed

    private void imeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imeActionPerformed

    private void provjeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provjeriActionPerformed

        if (ime.getText().equals("") || prezime.getText().equals("") || radnisati.getText().equals("") || radnomjesto.getSelectedItem().equals("...")) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Niste unijeli sve podatke!");
        } else if (!ime.getText().equals("") || !prezime.getText().equals("") || !radnisati.getText().equals("") || !radnomjesto.getSelectedItem().equals("...")) {
            //Provjera ime
            boolean provjera1;
            char[] imep = ime.getText().toCharArray();
            for (char c : imep) {
                if (!Character.isLetter(c)) {
                    provjera1 = false;
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Vrijednost ime ne smije sadrzavati brojeve!");
                    break;
                }
            }
            //Provjera prezime
            boolean provjera2;
            char[] prezimep = prezime.getText().toCharArray();
            for (char c : prezimep) {
                if (!Character.isLetter(c)) {
                    provjera1 = false;
                    Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Vrijednost prezime ne smije sadrzavati brojeve!");
                    break;
                }
            }
            //Provjera radni sati
            try {
                Integer.parseInt(radnisati.getText());
            } catch (NumberFormatException e) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Vrijednost radnih sati ne smije sadrzavati slova!");
            }
        }
        JOptionPane.showMessageDialog(null, "Provjera izvrsena!");
    }//GEN-LAST:event_provjeriActionPerformed

    private void prezimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prezimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prezimeActionPerformed

    private void radnisatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radnisatiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radnisatiActionPerformed

    private void radnomjestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radnomjestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radnomjestoActionPerformed

    private void noviunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noviunosActionPerformed
        this.setVisible(false);
        new UnosPodataka().setVisible(true);
    }//GEN-LAST:event_noviunosActionPerformed

    private void spremiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spremiActionPerformed

        try {
            FileWriter dat = new FileWriter("baza.txt", true);
            dat.write(ime.getText());
            dat.write(" , ");
            dat.write(prezime.getText());
            dat.write(" , ");
            dat.write(radnisati.getText());
            dat.write(" , ");
            dat.write(radnomjesto.getSelectedItem().toString());
            dat.write("\n");
            dat.close();
            JOptionPane.showMessageDialog(null, "Uspjesan unos podataka!");
        } catch (Exception e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Dogodila se greska kod spremenja podataka u bazu!");
        }
        //Zaposlenici.UnesiNovogZaposlenika(new Object[]{ime.getText(), prezime.getText(), radnisati.getText(), radnomjesto.getSelectedItem().toString()});
    }//GEN-LAST:event_spremiActionPerformed

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
            java.util.logging.Logger.getLogger(UnosPodataka.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosPodataka.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosPodataka.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosPodataka.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UnosPodataka().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JTextField ime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton noviunos;
    private javax.swing.JTextField prezime;
    private javax.swing.JButton provjeri;
    private javax.swing.JTextField radnisati;
    private javax.swing.JComboBox<String> radnomjesto;
    private javax.swing.JButton spremi;
    // End of variables declaration//GEN-END:variables
}
