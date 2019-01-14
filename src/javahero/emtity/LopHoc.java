/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.emtity;

import java.util.List;

/**
 *
 * @author pc
 */
public class LopHoc {
    private long ma;
    private String ten;
    private  List<SinhVien> sinhViens;

    public List<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(List<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }

    public LopHoc() {
    }

    public LopHoc(long ma, String ten, List<SinhVien> sinhViens) {
        this.ma = ma;
        this.ten = ten;
        this.sinhViens = sinhViens;
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

    @Override
    public String toString() {
        return "LopHoc{" + "ma=" + ma + ", ten=" + ten + ", sinhViens=" + sinhViens + '}';
    }
    
}
