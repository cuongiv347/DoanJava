/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan_java_nhom7;

import GiaoDienNhom7.Login;
import GiaoDienNhom7.QLy_XeHoi;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author huy
 */
public class Doan_Java_Nhom7 {
  public static  GiaoDienNhom7.QLy_XeHoi frmTC=new QLy_XeHoi();
//     public static database.clsConnectDB connection = new  database.clsConnectDB ();

    public static void main(String[] args) {
       GiaoDienNhom7.Login frmDN= new   GiaoDienNhom7.Login();
  
       frmDN.show();
    }
   
    
}
