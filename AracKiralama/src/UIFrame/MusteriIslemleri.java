/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIFrame;

import Database.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MusteriIslemleri extends javax.swing.JFrame implements minLogo {

    public MusteriIslemleri() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(icon);
        MusteriDoldur(tb_Musteriler);
    }
    ResultSet rs;
    Connection conn = null;
    PreparedStatement pst = null;
    Statement statement=null;
    DefaultTableModel model;
    
    public void MusteriDoldur(javax.swing.JTable tb){
         tableBosalt(tb);
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        try {
            try {
                tb.removeAll();
                conn = db.java_db();
                rs = conn.prepareStatement("SELECT *FROM Musteriler").executeQuery();

                while (rs.next()) {

                    int id=Integer.parseInt(rs.getString(1));
                    String ad = rs.getString(2);
                    String soyad = rs.getString(3);
                    String tel = rs.getString(4);
                    String mail = rs.getString(5);
                    String adres = rs.getString(6);
                   

                    Object[] eklenecek = {id,ad, soyad,tel,mail,adres};
                    model.addRow(eklenecek);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }

        } catch (Exception e) {
        }
    }
    
     public void tableBosalt(javax.swing.JTable tb) {
        DefaultTableModel dm = (DefaultTableModel) tb.getModel();
        int rowCount = dm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
    
    
    public void metinSifirla() {
        txt_ad.setText("");
        txt_adres.setText("");
        txt_email.setText("");
        txt_soyad.setText("");
        txt_tel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_soyad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_adres = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Musteriler = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Müşteri Ekleme");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ad:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Soyad:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefon:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Adres:");

        txt_ad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_tel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_email.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_soyad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_adres.setColumns(20);
        txt_adres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_adres.setRows(5);
        jScrollPane1.setViewportView(txt_adres);

        jButton1.setText("Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Müşteriyi Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Geri");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tb_Musteriler.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tb_Musteriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Ad", "Soyad", "Telefon", "Email", "Adres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Musteriler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_MusterilerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Musteriler);
        if (tb_Musteriler.getColumnModel().getColumnCount() > 0) {
            tb_Musteriler.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Müşteriler");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_email)
                                            .addComponent(txt_tel)
                                            .addComponent(txt_ad)
                                            .addComponent(txt_soyad)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AnaSayfa frame = new AnaSayfa();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String ad = txt_ad.getText();
            String soyad = txt_soyad.getText();
            String tel = txt_tel.getText();
            String mail = txt_email.getText();
            String adres = txt_adres.getText();
            if (ad.equals("") || soyad.equals("") || tel.equals("") || mail.equals("")) {
                System.out.println("Lütfen bütün alanları doldurunuz...");
            } else {
                conn = db.java_db();
                
                 String sql = "INSERT INTO Musteriler (ad, soyad, telefon, email, adres) VALUES (?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setString(1, ad);
                pst.setString(2, soyad);
                pst.setString(3, tel);
                pst.setString(4, mail);
                pst.setString(5, adres);
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kayıt Başarılı");
                metinSifirla();
                MusteriDoldur(tb_Musteriler);
            }
        } catch (Exception e) {
            System.out.println("Beklenmeyen Bir Hata Oluştu...");
        }finally {
                    try {

                        conn.close();
                    } catch (SQLException ex) {

                    }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int SeciliSatır = tb_Musteriler.getSelectedRow();
         
        DefaultTableModel dm = (DefaultTableModel) tb_Musteriler.getModel();
        if (SeciliSatır == -1) {
            if (tb_Musteriler.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Müşteriler Tablosu Boş");
            } else {
                JOptionPane.showMessageDialog(null, "Silinecek Müşteriyi Seçiniz");
            }
        } else {

            try {

                conn = db.java_db();
                int silinecek_id = (int) dm.getValueAt(SeciliSatır, 0);
                String sql = "DELETE FROM Musteriler WHERE musteri_id ="+silinecek_id;
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Müşteri Başarıyla Silinmiştir");
                MusteriDoldur(tb_Musteriler);
            } catch (Exception e) {
              System.out.println("Beklenmeyen Bir Hata Oluştu...");
            } finally {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try {
            int SeciliSatır = tb_Musteriler.getSelectedRow();
            DefaultTableModel dm = (DefaultTableModel) tb_Musteriler.getModel();
            int id = (int) dm.getValueAt(SeciliSatır, 0);
           
            String ad = txt_ad.getText();
            String soyad =txt_soyad.getText();
            String tel = txt_tel.getText();
            String mail = txt_email.getText();
            String adres = txt_adres.getText();
            conn = db.java_db();
            String sql = "UPDATE Musteriler SET ad=?, soyad=?, telefon=?, email=?, adres=? WHERE musteri_id=?";

            
            pst= conn.prepareStatement(sql);
            pst.setString(1, ad);
            pst.setString(2, soyad);
            pst.setString(3, tel);
            pst.setString(4, mail);
            pst.setString(5, adres);
            pst.setInt(6, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Müşteri Bilgileri Başarıyla Güncellendi");
            MusteriDoldur(tb_Musteriler);
        } catch (Exception e) {
             System.out.println("Beklenmeyen Bir Hata Oluştu...");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
            }
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tb_MusterilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_MusterilerMouseClicked
             int SeciliSatır = tb_Musteriler.getSelectedRow();
            DefaultTableModel dm = (DefaultTableModel) tb_Musteriler.getModel();
            int id = (int) dm.getValueAt(SeciliSatır, 0);
            txt_ad.setText(String.valueOf(dm.getValueAt(SeciliSatır, 1)));
            txt_soyad.setText(String.valueOf(dm.getValueAt(SeciliSatır, 2)));
            txt_tel.setText(String.valueOf(dm.getValueAt(SeciliSatır, 3)));
            txt_email.setText(String.valueOf(dm.getValueAt(SeciliSatır, 4)));
            txt_adres.setText(String.valueOf(dm.getValueAt(SeciliSatır, 5)));
            
        
    }//GEN-LAST:event_tb_MusterilerMouseClicked

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
            java.util.logging.Logger.getLogger(MusteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tb_Musteriler;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextArea txt_adres;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
