package com.team.ui;

import com.team.logic.SanPhamCuaHang;

import javax.swing.*;
import java.util.List;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListKhachHang;
import com.team.logic.SanPhamCuaHang;

public interface ActionClick {
	void actionClick();
	void dangKidangNhap();
	void comeBack();
	void goBacktoLogin();
	void goBacktoPhienCH();
	void acctionShowSP();
	void addSp();
	DefaultListModel<SanPhamCuaHang> getModel_SpCH();
	void toDangKy();
	void toDangNhap();
	void backToDangKy();
	void toKhachHangDK();
	void toCuaHangDK();
	void addListKhachHang(KhachHang khachHang);
	void addListCuaHang(CuaHang cuaHang);
	List<CuaHang> getListCH();
	List<KhachHang> getListKH();
}
