/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDienNhom7;

import java.io.Serializable;

/**
 *
 * @author phamc
 */
public class XeHoi implements Serializable{
    private String nMaXe;
    private String nTenXe;
    private String nLoaiXe;
    private String nGia;
    private String nMau;
    private String nNgayNhap;
    private String nHangXe;

    public XeHoi(){
        
    }
    public XeHoi(String nMaXe, String nTenXe, String nLoaiXe, String nGia, String nMau, String nNgayNhap, String nHangXe) {
        this.nMaXe = nMaXe;
        this.nTenXe = nTenXe;
        this.nLoaiXe = nLoaiXe;
        this.nGia = nGia;
        this.nMau = nMau;
        this.nNgayNhap = nNgayNhap;
        this.nHangXe = nHangXe;
    }

    /**
     * @return the nMaXe
     */
    public String getnMaXe() {
        return nMaXe;
    }

    /**
     * @param nMaXe the nMaXe to set
     */
    public void setnMaXe(String nMaXe) {
        this.nMaXe = nMaXe;
    }

    /**
     * @return the nTenXe
     */
    public String getnTenXe() {
        return nTenXe;
    }

    /**
     * @param nTenXe the nTenXe to set
     */
    public void setnTenXe(String nTenXe) {
        this.nTenXe = nTenXe;
    }

    /**
     * @return the nLoaiXe
     */
    public String getnLoaiXe() {
        return nLoaiXe;
    }

    /**
     * @param nLoaiXe the nLoaiXe to set
     */
    public void setnLoaiXe(String nLoaiXe) {
        this.nLoaiXe = nLoaiXe;
    }

    /**
     * @return the nGia
     */
    public String getnGia() {
        return nGia;
    }

    /**
     * @param nGia the nGia to set
     */
    public void setnGia(String nGia) {
        this.nGia = nGia;
    }

    /**
     * @return the nMau
     */
    public String getnMau() {
        return nMau;
    }

    /**
     * @param nMau the nMau to set
     */
    public void setnMau(String nMau) {
        this.nMau = nMau;
    }

    /**
     * @return the nNgayNhap
     */
    public String getnNgayNhap() {
        return nNgayNhap;
    }

    /**
     * @param nNgayNhap the nNgayNhap to set
     */
    public void setnNgayNhap(String nNgayNhap) {
        this.nNgayNhap = nNgayNhap;
    }

    /**
     * @return the nHangXe
     */
    public String getnHangXe() {
        return nHangXe;
    }

    /**
     * @param nHangXe the nHangXe to set
     */
    public void setnHangXe(String nHangXe) {
        this.nHangXe = nHangXe;
    }

    @Override
    public String toString() {
        return "AddXes{" + "nMaXe=" + nMaXe + ", nTenXe=" + nTenXe + ", nLoaiXe=" + nLoaiXe + ", nGia=" + nGia + ", nMau=" + nMau + ", nNgayNhap=" + nNgayNhap + ", nHangXe=" + nHangXe + '}';
    }
    
   
}
