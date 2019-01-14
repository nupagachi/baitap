/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller.map;

import javahero.Controller.dto.LopHocDTO;
import javahero.emtity.LopHoc;

/**
 *
 * @author pc
 */
public class LopHocMapping implements IMapping<LopHoc, LopHocDTO>{

    @Override
    public LopHocDTO toDTO(LopHoc e) {
        LopHocDTO dTO=new LopHocDTO();
        dTO.setMa(e.getMa());
        dTO.setTen(e.getTen());
        return dTO;
    }

    @Override
    public LopHoc toEntity(LopHocDTO d) {
        LopHoc hoc=new LopHoc();
        return hoc;
    }
    
    
}
