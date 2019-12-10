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

/**
 *
 * @author phamc
 */
public class QuanLyBanHangXe {

    ArrayList<CTDonDatHang> ds = new ArrayList<CTDonDatHang>();
    int index = -1;

    public QuanLyBanHangXe() {
    }

    public ArrayList<CTDonDatHang> getDs() {
        return ds;
    }

    public int getIndex() {
        return index;
    }
    
    //them chi tiet don dat hang
    public void ThemDonDatHang(CTDonDatHang X) {
        ds.add(X);
        index = ds.size() - 1;
    }

    //Xoa chi tiet don dat hang
    public void XoaXe(CTDonDatHang X) {
        for (CTDonDatHang chiTiet : ds) {
            for (int i = 0; i < ds.size(); i++) {
                if (chiTiet.getXE().getMaXe().equals(ds.get(i).getXE().getMaXe())) {
                    ds.remove(chiTiet);
                    index = 0;
                  break;
                }
            }
        }
    }
   

//    public void SuaXe(CTDonDatHang X) {
//       
//        for (CTDonDatHang chiTiet : ds) {
//              for (int i = 0; i < ds.size(); i++) {
//            if (chiTiet.getDONDATHANG().getMaDDH().equals(ds.get(i).getDONDATHANG().getMaDDH())) {
//                chiTiet.getDONDATHANG().setNgayLap(ds.get(i).getDONDATHANG().getNgayLap());
//                chiTiet.setSoLuong(ds.get(i).getSoLuong());
//                chiTiet.ThanhTien();
//            }
//            }
//        }
//    }

    public CTDonDatHang HienThi() {
        return ds.get(index);
    }

    public void GhiThongTin() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("DonHang.txt");
            FileWriter fw = new FileWriter(f, true);

            //Bước 2: Ghi dữ liệu
            for (int i = 0; i < ds.size(); i++) {
                fw.write(ds.get(i).getDONDATHANG() + "#" + ds.get(i).getSoLuong() + "#" + ds.get(i).getXE() + "#" + ds.get(i).ThanhTien());// ghi vào file
                fw.write("\r\n");
            }
            //Bước 3: Đóng luồng
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
    public void GhiThongTin1() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("DonHangDaXoa.txt");
            FileWriter fw = new FileWriter(f, true);

            //Bước 2: Ghi dữ liệu
            for (int i = 0; i < ds.size(); i++) {
                fw.write(ds.get(i).getDONDATHANG() + "#" + ds.get(i).getSoLuong() + "#" + ds.get(i).getXE() + "#" + ds.get(i).ThanhTien());// ghi vào file
                fw.write("\r\n");
            }
            //Bước 3: Đóng luồng
            fw.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
    public void DocThongTin() {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File f = new File("XeLoaiXe.txt");
            FileReader fr = new FileReader(f);

            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            ds.clear();
            while ((line = br.readLine()) != null) {
                String[] str = line.split(";");
                CTDonDatHang X = new CTDonDatHang();
                X.getXE().setMaXe(str[0]);
                X.getXE().setTenXe(str[1]);
                X.getXE().setDungTich(str[2]);
                X.getXE().LOAIXE.setTenLoai(str[3]);
                X.getXE().LOAIXE.setXuatXu(str[4]);
                X.getDONDATHANG().setMaDDH(str[5]);
                X.getDONDATHANG().setNgayLap(str[6]);
                X.setSoLuong(Integer.parseInt(str[7]));
                X.getXE().setDonGia(Integer.parseInt(str[8]));
                X.getXE().LOAIXE.setMaLoai(str[9]);
                ds.add(X);
            }

            //Bước 3: Đóng luồng
            index = 0;
            fr.close();
            br.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }

    }

}
