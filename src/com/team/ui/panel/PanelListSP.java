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

public class PanelListSP extends BasePanel {
    private JButton jButton_Return;
    private JButton jButton_findSp;
    private JButton jButton_addSp;
    private JButton jButton_deleteSp;
    private JButton jButton_editSp;
    private JLabel jLabel_TitleSp;
    private JList<SanPhamCuaHang> listsanphamCH;
    private DefaultListModel<SanPhamCuaHang> model_sp;

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

        jLabel_TitleSp = creatLabel("Sản phẩm",280,35,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        jLabel_TitleSp.setSize(300,60);
        add(jLabel_TitleSp);

        jButton_Return = creatButton("Quay lại ",30,8,new Font("Tahoma",Font.PLAIN,16),Color.black,"button_return");
        jButton_Return.setBackground(null);
        jButton_Return.setBorder(null);
        jButton_Return.setFocusable(false);
        jButton_Return.setSize(80,30);
        add(jButton_Return);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(10,10,20,25);
        try {
            Image img = ImageIO.read(getClass().getResource("../Picture/return-48_45247.png"));
            Image dimg = img.getScaledInstance(jLabel.getWidth(), jLabel.getHeight(),
                    Image.SCALE_SMOOTH);
            jLabel.setIcon(new ImageIcon(dimg));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        add(jLabel);

        // Tao JList
        JPanel jPanel_main = new JPanel(); // Tạo PanelMain để chứa
        jPanel_main.setBounds(0,150, 786,300);
        jPanel_main.setBackground(Color.decode("#97D7D3"));
        jPanel_main.setLayout(new BorderLayout());

        model_sp = new DefaultListModel<>(); // Tạo model để add vào JList -- mỗi model là thể hiện cho 1 sản phẩm của cửa hàng
        model_sp.addElement(new SanPhamCuaHang("1","Áo thun","Áo","Áo cao cấp",20,150,null));
        model_sp.addElement(new SanPhamCuaHang("2","Áo dài tay","Áo","Áo cao cấp",20,200,null));
        model_sp.addElement(new SanPhamCuaHang("3","Áo phông ","Áo","Áo cao cấp",20,150,null));
        model_sp.addElement(new SanPhamCuaHang("4","Áo sơ mi","Áo","Áo cao cấp",20,350,null));
        model_sp.addElement(new SanPhamCuaHang("5","Quần đùi","Quần","Quần cao cấp",20,200,null));
        model_sp.addElement(new SanPhamCuaHang("6","Quần dài","Quần","Quần cao cấp",20,250,null));

        listsanphamCH = new JList<>(model_sp); // khởi tạo JList với các thành phần bên trong là các model
        listsanphamCH.setCellRenderer(new PanelSanPhamRender());
        jPanel_main.add(new JScrollPane(listsanphamCH),BorderLayout.CENTER); // add Jlist vào trong 1 ScrollPane , sau đó add ScrollPane vào cái PanelMain

        add(jPanel_main); // add PanelMain vào Panel chính


        jButton_addSp = creatButton("Thêm sản phẩm",280,515,sp_font,Color.black,"button_addsp");
        jButton_addSp.setSize(230,40);
        jButton_addSp.setFocusable(false);
        jButton_addSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_addSp);

        jButton_deleteSp = creatButton("Xóa sản phẩm", 10,515,sp_font,Color.black,"button_deletesp");
        jButton_deleteSp.setSize(230,40);
        jButton_deleteSp.setFocusable(false);
        jButton_deleteSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_deleteSp);

        jButton_editSp = creatButton("Sửa sản phẩm", 545,515,sp_font,Color.black,"button_editsp");
        jButton_editSp.setSize(230,40);
        jButton_editSp.setFocusable(false);
        jButton_editSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_editSp);

        jButton_findSp = creatButton("Tìm sản phầm", 620,110,new Font("Tahoma",Font.PLAIN,15),Color.black,"button_findsp");
        jButton_findSp.setSize(150,30);
        jButton_findSp.setFocusable(false);
        jButton_findSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_findSp);

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
    }
    private void deleteSp(){
        System.out.println("rv");
        DefaultListModel<SanPhamCuaHang> model = (DefaultListModel<SanPhamCuaHang>) listsanphamCH.getModel();
        if (!model.isEmpty() && listsanphamCH.getSelectedIndex()>=0){
            model.remove(listsanphamCH.getSelectedIndex());
        }
        listsanphamCH.setModel(model);
    }

    private void addSp(){
        System.out.println("add");
        actionClick.addSp();

    }

    private ActionClick actionClick;

    public ActionClick getActionClick() {
        return actionClick;
    }

    public void setActionClick(ActionClick actionClick) {
        this.actionClick = actionClick;
    }

    public JList<SanPhamCuaHang> getListsanphamCH() {
        return listsanphamCH;
    }

    public void setListsanphamCH(JList<SanPhamCuaHang> listsanphamCH) {
        this.listsanphamCH = listsanphamCH;
    }


}
