/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero.Controller.map;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class DatetoString {
    SimpleDateFormat dateFormat =new SimpleDateFormat("dd-mm-yyyy");

    String CovertString(Date d){
        return dateFormat.format(d);
    }
    
}
