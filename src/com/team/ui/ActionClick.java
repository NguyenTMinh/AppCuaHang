package com.team.ui;

import com.team.logic.SanPhamCuaHang;

import javax.swing.*;
import java.util.List;

public interface ActionClick {
	void actionClick();
	void dangKidangNhap();
	void comeBack();
	void acctionShowSP();
	void addSp();
	List<SanPhamCuaHang> listSpCh();
	DefaultListModel<SanPhamCuaHang> model_SanPhamCH();
}
