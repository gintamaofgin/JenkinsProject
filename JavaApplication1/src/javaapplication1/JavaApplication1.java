/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import business.GradeChecker;

/**
 *
 * @author ASUS
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(GradeChecker.checkGrade(0));
        System.out.println(GradeChecker.checkGrade(4.909999999));
        System.out.println(GradeChecker.checkGrade(5));
        System.out.println(GradeChecker.checkGrade(10.5));
        // ra mot trang thai khong hop le
        
        
        // test = sout() bang log co rui ro
        // code co tiem an loi logic va ta khong phat hien ra
        // co loi login thi van build ra duoc jar.war
        // ki thuat TDD hay hon 1 muc: code bi loi login
        // cam khong cho ra . .jar,.war
    }
    
}
