/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller.dto;

import java.util.Date;

/**
 *
 * @author pc
 */
public class SinhVienDTO {
    private long ma;
    private String ten;
    private String ngaySinh;
    private long maLop;

    public SinhVienDTO() {
    }

    public SinhVienDTO(long ma, String ten, String ngaySinh, long maLop) {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.maLop = maLop;
    }

    public long getMa() {
        return ma;
    }

    public void setMa(long ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public long getMaLop() {
        return maLop;
    }

    public void setMaLop(LopHocDTO t) {
        this.maLop = t.getMa();
    }

    @Override
    public String toString() {
        return "SinhVienDTO{" + "ma=" + ma + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", maLop=" + maLop + '}';
    }
    
    
}
