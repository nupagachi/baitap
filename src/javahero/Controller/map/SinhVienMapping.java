/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller.map;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javahero.Controller.dto.LopHocDTO;
import javahero.Controller.dto.SinhVienDTO;
import javahero.emtity.LopHoc;
import javahero.emtity.SinhVien;

/**
 *
 * @author pc
 */
public class SinhVienMapping implements IMapping<SinhVien, SinhVienDTO>{

    @Override
    public SinhVienDTO toDTO(SinhVien e) {
        SinhVienDTO svdto=new SinhVienDTO();
        svdto.setMa(e.getMa());
        svdto.setTen(e.getTen());
        DatetoString datetoString=new DatetoString();
        svdto.setNgaySinh(datetoString.CovertString(e.getNgaySinh()));
        LopHocMapping hocMapping=new LopHocMapping();
        LopHoc t=new LopHoc();
        LopHocDTO toDTO = hocMapping.toDTO(t);
        svdto.setMaLop(toDTO);
        return svdto;
        
    }

    @Override
    public SinhVien toEntity(SinhVienDTO d) {
        SinhVien sv=new SinhVien();
        sv.setMa(d.getMa());
        sv.setTen(d.getTen());
        String startDateString =d.getNgaySinh();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
        Date startDate = null;    
        try {
            startDate = df.parse(startDateString);
            sv.setNgaySinh(startDate);
        } catch (Exception e) {
        e.printStackTrace();
        }
        LopHocDTO dTO=new LopHocDTO();
        LopHocMapping hocMapping=new LopHocMapping();
        LopHoc toEntity = hocMapping.toEntity(dTO);
        sv.setMaLop(toEntity);

        return sv;
       
    }
    
}
