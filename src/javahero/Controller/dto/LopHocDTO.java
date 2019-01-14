/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller.dto;

/**
 *
 * @author pc
 */
public class LopHocDTO {
    private long ma;
    private String ten;

    public LopHocDTO() {
    }

    public LopHocDTO(long ma, String ten) {
        this.ma = ma;
        this.ten = ten;
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
        return "LopHocDTO{" + "ma=" + ma + ", ten=" + ten + '}';
    }
    
}
