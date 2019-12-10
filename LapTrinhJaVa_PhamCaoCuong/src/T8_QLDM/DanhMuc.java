/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8_QLDM;

/**
 *
 * @author phamc
 */
public class DanhMuc implements Comparable<DanhMuc>{
    /*Khai báo kiểu dữ liệu*/
    private String MaSach;
    private String TenSach;
    private Double GiaBia;
    /*Get ,Set Malh , TenSach ,GiaBia*/
    /**
     * @return the MaSach
     */
    public String getMaSach() {
        return MaSach;
    }

    /**
     * @param MaSach the MaSach to set
     */
    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    /**
     * @return the TenSach
     */
    public String getTenSach() {
        return TenSach;
    }

    /**
     * @param TenSach the TenSach to set
     */
    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    /**
     * @return the GiaBia
     */
    public Double getGiaBia() {
        return GiaBia;
    }

    /**
     * @param GiaBia the GiaBia to set
     */
    public void setGiaBia(Double GiaBia) {
        this.GiaBia = GiaBia;
    }
    /*ToStringD sắp xếp theo điểm */
    private String ToStringD()
    {
        String s= String.valueOf(getGiaBia());
        return s; 
    }
    /* sắp xếp theo điểm */
    @Override
    public int compareTo (DanhMuc lh){
        return ToStringD().compareTo(String.valueOf(lh.getGiaBia()));
    }
    /*sắp xếp theo tên  
    @Override
    public int compareTo(DanhMuc lh){
        return TenSach.compareTo(lh.getTenSach());
    }
    */ 
}
