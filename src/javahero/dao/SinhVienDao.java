/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javahero.connection.Connect;
import javahero.emtity.SinhVien;

/**
 *
 * @author pc
 */
public class SinhVienDao implements IDAO<SinhVien>{
    private Connection connection=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    @Override
    public SinhVien Insert(SinhVien t) {
        try {
           connection = Connect.open();
            String sql = "insert into sinhvien(ma,ten,ngaysinh,lophoc) values(?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, t.getMa());
            ps.setLong(4, t.getMaLop());
            ps.setString(2, t.getTen());
            ps.setDate(3, new Date(t.getNgaySinh().getTime()));
            if(ps.executeUpdate()>0){
                System.out.println("insert thanh cong");
                return t;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConnectException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Connect.close(rs, ps, connection);
        }
        return null;
    }

    @Override
    public void UpdateID(long id) {
        try {
            connection = Connect.open();
            String sql = "update sinhvien set ten='canh' where id=?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id); 
            if(ps.executeUpdate()>0){
                System.out.println("update thanh cong");
            }
        } catch (ConnectException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Connect.close(rs, ps, connection);
        }
    }

    @Override
    public List<SinhVien> SetlectAll() {
       List<SinhVien> list=new ArrayList<>();
        try {
            connection = Connect.open();
            String sql = "select * from sinhvien";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            SinhVien t=new SinhVien();
            while(rs.next()){
                t.setMa(rs.getLong("ma"));
                t.setTen(rs.getString("ten"));
                t.setNgaySinh(new java.util.Date(rs.getDate("ngaysinh").getTime()));
                list.add(t);
            }
        } catch (ConnectException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Connect.close(rs, ps, connection);
        }
        return list;
    }

    @Override
    public void DeleteTen(String ten) {
        try {
            connection= Connect.open();
            String sql = "delete  from sinhvien where ten=?";
            ps= connection.prepareStatement(sql);
            ps.setString(1, ten);
            if(ps.executeUpdate()>0){
                System.out.println("delete thanh cong");
            }else{
                System.out.println("noi dung xoa khong co trong DB");
            }
        } catch (ConnectException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Connect.close(rs, ps, connection);
        }
    }
    
}
