/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Ban {
    private String maBan, viTri;
    private int soGhe;

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        if(soGhe>1){
            this.soGhe = soGhe;
        }
        else{
            this.soGhe = 2;
        }
    }

    public String getMaBan() {
        return maBan;
    }

    public Ban(String maBan, String viTri, int soGhe) {
        if(maBan.equalsIgnoreCase("")){
            this.maBan = "B000";
        }
        else{
            this.maBan = maBan;
        }
        this.viTri = viTri;
        this.soGhe = soGhe;
    }
    
    // contructer khong them vi tri
    public Ban(String maBan, int soGhe) {
        if(maBan.equalsIgnoreCase("")){
            this.maBan = "B000";
        }
        else{
            this.maBan = maBan;
        }
        this.viTri = "Chưa có vị trí";
        this.soGhe = soGhe;
    }
    
}
