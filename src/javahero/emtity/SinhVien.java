/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.emtity;

/**
 *
 * @author pc
 */import java.util.*;
public class SinhVien {
    private long ma;
    private String ten;
    private Date ngaySinh;
    private long maLop;

    public SinhVien() {
    }

    public SinhVien(long ma, String ten, Date ngaySinh, long maLop) {
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public long getMaLop() {
        return maLop;
    }

    public void setMaLop(LopHoc t) {
        this.maLop = t.getMa();
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", maLop=" + maLop + '}';
    }
    
    

    
}
