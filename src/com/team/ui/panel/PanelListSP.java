package com.team.ui.panel;

import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelListSP extends BasePanel {
    private JButton jButton_Return;
    private JButton jButton_findSp;
    private JButton jButton_addSp;
    private JButton jButton_deleteSp;
    private JButton jButton_editSp;
    private JButton jButton_showAllSp;

    private JLabel jLabel_TitleSp;
    private JLabel jLabel_iconReturn;
    private JList<SanPhamCuaHang> listsanphamCH;
    private DefaultListModel<SanPhamCuaHang> model_sp;

    private ImageIcon imageIcon_Quandai;
    public BufferedImage image_quanDai;

    private ImageIcon imageIcon_aoPhong;
    public BufferedImage image_aoPhong;

    private JPanel panel_editSp;
    private JPanel jPanel_main;

    private JTextField textField_findSp;

    private JTextField textField_maSp;
    private JTextField textField_tenSp;
    private JTextField textField_phanLoai;
    private JTextField textField_thongtinChiTiet;
    private JTextField textField_soLuong;
    private JTextField textField_giaTien;

    private JLabel label_TitleaddSp;
    private JLabel label_maSp;
    private JLabel label_tenSp;
    private JLabel label_phanLoai;
    private JLabel label_thongtinChiTiet;
    private JLabel label_soLuong;
    private JLabel label_giaTien;

    JButton button_Xacnhan;
    JButton button_return;

    @Override
    public void initUI() {
        setLayout(null);
        setVisible(true);
        setBackground(Color.white);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font sp_font = new Font("Tahoma",Font.PLAIN,20);

        jLabel_TitleSp = creatLabel("Sản phẩm",280,20,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        jLabel_TitleSp.setSize(300,60);
        add(jLabel_TitleSp);

        jButton_Return = creatButton("Quay lại ",30,8,new Font("Tahoma",Font.PLAIN,16),Color.black,"button_return");
        jButton_Return.setBackground(null);
        jButton_Return.setBorder(null);
        jButton_Return.setFocusable(false);
        jButton_Return.setSize(80,30);
        add(jButton_Return);

        jLabel_iconReturn = new JLabel();
        jLabel_iconReturn.setBounds(10,10,20,25);
        try {
            Image img = ImageIO.read(getClass().getResource("../Picture/return-48_45247.png"));
            Image dimg = img.getScaledInstance(jLabel_iconReturn.getWidth(), jLabel_iconReturn.getHeight(),
                    Image.SCALE_SMOOTH);
            jLabel_iconReturn.setIcon(new ImageIcon(dimg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(jLabel_iconReturn);

        try {
            image_quanDai = ImageIO.read(new File("src/com/team/ui/Picture/quandai.png"));
            image_aoPhong = ImageIO.read(new File("src/com/team/ui/Picture/aophong.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imageIcon_Quandai = new ImageIcon(image_quanDai.getScaledInstance(100,100,Image.SCALE_SMOOTH));
        imageIcon_aoPhong = new ImageIcon(image_aoPhong.getScaledInstance(100,100,Image.SCALE_SMOOTH));

        // Tao JList
        jPanel_main = new JPanel(); // Tạo PanelMain để chứa
        jPanel_main.setBounds(0,150, 786,320);
        jPanel_main.setBackground(Color.decode("#97D7D3"));
        jPanel_main.setLayout(new BorderLayout());

        model_sp = new DefaultListModel<>(); // Tạo model để add vào JList -- mỗi model là thể hiện cho 1 sản phẩm của cửa hàng
        model_sp.addElement(new SanPhamCuaHang("1","Áo thun","Áo","Áo cao cấp",20,150,imageIcon_aoPhong));
        model_sp.addElement(new SanPhamCuaHang("2","Áo dài tay","Áo","Áo cao cấp",20,200,imageIcon_aoPhong));
        model_sp.addElement(new SanPhamCuaHang("3","Áo phông ","Áo","Áo cao cấp",20,150,imageIcon_aoPhong));
        model_sp.addElement(new SanPhamCuaHang("4","Áo sơ mi","Áo","Áo cao cấp",20,350,imageIcon_aoPhong));
        model_sp.addElement(new SanPhamCuaHang("5","Quần đùi","Quần","Quần cao cấp",20,200,imageIcon_Quandai));
        model_sp.addElement(new SanPhamCuaHang("6","Quần dài","Quần","Quần cao cấp",20,250,imageIcon_Quandai));

        listsanphamCH = new JList<>(model_sp); // khởi tạo JList với các thành phần bên trong là các model
        listsanphamCH.setCellRenderer(new PanelSanPhamRender());
        jPanel_main.add(new JScrollPane(listsanphamCH),BorderLayout.CENTER); // add Jlist vào trong 1 ScrollPane , sau đó add ScrollPane vào cái PanelMain

        add(jPanel_main); // add PanelMain vào Panel chính


        jButton_addSp = creatButton("Thêm sản phẩm",280,540,sp_font,Color.black,"button_addsp");
        jButton_addSp.setSize(230,40);
        jButton_addSp.setFocusable(false);
        jButton_addSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_addSp);

        jButton_showAllSp = creatButton("Tất cả sản phẩm",295,480,sp_font,Color.black,"button_showAllSp");
        jButton_showAllSp.setSize(200,30);
        jButton_showAllSp.setFocusable(false);
        jButton_showAllSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_showAllSp);

        jButton_deleteSp = creatButton("Xóa sản phẩm", 10,540,sp_font,Color.black,"button_deletesp");
        jButton_deleteSp.setSize(230,40);
        jButton_deleteSp.setFocusable(false);
        jButton_deleteSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_deleteSp);

        jButton_editSp = creatButton("Sửa sản phẩm", 545,540,sp_font,Color.black,"button_editsp");
        jButton_editSp.setSize(230,40);
        jButton_editSp.setFocusable(false);
        jButton_editSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_editSp);

        jButton_findSp = creatButton("Tìm sản phầm", 620,110,new Font("Tahoma",Font.PLAIN,15),Color.black,"button_findsp");
        jButton_findSp.setSize(150,30);
        jButton_findSp.setFocusable(false);
        jButton_findSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_findSp);

        textField_findSp = createTextField(200,100,400,sp_font,Color.black);
        textField_findSp.setSize(400,40);
        add(textField_findSp);



        panel_editSp = new JPanel();
        panel_editSp.setLayout(null);
        panel_editSp.setVisible(false);
        panel_editSp.setBackground(Color.decode("#61149c"));
        panel_editSp.setBounds(0,0,800,650);

        Font small_font = new Font("Tahoma",Font.PLAIN,25);

        textField_maSp = createTextField(200,150,400,small_font,Color.black);
        textField_tenSp = createTextField(200,200,400,small_font,Color.black);
        textField_phanLoai = createTextField(200,250,400,small_font,Color.black);
        textField_thongtinChiTiet = createTextField(200,300,400,small_font,Color.black);
        textField_soLuong = createTextField(200,350,400,small_font,Color.black);
        textField_giaTien = createTextField(200,400,400,small_font,Color.black);

        label_TitleaddSp = creatLabel("Sửa sản phẩm",210,35,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        label_TitleaddSp.setSize(400,60);
        label_TitleaddSp.setForeground(Color.decode("#e019b2"));
        label_TitleaddSp.setBackground(null);

        label_maSp = creatLabel("Mã sản phẩm",40,148,small_font,Color.decode("#e05ccf"),null);
        label_tenSp = creatLabel("Tên sản phẩm",40,198,small_font,Color.decode("#e05ccf"),null);
        label_phanLoai = creatLabel("Phân loại",40,248,small_font,Color.decode("#e05ccf"),null);
        label_thongtinChiTiet = creatLabel("Chi tiết ",40,298,small_font,Color.decode("#e05ccf"),null);
        label_soLuong = creatLabel("Số lượng ",40,348,small_font,Color.decode("#e05ccf"),null);
        label_giaTien = creatLabel("Giá ",40,398,small_font,Color.decode("#e05ccf"),null);

        button_Xacnhan = creatButton("Xác nhận",320,500,new Font("Helvetica Neue",Font.CENTER_BASELINE,25),Color.black,"button_ConfirmEditSp");
        button_return = creatButton("Trở lại",5,5,small_font,Color.black,"button_returnList");

        panel_editSp.add(textField_maSp);
        panel_editSp.add(textField_tenSp);
        panel_editSp.add(textField_phanLoai);
        panel_editSp.add(textField_thongtinChiTiet);
        panel_editSp.add(textField_soLuong);
        panel_editSp.add(textField_giaTien);

        panel_editSp.add(label_TitleaddSp);
        panel_editSp.add(label_maSp);
        panel_editSp.add(label_tenSp);
        panel_editSp.add(label_phanLoai);
        panel_editSp.add(label_thongtinChiTiet);
        panel_editSp.add(label_soLuong);
        panel_editSp.add(label_giaTien);

        panel_editSp.add(button_Xacnhan);
        panel_editSp.add(button_return);

        add(panel_editSp);
    }

    @Override
    protected void handleClick(String name) {
        if (name.equals("button_addsp")){
            this.addSp();
            return;
        }

        if(name.equals("button_deletesp")){
            this.deleteSp();
            return;
        }

        if (name.equals("button_return")){
            actionClick.goBacktoPhienCH();
        }

        if(name.equals("button_editsp")){
            this.editSp();
            return;
        }

        if (name.equals("button_returnList")){
            panel_editSp.setVisible(false);
            show_PanelList();
        }

        if (name.equals("button_ConfirmEditSp")){
            DefaultListModel<SanPhamCuaHang> model = (DefaultListModel<SanPhamCuaHang>) listsanphamCH.getModel();
            if (!model.isEmpty() && listsanphamCH.getSelectedIndex()>=0){
                if (!textField_maSp.getText().equals("")){
                    model.get(listsanphamCH.getSelectedIndex()).setMaSP(textField_maSp.getText());
                }
                if (!textField_tenSp.getText().equals("")){
                    model.get(listsanphamCH.getSelectedIndex()).setTenSP(textField_tenSp.getText());
                }
                if (!textField_phanLoai.getText().equals("")){
                    model.get(listsanphamCH.getSelectedIndex()).setPhanLoai(textField_phanLoai.getText());
                }
                if (!textField_thongtinChiTiet.getText().equals("")){
                    model.get(listsanphamCH.getSelectedIndex()).setThongTinChiTiet(textField_thongtinChiTiet.getText());
                }
                if (!textField_soLuong.getText().equals("")){
                    model.get(listsanphamCH.getSelectedIndex()).setSoLuong(Integer.valueOf(textField_soLuong.getText()));
                }
                if (!textField_giaTien.getText().equals("")){
                    model.get(listsanphamCH.getSelectedIndex()).setGiaTien(Long.valueOf(textField_giaTien.getText()));
                }
            }
            listsanphamCH.setModel(model);
            panel_editSp.setVisible(false);
            removeTextField();
            show_PanelList();
        }

        if (name.equals("button_findsp")){
            int check = 0;
            DefaultListModel<SanPhamCuaHang> model_FullSpCuaHang = (DefaultListModel<SanPhamCuaHang>) listsanphamCH.getModel();
            for (int i = 0; i < model_FullSpCuaHang.size(); i++) {
                if (model_FullSpCuaHang.get(i).getMaSP().equals(textField_findSp.getText())){
                    DefaultListModel<SanPhamCuaHang> model_SpCanTim = new DefaultListModel<>();
                    model_SpCanTim.addElement(new SanPhamCuaHang(model_FullSpCuaHang.get(i).getMaSP(),model_FullSpCuaHang.get(i).getTenSP(),model_FullSpCuaHang.get(i).getPhanLoai(),model_FullSpCuaHang.get(i).getThongTinChiTiet(),model_FullSpCuaHang.get(i).getSoLuong(),model_FullSpCuaHang.get(i).getGiaTien(),model_FullSpCuaHang.get(i).getAnhMH()));
                    listsanphamCH.setModel(model_SpCanTim);
                    check +=1;
                    break;
                }
            }
            if (check == 0){
                JOptionPane.showConfirmDialog(null,"Không có sản phẩm","Error",JOptionPane.CLOSED_OPTION);
            }
        }

        if (name.equals("button_showAllSp")){
            actionClick.acctionShowSP();
        }
    }
    private void deleteSp(){
        DefaultListModel<SanPhamCuaHang> model = (DefaultListModel<SanPhamCuaHang>) listsanphamCH.getModel();
        if (!model.isEmpty() && listsanphamCH.getSelectedIndex()>=0){
            model.remove(listsanphamCH.getSelectedIndex());
        }
        listsanphamCH.setModel(model);
    }

    private void editSp(){
        panel_editSp.setVisible(true);
        remove_PanelListSp();
    }

    private void addSp(){
        actionClick.addSp();
    }

    private ActionClick actionClick;

    public ActionClick getActionClick() {
        return actionClick;
    }

    public void setActionClick(ActionClick actionClick) {
        this.actionClick = actionClick;
    }

    public void setModelList(DefaultListModel<SanPhamCuaHang> model) {
        listsanphamCH.setModel(model);
    }

    public JList<SanPhamCuaHang> getListsanphamCH() {
        return listsanphamCH;
    }

    public void setListsanphamCH(JList<SanPhamCuaHang> listsanphamCH) {
        this.listsanphamCH = listsanphamCH;
    }

    public void remove_PanelListSp(){
        jButton_Return.setVisible(false);
        jButton_findSp.setVisible(false);
        jButton_addSp.setVisible(false);
        jButton_deleteSp.setVisible(false);
        jButton_editSp.setVisible(false);
        jLabel_TitleSp.setVisible(false);
        jPanel_main.setVisible(false);
        jLabel_iconReturn.setVisible(false);
    }
    public void show_PanelList(){
        jButton_Return.setVisible(true);
        jButton_findSp.setVisible(true);
        jButton_addSp.setVisible(true);
        jButton_deleteSp.setVisible(true);
        jButton_editSp.setVisible(true);
        jLabel_TitleSp.setVisible(true);
        jPanel_main.setVisible(true);
        jLabel_iconReturn.setVisible(true);
    }
    public void removeTextField(){
        textField_maSp.setText("");
        textField_tenSp.setText("");
        textField_phanLoai.setText("");
        textField_thongtinChiTiet.setText("");
        textField_soLuong.setText("");
        textField_giaTien.setText("");
    }
}
