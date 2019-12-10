/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8_DSSV;

/**
 *
 * @author phamc
 */
public class SinhVien implements Comparable<SinhVien>{
    /*Khai báo kiểu dữ liệu*/
    private String MaSV;
    private String HoTen;
    private Double NgaySinh;
    /*Get ,Set Masv , HoTen ,NgaySinh*/
    /**
     * @return the MaSV
     */
    public String getMaSV() {
        return MaSV;
    }

    /**
     * @param MaSV the MaSV to set
     */
    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    /**
     * @return the HoTen
     */
    public String getHoTen() {
        return HoTen;
    }

    /**
     * @param HoTen the HoTen to set
     */
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    /**
     * @return the NgaySinh
     */
    public Double getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Double NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    /*ToStringD sắp xếp theo điểm */
    private String ToStringD()
    {
        String s= String.valueOf(getNgaySinh());
        return s; 
    }
    /* sắp xếp theo điểm */
    @Override
    public int compareTo (SinhVien sv){
        return ToStringD().compareTo(String.valueOf(sv.getNgaySinh()));
    }
    /*sắp xếp theo tên  
    @Override
    public int compareTo(SinhVien sv){
        return HoTen.compareTo(sv.getHoTen());
    }
    */ 
}
