/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class QLKhachHang {
      ArrayList<hopDong> ds = new ArrayList<>();
      int index = -1;
       //them 
    public void Themkh(hopDong kh){
        ds.add(kh);
        index = ds.size()-1;
    }
    public hopDong HienThi(){
        return ds.get(index);
    }
    public String HienThiTT(){
        return (index + 1) + "/" + ds.size();
    }
    // truoc
    public void Truoc(){
        if(index == 0)
        {
            return;
        }
        index--;
        
    }
   
    
    
    // sau
    public void Sau(){
        if(index == ds.size()-1){
            return;
        }
        index++;
    }
     public void GhiThongTin() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("mydata.txt");
            FileWriter fw = new FileWriter(f);

            //Bước 2: Ghi dữ liệu
            for (hopDong hd : ds) {
                fw.write(ds.toString());// ghi vào file
            }
            //Bước 3: Đóng luồng
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }

}
