package func;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.KhachHang;
import entity.KhachHangXML;
import utils.FileUtils;

/**
 * StudentFunc class
 * 
 * @author viettuts.vn
 */
public class QuanLyFunc {
    private static final String KhachHang_FILE_NAME = "khachhang.xml";
    private List<KhachHang> listKhachHangs;
    
    public QuanLyFunc() {
        this.listKhachHangs = readListKhachHangs();
    }

    /**
     * Lưu các đối tượng khachhang vào file khachhang.xml
     * 
     * @param khachhangs
     */
    public void writeListKhachHangs(List<KhachHang> khachHangs) {
        KhachHangXML khachHangXML = new KhachHangXML();
        khachHangXML.setKhachHang(khachHangs);
        FileUtils.writeXMLtoFile(KhachHang_FILE_NAME, khachHangXML);
    }

    /**
     * Đọc các đối tượng student từ file student.xml
     * 
     * @return list student
     */
    public List<KhachHang> readListKhachHangs() {
        List<KhachHang> list = new ArrayList<KhachHang>();
        KhachHangXML khachHangXML = (KhachHangXML) FileUtils.readXMLFile(KhachHang_FILE_NAME, KhachHangXML.class);
        if (khachHangXML != null) {
            list = khachHangXML.getKhachHang();
        }
        return list;
    }
    
    

    /**
     * thêm student vào listStudents và lưu listStudents vào file
     * 
     * @param student
     */
    public void add(KhachHang khachhang) {
        //int id = (listKhachHangs.size() > 0) ? (listKhachHangs.size() + 1) : 1;
        //khachhang.setID(id);
        listKhachHangs.add(khachhang);
        writeListKhachHangs(listKhachHangs);
    }
    /**
     * cập nhật student vào listStudents và lưu listStudents vào file
     * 
     * @param 
     */
    public void edit(KhachHang khachhang) {
        int size = listKhachHangs.size();
        for (int i = 0; i < size; i++) {
            if (listKhachHangs.get(i).getID()== khachhang.getID()) {
                listKhachHangs.get(i).setTenKH( khachhang.getTenKH());
                listKhachHangs.get(i).setCCCD(khachhang.getCCCD());
                listKhachHangs.get(i).setSDT(khachhang.getSDT());
                listKhachHangs.get(i).setSoNgayTro(khachhang.getSoNgayTro());
                listKhachHangs.get(i).setLoaiPhong(khachhang.getLoaiPhong());
                listKhachHangs.get(i).setGiaPhong(khachhang.getGiaPhong());
                listKhachHangs.get(i).setTongTien(khachhang.getTongTien());
                writeListKhachHangs(listKhachHangs);
                break;
            }
        }
    }


    /**
     * xóa khachhang từ listKhachHangs và lưu listKhachHangs vào file
     * 
     * @param khachhang
     */
    public boolean delete(KhachHang khachHang) {
        boolean isFound = false;
        int size = listKhachHangs.size();
        for (int i = 0; i < size; i++) {
            if (listKhachHangs.get(i).getID()== khachHang.getID()) {
                khachHang = listKhachHangs.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listKhachHangs.remove(khachHang);
            writeListKhachHangs(listKhachHangs);
            return true;
        }
        return false;
    }
 

    public List<KhachHang> getListKhachHangs() {
        return listKhachHangs;
    }

    public void setListKhachHangs(List<KhachHang> listKhachHangs) {
        this.listKhachHangs = listKhachHangs;
    }
 }