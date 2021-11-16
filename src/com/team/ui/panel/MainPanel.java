package com.team.ui.panel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListCuaHang;
import com.team.logic.ListKhachHang;
import com.team.ui.ActionClick;


public class MainPanel extends BasePanel implements ActionClick{
	private ListKhachHang listKhachHang;
	private ListCuaHang listCuaHang;
	private PanelStartApp panelStartApp;
	private PanelDangKy panelDangKy;
	private PanelKhachHangDK panelKhachHangDK;
	private PanelCuaHangDK panelCuaHangDK;
	private PanelABC panelABC;
	
	public MainPanel() {
		listCuaHang = new ListCuaHang();
		listKhachHang = new ListKhachHang();
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
		panelKhachHangDK = new PanelKhachHangDK();
		panelKhachHangDK.setAck(this);
		add(panelKhachHangDK);
		panelCuaHangDK = new PanelCuaHangDK();
		panelCuaHangDK.setAck(this);
		add(panelCuaHangDK);
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
		panelCuaHangDK.setVisible(false);
		panelKhachHangDK.setVisible(false);
		panelDangKy.setVisible(false);
		panelStartApp.setVisible(true);
	}

	@Override
	public void backToDangKy() {
		panelCuaHangDK.setVisible(false);
		panelKhachHangDK.setVisible(false);
		panelDangKy.setVisible(true);
	}

	@Override
	public void toKhachHangDK() {
		panelKhachHangDK.setVisible(true);
		panelDangKy.setVisible(false);
	}

	@Override
	public void addListKhachHang(KhachHang khachHang) {
		this.listKhachHang.addKhachHang(khachHang);
		try {
			listKhachHang.writeDataToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void toCuaHangDK() {
		panelCuaHangDK.setVisible(true);
		panelDangKy.setVisible(false);
	}

	@Override
	public void addListCuaHang(CuaHang cuaHang) {
		this.listCuaHang.addCuaHang(cuaHang);
		try {
			listCuaHang.writeDataToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<CuaHang> getListCH() {
		return this.listCuaHang.getCuaHangs();
	}

	@Override
	public List<KhachHang> getListKH() {
		return this.listKhachHang.getKhachHangs();
	}
	
}
