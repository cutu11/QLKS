package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import func.QuanLyFunc;
import entity.KhachHang;
import view.QuanLyView;

public class QuanLyController {
    private QuanLyFunc quanlyDao;
    private QuanLyView quanlyView;

    public QuanLyController(QuanLyView view) {
        this.quanlyView = view;
        quanlyDao = new QuanLyFunc();

        view.addDatPhongListener(new DatPhongListener());
        view.addSuaDuLieuListener(new SuaDuLieuListener());
        view.addClearDuLieutListener(new ClearDuLieutListener());
        view.addTraPhongListener(new TraPhongListener());
        view.addListKhachHangSelectionListener(new ListKhachHangSelectionListener());
    }

    public void showQuanLyView() {
        List<KhachHang> khachhangList = quanlyDao.getListKhachHangs();
        quanlyView.setVisible(true);
        quanlyView.showListKhachHangs(khachhangList);
    }

    /**
     * Lớp AddStudentListener 
     * chứa cài đặt cho sự kiện click button "Add"
     * 
     * @author viettuts.vn
     */
    class DatPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            KhachHang khachhang = quanlyView.getKhachHangInfo();
            if (khachhang != null) {
                quanlyDao.add(khachhang);
                quanlyView.showKhachHangs(khachhang);
                quanlyView.showListKhachHangs(quanlyDao.getListKhachHangs());
                quanlyView.showMessage("Đặt Phòng thành công!");
            }
        }
    }

    /**
     * Lớp EditStudentListener 
     * chứa cài đặt cho sự kiện click button "Edit"
     * 
     * @author viettuts.vn
     */
    class SuaDuLieuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            KhachHang khachhang = quanlyView.getKhachHangInfo();
            if (khachhang != null) {
                quanlyDao.edit(khachhang);
                quanlyView.showKhachHangs(khachhang);
                quanlyView.showListKhachHangs(quanlyDao.getListKhachHangs());
                quanlyView.showMessage("Cập nhật thành công!");
            }
        }
    }

    /**
     * Lớp DeleteStudentListener 
     * chứa cài đặt cho sự kiện click button "Delete"
     * 
     * @author viettuts.vn
     */
    class TraPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            KhachHang khachhang = quanlyView.getKhachHangInfo();
            if (khachhang != null) {
                quanlyDao.delete(khachhang);
                quanlyView.clearKhachHangsInfo();
                quanlyView.showListKhachHangs(quanlyDao.getListKhachHangs());
                quanlyView.showMessage("Trả Phòng thành công!");
            }
        }
    }

    /**
     * Lớp ClearStudentListener 
     * chứa cài đặt cho sự kiện click button "Clear"
     * 
     * @author viettuts.vn
     */
    class ClearDuLieutListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            quanlyView.clearKhachHangsInfo();
        }
    }
    class ListKhachHangSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            quanlyView.fillQuanLyFromSelectedRow();
        }
    }
}
