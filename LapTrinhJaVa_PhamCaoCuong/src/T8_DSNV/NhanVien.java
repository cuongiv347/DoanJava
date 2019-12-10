/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8_DSNV;

/**
 *
 * @author phamc
 */
public class NhanVien implements Comparable<NhanVien>{
    /*Khai báo kiểu dữ liệu*/
    private String MaNV;
    private String TenNV;
    private Double NgaySinh;
    /*Get ,Set Malh , TenNV ,NgaySinh*/
    /**
     * @return the MaNV
     */
    public String getMaNV() {
        return MaNV;
    }

    /**
     * @param MaNV the MaNV to set
     */
    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    /**
     * @return the TenNV
     */
    public String getTenNV() {
        return TenNV;
    }

    /**
     * @param TenNV the TenNV to set
     */
    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
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
    public int compareTo (NhanVien lh){
        return ToStringD().compareTo(String.valueOf(lh.getNgaySinh()));
    }
    /*sắp xếp theo tên  
    @Override
    public int compareTo(NhanVien lh){
        return TenNV.compareTo(lh.getTenNV());
    }
    */ 
}
