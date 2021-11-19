package com.team.logic;

<<<<<<< HEAD
=======
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
>>>>>>> login/store
import javax.swing.ImageIcon;

public class SanPhamCuaHang {
	private String maSP;
	private String tenSP;
	private String phanLoai;
	private String thongTinChiTiet;
	private int soLuong;
	private long giaTien;
	private ImageIcon anhMH;
	
	public SanPhamCuaHang(String maSP, String tenSP, String phanLoai, String thongTinChiTiet, int soLuong, long giaTien,
			ImageIcon anhMH) {
<<<<<<< HEAD
		super();
=======
>>>>>>> login/store
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.phanLoai = phanLoai;
		this.thongTinChiTiet = thongTinChiTiet;
		this.soLuong = soLuong;
		this.giaTien = giaTien;
<<<<<<< HEAD
		this.anhMH = anhMH;
	}

=======
		if(anhMH == null) {
			try {
				BufferedImage image = ImageIO.read(new File(FileSystem.PATH_IMAGE_DEFAULT));
				this.anhMH = new ImageIcon(image.getScaledInstance(50, 50, BufferedImage.SCALE_SMOOTH),FileSystem.PATH_IMAGE_DEFAULT);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			this.anhMH = anhMH;
		}
		
	}


>>>>>>> login/store
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
	
	public long getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(long giaTien) {
		this.giaTien = giaTien;
	}

	public String getInfos() {
		String thongTinSP = this.getThongTinChiTiet().replaceAll("\n", "#");
		return this.getMaSP()+"&"+this.getTenSP()+"&"+this.getPhanLoai()+"&"+thongTinSP
				+"&"+String.valueOf(this.getSoLuong())+"&"+String.valueOf(this.getGiaTien())+"&"+this.getAnhMH().getDescription();
	}
<<<<<<< HEAD
=======

	@Override
	public String toString() {
		String thongTinSP = this.getThongTinChiTiet().replaceAll("\n", "#");
		return this.getMaSP()+"\t "+this.getTenSP()+"\t "+this.getPhanLoai()+"\t "+thongTinSP
				+"\t "+String.valueOf(this.getSoLuong())+"\t "+String.valueOf(this.getGiaTien());
	}
>>>>>>> login/store
}
