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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javahero.connection.Connect;
import javahero.emtity.LopHoc;

/**
 *
 * @author pc
 */
public class LopHocDao implements IDAO<LopHoc>{
    private Connection connection=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    @Override
    public LopHoc Insert(LopHoc t) {
         try {
           connection = Connect.open();
            String sql = "insert into sinhvien(ma,ten) values(?,?)";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, t.getMa());
            ps.setString(2, t.getTen());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LopHoc> SetlectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
