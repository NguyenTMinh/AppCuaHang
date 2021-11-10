package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.team.ui.GUI;

public class PanelStartApp extends BasePanel{
	private static final String APP_NAME = "STORES";
	private JLabel lb_AppName, lb_BanLa, lb_DangKy;
	private JButton bt_CuaHang, bt_KhachHang;
	
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
		Font font1 = new Font("Tahoma", Font.BOLD, 60);
		Font font2 = new Font("Tahoma", Font.BOLD, 15);
		lb_AppName = creatLabel(APP_NAME, 0, 20, font1, Color.BLACK, getBackground());
		int x = GUI.W_SIZE/2 - lb_AppName.getWidth()/2;
		lb_AppName.setLocation(x, lb_AppName.getY());
		add(lb_AppName);
	}

}
