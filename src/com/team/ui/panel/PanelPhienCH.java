package com.team.ui.panel;

import com.team.ui.ActionClick;

import javax.swing.*;
import java.awt.*;

public class PanelPhienCH extends BasePanel{
    private JLabel jLabel_UserName;
    private JButton jButton_Logout;
    private JLabel jLabel_TenCH;

    private JButton jButton_ListSP;
    private JButton jButton_Doanhthu;
    private JButton jButton_CnKhac;

    private ActionClick actionClick_ListSP;

    @Override
    public void initUI() {
        setLayout(null);
        setBackground(Color.white);
        setVisible(true);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font font = new Font("Tahoma",Font.PLAIN,20);
        Font small_font = new Font("Tahoma",Font.CENTER_BASELINE,15);

        jLabel_UserName = creatLabel("UserName",10,12,small_font,Color.black,Color.white);
        add(jLabel_UserName);

        jButton_Logout = creatButton("Đăng xuất", jLabel_UserName.getWidth() + 12, 6,small_font,Color.black,"button_logout");
        jButton_Logout.setSize(100,30);
        jButton_Logout.setFocusable(false);
        jButton_Logout.setBorder(BorderFactory.createEmptyBorder());
        jButton_Logout.setBackground(Color.white);
        add(jButton_Logout);

        jLabel_TenCH = creatLabel("Tên cửa hàng",219,190,small_font,Color.black,Color.white);
        jLabel_TenCH.setSize(350,25);
        add(jLabel_TenCH);

        jButton_ListSP = creatButton("Danh sách sản phẩm",219,220,font,Color.black,"button_ListSP");
        jButton_ListSP.setSize(350,50);
        jButton_ListSP.setFocusable(false);
        jButton_ListSP.setBackground(Color.decode("#97D7D3"));
        add(jButton_ListSP);

        jButton_Doanhthu = creatButton("Doanh thu",219,290,font,Color.black,"button_doanhthu");
        jButton_Doanhthu.setSize(350,50);
        jButton_Doanhthu.setFocusable(false);
        jButton_Doanhthu.setBackground(Color.decode("#97D7D3"));
        add(jButton_Doanhthu);

        jButton_CnKhac = creatButton("Chức năng khác",219,360,font,Color.black,"button_cnkhac");
        jButton_CnKhac.setSize(350,50);
        jButton_CnKhac.setFocusable(false);
        jButton_CnKhac.setBackground(Color.decode("#97D7D3"));
        add(jButton_CnKhac);
    }

    @Override
    protected void handleClick(String name) {
        if (name.equals("button_ListSP")){
            actionClick_ListSP.acctionShowSP();
        }
        else System.out.println("Sai");
    }

    public ActionClick getActionClick_ListSP() {
        return actionClick_ListSP;
    }

    public void setActionClick_ListSP(ActionClick actionClick_ListSP) {
        this.actionClick_ListSP = actionClick_ListSP;
    }
}
