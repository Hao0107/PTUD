/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.Ban;
import entity.LoaiBan;
import gui.Card_Ban;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Ban_DAO {
    public List<Card_Ban> taoDanhSachCardBan(int soLuongBan) {
        List<Card_Ban> danhSachCardBan = new ArrayList<>();
        
        // Duyệt qua và tạo các Card_Ban
        for (int i = 1; i <= soLuongBan; i++) {
            Card_Ban cardBan = new Card_Ban();
            
            // Thiết lập thông tin cho mỗi Card_Ban (tuỳ chỉnh nếu cần)
            cardBan.setlbTitle("Bàn " + i);
            cardBan.setlbValue("Sẵn sàng");
            
            danhSachCardBan.add(cardBan);  // Thêm vào danh sách
        }
        
        return danhSachCardBan;
    }
    
    public List<Card_Ban> taoDanhSachTheoMa(String maBan) {
        List<Card_Ban> danhSachCardBan = new ArrayList<>();
        String sql = "SELECT maBan, maLoai, trangThaiBan, soLuongGhe, viTri FROM Ban WHERE maBan = ?";

        try (Connection con = ConnectDB.getInstance().connect();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Thiết lập giá trị của tham số maBan trong câu truy vấn
            ps.setString(1, maBan);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    // Lấy dữ liệu từ ResultSet
                    String maBanResult = rs.getString("maBan");
                    LoaiBan loaiBan = new LoaiBan(rs.getString("maLoai"));
                    String trangThaiBan = rs.getString("trangThaiBan");
                    int soLuongGhe = rs.getInt("soLuongGhe");
                    String viTri = rs.getString("viTri");

                    // Tạo đối tượng Ban và sau đó là Card_Ban
                    Ban ban = new Ban(maBanResult, loaiBan, trangThaiBan, soLuongGhe, viTri);
                    Card_Ban cardBan = new Card_Ban();

                    // Thiết lập dữ liệu cho mỗi Card_Ban
                    cardBan.setlbTitle("Bàn " + ban.getMaBan());
                    cardBan.setlbValue(ban.getTrangThaiBan());

                    // Thêm Card_Ban vào danh sách
                    danhSachCardBan.add(cardBan);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachCardBan;
    }
    
    public List<Ban> layDanhSachBan() {
        List<Ban> danhSachBan = new ArrayList<>();
        String sql = "SELECT maBan, maLoai, trangThaiBan, soLuongGhe, viTri FROM Ban";

        try (Connection con = ConnectDB.getInstance().connect();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String maBan = rs.getString("maBan");
                LoaiBan loaiBan = new LoaiBan(rs.getString("maLoai"));
                String trangThaiBan = rs.getString("trangThaiBan");
                int soLuongGhe = rs.getInt("soLuongGhe");
                String viTri = rs.getString("viTri");

                Ban ban = new Ban(maBan, loaiBan, trangThaiBan, soLuongGhe, viTri);
                danhSachBan.add(ban);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachBan;
    }
    
    public List<Ban> layDanhSachBanTheoTang(String tang) {
        List<Ban> danhSachBan = new ArrayList<>();
        String sql = "SELECT maBan, maLoai, trangThaiBan, soLuongGhe, viTri FROM Ban WHERE viTri = ?";

        try (Connection con = ConnectDB.getInstance().connect();
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Thiết lập giá trị cho tham số tầng trong câu truy vấn
            ps.setString(1, tang);

            // Thực thi truy vấn và lấy kết quả
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String maBan = rs.getString("maBan");
                    LoaiBan loaiBan = new LoaiBan(rs.getString("maLoai"));
                    String trangThaiBan = rs.getString("trangThaiBan");
                    int soLuongGhe = rs.getInt("soLuongGhe");
                    String viTri = rs.getString("viTri");

                    // Tạo đối tượng Ban từ dữ liệu và thêm vào danh sách
                    Ban ban = new Ban(maBan, loaiBan, trangThaiBan, soLuongGhe, viTri);
                    danhSachBan.add(ban);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachBan;
    }
    
    public List<Ban> layDanhSachBanTheoTangVaSoLuongGhe(String tang, int soLuongGhe) {
        // Lấy danh sách bàn theo tầng trước
        List<Ban> danhSachBanTheoTang = layDanhSachBanTheoTang(tang);

        // Lọc danh sách theo số lượng ghế
        List<Ban> danhSachBanTheoSoLuongGhe = new ArrayList<>();
        for (Ban ban : danhSachBanTheoTang) {
            if (ban.getSoGhe()== soLuongGhe) {
                danhSachBanTheoSoLuongGhe.add(ban);
            }
        }

        return danhSachBanTheoSoLuongGhe;
    }
    public List<Card_Ban> taoDanhSachTangvaGhe(String tang, int ghe) {
        List<Card_Ban> danhSachCardBan = new ArrayList<>();
        List<Ban> danhSachBan = layDanhSachBanTheoTangVaSoLuongGhe(tang, ghe); // Lấy dữ liệu từ cơ sở dữ liệu

        for (Ban ban : danhSachBan) {
            Card_Ban cardBan = new Card_Ban();

            // Thiết lập dữ liệu cho mỗi Card_Ban
            cardBan.setlbTitle("Bàn " + ban.getMaBan());
            cardBan.setlbValue(ban.getTrangThaiBan());
            
            danhSachCardBan.add(cardBan); // Thêm vào danh sách card
        }

        return danhSachCardBan;
    }
    
    public List<Card_Ban> taoDanhSachTang(String tang) {
        List<Card_Ban> danhSachCardBan = new ArrayList<>();
        List<Ban> danhSachBan = layDanhSachBanTheoTang(tang); // Lấy dữ liệu từ cơ sở dữ liệu

        for (Ban ban : danhSachBan) {
            Card_Ban cardBan = new Card_Ban();

            // Thiết lập dữ liệu cho mỗi Card_Ban
            cardBan.setlbTitle("Bàn " + ban.getMaBan());
            cardBan.setlbValue(ban.getTrangThaiBan());
            
            danhSachCardBan.add(cardBan); // Thêm vào danh sách card
        }

        return danhSachCardBan;
    }
    
    public String getTang(String maBan){
        List<Ban> danhSachBan = layDanhSachBan();
        
        for (Ban ban : danhSachBan) {
            if(ban.getMaBan().equalsIgnoreCase(maBan)){
                return ban.getViTri();
            }
        }
        return null;
    }
}
