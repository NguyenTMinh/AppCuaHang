package com.team.ui;

import java.util.List;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListKhachHang;

public interface ActionClick {
	void actionClick();
	void comeBack();
	void toDangKy();
	void toDangNhap();
	void backToDangKy();
	void toKhachHangDK();
	void toCuaHangDK();
	void addListKhachHang(KhachHang khachHang);
	void addListCuaHang(CuaHang cuaHang);
}
