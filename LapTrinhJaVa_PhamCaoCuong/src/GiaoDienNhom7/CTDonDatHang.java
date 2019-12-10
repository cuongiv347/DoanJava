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
public class CTDonDatHang {

    private DonDatHang DONDATHANG;
    private Xe XE;
    private Integer soLuong;

    public CTDonDatHang() {
        soLuong = 1;
    }

    public CTDonDatHang(Integer sLuong) {
        soLuong = sLuong;
    }

    /**
     * @return the DONDATHANG
     */
    public DonDatHang getDONDATHANG() {
        return DONDATHANG;
    }

    /**
     * @param DONDATHANG the DONDATHANG to set
     */
    public void setDONDATHANG(DonDatHang DONDATHANG) {
        this.DONDATHANG = DONDATHANG;
    }

    /**
     * @return the XE
     */
    public Xe getXE() {
        return XE;
    }

    /**
     * @param XE the XE to set
     */
    public void setXE(Xe XE) {
        this.XE = XE;
    }

    /**
     * @return the soLuong
     */
    public Integer getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
    public Integer ThanhTien()
   {
       Integer ThanhTien;
      ThanhTien = (Integer) (this.getSoLuong() * this.getXE().getDonGia());
        return ThanhTien;
   }
    public  double tong()
    {
        Integer tong = 0;
        tong += ThanhTien();
        return  tong;
    }
    public String toString() {
        String msg = "";
        msg += XE.getMaXe() + ";";
        msg += XE.getTenXe() + ";";
        msg += XE.getDungTich() + ";";
        msg += XE.LOAIXE.getTenLoai() + ";";
        msg += XE.LOAIXE.getXuatXu()+ ";";
        msg += DONDATHANG.getMaDDH()+ ";";
        msg += DONDATHANG.getNgayLap()+ ";";
        msg += getSoLuong()+ ";";
        msg += XE.getDonGia().toString() + ";";
        msg += XE.LOAIXE.getMaLoai()+ ";";

        msg += "\r\n";

        return msg;
    }
}
