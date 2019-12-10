/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T8_DSLH;

/**
 *
 * @author phamc
 */
public class LopHoc implements Comparable<LopHoc>{
    /*Khai báo kiểu dữ liệu*/
    private String MaLop;
    private String TenLop;
    private Double SiSo;
    /*Get ,Set Malh , TenLop ,SiSo*/
    /**
     * @return the MaLop
     */
    public String getMaLop() {
        return MaLop;
    }

    /**
     * @param MaLop the MaLop to set
     */
    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    /**
     * @return the TenLop
     */
    public String getTenLop() {
        return TenLop;
    }

    /**
     * @param TenLop the TenLop to set
     */
    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    /**
     * @return the SiSo
     */
    public Double getSiSo() {
        return SiSo;
    }

    /**
     * @param SiSo the SiSo to set
     */
    public void setSiSo(Double SiSo) {
        this.SiSo = SiSo;
    }
    /*ToStringD sắp xếp theo điểm */
    private String ToStringD()
    {
        String s= String.valueOf(getSiSo());
        return s; 
    }
    /* sắp xếp theo điểm */
    @Override
    public int compareTo (LopHoc lh){
        return ToStringD().compareTo(String.valueOf(lh.getSiSo()));
    }
    /*sắp xếp theo tên  
    @Override
    public int compareTo(LopHoc lh){
        return TenLop.compareTo(lh.getTenLop());
    }
    */ 
}
