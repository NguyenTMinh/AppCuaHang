package com.team.ui.panel;

import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;

import javax.swing.*;
import java.awt.*;

public class PanelAddSp extends BasePanel{
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

    private JButton button_Xacnhan;
    private JButton button_return;

    private PanelListSP panelListSP = panelListSP = new PanelListSP();

    private DefaultListModel<SanPhamCuaHang> model_SpCH = (DefaultListModel<SanPhamCuaHang>) panelListSP.getListsanphamCH().getModel();
    @Override
    public void initUI() {
        setLayout(null);
        setVisible(true);
        setBackground(Color.decode("#61149c"));
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font small_font = new Font("Tahoma",Font.PLAIN,25);

        textField_maSp = createTextField(200,150,400,small_font,Color.black);
        textField_tenSp = createTextField(200,200,400,small_font,Color.black);
        textField_phanLoai = createTextField(200,250,400,small_font,Color.black);
        textField_thongtinChiTiet = createTextField(200,300,400,small_font,Color.black);
        textField_soLuong = createTextField(200,350,400,small_font,Color.black);
        textField_giaTien = createTextField(200,400,400,small_font,Color.black);

        label_TitleaddSp = creatLabel("Thêm sản phẩm",210,35,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        label_TitleaddSp.setSize(400,60);
        label_TitleaddSp.setForeground(Color.decode("#e019b2"));
        label_TitleaddSp.setBackground(null);

        label_maSp = creatLabel("Mã sản phẩm",40,148,small_font,Color.decode("#e05ccf"),null);
        label_tenSp = creatLabel("Tên sản phẩm",40,198,small_font,Color.decode("#e05ccf"),null);
        label_phanLoai = creatLabel("Phân loại",40,248,small_font,Color.decode("#e05ccf"),null);
        label_thongtinChiTiet = creatLabel("Chi tiết ",40,298,small_font,Color.decode("#e05ccf"),null);
        label_soLuong = creatLabel("Số lượng ",40,348,small_font,Color.decode("#e05ccf"),null);
        label_giaTien = creatLabel("Giá ",40,398,small_font,Color.decode("#e05ccf"),null);

        button_Xacnhan = creatButton("Xác nhận",320,500,new Font("Helvetica Neue",Font.CENTER_BASELINE,25),Color.black,"button_xacNhanAddSp");
        button_return = creatButton("Trở lại",5,5,small_font,Color.black,"button_return");

        add(textField_maSp);
        add(textField_tenSp);
        add(textField_phanLoai);
        add(textField_thongtinChiTiet);
        add(textField_soLuong);
        add(textField_giaTien);

        add(label_TitleaddSp);
        add(label_maSp);
        add(label_tenSp);
        add(label_phanLoai);
        add(label_thongtinChiTiet);
        add(label_soLuong);
        add(label_giaTien);

        add(button_Xacnhan);
        add(button_return);
    }

    @Override
    protected void handleClick(String name) {
        if (name.equals("button_xacNhanAddSp")){
            if (textField_maSp.getText().equals(" ")|| textField_tenSp.getText().equals("")|| textField_phanLoai.getText().equals("")||textField_thongtinChiTiet.getText().equals("") || textField_soLuong.getText().equals("")||textField_giaTien.getText().equals("")){
                JOptionPane.showConfirmDialog(null,"Hãy nhập đầy đủ","Error",JOptionPane.CLOSED_OPTION);
            }
            else {
                model_SpCH.addElement(new SanPhamCuaHang(textField_maSp.getText(),textField_tenSp.getText(),textField_phanLoai.getText(),textField_thongtinChiTiet.getText(),Integer.valueOf(textField_soLuong.getText()),Integer.valueOf(textField_giaTien.getText()),null));
                removeTextField();
                actionClick.acctionShowSP();
            }
        }
        if (name.equals("button_return")){
            removeTextField();
            actionClick.acctionShowSP();
        }
    }
    private ActionClick actionClick;

    public ActionClick getActionClick() {
        return actionClick;
    }

    public void setActionClick(ActionClick actionClick) {
        this.actionClick = actionClick;
    }

    public DefaultListModel<SanPhamCuaHang> getModel_SpCH() {
        return model_SpCH;
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
