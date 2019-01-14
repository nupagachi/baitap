/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahero;

import java.util.List;
import java.util.Scanner;
import javahero.Controller.SinhVienCtrl;
import javahero.Controller.dto.SinhVienDTO;

/**
 *
 * @author pc
 */
public class JavaHero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("The student management program");
		System.out.println("1. Add new student");
		System.out.println("2. Display students");
		System.out.println("3. Update student");
		System.out.println("4. Delete student by name");
		System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice =new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
                            Insert();
                            break;
			case 2:
                            SelectAll();
                            break;
                        case 3:
                            Update();
                            break;
                        case 4:
                            Delete();
                            break;
                        case 5:   
                            break;
		}
	}
	


    private static void SelectAll() {
        SinhVienCtrl ctrl=new SinhVienCtrl();
        List<SinhVienDTO> SetlectAll = ctrl.SetlectAll();
        for (SinhVienDTO sinhVienDTO : SetlectAll) {
            System.out.println(sinhVienDTO);
        }
        
    }

    
    private static void Insert() {
        
    }

    private static void Delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}	

 
