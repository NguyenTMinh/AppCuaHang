package com.team.ui;

import java.util.List;

import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.logic.ListKhachHang;
import com.team.logic.SanPhamKhachHang;
import javax.swing.DefaultListModel;

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
        void fromGioHang();
        void fromLichSu();
        void fromPhienLamViec();
        void toGioHang();
        void toLichSu();
        ListKhachHang getListKH();
        DefaultListModel<SanPhamKhachHang> model_SanPhamKhachHang();
        void showAllGioHang();
        void showAllLichSu();
        void toDanhSachSanPham();
        void fromDanhSachSanPham();
        void showAllDanhSachSanPham();
}
