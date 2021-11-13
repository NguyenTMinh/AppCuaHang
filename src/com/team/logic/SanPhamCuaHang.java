package com.team.logic;

import javax.swing.ImageIcon;

public class SanPhamCuaHang {
	protected String maSP;
	protected String tenSP;
	protected String phanLoai;
	protected String thongTinChiTiet;
	protected int soLuong;
	protected ImageIcon anhMH;
	
	public SanPhamCuaHang(String maSP, String tenSP, String phanLoai, String thongTinChiTiet, int soLuong, ImageIcon anhMH) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.phanLoai = phanLoai;
		this.thongTinChiTiet = thongTinChiTiet;
		this.soLuong = soLuong;
		this.anhMH = anhMH;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getPhanLoai() {
		return phanLoai;
	}

	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}

	public String getThongTinChiTiet() {
		return thongTinChiTiet;
	}

	public void setThongTinChiTiet(String thongTinChiTiet) {
		this.thongTinChiTiet = thongTinChiTiet;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public ImageIcon getAnhMH() {
		return anhMH;
	}

	public void setAnhMH(ImageIcon anhMH) {
		this.anhMH = anhMH;
	}
	
	public String getInfos() {
		return this.getMaSP()+"&"+this.getTenSP()+"&"+this.getPhanLoai()+"&"+this.getThongTinChiTiet()
				+"&"+String.valueOf(this.getSoLuong())+"&"+this.getAnhMH().getDescription();
	}
}
