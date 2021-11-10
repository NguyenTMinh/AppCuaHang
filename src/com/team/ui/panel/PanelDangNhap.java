package com.team.ui.panel;

import javax.swing.*;
import java.awt.*;

public class PanelDangNhap extends BasePanel{
    private JLabel jLabel_Login;

    @Override
    public void initUI() {
        setLayout(null);
        setBackground(Color.green);
        setVisible(true);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        Font font = new Font("Tahoma",Font.PLAIN,60);
        jLabel_Login = creatLabel("STORES",300,50,font,Color.BLACK,Color.white);
        add(jLabel_Login);
    }
}
