/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripa3l;

import skripa3l.Koneksi;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KAMPRTO
 */
public class From_Barang extends javax.swing.JDialog {
    String nilai_baru = "";
    
    String Kode_Barang;
    
    Object[][] dataServiceBarang = null;
    String[] namaKolom = new String[]{
        "Kode Barang","Nama Barang","Satuan","Harga"
    };
    DefaultTableModel model = new DefaultTableModel(dataServiceBarang,namaKolom);
    /**
     * Creates new form From_Barang
     */
    public From_Barang (java.awt.Component param_cpmnt) {
        super(new JDialog(), "Form Service Barang", true);
        initComponents();
    }
    public From_Barang(java.awt.Frame parent, boolean modal) {
        super(new JDialog(), "Form Service Barang", true);
        initComponents();
        tampilTabel();
    }
    
    public String showDialogTampil() {
        setVisible(true);
        return Kode_Barang;
    }
      
      private void tampilTabel(){
        Koneksi objKoneksi = new Koneksi();
        try {
            Connection con = objKoneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from master_barang";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Kode_Barang"),
                    rs.getString("Nama_Barang"),
                    rs.getString("Satuan"),
                    rs.getString("Harga"),
                });
                tabelServiceBarang.setModel(model);
            }
            st.close();
            con.close();	
        }catch(Exception ex){
            System.out.println (ex);
        }
    }  
     
     private void hapusTable(){
        int baris = model.getRowCount();
        for(int i=0;i<baris;i++){
            model.removeRow(0);
        }
    }
     
    public void cariTabel(){
        Koneksi objKoneksi = new Koneksi();
        try {
            Connection con = objKoneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from master_barang "
                    + "where Kode_Barang like '%"+txtkatakunci.getText()+"%' "
                    + "or Nama_Barang like '%"+txtkatakunci.getText()+"%' "
                    + "or Satuan like '%"+txtkatakunci.getText()+"%' "
                    + "or Harga like '%"+txtkatakunci.getText()+"%' "
                    + "order by Kode_Barang";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString("Kode_Barang"),
                    rs.getString("Nama_Barang"),
                    rs.getString("Satuan"),
                    rs.getString("Harga")
                });
                tabelServiceBarang.setModel(model);
            }
            st.close();
            con.close();	
        }catch(Exception ex){
            System.out.println (ex);
        }
    } 
    
        public void pilihTabel(){
        if(this.txtkatakunci.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Text Masih Kosong", "Informasi Pilih", JOptionPane.WARNING_MESSAGE);
            this.txtkatakunci.requestFocus();
        }
        
        else
        {
            int baris = tabelServiceBarang.getSelectedRow();
            Kode_Barang = (String)model.getValueAt(baris,0);
            
            
            this.nilai_baru = this.txtkatakunci.getText();
            this.dispose();
        }
    } 
     
        void prosesPilih(){
        if(this.txtkatakunci.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Text Masih Kosong", "Informasi Pilih", JOptionPane.WARNING_MESSAGE);
            this.txtkatakunci.requestFocus();
        }
        
        else
        {
            this.nilai_baru = this.txtkatakunci.getText();
            this.dispose();
        }
    }  
        
         void prosesKeluar(){
        if(txtkatakunci.getText().equals(""))
        {
            int tanya = JOptionPane.showConfirmDialog(null, "Kata Kunci Masih Kosong, Yakin Mau Keluar?", "Informasi Tutup PopUp Customer",JOptionPane.YES_NO_OPTION);
            if(tanya==JOptionPane.YES_OPTION)
            {
                setVisible(false);
            }
        }
        
        else
        {
            prosesPilih();
        }
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtkatakunci = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPilih = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelServiceBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("From_A3L");

        txtkatakunci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtkatakunciMouseClicked(evt);
            }
        });
        txtkatakunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkatakunciKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kata Kunci");

        btnPilih.setText("Pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        tabelServiceBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode A3L", "Kota", "Alamat", "Telepon"
            }
        ));
        tabelServiceBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelServiceBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelServiceBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(txtkatakunci, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkatakunci, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilih, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkatakunciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtkatakunciMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkatakunciMouseClicked

    private void txtkatakunciKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkatakunciKeyReleased
        // TODO add your handling code here:
        hapusTable();
        cariTabel();
    }//GEN-LAST:event_txtkatakunciKeyReleased

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        // TODO add your handling code here:
        pilihTabel();
    }//GEN-LAST:event_btnPilihActionPerformed

    private void tabelServiceBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelServiceBarangMouseClicked
        // TODO add your handling code here:
        this.txtkatakunci.setText(
            tabelServiceBarang.getValueAt(this.tabelServiceBarang.getSelectedRow(),0).toString()
        );
    }//GEN-LAST:event_tabelServiceBarangMouseClicked

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
            java.util.logging.Logger.getLogger(From_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                From_Barang dialog = new From_Barang(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelServiceBarang;
    private javax.swing.JTextField txtkatakunci;
    // End of variables declaration//GEN-END:variables
}
