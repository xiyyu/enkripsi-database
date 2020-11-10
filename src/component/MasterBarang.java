/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skripa3l;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import skripa3l.Koneksi;
/**
 *
 * @author KAMPRTO
 */
public class MasterBarang extends javax.swing.JFrame {
    DefaultTableModel tabModel;
    Object[] kolom;
    Dimension OD = Toolkit.getDefaultToolkit().getScreenSize();
    MasterBarang.SearchRenderer renderer = new MasterBarang.SearchRenderer();
    private JFrame frame = new JFrame();
    /**
     * Creates new form MasterServiceProduk
     */
    public MasterBarang() {
        initComponents();
         setTitle("Master Barang");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.getContentPane().setBackground(Color.lightGray);
        this.setLocation(OD.width / 2 - getWidth() / 2, OD.height / 2 - getHeight() / 2);
        kolom = new Object[]{"Kode Barang", "Nama Barang", "Satuan", "Harga"};
        tabModel = new DefaultTableModel(null, kolom);
        jTable1.setModel(tabModel);
        //setIconImage(getToolkit().getImage(getClass().getResource("/images/button/Applications_Folder.png")));
        setAwalForm();
        autoNumber();
        txtCari.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                fireDocumentChangeEvent();
            }

            public void removeUpdate(DocumentEvent e) {
                fireDocumentChangeEvent();
            }

            public void changedUpdate(DocumentEvent e) {
            }
        });
        fireDocumentChangeEvent();
        jTable1.setDefaultRenderer(Object.class, renderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jlebel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtBarang = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtCari = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSatuan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Master Service Produk");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama Barang");

        Jlebel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Jlebel4.setText("Satuan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Harga ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cari");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Satuan", "Harga "
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(Jlebel4))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Jlebel4)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
         if (!txtKodeBarang.getText().equals("") && !txtBarang.getText().equals("") && !txtSatuan.getText().equals("") && !txtHarga.getText().equals("")) {
            try {
                Koneksi objK = new Koneksi();
                Connection con = objK.getConnection();
                Statement st = con.createStatement();
                String sql = "Insert into master_barang values('"
                        + txtKodeBarang.getText() + "','"
                        + txtBarang.getText()+ "','"
                        + txtSatuan.getText() + "','"
                        + txtHarga.getText() + "')";
                int vHasil = st.executeUpdate(sql);
                if (vHasil > 0) {
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
                }
                con.close();
                setAwalForm();
            } catch (SQLException | HeadlessException e) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Isi Data Secara Lengkap");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
         int confirm = JOptionPane.showOptionDialog(frame, 
                        "Apakah Anda Ingin Mengubah Data Ini ?", 
                        "Confirmation", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION){
            try {
                Koneksi objK = new Koneksi();
                Connection con = objK.getConnection();
                Statement st = con.createStatement();//menulis statement harus melalui objek koneksi// langkah 3
                String sql = "Update master_barang set Nama_Barang='" + txtBarang.getText()+ "', Satuan='" + txtSatuan.getText()+ "', Harga='" + txtHarga.getText() + "' Where Kode_Barang='" + txtKodeBarang.getText() + "';";
                int vHasil = st.executeUpdate(sql);//langkah 5, sql dari string yg dipakai untuk insert barang tadi
                if (vHasil > 0) {//langkah 6
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                }
                setAwalForm();
                con.close();
            } catch (SQLException | HeadlessException e) {
                System.out.println(e.toString());
            }
        }
        else if (confirm == JOptionPane.NO_OPTION){
            setAwalForm();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        // TODO add your handling code here:
        setAwalForm();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showOptionDialog(frame, 
                        "Apakah Anda Ingin Menghapus Data Ini ?", 
                        "Confirmation", JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (confirm == JOptionPane.YES_OPTION){
            try {
                Koneksi objK = new Koneksi();
                Connection con = objK.getConnection();
                Statement st = con.createStatement();//menulis statement harus melalui objek koneksi// langkah 3
                String sql = "Delete from master_barang Where " + "Kode_Barang='" + txtKodeBarang.getText() + "'";
                int vHasil = st.executeUpdate(sql);//langkah 5, sql dari string yg dipakai untuk insert barang tadi
                if (vHasil > 0) {//langkah 6
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                }
                setAwalForm();
                con.close();
            } catch (SQLException | HeadlessException e) {

            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuUtama a = new MenuUtama();
        a.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          tampildaritable();
    }//GEN-LAST:event_jTable1MouseClicked

     void setAwalForm() {
        txtKodeBarang.setEnabled(false);
        txtBarang.setText("");
        txtSatuan.setText("");
        txtHarga.setText("");
        txtBarang.requestFocus();
        btnBersih.setEnabled(true);
        btnHapus.setEnabled(false);
        btnSimpan.setEnabled(true);
        btnEdit.setEnabled(false);

        autoNumber();
        hapusTabel();
        tampilTabel();
    }
     
     void hapusTabel() {
        int brs = tabModel.getRowCount();
        for (int i = 0; i < brs; i++) {
            tabModel.removeRow(0);
        }
    }
     
     void tampilTabel() {
        try {
            Koneksi objK = new Koneksi();
            Connection con = objK.getConnection();
            Statement st = con.createStatement();
            String sql = "Select * from master_barang order by Kode_Barang";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Kode_Barang = rs.getString("Kode_Barang");
                String Nama_Barang = rs.getString("Nama_Barang");
                String Satuan = rs.getString("Satuan");  
                String Harga = rs.getString("Harga");
                //String seat = rs.getString("seat");
                String[] data = {Kode_Barang, Nama_Barang, Satuan, Harga };
                tabModel.addRow(data);
                 TableColumn column;
                jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
                column = jTable1.getColumnModel().getColumn(0); 
                column.setPreferredWidth(55);
                column = jTable1.getColumnModel().getColumn(1); 
                column.setPreferredWidth(150); 
                column = jTable1.getColumnModel().getColumn(2); 
                column.setPreferredWidth(320); 
                column = jTable1.getColumnModel().getColumn(3); 
                column.setPreferredWidth(105);
                //System.out.println("data customer : "+data);
            }
            rs.close();
            con.close();
        } catch (SQLException | HeadlessException e) {

        }
    }
     
     void tampildaritable() {
        int row = jTable1.getSelectedRow();
        txtKodeBarang.setText(jTable1.getValueAt(row, 0).toString());
        txtBarang.setText(jTable1.getValueAt(row, 1).toString());
        txtSatuan.setText(jTable1.getValueAt(row, 2).toString());
        txtHarga.setText(jTable1.getValueAt(row, 3).toString());
        btnSimpan.setEnabled(false);
        btnBersih.setEnabled(true);
        btnHapus.setEnabled(true);
        btnEdit.setEnabled(true);
        txtBarang.requestFocus();
    }      
      
    void autoNumber() {
        try {
            Koneksi objK = new Koneksi();
            Connection con = objK.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from master_barang order by Kode_Barang DESC";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String kd = rs.getString("Kode_Barang");
                int kd_customer = Integer.parseInt(kd) + 1;
                txtKodeBarang.setText(String.valueOf(kd_customer));
                rs.close();
                con.close();
            } else {
                txtKodeBarang.setText("1");
            }
        } catch (Exception e) {
       } 
     }
      
      private void fireDocumentChangeEvent() {
        String pattern = txtCari.getText().trim();
        renderer.setPattern(pattern);
        jTable1.repaint();
    }
    
    class SearchRenderer implements TableCellRenderer {

        private final Color BACKGROUND_SELECTION_COLOR = new Color(220, 240,
                255);
        private final transient Highlighter.HighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(
                Color.BLUE);
        private final JTextField txtCari = new JTextField();
        private String pattern = "";
        private String prev;

        public boolean setPattern(String str) {
            if (str == null || str.equals(pattern)) {
                return false;
            } else {
                prev = pattern;
                pattern = str;
                return true;
            }
        }

        public SearchRenderer() {
            super();
            txtCari.setOpaque(true);
            txtCari.setBorder(BorderFactory.createEmptyBorder());
            txtCari.setForeground(Color.BLACK);
            txtCari.setBackground(Color.WHITE);
            txtCari.setEditable(false);
        }

        @Override
        public Component getTableCellRendererComponent(JTable tabel,
                Object value, boolean isSelected, boolean hasFocus, int row,
                int column) {
            String txt = Objects.toString(value, "");
            Highlighter highlighter = txtCari.getHighlighter();
            highlighter.removeAllHighlights();
            txtCari.setText(txt);
            txtCari.setBackground(isSelected ? BACKGROUND_SELECTION_COLOR
                    : Color.WHITE);
            if (pattern != null && !pattern.isEmpty() && !pattern.equals(prev)) {
                Matcher matcher = Pattern.compile(pattern).matcher(txt);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    try {
                        highlighter.addHighlight(start, end, highlightPainter);
                    } catch (BadLocationException e) {
                        e.printStackTrace();
                    }
                }
            }
            return txtCari;
        }
    }  
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
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlebel4;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBarang;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtSatuan;
    // End of variables declaration//GEN-END:variables
}