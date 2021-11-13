package com.team.ui.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.team.logic.CuaHang;
import com.team.logic.KhachHang;
import com.team.ui.ActionClick;
import com.team.ui.GUI;

public class PanelCuaHangDK extends BasePanel{
	private static final String TITLE = "Đăng ký thông tin cửa hàng";
	private static final String BT_XACNHAN = "BT_XACNHAN";
	private JLabel lb_QuayLai, lb_QuayLaiSP, lb_Title, lb_TaiKhoan, lb_MatKhau, lb_ConfirmMK, lb_TenShop, lb_DiaChi, lb_Sdt, lb_Email;
	private JTextField tf_TaiKhoan, tf_TenShop, tf_DiaChi, tf_Sdt, tf_Email;
	private JPasswordField tf_MatKhau, tf_ConfirmMK;
	private JButton bt_XacNhan, bt_XacNhanSP;
	private JPanel pn_infoSP;

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
		pn_infoSP = new JPanel(null);
		pn_infoSP.setSize(600,500);
		int x = GUI.W_SIZE/2 - pn_infoSP.getWidth()/2;
		pn_infoSP.setLocation(x, 40);
		pn_infoSP.setVisible(false);
		add(pn_infoSP);
		Icon icon = new ImageIcon("D:\\Downloads\\ic_arrow_back_ios1.png","comeback");
		lb_QuayLai = new JLabel("<html><u>Quay lại</u></html>", icon, JLabel.CENTER);
		lb_QuayLai.setLocation(20, 20);
		lb_QuayLai.setBackground(GUI.colorTheme);
		lb_QuayLai.setSize(100,40);
		lb_QuayLai.setFont(font2);
		lb_QuayLai.setOpaque(true);
		lb_QuayLai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clearText();
				ack.backToDangKy();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_QuayLai.setForeground(Color.BLUE);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_QuayLai.setForeground(Color.BLACK);
			}
		});
		add(lb_QuayLai);
		lb_Title = createLabel(TITLE, 0, lb_QuayLai.getY()+lb_QuayLai.getHeight()+20, font1, Color.BLACK, GUI.colorTheme);
		x = GUI.W_SIZE/2 - lb_Title.getWidth()/2;
		lb_Title.setLocation(x, lb_Title.getY());
		add(lb_Title);
		lb_TaiKhoan = createLabel("Tài khoản:", 150, lb_Title.getY()+lb_Title.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		add(lb_TaiKhoan);
		tf_TaiKhoan = createTextField(lb_TaiKhoan.getX()+lb_TaiKhoan.getWidth()+20, lb_TaiKhoan.getY(), 320, font2, Color.BLACK);
		add(tf_TaiKhoan);
		lb_MatKhau = createLabel("Mật khẩu:", lb_TaiKhoan.getX(), lb_TaiKhoan.getY()+lb_TaiKhoan.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		lb_MatKhau.setLocation(lb_TaiKhoan.getX()-(lb_MatKhau.getWidth()-lb_TaiKhoan.getWidth()), lb_MatKhau.getY());
		add(lb_MatKhau);
		tf_MatKhau = createPasswordField(tf_TaiKhoan.getX(), lb_MatKhau.getY(), 320, font2, Color.BLACK);
		add(tf_MatKhau);
		lb_ConfirmMK = createLabel("Xác nhận mật khẩu:", 0, lb_MatKhau.getY()+lb_MatKhau.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		lb_ConfirmMK.setLocation(lb_TaiKhoan.getX()-(lb_ConfirmMK.getWidth()-lb_TaiKhoan.getWidth()), lb_ConfirmMK.getY());
		add(lb_ConfirmMK);
		tf_ConfirmMK = createPasswordField(tf_TaiKhoan.getX(), lb_ConfirmMK.getY(), 320, font2, Color.BLACK);
		add(tf_ConfirmMK);
		lb_TenShop = createLabel("Tên shop:", 0, lb_ConfirmMK.getY()+lb_ConfirmMK.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		lb_TenShop.setLocation(lb_TaiKhoan.getX()-(lb_TenShop.getWidth()-lb_TaiKhoan.getWidth()), lb_TenShop.getY());
		add(lb_TenShop);
		tf_TenShop = createTextField(tf_TaiKhoan.getX(), lb_TenShop.getY(), 320, font2, Color.BLACK);
		add(tf_TenShop);
		lb_DiaChi = createLabel("Địa chỉ shop:", 0, lb_TenShop.getY()+lb_TenShop.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		lb_DiaChi.setLocation(lb_TaiKhoan.getX()-(lb_DiaChi.getWidth()-lb_TaiKhoan.getWidth()), lb_DiaChi.getY());
		add(lb_DiaChi);
		tf_DiaChi = createTextField(tf_TaiKhoan.getX(), lb_DiaChi.getY(), 320, font2, Color.BLACK);
		add(tf_DiaChi);
		lb_Sdt = createLabel("Số điện thoại:", 0, lb_DiaChi.getY()+lb_DiaChi.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		lb_Sdt.setLocation(lb_TaiKhoan.getX()-(lb_Sdt.getWidth()-lb_TaiKhoan.getWidth()), lb_Sdt.getY());
		add(lb_Sdt);
		tf_Sdt = createTextField(tf_TaiKhoan.getX(), lb_Sdt.getY(), 320, font2, Color.BLACK);
		add(tf_Sdt);
		lb_Email = createLabel("Email:", 0, lb_Sdt.getY()+lb_Sdt.getHeight()+20, font2, Color.BLACK, GUI.colorTheme);
		lb_Email.setLocation(lb_TaiKhoan.getX()-(lb_Email.getWidth()-lb_TaiKhoan.getWidth()), lb_Email.getY());
		add(lb_Email);
		tf_Email = createTextField(tf_TaiKhoan.getX(), lb_Email.getY(), 320, font2, Color.BLACK);
		add(tf_Email);
		bt_XacNhan = createButton("Xác nhận", 0, tf_Email.getY()+tf_Email.getHeight()+40, font1, Color.BLACK, BT_XACNHAN);
		x = GUI.W_SIZE/2 - bt_XacNhan.getWidth()/2;
		bt_XacNhan.setLocation(x, bt_XacNhan.getY());
		add(bt_XacNhan);
		
	}

	@Override
	protected void handleClick(String name) {
		if(name.equals(BT_XACNHAN)) {
			if(tf_TaiKhoan.getText().equals("")||tf_MatKhau.getText().equals("")||tf_ConfirmMK.getText().equals("")||
					tf_TenShop.getText().equals("")||tf_DiaChi.getText().equals("")||tf_Sdt.getText().equals("")||
					tf_Email.getText().equals("")) {
				JOptionPane.showConfirmDialog(null, "Mời bạn nhập đầy đủ thông tin", "Error", JOptionPane.CLOSED_OPTION);
			}else {
				if(tf_ConfirmMK.getText().equals(tf_MatKhau.getText())) {
					CuaHang cuaHang = new CuaHang(tf_TaiKhoan.getText(), tf_MatKhau.getText(), tf_TenShop.getText(), tf_DiaChi.getText(), 
							tf_Sdt.getText(), tf_Email.getText());
					ack.addListCuaHang(cuaHang);
					JOptionPane.showConfirmDialog(null, "Đăng ký thành công, bạn có muốn thêm sản phẩm", "Stores", JOptionPane.YES_NO_OPTION);
					clearText();
					ack.comeBack();
				}else {
					JOptionPane.showConfirmDialog(null, "Mật khẩu xác nhận không chính xác", "Error", JOptionPane.CLOSED_OPTION);
				}
			}
		}
	}
	
	private void clearText() {
		tf_ConfirmMK.setText("");
		tf_DiaChi.setText("");
		tf_Email.setText("");
		tf_TenShop.setText("");
		tf_MatKhau.setText("");
		tf_Sdt.setText("");
		tf_TaiKhoan.setText("");
	}
	
	private ActionClick ack;

	public ActionClick getAck() {
		return ack;
	}

	public void setAck(ActionClick ack) {
		this.ack = ack;
	}
	
}
