/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDienNhom7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;

/**
 *
 * @author phamc
 */
public class listXeHoi {
    private ArrayList<XeHoi> listXeHoi;

    public listXeHoi() {
        listXeHoi = new ArrayList<>();
    }

    public listXeHoi(ArrayList<XeHoi> listXeHoi) {
        this.listXeHoi = listXeHoi;
    }

    public ArrayList<XeHoi> getList() {
        return listXeHoi;
    }

    public void setList(ArrayList<XeHoi> listXeHoi) {
        this.listXeHoi = listXeHoi;
    }

    public void insert(XeHoi xh) {
        listXeHoi.add(xh);
    }
    
    public void delete(int index){
        listXeHoi.remove(index);
    }
     public void update(XeHoi xh, int index){
        listXeHoi.get(index).setnMaXe(xh.getnMaXe());
        listXeHoi.get(index).setnTenXe(xh.getnTenXe());
        listXeHoi.get(index).setnLoaiXe(xh.getnLoaiXe());
        listXeHoi.get(index).setnMau(xh.getnMau());
        listXeHoi.get(index).setnGia(xh.getnGia());
        listXeHoi.get(index).setnNgayNhap(xh.getnNgayNhap());
        listXeHoi.get(index).setnHangXe(xh.getnHangXe());
    }
    public ArrayList<XeHoi> show() {
        return listXeHoi;
    }
    
    public int find(String maXe) {  
        int index = -1;
        for(int i = 0; i < listXeHoi.size(); i++){
            if(maXe.equals(listXeHoi.get(i).getnMaXe())){
                index = i;
            }
        }
        return index;  
    }
    
    public void sortByName() {
        Collections.sort(listXeHoi, new Comparator<XeHoi>() {
            public int compare(XeHoi xh1, XeHoi xh2) {
                return xh1.getnTenXe().compareTo(xh2.getnTenXe());
            }
        });
    }
     public void DocFileUpdate() throws IOException{
        try {
            // tao doi tung luong va lien ket nguoi du lieu
            File f = new File("Xe.txt");
            FileReader fr = new FileReader(f);

            // doc du lieu
            BufferedReader br = new BufferedReader(fr);
            String line;
            listXeHoi.clear();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                XeHoi xeHoi = new XeHoi();
                xeHoi.setnMaXe(str[0]);
                xeHoi.setnTenXe(str[1]);
                xeHoi.setnLoaiXe(str[2]);
                xeHoi.setnMau(str[3]);
                xeHoi.setnGia(str[3]);
                xeHoi.setnNgayNhap(str[3]);
                xeHoi.setnHangXe(str[3]);
                listXeHoi.add(xeHoi);
            }
            // dong luong
            fr.close();
            br.close();
        } catch (IOException ex) {
           System.out.println("Loi doc file: " + ex);
        }
    }
      public void ghiFileCT(){
        try{
            // tao doi tung luong va lien ket nguoi du lieu
            File f = new File("Xe1.txt");
            FileWriter fw =  new FileWriter(f);
            
            // ghi du lieu
            for(XeHoi ct : listXeHoi){
                fw.write(ct.toString());
            }
            
            // dong luong
            fw.close();
        }
        catch(IOException ex){
            System.out.println("Loi doc file: " + ex);
        }
    }
     
}
    