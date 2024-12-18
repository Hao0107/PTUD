/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.manHinhChinh;

import entity.NhanVien;
import gui.KhachHangNhanVien.Panel_QuanLyNhanVien;
import gui.KhachHangNhanVien.PhanCaNhanVien;
import gui.KhachHangNhanVien.QuanLyKhachHang;
import gui.KhachHangNhanVien.XemThongTinNhanVien;
import gui.ban.Form_QuanLyBan;
import gui.dangNhap.Login;
import gui.datBan.ManHinh_DatBan;
import gui.hoaDon.DanhSachHoaDon;
import gui.monAn.Form_QuanLyMon;
import gui.thongKe.ThongKeDoanhThu;
import gui.thongKe.ThongKeKhachHang;
import gui.thongKe.ThongKeNhanVien;
import gui.thongKe.ThongKeSanPham;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author Admin
 */
public class ManHinhChinh extends javax.swing.JFrame {
    NhanVien nhanvien;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    /**
     * Creates new form ManHinhChinh
     */
    public ManHinhChinh(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
        
        initComponents();
        addPopupmenu();
        tenNhanVien.setText(this.nhanvien.getTenNV());
        btn_dangxuat.setText(this.nhanvien.getTenNV());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        anhManHinhChinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Thai_restaurant_resized_900x600.png")));
        anhManHinhChinh.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icon/Thai_restaurant_resized_900x600.png")));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icon/5519105_achievement_awards_badge_chef_cook_icon (1).png")));
        
        btn_TrangChu.setBackground(Color.darkGray);
        btn_TrangChu.setForeground(Color.GREEN);
        
        btn_qly_ban.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_ban.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
    }
    
    private void addPopupmenu(){
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        
        jMenuItem1.setText("Thông tin chi tiết");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Đăng xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);
        
        btn_dangxuat.setText("Tên Nhân Viên");
        btn_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangxuatActionPerformed(evt);
            }
        });

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
        logo = new javax.swing.JLabel();
        btn_TrangChu = new javax.swing.JButton();
        btn_qly_ban = new javax.swing.JButton();
        btn_qly_mon = new javax.swing.JButton();
        btn_DatBan = new javax.swing.JButton();
        btn_qlyKhachHang = new javax.swing.JButton();
        btn_qlyNhanVien = new javax.swing.JButton();
        btn_ThongKe = new javax.swing.JButton();
        btn_hdsd = new javax.swing.JButton();
        tenNhanVien = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_dangxuat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        P_chucNang = new javax.swing.JPanel();
        anhManHinhChinh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_TrangChu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_TrangChu.setText("Trang chủ");
        btn_TrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TrangChuActionPerformed(evt);
            }
        });

        btn_qly_ban.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_qly_ban.setText("Quản lý bàn");
        btn_qly_ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qly_banActionPerformed(evt);
            }
        });

        btn_qly_mon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_qly_mon.setText("Quản lý món ăn");
        btn_qly_mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qly_monActionPerformed(evt);
            }
        });

        btn_DatBan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_DatBan.setText("Đặt bàn");
        btn_DatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DatBanActionPerformed(evt);
            }
        });

        btn_qlyKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_qlyKhachHang.setText("Quản lý khách hàng");
        btn_qlyKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qlyKhachHangActionPerformed(evt);
            }
        });

        btn_qlyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_qlyNhanVien.setText("Quản lý nhân viên");
        btn_qlyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qlyNhanVienActionPerformed(evt);
            }
        });

        btn_ThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_ThongKe.setText("Thống kê");
        btn_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongKeActionPerformed(evt);
            }
        });

        btn_hdsd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hdsd.setText("About us");
        btn_hdsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hdsdActionPerformed(evt);
            }
        });

        tenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenNhanVien.setForeground(new java.awt.Color(0, 102, 102));
        tenNhanVien.setText("Tên Nhân Viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_TrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_qly_ban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_qly_mon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(btn_DatBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_qlyKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_qlyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hdsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(tenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_qly_ban, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_qly_mon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_DatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_qlyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_qlyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_hdsd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Thái Restaurant");

        btn_dangxuat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_dangxuat.setForeground(new java.awt.Color(0, 102, 102));
        btn_dangxuat.setText("Tên Nhân Viên");
        btn_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(btn_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        P_chucNang.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout P_chucNangLayout = new javax.swing.GroupLayout(P_chucNang);
        P_chucNang.setLayout(P_chucNangLayout);
        P_chucNangLayout.setHorizontalGroup(
            P_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anhManHinhChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_chucNangLayout.setVerticalGroup(
            P_chucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anhManHinhChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_chucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_chucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_qly_banActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qly_banActionPerformed
        // TODO add your handling code here:
        Form_QuanLyBan qlBan = new Form_QuanLyBan();
        
        JTabbedPane tabqlBan = new JTabbedPane();
        tabqlBan.addTab("Quản lý bàn", qlBan);
        
        P_chucNang.removeAll();
        P_chucNang.setLayout(new java.awt.BorderLayout());
        P_chucNang.add(tabqlBan);
        P_chucNang.validate();
        P_chucNang.repaint();
        
        btn_qly_ban.setBackground(Color.darkGray);
        btn_qly_ban.setForeground(Color.GREEN);
        
        btn_TrangChu.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
        btn_TrangChu.setForeground(Color.black);
        btn_DatBan.setForeground(Color.black);
        btn_ThongKe.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_qlyNhanVien.setForeground(Color.black);
        btn_qly_mon.setForeground(Color.black);
        btn_hdsd.setForeground(Color.black);
    }//GEN-LAST:event_btn_qly_banActionPerformed

    private void btn_qly_monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qly_monActionPerformed
        // TODO add your handling code here:
//        try {
            Form_QuanLyMon ftm = new Form_QuanLyMon();
//        }
//        catch(SQLException ex){
//            Logger.getLogger(ManHinhChinh.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        JTabbedPane tabQlyMon = new JTabbedPane();
        tabQlyMon.addTab("Quản lý món", ftm);
        
        P_chucNang.removeAll();
        P_chucNang.setLayout(new java.awt.BorderLayout());
        P_chucNang.add(tabQlyMon);
        P_chucNang.validate();
        P_chucNang.repaint();
        
        btn_qly_mon.setBackground(Color.darkGray);
        btn_qly_mon.setForeground(Color.GREEN);
        
        btn_TrangChu.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_ban.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
        btn_TrangChu.setForeground(Color.black);
        btn_DatBan.setForeground(Color.black);
        btn_ThongKe.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_qlyNhanVien.setForeground(Color.black);
        btn_qly_ban.setForeground(Color.black);
        btn_hdsd.setForeground(Color.black);
    }//GEN-LAST:event_btn_qly_monActionPerformed

    private void btn_TrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TrangChuActionPerformed
        // TODO add your handling code here:        
        P_chucNang.removeAll();
        P_chucNang.setLayout(new java.awt.BorderLayout());
        
        anhManHinhChinh = new javax.swing.JLabel();
        P_chucNang.add(anhManHinhChinh);
        anhManHinhChinh.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("icon/Thai_restaurant_resized_900x600.png")));
        
        P_chucNang.validate();
        P_chucNang.repaint();
        
        btn_TrangChu.setBackground(Color.darkGray);
        btn_TrangChu.setForeground(Color.GREEN);
        
        btn_qly_ban.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
        btn_DatBan.setForeground(Color.black);
        btn_qly_ban.setForeground(Color.black);
        btn_ThongKe.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_qlyNhanVien.setForeground(Color.black);
        btn_qly_mon.setForeground(Color.black);
        btn_hdsd.setForeground(Color.black);
    }//GEN-LAST:event_btn_TrangChuActionPerformed

    private void btn_DatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DatBanActionPerformed
        // TODO add your handling code here:
        ManHinh_DatBan db = new ManHinh_DatBan(nhanvien);
        
        JTabbedPane tabDatBan = new JTabbedPane();
        tabDatBan.addTab("Đặt bàn", db);
        
        P_chucNang.removeAll();
        P_chucNang.setLayout(new java.awt.BorderLayout());
        P_chucNang.add(tabDatBan);
        P_chucNang.validate();
        P_chucNang.repaint();
        
        
        btn_DatBan.setBackground(Color.darkGray);
        btn_DatBan.setForeground(Color.GREEN);
        
        btn_TrangChu.setBackground(Color.white);
        btn_qly_ban.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
        btn_TrangChu.setForeground(Color.black);
        btn_qly_ban.setForeground(Color.black);
        btn_ThongKe.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_qlyNhanVien.setForeground(Color.black);
        btn_qly_mon.setForeground(Color.black);
        btn_hdsd.setForeground(Color.black);
    }//GEN-LAST:event_btn_DatBanActionPerformed

    private void btn_ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongKeActionPerformed
        // TODO add your handling code here:
        ThongKeDoanhThu tkdt = new ThongKeDoanhThu();
        ThongKeKhachHang tkkh = new ThongKeKhachHang();
        ThongKeNhanVien tknv = new ThongKeNhanVien();
        ThongKeSanPham tksp = new ThongKeSanPham();
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        
        JTabbedPane tabThongKe = new JTabbedPane();
        tabThongKe.addTab("Danh Sách Hóa Đơn", dshd);
        tabThongKe.addTab("Thống kê Doanh thu", tkdt);
        tabThongKe.addTab("Thống kê Khách hàng", tkkh);
        tabThongKe.addTab("Thống kê Nhân viên", tknv);
        tabThongKe.addTab("Thống kê Sản phẩm", tksp);
        
        P_chucNang.removeAll();
        P_chucNang.setLayout(new java.awt.BorderLayout());
        P_chucNang.add(tabThongKe);
        P_chucNang.validate();
        P_chucNang.repaint();
        
        btn_ThongKe.setBackground(Color.darkGray);
        btn_ThongKe.setForeground(Color.GREEN);
        
        btn_TrangChu.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_ban.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
        btn_TrangChu.setForeground(Color.black);
        btn_DatBan.setForeground(Color.black);
        btn_qly_mon.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_qlyNhanVien.setForeground(Color.black);
        btn_qly_ban.setForeground(Color.black);
        btn_hdsd.setForeground(Color.black);
    }//GEN-LAST:event_btn_ThongKeActionPerformed

    private void btn_qlyKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qlyKhachHangActionPerformed
        try {
            // TODO add your handling code here:
            QuanLyKhachHang qlkh = new QuanLyKhachHang();
            
            JTabbedPane tabKhachHang = new JTabbedPane();
            tabKhachHang.add("Quản lý khách hàng", qlkh);
            
            P_chucNang.removeAll();
            P_chucNang.setLayout(new java.awt.BorderLayout());
            P_chucNang.add(tabKhachHang);
            P_chucNang.validate();
            P_chucNang.repaint();
            
            btn_qlyKhachHang.setBackground(Color.darkGray);
            btn_qlyKhachHang.setForeground(Color.GREEN);

            btn_TrangChu.setBackground(Color.white);
            btn_DatBan.setBackground(Color.white);
            btn_qly_mon.setBackground(Color.white);
            btn_ThongKe.setBackground(Color.white);
            btn_qly_ban.setBackground(Color.white);
            btn_qlyNhanVien.setBackground(Color.white);
            btn_hdsd.setBackground(Color.white);

            btn_TrangChu.setForeground(Color.black);
            btn_DatBan.setForeground(Color.black);
            btn_qly_mon.setForeground(Color.black);
            btn_ThongKe.setForeground(Color.black);
            btn_qlyNhanVien.setForeground(Color.black);
            btn_qly_ban.setForeground(Color.black);
            btn_hdsd.setForeground(Color.black);
        } catch (SQLException ex) {
            Logger.getLogger(ManHinhChinh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_qlyKhachHangActionPerformed

    private void btn_qlyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qlyNhanVienActionPerformed
        // TODO add your handling code here:
        PhanCaNhanVien pcnv = new PhanCaNhanVien();
        XemThongTinNhanVien xemtt = new XemThongTinNhanVien();
        JTabbedPane tabNhanVien = new JTabbedPane();
        tabNhanVien.add("Xem thông tin nhân viên", xemtt);
        tabNhanVien.add("Phân ca nhân viên", pcnv);
        
        P_chucNang.removeAll();
        P_chucNang.setLayout(new java.awt.BorderLayout());
        P_chucNang.add(tabNhanVien);
        P_chucNang.validate();
        P_chucNang.repaint();
        
        btn_qlyNhanVien.setBackground(Color.darkGray);
        btn_qlyNhanVien.setForeground(Color.GREEN);
        
        btn_TrangChu.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_ban.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_hdsd.setBackground(Color.white);
        
        btn_TrangChu.setForeground(Color.black);
        btn_DatBan.setForeground(Color.black);
        btn_qly_mon.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_ThongKe.setForeground(Color.black);
        btn_qly_ban.setForeground(Color.black);
        btn_hdsd.setForeground(Color.black);
    }//GEN-LAST:event_btn_qlyNhanVienActionPerformed

    private void btn_hdsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hdsdActionPerformed
        // TODO add your handling code here:
        
        btn_hdsd.setBackground(Color.darkGray);
        btn_hdsd.setForeground(Color.GREEN);
        
        btn_TrangChu.setBackground(Color.white);
        btn_DatBan.setBackground(Color.white);
        btn_qly_mon.setBackground(Color.white);
        btn_qlyKhachHang.setBackground(Color.white);
        btn_qly_ban.setBackground(Color.white);
        btn_ThongKe.setBackground(Color.white);
        btn_qlyNhanVien.setBackground(Color.white);
        
        btn_TrangChu.setForeground(Color.black);
        btn_DatBan.setForeground(Color.black);
        btn_qly_mon.setForeground(Color.black);
        btn_qlyKhachHang.setForeground(Color.black);
        btn_ThongKe.setForeground(Color.black);
        btn_qly_ban.setForeground(Color.black);
        btn_qlyNhanVien.setForeground(Color.black);
    }//GEN-LAST:event_btn_hdsdActionPerformed

    private void btn_dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangxuatActionPerformed
        // TODO add your handling code here:
        jPopupMenu1.show(btn_dangxuat, 0, btn_dangxuat.getHeight());
    }//GEN-LAST:event_btn_dangxuatActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(this, "Thông tin chi tiết nhân viên.");
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        JOptionPane.showMessageDialog(this, "Đăng xuất thành công!");
        this.dispose(); // Đóng form hiện tại
        Login Frame_login = new Login();
        Frame_login.setLocationRelativeTo(null);
        Frame_login.setVisible(true);
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
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManHinhChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ManHinhChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_chucNang;
    private javax.swing.JLabel anhManHinhChinh;
    private javax.swing.JButton btn_DatBan;
    private javax.swing.JButton btn_ThongKe;
    private javax.swing.JButton btn_TrangChu;
    private javax.swing.JButton btn_dangxuat;
    private javax.swing.JButton btn_hdsd;
    private javax.swing.JButton btn_qlyKhachHang;
    private javax.swing.JButton btn_qlyNhanVien;
    private javax.swing.JButton btn_qly_ban;
    private javax.swing.JButton btn_qly_mon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel tenNhanVien;
    // End of variables declaration//GEN-END:variables
}
