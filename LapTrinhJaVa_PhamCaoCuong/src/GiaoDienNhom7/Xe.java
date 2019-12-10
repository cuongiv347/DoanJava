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
public class Xe {
    LoaiXe LOAIXE;
    private String MaXe;
    private String TenXe;
    private String  DungTich;
    private Integer DonGia;
    public Xe()
    {
    }
    public Xe(LoaiXe LOAIXE, String MaXe, String TenXe, String DungTich, Integer DonGia) {
        this.LOAIXE = LOAIXE;
        this.MaXe = MaXe;
        this.TenXe = TenXe;
        this.DungTich = DungTich;
        this.DonGia = DonGia;
    }
    /**
     * @return the LOAIXE
     */

    /**
     * @param LOAIXE the LOAIXE to set
     */

    /**
     * @return the MaXe
     */
    public String getMaXe() {
        return MaXe;
    }

    /**
     * @param MaXe the MaXe to set
     */
    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    /**
     * @return the TenXe
     */
    public String getTenXe() {
        return TenXe;
    }

    /**
     * @param TenXe the TenXe to set
     */
    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    /**
     * @return the DungTich
     */
    public String getDungTich() {
        return DungTich;
    }

    /**
     * @param DungTich the DungTich to set
     */
    public void setDungTich(String DungTich) {
        this.DungTich = DungTich;
    }

    /**
     * @return the DonGia
     */
    public Integer getDonGia() {
        return DonGia;
    }

    /**
     * @param DonGia the DonGia to set
     */
    public void setDonGia(Integer DonGia) {
        this.DonGia = DonGia;
    }
     /**
     * @return the LOAIXE
     */
    public LoaiXe getLOAIXE() {
        return LOAIXE;
    }
    /**
     * @param LOAIXE the LOAIXE to set
     */
    public void setLOAIXE(LoaiXe LOAIXE) {
        this.LOAIXE = LOAIXE;
    }
    @Override
    public String toString() {
        String msg = "";
        msg += MaXe + ";";
        msg += TenXe + ";";
        msg += DungTich + ";";
        msg += LOAIXE.getTenLoai() + ";";
        msg += LOAIXE.getXuatXu()+ ";";
        msg += DonGia + ";";
        msg += LOAIXE.getMaLoai() ;
        msg += "\r\n";

        return msg;
    }

  
}
