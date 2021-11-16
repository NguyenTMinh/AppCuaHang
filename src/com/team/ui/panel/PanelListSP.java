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
        JPanel jPanel_main = new JPanel();
        jPanel_main.setBounds(0,150, 786,300);
        jPanel_main.setBackground(Color.decode("#97D7D3"));
        jPanel_main.setLayout(new BorderLayout());

        DefaultListModel<SanPhamCuaHang> model_sp = new DefaultListModel<>();

        model_sp.addElement(new SanPhamCuaHang("1","Áo thun","Áo","Áo cao cấp",20,150,null));
        model_sp.addElement(new SanPhamCuaHang("2","Áo dài tay","Áo","Áo cao cấp",20,200,null));
        model_sp.addElement(new SanPhamCuaHang("3","Áo phông ","Áo","Áo cao cấp",20,150,null));
        model_sp.addElement(new SanPhamCuaHang("4","Áo sơ mi","Áo","Áo cao cấp",20,350,null));
        model_sp.addElement(new SanPhamCuaHang("5","Quần đùi","Quần","Quần cao cấp",20,200,null));
        model_sp.addElement(new SanPhamCuaHang("6","Quần dài","Quần","Quần cao cấp",20,250,null));

        listsanphamCH = new JList<>(model_sp);
        listsanphamCH.setCellRenderer(new PanelSanPhamRender());
        jPanel_main.add(new JScrollPane(listsanphamCH),BorderLayout.CENTER);

        add(jPanel_main);

/*        JPanel jPanel_main = new JPanel();
        jPanel_main.setBounds(0,150, 786,300);
        jPanel_main.setLayout(new FlowLayout());
        jPanel_main.setBackground(Color.decode("#97D7D3"));

        /////////
        JPanel jPanel_sp1 = new JPanel();
        Label label_sp1_maSp = new Label("Ma san pham 1");
        label_sp1_maSp.setFont(sp_font);
        Label label_sp1_tenSp = new Label("Ten san pham");
        label_sp1_tenSp.setFont(sp_font);
        Label label_sp1_giatienSp = new Label("Gia tien");
        label_sp1_giatienSp.setFont(sp_font);
        Label label_sp1_soluongSp = new Label("So luong");
        label_sp1_soluongSp.setFont(sp_font);
        JCheckBox checkBox_sp1 = new JCheckBox();
        checkBox_sp1.setText("Chọn sp 1");
        checkBox_sp1.setBackground(null);

        jPanel_sp1.setBackground(Color.white);
        jPanel_sp1.setLayout(new GridLayout(5,1));
        jPanel_sp1.setBorder(new LineBorder(Color.black));
        jPanel_sp1.add(label_sp1_maSp);
        jPanel_sp1.add(label_sp1_tenSp);
        jPanel_sp1.add(label_sp1_giatienSp);
        jPanel_sp1.add(label_sp1_soluongSp);
        jPanel_sp1.add(checkBox_sp1);

        ////////
        JPanel jPanel_sp2 = new JPanel();
        Label label_sp2_maSp = new Label("Ma san pham 2");
        label_sp2_maSp.setFont(sp_font);
        Label label_sp2_tenSp = new Label("Ten san pham");
        label_sp2_tenSp.setFont(sp_font);
        Label label_sp2_giatienSp = new Label("Gia tien");
        label_sp2_giatienSp.setFont(sp_font);
        Label label_sp2_soluongSp = new Label("So luong");
        label_sp2_soluongSp.setFont(sp_font);
        JCheckBox checkBox_sp2 = new JCheckBox();
        checkBox_sp2.setText("Chọn sp 2");
        checkBox_sp2.setBackground(null);

        jPanel_sp2.setBackground(Color.white);
        jPanel_sp2.setLayout(new GridLayout(5,1));
        jPanel_sp2.setBorder(new LineBorder(Color.black));
        jPanel_sp2.add(label_sp2_maSp);
        jPanel_sp2.add(label_sp2_tenSp);
        jPanel_sp2.add(label_sp2_giatienSp);
        jPanel_sp2.add(label_sp2_soluongSp);
        jPanel_sp2.add(checkBox_sp2);
        ///
        JPanel jPanel_sp3 = new JPanel();
        Label label_sp3_maSp = new Label("Ma san pham 3");
        label_sp3_maSp.setFont(sp_font);
        Label label_sp3_tenSp = new Label("Ten san pham");
        label_sp3_tenSp.setFont(sp_font);
        Label label_sp3_giatienSp = new Label("Gia tien");
        label_sp3_giatienSp.setFont(sp_font);
        Label label_sp3_soluongSp = new Label("So luong");
        label_sp3_soluongSp.setFont(sp_font);
        JCheckBox checkBox_sp3 = new JCheckBox();
        checkBox_sp3.setText("Chọn sp 3");
        checkBox_sp3.setBackground(null);

        jPanel_sp3.setBackground(Color.white);
        jPanel_sp3.setLayout(new GridLayout(5,1));
        jPanel_sp3.setBorder(new LineBorder(Color.black));
        jPanel_sp3.add(label_sp3_maSp);
        jPanel_sp3.add(label_sp3_tenSp);
        jPanel_sp3.add(label_sp3_giatienSp);
        jPanel_sp3.add(label_sp3_soluongSp);
        jPanel_sp3.add(checkBox_sp3);

        JPanel jPanel_sp4 = new JPanel();
        Label label_sp4_maSp = new Label("Ma san pham 4");
        label_sp4_maSp.setFont(sp_font);
        Label label_sp4_tenSp = new Label("Ten san pham");
        label_sp4_tenSp.setFont(sp_font);
        Label label_sp4_giatienSp = new Label("Gia tien");
        label_sp4_giatienSp.setFont(sp_font);
        Label label_sp4_soluongSp = new Label("So luong");
        label_sp4_soluongSp.setFont(sp_font);
        JCheckBox checkBox_sp4 = new JCheckBox();
        checkBox_sp4.setText("Chọn sp 4");
        checkBox_sp4.setBackground(null);

        jPanel_sp4.setBackground(Color.white);
        jPanel_sp4.setLayout(new GridLayout(5,1));
        jPanel_sp4.setBorder(new LineBorder(Color.black));
        jPanel_sp4.add(label_sp4_maSp);
        jPanel_sp4.add(label_sp4_tenSp);
        jPanel_sp4.add(label_sp4_giatienSp);
        jPanel_sp4.add(label_sp4_soluongSp);
        jPanel_sp4.add(checkBox_sp4);

        JPanel jPanel_sp5 = new JPanel();
        Label label_sp5_maSp = new Label("Ma san pham 4");
        label_sp5_maSp.setFont(sp_font);
        Label label_sp5_tenSp = new Label("Ten san pham");
        label_sp5_tenSp.setFont(sp_font);
        Label label_sp5_giatienSp = new Label("Gia tien");
        label_sp5_giatienSp.setFont(sp_font);
        Label label_sp5_soluongSp = new Label("So luong");
        label_sp5_soluongSp.setFont(sp_font);
        JCheckBox checkBox_sp5 = new JCheckBox();
        checkBox_sp5.setText("Chọn sp 4");
        checkBox_sp5.setBackground(null);

        jPanel_sp5.setBackground(Color.white);
        jPanel_sp5.setLayout(new GridLayout(5,1));
        jPanel_sp5.setBorder(new LineBorder(Color.black));
        jPanel_sp5.add(label_sp5_maSp);
        jPanel_sp5.add(label_sp5_tenSp);
        jPanel_sp5.add(label_sp5_giatienSp);
        jPanel_sp5.add(label_sp5_soluongSp);
        jPanel_sp5.add(checkBox_sp5);

        jPanel_main.add(jPanel_sp1);
        jPanel_main.add(jPanel_sp2);
        jPanel_main.add(jPanel_sp3);
        jPanel_main.add(jPanel_sp4);
        jPanel_main.add(jPanel_sp5);
        add(jPanel_main);*/

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
}
