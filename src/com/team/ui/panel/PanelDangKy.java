package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import com.team.ui.ActionClick;
import com.team.ui.GUI;

public class PanelDangKy extends BasePanel{
	private static final String BACK = "";
	private static final String BT_BACK = "BT_BACK";
	private static final String TITLE = "Bạn muốn đăng ký tài khoản dành cho";
	private static final String DKCH = "Quản lý cửa hàng";
	private static final String BT_DKCH = "BT_DKCH";
	private static final String DKKH = "Khách hàng";
	private static final String BT_DKCKH = "BT_DKCKH";
	private JButton bt_back, bt_DKCuaHang, bt_DKKhachHang;
	private JLabel lb_text, lb_QuayLai;
	
	
	@Override
	public void initUI() {
		setLayout(null);
		setBackground(GUI.colorTheme);
		setVisible(true);
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComp() {
		Font font1 = new Font("Tahoma", Font.BOLD, 20);
		Font font2 = new Font("Tahoma", Font.BOLD, 15);
		Icon icon = new ImageIcon("D:\\Downloads\\ic_arrow_back_ios1.png","comeback");
		lb_QuayLai = new JLabel("Quay lại", icon, JLabel.CENTER);
		lb_QuayLai.setLocation(20, 20);
		lb_QuayLai.setBackground(GUI.colorTheme);
		lb_QuayLai.setSize(100,40);
		lb_QuayLai.setFont(font2);
		lb_QuayLai.setOpaque(true);
		lb_QuayLai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ack.comeBack();
			}
		});
		add(lb_QuayLai);
		lb_text = creatLabel(TITLE, 0, lb_QuayLai.getY()+lb_QuayLai.getHeight()+50, font1, Color.BLACK, GUI.colorTheme);
		int x = GUI.W_SIZE/2 - lb_text.getWidth()/2;
		lb_text.setLocation(x, lb_text.getY());
		add(lb_text);
		bt_DKCuaHang = creatButton(DKCH, 0, lb_text.getY()+lb_text.getHeight()+30, font1, Color.BLACK, BT_DKCH);
		x = GUI.W_SIZE/2 - bt_DKCuaHang.getWidth()/2;
		bt_DKCuaHang.setLocation(x, bt_DKCuaHang.getY());
		add(bt_DKCuaHang);
		bt_DKKhachHang = creatButton(DKKH, 0, bt_DKCuaHang.getY()+bt_DKCuaHang.getHeight()+30, font1, Color.BLACK, BT_DKCKH);
		bt_DKKhachHang.setSize(bt_DKCuaHang.getSize());
		x = GUI.W_SIZE/2 - bt_DKCuaHang.getWidth()/2;
		bt_DKKhachHang.setLocation(x, bt_DKKhachHang.getY());
		add(bt_DKKhachHang);
	}

	private ActionClick ack;

	public ActionClick getAck() {
		return ack;
	}

	public void setAck(ActionClick ack) {
		this.ack = ack;
	}
	
	
}
