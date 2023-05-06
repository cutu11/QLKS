/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.text.DecimalFormat;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "khachhang")
@XmlAccessorType(XmlAccessType.FIELD)
public class KhachHang implements Serializable{
    private static final long serialVersionUID = 1L;
    private String TenKH;
    private int CCCD;
    private int SDT;
    private int ID;
    private int GiaPhong;
    private int SoNgayTro;
    private String LoaiPhong;
    private int TongTien;

    public KhachHang() {
    }

    public KhachHang(String TenKH, int CCCD, int SDT, int ID, int GiaPhong, int SoNgayTro, String LoaiPhong, int TongTien) {
        this.TenKH = TenKH;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.ID = ID;
        this.GiaPhong = GiaPhong;
        this.SoNgayTro = SoNgayTro;
        this.LoaiPhong = LoaiPhong;
        this.TongTien = TongTien;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(int GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public int getSoNgayTro() {
        return SoNgayTro;
    }

    public void setSoNgayTro(int SoNgayTro) {
        this.SoNgayTro = SoNgayTro;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }
    public void setTongTien(int TongTien) {
    	this.TongTien = TongTien;
    }
    
    public int getTongTien() {
    	return this.SoNgayTro * this.GiaPhong;
    }
    
    public String getFormattedGiaPhong() {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(this.GiaPhong);
    }

    public String getFormattedTongTien() {
        DecimalFormat decimalFormat = new DecimalFormat("###,### VNĐ");
        return decimalFormat.format(getTongTien());
    }

}