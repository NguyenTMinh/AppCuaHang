package com.team.ui;

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
}
