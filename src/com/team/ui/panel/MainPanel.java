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
	private PanelDangNhap panelDangNhap;
	private PanelPhienCH panelPhienCH;
	private PanelListSP panelListSP;

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
		panelDangNhap = new PanelDangNhap();
		panelDangNhap.setActionClick(this);
		add(panelDangNhap);
		panelPhienCH = new PanelPhienCH();
		panelPhienCH.setActionClick_ListSP(this);
		add(panelPhienCH);
		panelListSP = new PanelListSP();
		add(panelListSP);
	}

	@Override
	public void actionClick() {
		panelPhienCH.setVisible(true);
		panelDangNhap.setVisible(false);
	}

	@Override
	public void dangKidangNhap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comeBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acctionShowSP() {
		panelListSP.setVisible(true);
		panelPhienCH.setVisible(false);
	}


}
