/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDienNhom7;

/**
 *
 * @author phamc
 */
public class DonDatHang {


    private String maDDH;
    private String ngayLap;
    public DonDatHang()
    {
     
    }

    public DonDatHang(String maDDH, String ngayLap) {
        this.maDDH = maDDH;
        this.ngayLap = ngayLap;
    }
     
    
    /**
     * @return the maDDH
     */
    public String getMaDDH() {
        return maDDH;
    }

    /**
     * @param maDDH the maDDH to set
     */
    public void setMaDDH(String maDDH) {
        this.maDDH = maDDH;
    }

    /**
     * @return the ngayLap
     */
    public String getNgayLap() {
        return ngayLap;
    }

    /**
     * @param ngayLap the ngayLap to set
     */
    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

   
}
