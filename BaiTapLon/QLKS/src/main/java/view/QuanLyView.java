package view;

import entity.KhachHang;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class QuanLyView extends JFrame implements ActionListener, ListSelectionListener {

    public QuanLyView(QuanLyView quanlyView) {
    }
	private JButton DatPhongbtn;
        //private JButton TimKiembtn;
        private JButton TraPhongbtn;
        private JButton Suabtn;
        private JButton Clearbtn;
        private JScrollPane jScrollQuanLyTable;
        private JTable QuanLyJTable;
        
        private JLabel idLabel;
        private JLabel tenLabel;
        private JLabel cccdLabel;
        private JLabel sdtLabel;
        private JLabel songaytroLabel;
        private JLabel loaiphongLabel;
        private JLabel giaLabel;
        private JLabel nhapmaphongLabel;
        
        private JTextField idtextField;
        private JTextField tenTextField;
        private JTextField cccdTextField;
        private JTextField sdtTextField;
        private JTextField songaytroTextField;
        private JTextField loaiphongTextField;
        private JTextField giaTextField;
        private JTextField nhapmaphongTextField;
        
        private String [] columnNames = new String [] {
            "Mã Phòng", "Tên KH", "CCCD", "SĐT", "Số Ngày Trọ", "Loại Phòng", "Giá Phòng", "Tổng Tiền"};
    // định nghĩa dữ liệu mặc định của bẳng student là rỗng
        private Object data = new Object [][] {};
	private JLabel quanlykhachJLabel;
        
    public QuanLyView(){
            initComponents();
        }
        private void initComponents(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        DatPhongbtn = new JButton("Đặt Phòng");
        //TimKiembtn = new JButton("Tìm Kiếm");
        TraPhongbtn = new JButton("Trả Phòng");
        Suabtn = new JButton("Sửa Dữ Liệu");
        Clearbtn = new JButton("Clear Dữ Liệu");
        
        jScrollQuanLyTable = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        QuanLyJTable = new JTable();
        
        
        idLabel = new JLabel("Mã Phòng");
        tenLabel = new JLabel("Tên KH");
        cccdLabel = new JLabel("CCCD");
        sdtLabel = new JLabel("SĐT");
        songaytroLabel = new JLabel("Số Ngày Trọ");
        loaiphongLabel = new JLabel("Loại Phòng");
        giaLabel = new JLabel("Giá Phòng");
        nhapmaphongLabel = new JLabel("Tổng Tiền");
        quanlykhachJLabel = new JLabel("Quản Lý Khách Đặt Phòng");
        Font font = new Font("Arial", Font.BOLD, 25);
        quanlykhachJLabel.setFont(font);
        
        idtextField = new JTextField(6);
        //idtextField.setEditable(false);
        tenTextField = new JTextField(15);
        cccdTextField = new JTextField(15);
        sdtTextField = new JTextField(15);
        songaytroTextField = new JTextField(15);
        loaiphongTextField = new JTextField(15);
        giaTextField = new JTextField(15);
        nhapmaphongTextField = new JTextField(15);
        
        QuanLyJTable.setModel(new DefaultTableModel((Object[][]) data, columnNames));
        jScrollQuanLyTable.setViewportView(QuanLyJTable);
        jScrollQuanLyTable.setPreferredSize(new Dimension (800, 450));
        
        SpringLayout layout = new SpringLayout();
        
        JPanel panel = new JPanel();
        panel.setSize(800, 420);
        panel.setBackground(Color.PINK);
        panel.setLayout(layout);
        panel.add(jScrollQuanLyTable);
        
        panel.add(DatPhongbtn);
        //panel.add(TimKiembtn);
        panel.add(TraPhongbtn);
        panel.add(Suabtn);
        panel.add(Clearbtn);
        
        
        panel.add(idLabel);
        panel.add(tenLabel);
        panel.add(cccdLabel);
        panel.add(sdtLabel);
        panel.add(songaytroLabel);
        panel.add(loaiphongLabel);
        panel.add(giaLabel);
        panel.add(nhapmaphongLabel);
        panel.add(quanlykhachJLabel);
        
        panel.add(idtextField);
        panel.add(tenTextField);
        panel.add(cccdTextField);
        panel.add(sdtTextField);
        panel.add(songaytroTextField);
        panel.add(loaiphongTextField);
        panel.add(giaTextField);
        panel.add(nhapmaphongTextField);
        
        layout.putConstraint(SpringLayout.WEST, idLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, idLabel, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, tenLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, tenLabel, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, cccdLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, cccdLabel, 70, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sdtLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, sdtLabel, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, songaytroLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, songaytroLabel, 130, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, loaiphongLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, loaiphongLabel, 160, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, giaLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, giaLabel, 190, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, nhapmaphongLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, nhapmaphongLabel, 350, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, quanlykhachJLabel, 550, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, quanlykhachJLabel, 10, SpringLayout.NORTH, panel);
        
        
        layout.putConstraint(SpringLayout.WEST, idtextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, idtextField, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, tenTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, tenTextField, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, cccdTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, cccdTextField, 70, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sdtTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, sdtTextField, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, songaytroTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, songaytroTextField, 130, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, loaiphongTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, loaiphongTextField, 160, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, giaTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, giaTextField, 190, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, nhapmaphongTextField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, nhapmaphongTextField, 350, SpringLayout.NORTH, panel);
        
        layout.putConstraint(SpringLayout.WEST, jScrollQuanLyTable, 300, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, jScrollQuanLyTable, 50, SpringLayout.NORTH, panel);
        
        layout.putConstraint(SpringLayout.WEST, DatPhongbtn, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, DatPhongbtn, 220, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, Suabtn, 130, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, Suabtn, 220, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, Clearbtn, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, Clearbtn, 260, SpringLayout.NORTH, panel);
        //layout.putConstraint(SpringLayout.WEST, TimKiembtn, 130, SpringLayout.WEST, panel);
        //layout.putConstraint(SpringLayout.NORTH, TimKiembtn, 350, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, TraPhongbtn, 130, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, TraPhongbtn, 390, SpringLayout.NORTH, panel);
        
        this.add(panel);
        this.pack();
        this.setTitle("Quản Lý Khách Đặt Phòng");
        this.setSize(1150, 600);
        this.setLocationRelativeTo(null);
        // disable Edit and Delete buttons
        Suabtn.setEnabled(false);
        TraPhongbtn.setEnabled(false);
        // enable Add button
        DatPhongbtn.setEnabled(true);
        }
        
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    public void showListKhachHangs(List<KhachHang> list) {
        int size = list.size();
        Object [][] khachhangs = new Object[size][8];
        for (int i = 0; i < size; i++) {
            khachhangs[i][0] = list.get(i).getID();
            khachhangs[i][1] = list.get(i).getTenKH();
            khachhangs[i][2] = list.get(i).getCCCD();
            khachhangs[i][3] = list.get(i).getSDT();
            khachhangs[i][4] = list.get(i).getSoNgayTro();
            khachhangs[i][5] = list.get(i).getLoaiPhong(); 
            khachhangs[i][6] = list.get(i).getGiaPhong();
            khachhangs[i][7] = list.get(i).getFormattedTongTien();
        }
        QuanLyJTable.setModel(new DefaultTableModel(khachhangs, columnNames));
    }
        
    public void fillQuanLyFromSelectedRow() {
        // lấy chỉ số của hàng được chọn 
        int row = QuanLyJTable.getSelectedRow();
        if (row >= 0) {
            idtextField.setText(QuanLyJTable.getModel().getValueAt(row, 0).toString());
            tenTextField.setText(QuanLyJTable.getModel().getValueAt(row, 1).toString());
            cccdTextField.setText(QuanLyJTable.getModel().getValueAt(row, 2).toString());
            sdtTextField.setText(QuanLyJTable.getModel().getValueAt(row, 3).toString());
            songaytroTextField.setText(QuanLyJTable.getModel().getValueAt(row, 4).toString());
            loaiphongTextField.setText(QuanLyJTable.getModel().getValueAt(row, 5).toString());
            giaTextField.setText(QuanLyJTable.getModel().getValueAt(row, 6).toString());
            nhapmaphongTextField.setText(QuanLyJTable.getModel().getValueAt(row, 7).toString());
            // enable Edit and Delete buttons
            Suabtn.setEnabled(true);
            TraPhongbtn.setEnabled(true);
            // disable Add button
            DatPhongbtn.setEnabled(false);
        }
    }
      
    public void clearKhachHangsInfo() {
        idtextField.setText("");
        tenTextField.setText("");
        cccdTextField.setText("");
        sdtTextField.setText("");
        songaytroTextField.setText("");
        loaiphongTextField.setText("");
        giaTextField.setText("");
        nhapmaphongTextField.setText("");
        // disable Edit and Delete buttons
        Suabtn.setEnabled(false);
        TraPhongbtn.setEnabled(false);
        // enable Add button
        DatPhongbtn.setEnabled(true);
    }
    
    public void showKhachHangs(KhachHang khachhang) {
        idtextField.setText("" + khachhang.getID());
        tenTextField.setText("" + khachhang.getTenKH());
        cccdTextField.setText("" + khachhang.getCCCD());
        sdtTextField.setText("" + khachhang.getSDT());
        songaytroTextField.setText("" + khachhang.getSoNgayTro());
        loaiphongTextField.setText("" + khachhang.getLoaiPhong());
        giaTextField.setText("" + khachhang.getGiaPhong());
        // Bật các nút chỉnh sửa và xóa
        Suabtn.setEnabled(true);
        TraPhongbtn.setEnabled(true);
        // Tắt nút đặt phòng
        DatPhongbtn.setEnabled(false);
    }

    public KhachHang getKhachHangInfo() {
        // validate student
        if ( !validateTenKH() || !validateCCCD() || !validateSDT() || !validateLoaiPhong() || !validateSoNgayTro() || !validateGiaPhong()) {
            return null;
        }
        try {
            KhachHang khachhang = new KhachHang();
            if (idtextField.getText() != null && !"".equals(idtextField.getText())) {
                khachhang.setID(Integer.parseInt(idtextField.getText()));
            }

            khachhang.setTenKH(tenTextField.getText().trim());
            khachhang.setCCCD(Integer.parseInt(cccdTextField.getText().trim()));
            khachhang.setSDT(Integer.parseInt(sdtTextField.getText().trim()));
            khachhang.setSoNgayTro(Integer.parseInt(songaytroTextField.getText().trim()));
            khachhang.setLoaiPhong(loaiphongTextField.getText().trim());
            khachhang.setGiaPhong(Integer.parseInt(giaTextField.getText().trim()));
            return khachhang;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
        }
    private boolean validateTenKH() {
        String ten = tenTextField.getText();
        if (ten == null || "".equals(ten.trim())) {
            tenTextField.requestFocus();
            showMessage("Tên KH không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validateCCCD() {
        int cccd = Integer.parseInt(cccdTextField.getText());
        if (cccd < 0) {
            cccdTextField.requestFocus();
            showMessage("CCCD không hợp lệ.");
            return false;
        }
        return true;
    }
    
    private boolean validateSDT() {
        try {
            int sdt = Integer.parseInt(sdtTextField.getText().trim());
            if (sdt < 0) {
                sdtTextField.requestFocus();
                showMessage("SĐT không hợp lệ");
                return false;
            }
        } catch (Exception e) {
            sdtTextField.requestFocus();
            showMessage("SĐT không hợp lệ!");
            return false;
        }
        return true;
    }
    
    private boolean validateSoNgayTro() {
        try {
            int songaytro = Integer.parseInt(songaytroTextField.getText().trim());
            if (songaytro < 0 ) {
                songaytroTextField.requestFocus();
                showMessage("Số ngày trọ không hợp lệ");
                return false;
            }
        } catch (Exception e) {
            songaytroTextField.requestFocus();
            showMessage("Số ngày trọ không hợp lệ!");
            return false;
        }
        return true;
    }
    private boolean validateLoaiPhong() {
            String loaiphong = (loaiphongTextField.getText().trim());
            if (loaiphong == null || "".equals(loaiphong.trim())) {
            	loaiphongTextField.requestFocus();
            showMessage("Loại phòng không được trống.");
            return false;
        }
        return true;
    }
    private boolean validateGiaPhong() {
        try {
            int gia = (int) Integer.parseInt(giaTextField.getText().trim());
            if (gia < 0 ) {
                giaTextField.requestFocus();
                showMessage("Giá phòng không hợp lệ");
                return false;
            }
        } catch (Exception e) {
        	giaTextField.requestFocus();
            showMessage("Giá phòng không hợp lệ!");
            return false;
        }
        return true;
    }
     public void actionPerformed(ActionEvent e) {
    }
    
    public void valueChanged(ListSelectionEvent e) {
    }
    
    public void addDatPhongListener(ActionListener listener) {
        DatPhongbtn.addActionListener(listener);
    }
    
    public void addSuaDuLieuListener(ActionListener listener) {
        Suabtn.addActionListener(listener);
    }
    
    public void addClearDuLieutListener(ActionListener listener) {
        Clearbtn.addActionListener(listener);
    }
    
    public void addTraPhongListener(ActionListener listener) {
        TraPhongbtn.addActionListener(listener);
    }
    public void addListKhachHangSelectionListener(ListSelectionListener listener) {
        QuanLyJTable.getSelectionModel().addListSelectionListener(listener);
    }
}
