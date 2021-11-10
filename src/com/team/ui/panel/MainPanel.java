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
		add(panelStartApp);
	}

	@Override
	public void actionClick() {
		
	}

	@Override
	public void dangKidangNhap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comeBack() {
		// TODO Auto-generated method stub
		
	}

	
}
