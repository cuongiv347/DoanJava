/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8_DMSP;

/**
 *
 * @author phamc
 */
public class DanhMuc implements Comparable<DanhMuc>{
    /*Khai báo kiểu dữ liệu*/
    private String MaSP;
    private String TenSP;
    private Double GiaBan;
    /*Get ,Set Malh , TenSP ,GiaBan*/
    /**
     * @return the MaSP
     */
    public String getMaSP() {
        return MaSP;
    }

    /**
     * @param MaSP the MaSP to set
     */
    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    /**
     * @return the TenSP
     */
    public String getTenSP() {
        return TenSP;
    }

    /**
     * @param TenSP the TenSP to set
     */
    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    /**
     * @return the GiaBan
     */
    public Double getGiaBan() {
        return GiaBan;
    }

    /**
     * @param GiaBan the GiaBan to set
     */
    public void setGiaBan(Double GiaBan) {
        this.GiaBan = GiaBan;
    }
    /*ToStringD sắp xếp theo điểm */
    private String ToStringD()
    {
        String s= String.valueOf(getGiaBan());
        return s; 
    }
    /* sắp xếp theo điểm */
    @Override
    public int compareTo (DanhMuc lh){
        return ToStringD().compareTo(String.valueOf(lh.getGiaBan()));
    }
    /*sắp xếp theo tên  
    @Override
    public int compareTo(DanhMuc lh){
        return TenSP.compareTo(lh.getTenSP());
    }
    */ 
}
