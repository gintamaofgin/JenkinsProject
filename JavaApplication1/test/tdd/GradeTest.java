/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import business.GradeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class GradeTest {
    
    // day la 1 cai ham dung de test cai ham chinh cua minh ben class GradeChecker de dam bao rang ham minh viet ra la chay dung nhu ki vong
    // gia su ben checker co nhieu ham, vay thi cu moi ham ben code chinh ta xay dung ben nay mot ham de test ham ben kia
    //p:dau ,  f: rot
    @Test // ham co - nay thi se chay = ownw
    public void testGrade(){
        //ham uoc luong value,asurex)
       
        // ham nay co do luong gia tri tra ve cua ham cho ru
        // ham nay co khop / match/ bang voi cai ki vong hay khong
        // khop --> mau xanh , den thong duong
        // khong hop --> mau do den dung lai code sai voi login
        // vi ko hop gia tri tra ve nhu ki vong
        assertEquals('f', GradeChecker.checkGrade(0));
        // tui hy vong ham cua ban tra ve chu f
        assertEquals('f', GradeChecker.checkGrade(4.9));
        assertEquals('e', GradeChecker.checkGrade(10.5));
   }
    public void testRedTshirt(){
        
    }
    public void testScholaship(){
        
    }
}
