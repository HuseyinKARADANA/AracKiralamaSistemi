
package UIFrame;

import Database.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AracIslemleri extends javax.swing.JFrame implements minLogo{

    public AracIslemleri() {
        initComponents();
         setLocationRelativeTo(null);
        setIconImage(icon);
        AracDoldur(tb_Araclar);
    }
    ResultSet rs;
    Connection conn = null;
    PreparedStatement pst = null;
    Statement statement=null;
    DefaultTableModel model;
    
    public void AracDoldur(javax.swing.JTable tb){
         tableBosalt(tb);
        DefaultTableModel model = (DefaultTableModel) tb.getModel();
        try {
            try {
                tb.removeAll();
                conn = db.java_db();
                rs = conn.prepareStatement("SELECT *FROM Araçlar").executeQuery();

                while (rs.next()) {

                    int id=Integer.parseInt(rs.getString(1));
                    String marka = rs.getString(2);
                    String aracModel = rs.getString(3);
                    int yil = Integer.parseInt(rs.getString(4));
                    String yakitTuru = rs.getString(5);
                    String vitesTuru = rs.getString(6);
                     int gunlukUcret = Integer.parseInt(rs.getString(7));
                    String durum = rs.getString(8);
                   

                    Object[] eklenecek = {id,marka,aracModel,yil,yakitTuru,vitesTuru,gunlukUcret,durum};
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
        txt_gunlukUcret.setText("");
        txt_marka.setText("");
        txt_model.setText("");
        txt_vitesTuru.setText("");
        txt_yakıtTuru.setText("");
        txt_yıl.setText("");
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
        txt_marka = new javax.swing.JTextField();
        txt_yıl = new javax.swing.JTextField();
        txt_yakıtTuru = new javax.swing.JTextField();
        txt_model = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Araclar = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_vitesTuru = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_gunlukUcret = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Araç İşlemleri");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Marka:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Model:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Yıl:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Yakıt Türü:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Vites Türü:");

        txt_marka.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_yıl.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_yakıtTuru.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txt_model.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jButton1.setText("Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Araç Sil");
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

        tb_Araclar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tb_Araclar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Marka", "Model", "Yıl", "Yakıt Türü", "Vites Türü", "Günlük Ücret", "Durum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Araclar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_AraclarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Araclar);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Araçlar");

        txt_vitesTuru.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Günlük Ücret:");

        txt_gunlukUcret.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_gunlukUcret, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                                                    .addComponent(txt_yakıtTuru)
                                                    .addComponent(txt_yıl)
                                                    .addComponent(txt_marka)
                                                    .addComponent(txt_model)
                                                    .addComponent(txt_vitesTuru, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(67, 67, 67)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_yıl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_yakıtTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_vitesTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_gunlukUcret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int yil=0,gunlukUcret=0;
            String marka = txt_marka.getText();
            String model = txt_model.getText();
             yil =Integer.parseInt( txt_yıl.getText());
            String yakitTuru = txt_yakıtTuru.getText();
            String vitesTuru = txt_vitesTuru.getText();
             gunlukUcret=Integer.parseInt( txt_gunlukUcret.getText());
            String durum="müsait";
            
            if (marka.equals("") || model.equals("") || yil<=0 || yakitTuru.equals("")|| vitesTuru.equals("") || gunlukUcret<=0) {
                System.out.println("Lütfen bütün alanları doldurunuz...");
            } else {
                conn = db.java_db();

                String sql = "INSERT INTO Araçlar (marka,model,yil,yakit_turu,vites_turu,gunluk_ucret,durum) VALUES (?,?,?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                pst.setString(1,marka);
                pst.setString(2, model);
                pst.setInt(3, yil);
                pst.setString(4, yakitTuru);
                pst.setString(5, vitesTuru);
                pst.setInt(6, gunlukUcret);
                pst.setString(7, durum);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kayıt Başarılı");
                metinSifirla();
                AracDoldur(tb_Araclar);
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
        int SeciliSatır = tb_Araclar.getSelectedRow();

        DefaultTableModel dm = (DefaultTableModel) tb_Araclar.getModel();
        if (SeciliSatır == -1) {
            if (tb_Araclar.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Araçlar Tablosu Boş");
            } else {
                JOptionPane.showMessageDialog(null, "Silinecek Aracı Seçiniz");
            }
        } else {

            try {

                conn = db.java_db();
                int silinecek_id = (int) dm.getValueAt(SeciliSatır, 0);
                String sql = "DELETE FROM Araçlar WHERE arac_id ="+silinecek_id;
                pst=conn.prepareStatement(sql);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Araç Başarıyla Silinmiştir");
                AracDoldur(tb_Araclar);
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
            int SeciliSatır = tb_Araclar.getSelectedRow();
            DefaultTableModel dm = (DefaultTableModel) tb_Araclar.getModel();
            int id = (int) dm.getValueAt(SeciliSatır, 0);

            int yil=0,gunlukUcret=0;
            String marka = txt_marka.getText();
            String model = txt_model.getText();
             yil =Integer.parseInt( txt_yıl.getText());
            String yakitTuru = txt_yakıtTuru.getText();
            String vitesTuru = txt_vitesTuru.getText();
             gunlukUcret=Integer.parseInt( txt_gunlukUcret.getText());
            String durum="beklemede";
            conn = db.java_db();
            String sql = "UPDATE Araçlar SET marka=?, model=?, yil=?, yakit_turu=?, vites_turu=?, gunluk_ucret=?, durum=?  WHERE arac_id=?";

            pst= conn.prepareStatement(sql);
            pst.setString(1, marka);
            pst.setString(2, model);
            pst.setInt(3, yil);
            pst.setString(4, yakitTuru);
            pst.setString(5, vitesTuru);
            pst.setInt(6, gunlukUcret);
            pst.setString(7,durum);
            pst.setInt(8, id);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Araç Bilgileri Başarıyla Güncellendi");
            AracDoldur(tb_Araclar);
        } catch (Exception e) {
            System.out.println("Beklenmeyen Bir Hata Oluştu...");
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AnaSayfa frame = new AnaSayfa();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tb_AraclarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_AraclarMouseClicked
        int SeciliSatır = tb_Araclar.getSelectedRow();
        DefaultTableModel dm = (DefaultTableModel) tb_Araclar.getModel();
        int id = (int) dm.getValueAt(SeciliSatır, 0);
        txt_marka.setText(String.valueOf(dm.getValueAt(SeciliSatır, 1)));
        txt_model.setText(String.valueOf(dm.getValueAt(SeciliSatır, 2)));
        txt_yıl.setText(String.valueOf(dm.getValueAt(SeciliSatır, 3)));
        txt_yakıtTuru.setText(String.valueOf(dm.getValueAt(SeciliSatır, 4)));
        txt_vitesTuru.setText(String.valueOf(dm.getValueAt(SeciliSatır, 5)));
        txt_gunlukUcret.setText(String.valueOf(dm.getValueAt(SeciliSatır, 6)));
        

    }//GEN-LAST:event_tb_AraclarMouseClicked

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
            java.util.logging.Logger.getLogger(AracIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AracIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AracIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AracIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AracIslemleri().setVisible(true);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tb_Araclar;
    private javax.swing.JTextField txt_gunlukUcret;
    private javax.swing.JTextField txt_marka;
    private javax.swing.JTextField txt_model;
    private javax.swing.JTextField txt_vitesTuru;
    private javax.swing.JTextField txt_yakıtTuru;
    private javax.swing.JTextField txt_yıl;
    // End of variables declaration//GEN-END:variables
}
