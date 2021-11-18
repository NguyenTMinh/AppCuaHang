package com.team.ui;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.SanPhamCuaHang;

import javax.swing.*;
import java.util.List;

public interface ActionClick {
	void actionClick();
	void dangKidangNhap();
	void comeBack();
	void goBacktoLogin();
	void goBacktoPhienCH();
	void acctionShowSP();
	void addSp();
	DefaultListModel<SanPhamCuaHang> getModel_SpCH();

	void backToDangKy();

	void addListKhachHang(KhachHang khachHang);

	void toKhachHangDK();

	void toCuaHangDK();

	void addListCuaHang(CuaHang cuaHang);

	void toDangKy();

	void toDangNhap();
}
