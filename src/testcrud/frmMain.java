/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author A455L
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rglaki = new javax.swing.JRadioButton();
        rgper = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        kelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        tanggal = new javax.swing.JTextField();
        tempat = new javax.swing.JTextField();
        no = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        ref = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Angelique Rose", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM MALANG");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 370, 40);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic Schools");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 60, 190, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, 0, 1000, 110);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("FISH&CHIPS", 1, 18)); // NOI18N
        jLabel3.setText("ISIAN DATA SISWA");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 10, 140, 20);

        jLabel4.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel4.setText("NIS");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 40, 50, 18);
        jPanel2.add(nis);
        nis.setBounds(20, 60, 170, 30);

        jLabel5.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel5.setText("NAMA");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 90, 60, 18);
        jPanel2.add(nama);
        nama.setBounds(20, 110, 170, 30);

        jLabel6.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel6.setText("JENIS KELAMIN");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 140, 100, 18);

        buttonGroup1.add(rglaki);
        rglaki.setText("LAKI-LAKI");
        rglaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rglakiActionPerformed(evt);
            }
        });
        jPanel2.add(rglaki);
        rglaki.setBounds(20, 170, 73, 23);

        buttonGroup1.add(rgper);
        rgper.setText("PEREMPUAN");
        jPanel2.add(rgper);
        rgper.setBounds(120, 170, 85, 23);

        jLabel7.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel7.setText("KELAS");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 200, 60, 18);
        jPanel2.add(kelas);
        kelas.setBounds(20, 220, 170, 30);

        jLabel8.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel8.setText("EMAIL");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 250, 60, 18);
        jPanel2.add(email);
        email.setBounds(20, 270, 170, 30);

        jLabel9.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel9.setText("no.absen");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 510, 100, 18);

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 180, 60);
        jPanel2.add(tanggal);
        tanggal.setBounds(20, 410, 170, 30);
        jPanel2.add(tempat);
        tempat.setBounds(20, 470, 170, 30);
        jPanel2.add(no);
        no.setBounds(20, 530, 170, 30);

        jLabel10.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel10.setText("ALAMAT");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 300, 100, 18);

        jLabel11.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel11.setText("Tanggal lahir");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 390, 100, 18);

        jLabel12.setFont(new java.awt.Font("Fifty Five ", 0, 18)); // NOI18N
        jLabel12.setText("tempat lahir");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 450, 100, 18);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 120, 240, 570);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(null);

        save.setBackground(new java.awt.Color(204, 255, 204));
        save.setForeground(new java.awt.Color(0, 51, 102));
        save.setText("SAVE");
        save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save.setBorderPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel4.add(save);
        save.setBounds(90, 30, 80, 40);

        delete.setBackground(new java.awt.Color(204, 255, 204));
        delete.setForeground(new java.awt.Color(0, 51, 102));
        delete.setText("DELETE");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setBorderPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete);
        delete.setBounds(190, 30, 90, 40);

        clear.setBackground(new java.awt.Color(204, 255, 204));
        clear.setForeground(new java.awt.Color(0, 51, 102));
        clear.setText("CLEAR");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear);
        clear.setBounds(310, 30, 70, 40);

        ref.setBackground(new java.awt.Color(204, 255, 204));
        ref.setForeground(new java.awt.Color(0, 51, 102));
        ref.setText("REFRESH");
        ref.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ref.setBorderPainted(false);
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        jPanel4.add(ref);
        ref.setBounds(410, 30, 100, 40);

        edit.setForeground(new java.awt.Color(0, 51, 102));
        edit.setText("EDIT");
        edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit.setBorderPainted(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel4.add(edit);
        edit.setBounds(530, 30, 80, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(280, 120, 700, 100);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(null);

        tbldata.setBackground(new java.awt.Color(204, 255, 204));
        tbldata.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbldata.setForeground(new java.awt.Color(255, 51, 51));
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NAMASISWA", "JENISKELAMIN", "KELAS", "EMAIL", "ALAMAT", "TANGGALLAHIR", "TEMPATLAHIR", "NOABSEN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldata);
        if (tbldata.getColumnModel().getColumnCount() > 0) {
            tbldata.getColumnModel().getColumn(0).setResizable(false);
            tbldata.getColumnModel().getColumn(1).setResizable(false);
            tbldata.getColumnModel().getColumn(2).setResizable(false);
            tbldata.getColumnModel().getColumn(3).setResizable(false);
            tbldata.getColumnModel().getColumn(4).setResizable(false);
            tbldata.getColumnModel().getColumn(5).setResizable(false);
            tbldata.getColumnModel().getColumn(6).setResizable(false);
            tbldata.getColumnModel().getColumn(7).setResizable(false);
            tbldata.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 680, 430);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(280, 240, 700, 450);

        setSize(new java.awt.Dimension(1013, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rglakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rglakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rglakiActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if("".equals(nis.getText()) || "".equals(nama.getText()) || "".equals(kelas.getText()) || "".equals(email.getText()) || "".equals(alamat.getText()) || "".equals(tanggal.getText()) || "".equals(tempat.getText()) || "".equals(no.getText())){
            JOptionPane.showMessageDialog(this, "HARAP LENGKAPI DATA", "Error", JOptionPane.WARNING_MESSAGE);
        } else{
           String jk = "";
           
           if(rglaki.isSelected()){
               jk = "L";
           } else{
               jk = "P";
           }
           String SQL = "INSERT INTO t_siswa " + "VALUES('" + nis.getText()+ "','"+nama.getText()+"','"+jk+"','"+kelas.getText()+"','"+email.getText()+"','"+alamat.getText()+"','"+tanggal.getText()+"','"+tempat.getText()+"','"+no.getText()+"')";
           int status = KoneksiDB.execute(SQL);
           if(status == 1){
               JOptionPane.showMessageDialog(this, "DATA BERHASIL DITAMBAHKAN", "Sukses", JOptionPane.INFORMATION_MESSAGE);
               selectData();
               
           }else{
               JOptionPane.showMessageDialog(this, "DATA GAGAL DITAMBAHKAN", "Sukses", JOptionPane.INFORMATION_MESSAGE);
           }
        }
       
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       int baris = tbldata.getSelectedRow();
       if (baris != -1){
           String NIS = tbldata.getValueAt(baris, 0).toString();
           String SQL = "DELETE FROM t_siswa WHERE NIS ='"+NIS+"'";
           int status = KoneksiDB.execute(SQL);
           if(status == 1){
               JOptionPane.showMessageDialog(this, "DATA BERHASIL DIHAPUS", "Sukses", JOptionPane.INFORMATION_MESSAGE);
           } else{
               JOptionPane.showMessageDialog(this, "DATA GAGAL DIHAPUS", "Gagal", JOptionPane.WARNING_MESSAGE);
           }
       }else{
           JOptionPane.showMessageDialog(this, "PILIH BARIS DATA DAHULU", "Error", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
           nis.setText("");
           nama.setText("");
           kelas.setText("");
           alamat.setText("");
           email.setText("");
           tanggal.setText("");
           tempat.setText("");
           no.setText("");
           buttonGroup1.clearSelection();




    }//GEN-LAST:event_clearActionPerformed

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        selectData();
        
    }//GEN-LAST:event_refActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
           if("".equals(nis.getText()) || "".equals(nama.getText()) || "".equals(kelas.getText()) || "".equals(email.getText()) || "".equals(alamat.getText())){
                JOptionPane.showMessageDialog(this, "HARAP LENGKAPI DATA", "Error", JOptionPane.WARNING_MESSAGE); 
              } else{
           String jk = "";
           
           if(rglaki.isSelected()){
               jk = "L";
           } else{
               jk = "P";
           }
           String SQL = "UPDATE t_siswa SET "
                   + "NamaSiswa='"+nama.getText()+"', "
                   + "JenisKelamin='" + jk+"', "
                   + "Kelas='"+kelas.getText()+"', "
                   + "Email='"+email.getText()+"', "
                   + "Alamat='"+alamat.getText()+"', "
                   + "Tanggal='"+tanggal.getText()+"', "
                   + "Tempat='"+tempat.getText()+"', "
                   + "No='"+no.getText()+"' WHERE NIS='"+nis.getText()+"'";
           int status = KoneksiDB.execute(SQL);
           if(status == 1){
               JOptionPane.showMessageDialog(this, "DATA BERHASIL DIUPDATE", "Sukses", JOptionPane.INFORMATION_MESSAGE);
               selectData();
               
           }else{
               JOptionPane.showMessageDialog(this, "DATA GAGAL DIUPDATE", "Sukses", JOptionPane.WARNING_MESSAGE);
           }
        }













        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        int baris = tbldata.getSelectedRow();
        
        if(baris != 1){
            nis.setText(tbldata.getValueAt(baris, 0).toString());
            nama.setText(tbldata.getValueAt(baris, 1).toString());
            if("Laki-laki".equals(tbldata.getValueAt(baris, 2).toString())){
                rglaki.setSelected(true);
            }else{
                rgper.setSelected(true);
            
            }
            kelas.setText(tbldata.getValueAt(baris, 3).toString());
            email.setText(tbldata.getValueAt(baris, 4).toString());
            alamat.setText(tbldata.getValueAt(baris, 5).toString());
             tanggal.setText(tbldata.getValueAt(baris, 6).toString());
              tempat.setText(tbldata.getValueAt(baris, 7).toString());
               no.setText(tbldata.getValueAt(baris, 8).toString());
        }










        // TODO add your handling code here:
    }//GEN-LAST:event_tbldataMouseClicked

    
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nis;
    private javax.swing.JTextField no;
    private javax.swing.JButton ref;
    private javax.swing.JRadioButton rglaki;
    private javax.swing.JRadioButton rgper;
    private javax.swing.JButton save;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField tempat;
    // End of variables declaration//GEN-END:variables

    public void selectData() {
       String kolom[] = {"NIS", "NamaSiwa", "JenisKelamin","Kelas","Email","Alamat", "Tanggal", "Tempat" , "No"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM t_siswa";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String NIS = rs.getString(1);
               String NamaSiswa = rs.getString(2);
               String JenisKelamin = "";
               if("L".equals(rs.getString(3))){
                   JenisKelamin = "Laki-laki";
                   
               }else{
                   JenisKelamin = "Perempuan";
                   
               }
               String Kelas = rs.getString(4);
               String Email = rs.getString(5);
               String Alamat = rs.getString(6);
               String Tanggal = rs.getString(7);
               String Tempat = rs.getString(8);
                String No = rs.getString(9);
               String data[] = {NIS,NamaSiswa, JenisKelamin, Kelas, Email, Alamat, Tanggal, Tempat, No};
               dtm.addRow(data);
               
           }
           
       }catch (SQLException ex){
           Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
           
       }
       tbldata.setModel(dtm);
   }
    
}


