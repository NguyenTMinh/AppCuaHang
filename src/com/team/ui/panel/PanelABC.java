package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import com.team.ui.GUI;

public class PanelABC extends BasePanel{
	private JLabel lb_abc;

	@Override
	public void initUI() {
		setLayout(null);
		setBackground(GUI.colorTheme);
		setVisible(true);
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComp() {
		Font font1 = new Font("Tahoma", Font.BOLD, 20);
		Font font2 = new Font("Tahoma", Font.BOLD, 15);
		lb_abc = createLabel("ABC", 100	, 100, font1, Color.BLACK, GUI.colorTheme);
		add(lb_abc);
	}

}
