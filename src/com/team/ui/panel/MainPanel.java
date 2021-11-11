package com.team.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import com.team.ui.ActionClick;


public class MainPanel extends BasePanel implements ActionClick{
	private PanelStartApp panelStartApp;
	private PanelDangKy panelDangKy;
	
	public MainPanel() {
	}
	
	@Override
	public void initUI() {
		setBackground(Color.WHITE);
		setLayout(new CardLayout());
	}
	
	@Override
	public void addEvent() {
		
	}
	
	@Override
	public void addComp() {
		panelStartApp = new PanelStartApp();
		panelStartApp.setAck(this);
		add(panelStartApp);
		panelDangKy = new PanelDangKy();
		panelDangKy.setAck(this);
		add(panelDangKy);
	}


	@Override
	public void toDangKy() {
		panelStartApp.setVisible(false);
		panelDangKy.setVisible(true);
	}
	
	@Override
	public void toDangNhap() {
		
	}

	@Override
	public void actionClick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comeBack() {
		panelDangKy.setVisible(false);
		panelStartApp.setVisible(true);
	}
}
