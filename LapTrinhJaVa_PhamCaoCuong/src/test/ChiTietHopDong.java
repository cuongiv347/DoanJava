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
public class ChiTietHopDong {
    private String soHD;
    private String maXe;
    private int soNgayThue;
    private int giaThue;
    private hopDong hopdong;
    private Xe xe;

    /**
     * @return the soHD
     */
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
     * @return the maXe
     */
    public String getMaXe() {
        return maXe;
    }

    /**
     * @param maXe the maXe to set
     */
    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    /**
     * @return the soNgayThue
     */
    public int getSoNgayThue() {
        return soNgayThue;
    }

    /**
     * @param soNgayThue the soNgayThue to set
     */
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    /**
     * @return the giaThue
     */
    public float getGiaThue() {
        return giaThue;
    }

    /**
     * @param giaThue the giaThue to set
     */
    public void setGiaThue(int giaThue) {
        this.giaThue = giaThue;
    }

    /**
     * @return the hopdong
     */
    public hopDong getHopdong() {
        return hopdong;
    }

    /**
     * @param hopdong the hopdong to set
     */
    public void setHopdong(hopDong hopdong) {
        this.hopdong = hopdong;
    }

    /**
     * @return the xe
     */
    public Xe getXe() {
        return xe;
    }

    /**
     * @param xe the xe to set
     */
    public void setXe(Xe xe) {
        this.xe = xe;
    }
   public int thanhtien()
   {
       int thanhtien;
       thanhtien = (int) (this.getSoNgayThue() * this.getGiaThue());
        return thanhtien;
   }
    public  double tongcong()
    {
        int tong = 0;
        tong += thanhtien();
        return  tong;
    }

    void setGiaThue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSoNgayThue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
