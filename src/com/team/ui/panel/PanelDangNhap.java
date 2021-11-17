package com.team.ui.panel;

import com.team.ui.ActionClick;
import com.team.ui.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class PanelDangNhap extends BasePanel{
    private JLabel jLabel_Title;
    private JLabel jLabel_Login;
    private JLabel jLabel_Acc;
    private JLabel jLabel_Pass;

    private JTextField jTextField_Acc;
    private JPasswordField jPasswordField_Pass;

    private JButton jButton_Login;
    private JButton jButton_Return;

    private ActionClick actionClick;

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
        Font big_font = new Font("Tahoma",Font.PLAIN,60);
        Font font = new Font("Tahoma",Font.PLAIN,30);
        Font small_font = new Font("Tahoma",Font.PLAIN,20);

        jLabel_Title = createLabel("STORE",290,50,big_font,Color.BLACK,null);
        jLabel_Title.setSize(220,60);
        add(jLabel_Title);

        jLabel_Login = createLabel("Đăng nhập",322,150,font,Color.black,null);
        add(jLabel_Login);

        jTextField_Acc = createTextField(250,300,320,small_font,Color.black);
        add(jTextField_Acc);
        jLabel_Acc = createLabel("Tài Khoản",138,300,small_font,Color.black,null);
        add(jLabel_Acc);

        jPasswordField_Pass = new JPasswordField();
        jPasswordField_Pass.setFont(small_font);
        jPasswordField_Pass.setSize(320,jTextField_Acc.getHeight());
        jPasswordField_Pass.setLocation(250,360);
        add(jPasswordField_Pass);
        jLabel_Pass = createLabel("Mật Khẩu",140,360,small_font,Color.black,null);
        add(jLabel_Pass);

        jButton_Login = createButton("Xác nhận",315,480,small_font,Color.black,"button_login");
        jButton_Login.setSize(160,50);
        jButton_Login.setBackground(Color.decode("#97D7D3"));
        add(jButton_Login);

        jButton_Return = createButton("Quay lại",10,10,new Font("Tahoma",Font.PLAIN,16),Color.black,"button_return");
        jButton_Return.setBackground(null);
        jButton_Return.setBorder(null);
        jButton_Return.setSize(90,30);
        add(jButton_Return);
    }

    @Override
    protected void handleClick(String name) {
        if(name.equals("button_login")){
            actionClick.actionClick();
        }
        else System.out.println("Sai");
    }

    public ActionClick getActionClick() {
        return actionClick;
    }

    public void setActionClick(ActionClick actionClick) {
        this.actionClick = actionClick;
    }
}
