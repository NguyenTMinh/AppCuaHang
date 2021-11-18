package com.team.ui.panel;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListCuaHang;
import com.team.logic.ListKhachHang;
import com.team.logic.SanPhamCuaHang;
import com.team.ui.ActionClick;


public class MainPanel extends BasePanel implements ActionClick{
	private ListKhachHang listKhachHang;
	private ListCuaHang listCuaHang;
	private PanelStartApp panelStartApp;
	private PanelDangKy panelDangKy;
	private PanelKhachHangDK panelKhachHangDK;
	private PanelCuaHangDK panelCuaHangDK;
	private PanelDangNhap panelDangNhap;
	private PanelPhienCH panelPhienCH;
	private PanelListSP panelListSP;
	private PanelAddSp panelAddSp;
	
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
	public void goBacktoLogin() {
		panelDangNhap.setVisible(true);
		panelPhienCH.setVisible(false);
	}
	
	@Override
	public void toDangKy() {
		panelStartApp.setVisible(false);
		panelDangKy.setVisible(true);
	}
	
	@Override
	public void toDangNhap() {
		panelStartApp.setVisible(false);
		panelDangNhap.setVisible(true);
	}
	
	@Override
	public void comeBack() {
		panelDangNhap.setVisible(false);
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

	@Override
	public int getRole() {
		return panelStartApp.getRoleAccount();
	}

	@Override
	public void passDataCHToPanel(CuaHang cuaHang) {
		panelPhienCH.setCuaHang(cuaHang);
	}

	@Override
	public void goToPhienCH() {
		panelDangNhap.setVisible(false);
		panelPhienCH.setVisible(true);
	}
	
	@Override
	public void setUserNameCH(String username, String shopname) {
		panelPhienCH.setjLabel_UserName(username);
		panelPhienCH.setjLabel_TenCH(shopname);
	}
	
	//dang nhap vao khach hang 
	@Override
	public void passDataKHToPanel(KhachHang khachHang) {
		
	}

	@Override
	public void setUserNameKH(String name) {
		
	}

	@Override
	public void saveDataCH(CuaHang cuaHang) {
		for (int i = 0; i < listCuaHang.getCuaHangs().size(); i++) {
			if(cuaHang.getTaiKhoan().equals(listCuaHang.getCuaHangs().get(i).getTaiKhoan())) {
				listCuaHang.getCuaHangs().set(i, cuaHang);
				break;
			}
		}
		try {
			listCuaHang.writeDataToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
