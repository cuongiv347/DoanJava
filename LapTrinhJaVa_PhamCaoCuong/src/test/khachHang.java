/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Administrator
 */
public class khachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private String diaChi;

    /**
     * @return the maKhachHang
     */
    public khachHang(){
        maKhachHang = "";
        tenKhachHang = "";
        diaChi = "";
    };
    
    public khachHang(String mkh,String tkh,String dc)
    {
        maKhachHang = mkh  ;
       tenKhachHang = tkh;
        diaChi = dc;
    }
    public String getMaKhachHang() {
        return maKhachHang;
    }

    /**
     * @param maKhachHang the maKhachHang to set
     */
    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    /**
     * @return the tenKhachHang
     */
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    /**
     * @param tenKhachHang the tenKhachHang to set
     */
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
