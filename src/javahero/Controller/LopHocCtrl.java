/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javahero.Controller.dto.LopHocDTO;
import javahero.Controller.dto.SinhVienDTO;
import javahero.Controller.map.LopHocMapping;
import javahero.dao.LopHocDao;
import javahero.emtity.LopHoc;
import javahero.emtity.SinhVien;

/**
 *
 * @author pc
 */
public class LopHocCtrl implements IController<LopHocDTO>{
    LopHocMapping mapping=new LopHocMapping();
    LopHocDao dao=new LopHocDao();
    @Override
    public LopHocDTO Insert(LopHocDTO t) {
        LopHoc toEntity = mapping.toEntity(t);
        return mapping.toDTO(dao.Insert(toEntity));
    }

    @Override
    public List<LopHocDTO> SetlectAll() {
        List<LopHoc> SetlectAll = dao.SetlectAll();
        List<LopHocDTO> collect = SetlectAll.stream().map(new Function<LopHoc, LopHocDTO>() {
            @Override
            public LopHocDTO apply(LopHoc t) {
               return mapping.toDTO(t);
            }
        }).collect(Collectors.toList());
        return collect;
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
