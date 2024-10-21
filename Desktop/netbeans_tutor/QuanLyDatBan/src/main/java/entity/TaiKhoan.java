/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class TaiKhoan {
    private String maTK, tenTK, chucVu, matKhau;

    public String getMaTK() {
        return maTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getMatKhau() {
        return matKhau;
    }
    
    
    public void setTenTK(String tenTK) {
        if(tenTK.equalsIgnoreCase("")){
            this.tenTK = "TaiKhoanMacDinh000";
        }
        else{
            this.tenTK = tenTK;
        }
    }
    
    // kiem tra dieu kien
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    // kiem tra dieu kien
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public TaiKhoan(String maTK, String tenTK, String chucVu, String matKhau) {
        // can kiem tra dieu kien ma phai dung voi TKXXX
        if(maTK.equalsIgnoreCase("")){
            this.maTK = "TK000";
        }else{
            this.maTK = maTK;
        }
        setTenTK(tenTK);
        setChucVu(chucVu);
        setMatKhau(matKhau);
    }
    
}
