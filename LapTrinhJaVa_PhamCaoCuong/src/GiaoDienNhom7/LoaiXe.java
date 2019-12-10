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
public class LoaiXe {
    private String MaLoai;
    private String TenLoai;
    private String XuatXu;
    public LoaiXe()
    {
    }
    public LoaiXe(String MaLoai, String TenLoai, String XuatXu) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
        this.XuatXu = XuatXu;
    }
   
    /**
     * @return the MaLoai
     */
    public String getMaLoai() {
        return MaLoai;
    }

    /**
     * @param MaLoai the MaLoai to set
     */
    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    /**
     * @return the TenLoai
     */
    public String getTenLoai() {
        return TenLoai;
    }

    /**
     * @param TenLoai the TenLoai to set
     */
    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    /**
     * @return the XuatXu
     */
    public String getXuatXu() {
        return XuatXu;
    }

    /**
     * @param XuatXu the XuatXu to set
     */
    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }
    
}
