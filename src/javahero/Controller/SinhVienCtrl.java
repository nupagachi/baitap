/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javahero.Controller.dto.SinhVienDTO;
import javahero.Controller.map.SinhVienMapping;
import javahero.dao.SinhVienDao;
import javahero.emtity.SinhVien;

/**
 *
 * @author pc
 */
public class SinhVienCtrl implements IController<SinhVienDTO>{
    SinhVienMapping  mapping=new SinhVienMapping();
    SinhVienDao dao=new SinhVienDao();
    @Override
    public List<SinhVienDTO> SetlectAll() {
        List<SinhVien> SetlectAll = dao.SetlectAll();
        List<SinhVienDTO> collect = SetlectAll.stream().map(new Function<SinhVien, SinhVienDTO>() {
            @Override
            public SinhVienDTO apply(SinhVien t) {
               return mapping.toDTO(t);
            }
        }).collect(Collectors.toList());
        return collect;
        }
    @Override
    public SinhVienDTO Insert(SinhVienDTO t) {
        SinhVien sv = mapping.toEntity(t);
        return mapping.toDTO(dao.Insert(sv));
    }

  

    @Override
    public void UpdateID(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
