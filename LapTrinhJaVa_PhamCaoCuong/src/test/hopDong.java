/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class hopDong{
    private String soHD;
    private String ngayHD;
    private String maHD;
    private khachHang khachhang;

    /**
     * @return the soHD
     */
    public hopDong(){
        soHD = "";
        ngayHD = "";
        maHD = "";
        
    };
    public hopDong(String shd,String nhd,String mhd)
    {
        soHD =shd;
        ngayHD =nhd;
        maHD =mhd;
    }
    public String getSoHD() {
        return soHD;
    }

    /**
     * @param soHD the soHD to set
     */
    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    /**
     * @return the ngayHD
     */
    public String getNgayHD() {
        return ngayHD;
    }

    /**
     * @param ngayHD the ngayHD to set
     */
    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    /**
     * @return the maHD
     */
    public String getMaHD() {
        return maHD;
    }

    /**
     * @param maHD the maHD to set
     */
    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    /**
     * @return the khachhang
     */
    public khachHang getKhachhang() {
        return khachhang;
    }

    /**
     * @param khachhang the khachhang to set
     */
    public void setKhachhang(khachHang khachhang) {
        this.khachhang = khachhang;
    }

    void getSoHD(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNgayHD(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String setSoHD(JTextField txtHopDong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
