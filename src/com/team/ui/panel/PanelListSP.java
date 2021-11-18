package com.team.ui.panel;

import com.team.logic.FileSystem;
import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PanelListSP extends BasePanel {
    private JButton jButton_findSp;
    private JButton jButton_addSp;
    private JButton jButton_deleteSp;
    private JButton jButton_editSp;
    private JButton jButton_showAllSp;

    private JLabel jLabel_TitleSp;
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
	private JLabel lb_QuayLai;
	private List<SanPhamCuaHang> listSPCH;

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
        Font font2 = new Font("Tahoma", Font.BOLD, 15);

        jLabel_TitleSp = createLabel("Sản phẩm",280,35,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        jLabel_TitleSp.setSize(300,60);
        add(jLabel_TitleSp);

        Icon icon = new ImageIcon(FileSystem.PATH_ICON_RETURN,"comeback");
		lb_QuayLai = new JLabel("<html><u>Quay lại</u></html>", icon, JLabel.CENTER);
		lb_QuayLai.setLocation(20, 20);
		lb_QuayLai.setBackground(Color.WHITE);
		lb_QuayLai.setSize(100,40);
		lb_QuayLai.setFont(font2);
		lb_QuayLai.setOpaque(true);
		lb_QuayLai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!lb_QuayLai.isEnabled()) {
					return;
				}
				clearText();
				actionClick.goBacktoPhienCH();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				if(!lb_QuayLai.isEnabled()) {
					return;
				}
				lb_QuayLai.setForeground(Color.BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				if(!lb_QuayLai.isEnabled()) {
					return;
				}
				lb_QuayLai.setForeground(Color.BLACK);
			}
		});
		add(lb_QuayLai);

        

        // Tao JList
        jPanel_main = new JPanel(); // Táº¡o PanelMain Ä‘á»ƒ chá»©a
        jPanel_main.setBounds(0,150, 786,300);
        jPanel_main.setBackground(Color.decode("#97D7D3"));
        jPanel_main.setLayout(new BorderLayout());

        try {
            image_quanDai = ImageIO.read(new File("src/com/team/ui/Picture/quandai.png"));
            image_aoPhong = ImageIO.read(new File("src/com/team/ui/Picture/aophong.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        imageIcon_aoPhong = new ImageIcon(image_aoPhong.getScaledInstance(100,100,Image.SCALE_SMOOTH));
        listSPCH = new ArrayList<>();
        model_sp = new DefaultListModel<>();
       
//        imageIcon_Quandai = new ImageIcon(image_quanDai.getScaledInstance(100,100,Image.SCALE_SMOOTH));
        imageIcon_aoPhong = new ImageIcon(image_aoPhong.getScaledInstance(100,100,Image.SCALE_SMOOTH));	// Táº¡o model Ä‘á»ƒ add vÃ o JList -- má»—i model lÃ  thá»ƒ hiá»‡n cho 1 sáº£n pháº©m cá»§a cá»­a hÃ ng
//        model_sp.addElement(new SanPhamCuaHang("1","Ã�o thun","Ã�o","Ã�o cao cáº¥p",20,150,imageIcon_aoPhong));
//        model_sp.addElement(new SanPhamCuaHang("2","Ã�o dÃ i tay","Ã�o","Ã�o cao cáº¥p",20,200,imageIcon_aoPhong));
//        model_sp.addElement(new SanPhamCuaHang("3","Ã�o phÃ´ng ","Ã�o","Ã�o cao cáº¥p",20,150,imageIcon_aoPhong));
//        model_sp.addElement(new SanPhamCuaHang("4","Ã�o sÆ¡ mi","Ã�o","Ã�o cao cáº¥p",20,350,imageIcon_aoPhong));
//        model_sp.addElement(new SanPhamCuaHang("5","Quáº§n Ä‘Ã¹i","Quáº§n","Quáº§n cao cáº¥p",20,200,imageIcon_Quandai));
//        model_sp.addElement(new SanPhamCuaHang("6","Quáº§n dÃ i","Quáº§n","Quáº§n cao cáº¥p",20,250,imageIcon_Quandai));

        listsanphamCH = new JList<>(model_sp); // khá»Ÿi táº¡o JList vá»›i cÃ¡c thÃ nh pháº§n bÃªn trong lÃ  cÃ¡c model
        listsanphamCH.setCellRenderer(new PanelSanPhamRender());
        jPanel_main.add(new JScrollPane(listsanphamCH),BorderLayout.CENTER);


        add(jPanel_main); // add PanelMain vÃ o Panel chÃ­nh
//        model_sp.addElement(new SanPhamCuaHang("1","Ã�o thun","Ã�o","Ã�o cao cáº¥p",20,150,imageIcon_aoPhong));
//        listsanphamCH.setModel(model_sp);// add Jlist vÃ o trong 1 ScrollPane , sau Ä‘Ã³ add ScrollPane vÃ o cÃ¡i PanelMain

        jButton_addSp = createButton("Thêm sản phẩm",280,515,sp_font,Color.black,"button_addsp");
        jButton_addSp.setSize(230,40);
        jButton_addSp.setFocusable(false);
        jButton_addSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_addSp);

        jButton_showAllSp = createButton("Tất cả sản phẩm",295,460,sp_font,Color.black,"button_showAllSp");
        jButton_showAllSp.setSize(200,30);
        jButton_showAllSp.setFocusable(false);
        jButton_showAllSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_showAllSp);

        jButton_deleteSp = createButton("Xóa sản phẩm", 10,515,sp_font,Color.black,"button_deletesp");
        jButton_deleteSp.setSize(230,40);
        jButton_deleteSp.setFocusable(false);
        jButton_deleteSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_deleteSp);

        jButton_editSp = createButton("Sửa sản phẩm", 545,515,sp_font,Color.black,"button_editsp");
        jButton_editSp.setSize(230,40);
        jButton_editSp.setFocusable(false);
        jButton_editSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_editSp);

        jButton_findSp = createButton("Tìm sản phầm", 620,110,new Font("Tahoma",Font.PLAIN,15),Color.black,"button_findsp");
        jButton_findSp.setSize(150,30);
        jButton_findSp.setFocusable(false);
        jButton_findSp.setBackground(Color.decode("#97D7D3"));
        add(jButton_findSp);

        textField_findSp = createTextField(200,113,400,sp_font,Color.black);
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

        label_TitleaddSp = createLabel("Sửa sản phẩm",210,35,new Font("Helvetica Neue",Font.CENTER_BASELINE,50),Color.black,Color.white);
        label_TitleaddSp.setSize(400,60);
        label_TitleaddSp.setForeground(Color.decode("#e019b2"));
        label_TitleaddSp.setBackground(null);

        label_maSp = createLabel("Mã sản phẩm",40,148,small_font,Color.decode("#e05ccf"),null);
        label_tenSp = createLabel("Tên sản phẩm",40,198,small_font,Color.decode("#e05ccf"),null);
        label_phanLoai = createLabel("Phân loại",40,248,small_font,Color.decode("#e05ccf"),null);
        label_thongtinChiTiet = createLabel("Chi tiết ",40,298,small_font,Color.decode("#e05ccf"),null);
        label_soLuong = createLabel("Số lượng",40,348,small_font,Color.decode("#e05ccf"),null);
        label_giaTien = createLabel("Giá ",40,398,small_font,Color.decode("#e05ccf"),null);

        button_Xacnhan = createButton("Xác nhận",320,500,new Font("Helvetica Neue",Font.CENTER_BASELINE,25),Color.black,"button_ConfirmEditSp");
        button_return = createButton("Trở lại",5,5,small_font,Color.black,"button_returnList");

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
    
    public void passDataFromListToModel() {
		if(listSPCH.size() > 0) {
			model_sp.addAll(listSPCH);
		}
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
//        listsanphamCH.updateUI();
    }

    public JList<SanPhamCuaHang> getListsanphamCH() {
        return listsanphamCH;
    }

    public void setListsanphamCH(JList<SanPhamCuaHang> listsanphamCH) {
        this.listsanphamCH = listsanphamCH;
    }

    public void remove_PanelListSp(){
    	lb_QuayLai.setEnabled(false);
        jButton_findSp.setVisible(false);
        jButton_addSp.setVisible(false);
        jButton_deleteSp.setVisible(false);
        jButton_editSp.setVisible(false);
        jLabel_TitleSp.setVisible(false);
        jPanel_main.setVisible(false);
        jButton_showAllSp.setVisible(false);
        textField_findSp.setVisible(false);
    }
    public void show_PanelList(){
        jButton_findSp.setVisible(true);
        jButton_addSp.setVisible(true);
        jButton_deleteSp.setVisible(true);
        jButton_editSp.setVisible(true);
        jLabel_TitleSp.setVisible(true);
        jPanel_main.setVisible(true);
        jButton_showAllSp.setVisible(true);
        textField_findSp.setVisible(true);
    }
    public void removeTextField(){
        textField_maSp.setText("");
        textField_tenSp.setText("");
        textField_phanLoai.setText("");
        textField_thongtinChiTiet.setText("");
        textField_soLuong.setText("");
        textField_giaTien.setText("");
    }
    
    private void clearText() {
    	textField_findSp.setText("");
    }

	public List<SanPhamCuaHang> getListSPCH() {
		return listSPCH;
	}

	public void setListSPCH(List<SanPhamCuaHang> listSPCH) {
		this.listSPCH = listSPCH;
	}
    
}
