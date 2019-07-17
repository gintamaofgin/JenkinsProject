/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author ASUS
 */
public class GradeChecker {
    public static char checkGrade(double grade){
        if(grade > 10 || grade < 0){
            return 'e';
        }else{
            if(grade >= 5.0){
            return 'p';
        }else{
            return 'f';
        }
        }
    }
}
