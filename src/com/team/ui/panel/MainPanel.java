package com.team.ui.panel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;


public class MainPanel extends BasePanel implements ActionClick{
	private PanelDangNhap panelDangNhap;
	private PanelPhienCH panelPhienCH;
	private PanelListSP panelListSP;
	private PanelAddSp panelAddSp;
	private List<SanPhamCuaHang> listSpCH;

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
		/*panelDangNhap = new PanelDangNhap();
		panelDangNhap.setActionClick(this);
		add(panelDangNhap);

		panelPhienCH = new PanelPhienCH();
		panelPhienCH.setActionClick_ListSP(this);
		add(panelPhienCH);*/

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
	public void acctionShowSP() {
		panelListSP.setVisible(true);
		//panelPhienCH.setVisible(false);
		panelAddSp.setVisible(false);
	}

	@Override
	public void addSp() {
		panelListSP.setVisible(false);
		panelAddSp.setVisible(true);
	}

	@Override
	public List<SanPhamCuaHang> listSpCh() {
		listSpCH = new ArrayList<>();
		listSpCH.add(new SanPhamCuaHang("1","Áo thun","Áo","Áo cao cấp",20,150,null));
		listSpCH.add(new SanPhamCuaHang("2","Áo dài tay","Áo","Áo cao cấp",20,200,null));
		return listSpCH;
	}

	@Override
	public DefaultListModel<SanPhamCuaHang> model_SanPhamCH() {
		model_SanPhamCH().addElement(new SanPhamCuaHang("1","Áo thun","Áo","Áo cao cấp",20,150,null));
		model_SanPhamCH().addElement(new SanPhamCuaHang("2","Áo dài tay","Áo","Áo cao cấp",20,200,null));
		return model_SanPhamCH();
	}
}
