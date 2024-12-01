/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.hoaDon;

import dao.HoaDon_DAO;
import entity.HoaDon;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Phuong
 */
public class DanhSachHoaDon extends javax.swing.JPanel {
    private HoaDon_DAO hoadonDAO;
    private DefaultTableModel model;
    /**
     * Creates new form DanhSachHoaDon
     */
    public DanhSachHoaDon() {
        try {
            initComponents();
            hoadonDAO = new HoaDon_DAO();
            model = new DefaultTableModel(new String[] {"STT", "Mã hóa đơn", "Nhân viên", "Khách hàng", "Ngày lập hóa đơn", "Tổng tiền"}, 0);
            table_dsHoaDon = new JTable(model);  // Khởi tạo JTable và kết nối với model
            
            table_dsHoaDon.setFont(new Font("Arial", Font.PLAIN, 16));
            table_dsHoaDon.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
            table_dsHoaDon.setRowHeight(30);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            table_dsHoaDon.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // Căn giữa cho cột đầu tiên

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(DefaultTableCellRenderer.RIGHT); // Sử dụng rightRenderer để căn phải
            table_dsHoaDon.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
            
            jScrollPane2.setViewportView(table_dsHoaDon);  // Nếu chưa gán bảng vào JScrollPane
            
            loadHoaDonToTable();  // Gọi load dữ liệu vào bảng
            
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void loadHoaDonToTable() throws SQLException {
        // Lấy danh sách hóa đơn từ DAO
        List<entity.HoaDon> dsHoaDon = hoadonDAO.getAllHoaDon();
        
        DecimalFormat df = new DecimalFormat("#,### VNĐ");
        // Clear bảng trước khi load dữ liệu mới
        model.setRowCount(0);

        // Thêm dữ liệu vào bảng
        int stt = 1;
        for (entity.HoaDon hd : dsHoaDon) {
            String tenKH = (hd.getYeucau() != null && hd.getYeucau().getKh() != null) ? hd.getYeucau().getKh().getTenKH() : "Không xác định";
            double tongTien = hd.getTongTien() + hd.getTongTien()*0.1;  // Lấy tổng tiền từ đối tượng Panel_HoaDon
            model.addRow(new Object[] {
                stt++, // STT
                hd.getMaHD(), // Mã Hóa Đơn
                hd.getNhanVien().getTenNV(), // Tên Nhân Viên
                tenKH, // Tên Khách Hàng
                hd.getThoiGianTao(), // Ngày Lập
                df.format(tongTien)
            });
        }
    }
        
    private void updateTable(List<HoaDon> dsHoaDon) {
        // Xóa dữ liệu cũ trên bảng
        model.setRowCount(0);
        DecimalFormat df = new DecimalFormat("#,### VNĐ");
        // Thêm dữ liệu mới sau khi sắp xếp
        int stt = 1;
        for (HoaDon hd : dsHoaDon) {
            String tenKH = (hd.getYeucau() != null && hd.getYeucau().getKh() != null) ? hd.getYeucau().getKh().getTenKH() : "Không xác định";
            double tongTien = hd.getTongTien() + hd.getTongTien()*0.1;
            model.addRow(new Object[] {
                stt++,
                hd.getMaHD(),
                hd.getNhanVien().getTenNV(),
                tenKH,
                hd.getThoiGianTao(),
                df.format(tongTien) // Hiển thị tổng tiền
            });
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_dsHoaDon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_tim = new javax.swing.JButton();
        btn_chiTiet = new javax.swing.JButton();
        t_tim = new javax.swing.JTextField();
        load = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sapXepTheoTongTien = new javax.swing.JComboBox<>();
        sapXepTheoNgayLap = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table_dsHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_dsHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hóa đơn", "Nhân viên", "Khách hàng", "Ngày lập hóa đơn", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_dsHoaDon.setRowHeight(40);
        table_dsHoaDon.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(table_dsHoaDon);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nhập số điện thoại để tìm kiếm: ");

        btn_tim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search (1).jpg"))); // NOI18N
        btn_tim.setText("Tìm");
        btn_tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timActionPerformed(evt);
            }
        });

        btn_chiTiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_chiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/details (1).jpg"))); // NOI18N
        btn_chiTiet.setText("Chi tiết hóa đơn");
        btn_chiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chiTietActionPerformed(evt);
            }
        });

        load.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        load.setText("Tải lại");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_chiTiet)
                        .addGap(18, 18, 18)
                        .addComponent(load))
                    .addComponent(jLabel3)
                    .addComponent(t_tim))
                .addGap(26, 26, 26)
                .addComponent(btn_tim, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(t_tim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_chiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(load))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("DANH SÁCH HÓA ĐƠN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Danh sách hóa đơn bán hàng:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp xếp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Theo tổng tiền");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Theo ngày lập");

        sapXepTheoTongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Tăng dần", "Giảm dần" }));
        sapXepTheoTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapXepTheoTongTienActionPerformed(evt);
            }
        });

        sapXepTheoNgayLap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Cũ nhất", "Mới nhất" }));
        sapXepTheoNgayLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapXepTheoNgayLapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sapXepTheoTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sapXepTheoNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sapXepTheoNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sapXepTheoTongTien))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jScrollPane2)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_chiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chiTietActionPerformed
        int selectedRow = table_dsHoaDon.getSelectedRow();
        if (selectedRow != -1) { // Kiểm tra xem có dòng nào được chọn hay không
            // Lấy mã Hóa Đơn từ bảng
            String maHD = (String) model.getValueAt(selectedRow, 1); // Cột thứ 2 (index 1) là "Mã HĐ"

            // Mở Frame_HoaDon và truyền mã hóa đơn
            Frame_HoaDon frame_hoadon = new Frame_HoaDon(maHD); // Truyền mã hóa đơn vào constructor
            frame_hoadon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame_hoadon.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn từ bảng!");
        }
    }//GEN-LAST:event_btn_chiTietActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
        try {
        // Gọi phương thức loadHoaDonToTable để tải lại dữ liệu từ cơ sở dữ liệu
            loadHoaDonToTable();
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadActionPerformed

    private void btn_timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timActionPerformed
        // TODO add your handling code here:
        // Lấy số điện thoại từ TextField
        String sdtTimKiem = t_tim.getText().trim();

        if (sdtTimKiem.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!");
            return;  // Nếu không có số điện thoại nhập vào thì không làm gì
        }

        try {
            // Gọi phương thức tìm kiếm hóa đơn theo số điện thoại của khách hàng
            List<entity.HoaDon> dsHoaDon = hoadonDAO.timHoaDonTheoSdt(sdtTimKiem);
            updateTable(dsHoaDon);

        } catch (SQLException ex) {
            Logger.getLogger(DanhSachHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Lỗi tìm kiếm hóa đơn: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_timActionPerformed

    private void sapXepTheoTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapXepTheoTongTienActionPerformed
        try {
            // TODO add your handling code here:
            // Lấy tùy chọn người dùng đã chọn
            String luaChon = sapXepTheoTongTien.getSelectedItem().toString();
            
            // Lấy danh sách hóa đơn từ DAO hoặc từ biến lưu danh sách hiện tại
            List<HoaDon> dsHoaDon = hoadonDAO.getAllHoaDon();
            
            // Kiểm tra và thực hiện sắp xếp
            if ("Tăng dần".equals(luaChon)) {
                dsHoaDon.sort(Comparator.comparingDouble(HoaDon::getTongTien));
            } else if ("Giảm dần".equals(luaChon)) {
                dsHoaDon.sort(Comparator.comparingDouble(HoaDon::getTongTien).reversed());
            }
            
            // Cập nhật dữ liệu vào bảng
            updateTable(dsHoaDon);
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sapXepTheoTongTienActionPerformed

    private void sapXepTheoNgayLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapXepTheoNgayLapActionPerformed
        try {
            // TODO add your handling code here:
            // Lấy tùy chọn người dùng đã chọn
            String luaChon = sapXepTheoNgayLap.getSelectedItem().toString();
            
            // Lấy danh sách hóa đơn từ DAO hoặc biến lưu trữ hiện tại
            List<HoaDon> dsHoaDon = hoadonDAO.getAllHoaDon();
            
            // Kiểm tra và thực hiện sắp xếp
            if ("Cũ nhất".equals(luaChon)) {
                dsHoaDon.sort(Comparator.comparing(HoaDon::getThoiGianTao));
            } else if ("Mới nhất".equals(luaChon)) {
                dsHoaDon.sort(Comparator.comparing(HoaDon::getThoiGianTao).reversed());
            }
            
            // Cập nhật lại dữ liệu trong bảng
            updateTable(dsHoaDon);
        } catch (SQLException ex) {
            Logger.getLogger(DanhSachHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sapXepTheoNgayLapActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chiTiet;
    private javax.swing.JButton btn_tim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton load;
    private javax.swing.JComboBox<String> sapXepTheoNgayLap;
    private javax.swing.JComboBox<String> sapXepTheoTongTien;
    private javax.swing.JTextField t_tim;
    private javax.swing.JTable table_dsHoaDon;
    // End of variables declaration//GEN-END:variables

    public void pack() {
//        throw new UnsupportedOperationException("Not supported yet.");
            this.setSize(800, 600); // Kích thước tùy chỉnh cho JFrame
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
