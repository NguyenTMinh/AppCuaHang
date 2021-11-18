package com.team.ui.panel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;


public class MainPanel extends BasePanel implements ActionClick{
	private PanelDangNhap panelDangNhap;
	private PanelPhienCH panelPhienCH;
	private PanelListSP panelListSP;
	private PanelAddSp panelAddSp;


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
		panelListSP.setActionClick(this);
		add(panelListSP);

		panelAddSp = new PanelAddSp();
		panelAddSp.setActionClick(this);
		add(panelAddSp);

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
	public void goBacktoLogin() {
		panelDangNhap.setVisible(true);
		panelPhienCH.setVisible(false);
	}

	@Override
	public void goBacktoPhienCH() {
		panelPhienCH.setVisible(true);
		panelListSP.setVisible(false);
	}

	@Override
	public void acctionShowSP() {
		panelListSP.setModelList(panelAddSp.getModel_SpCH());
		panelListSP.setVisible(true);
		panelPhienCH.setVisible(false);
		panelAddSp.setVisible(false);
	}

	@Override
	public void addSp() {
		panelListSP.setVisible(false);
		panelAddSp.setVisible(true);
	}


	@Override
	public DefaultListModel<SanPhamCuaHang> getModel_SpCH() {
		return panelAddSp.getModel_SpCH();
	}

	@Override
	public void backToDangKy() {

	}

	@Override
	public void addListKhachHang(KhachHang khachHang) {

	}

	@Override
	public void toKhachHangDK() {

	}

	@Override
	public void toCuaHangDK() {

	}

	@Override
	public void addListCuaHang(CuaHang cuaHang) {

	}

	@Override
	public void toDangKy() {

	}

	@Override
	public void toDangNhap() {

	}

}
