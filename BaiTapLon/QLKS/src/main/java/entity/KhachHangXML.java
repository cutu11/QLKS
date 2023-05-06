package entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "khachhangs")
@XmlAccessorType(XmlAccessType.FIELD)
public class KhachHangXML {
    
    private List<KhachHang> khachhang;

    public List<KhachHang> getKhachHang() {
        return khachhang;
    }

    public void setKhachHang(List<KhachHang> khachhang) {
        this.khachhang = khachhang;
    }
}