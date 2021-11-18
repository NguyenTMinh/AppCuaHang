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
import com.team.logic.SanPhamKhachHang;
import com.team.ui.ActionClick;
import javax.swing.DefaultListModel;
import sun.net.www.content.image.gif;

public class MainPanel extends BasePanel implements ActionClick {

    private ListKhachHang listKhachHang;
    private ListCuaHang listCuaHang; // giữ tất cả 
    private PanelStartApp panelStartApp;
    private PanelDangKy panelDangKy;
    private PanelKhachHangDK panelKhachHangDK;
    private PanelCuaHangDK panelCuaHangDK;
    private PanelGioHang panelGioHang;
    private PanelPhienLamViecCuaKhachHang panelLamViecKhachHang;
    private PanelLichSu panelLichSu;
    private PanelDSSPKhachHang panelDSSPKhachHang;

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
        panelLamViecKhachHang = new PanelPhienLamViecCuaKhachHang();
        panelLamViecKhachHang.setAck(this);
        add(panelLamViecKhachHang);
        panelGioHang = new PanelGioHang();
        panelGioHang.setAck(this);
        add(panelGioHang);
        panelDSSPKhachHang = new PanelDSSPKhachHang();
        panelDSSPKhachHang.setAck(this);
        add(panelDSSPKhachHang);
        panelLichSu = new PanelLichSu();
        panelLichSu.setAck(this);
        add(panelLichSu);
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
    public void fromGioHang() {
        panelGioHang.setVisible(false);
        panelLamViecKhachHang.setVisible(true);
    }

    @Override
    public void fromPhienLamViec() {
        panelLamViecKhachHang.setVisible(false);
        panelStartApp.setVisible(true);
    }

    @Override
    public void toGioHang() {
        panelGioHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void toLichSu() {
        panelLichSu.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void fromLichSu() {
        panelLichSu.setVisible(false);
        panelLamViecKhachHang.setVisible(true);
    }

    @Override
    public ListKhachHang getListKH() {

        return listKhachHang;
    }

    @Override
    public DefaultListModel<SanPhamKhachHang> model_SanPhamKhachHang() {
        return model_SanPhamKhachHang();
    }

    @Override
    public void showAllGioHang() {
        panelGioHang.setModelList(panelGioHang.getModel_sp());
        panelGioHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void showAllLichSu() {
        panelLichSu.setModelList(panelLichSu.getModel_sp());
        panelLichSu.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void toDanhSachSanPham() {
        panelDSSPKhachHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }

    @Override
    public void fromDanhSachSanPham() {
        panelDSSPKhachHang.setVisible(false);
        panelLamViecKhachHang.setVisible(true);
    }

    @Override
    public void showAllDanhSachSanPham() {
        panelDSSPKhachHang.setModelList(panelDSSPKhachHang.getModel_sp());
        panelDSSPKhachHang.setVisible(true);
        panelLamViecKhachHang.setVisible(false);
    }
}
