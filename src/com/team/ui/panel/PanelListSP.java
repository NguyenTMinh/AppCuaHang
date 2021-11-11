package com.team.ui.panel;

import javax.swing.*;
import java.awt.*;

public class PanelListSP extends BasePanel{
    private JButton jButton_Return;

    @Override
    public void initUI() {
        setLayout(null);
        setVisible(true);
        setBackground(Color.yellow);
    }

    @Override
    public void addEvent() {

    }

    @Override
    public void addComp() {
        jButton_Return = creatButton("Quay lại ",10,10,new Font("Tahoma",Font.PLAIN,16),Color.black,"button_return");
        jButton_Return.setBackground(null);
        jButton_Return.setSize(90,30);
        add(jButton_Return);
    }
}
