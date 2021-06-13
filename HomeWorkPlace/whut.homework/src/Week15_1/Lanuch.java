package Week15_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;


public class Lanuch extends JFrame implements ActionListener{
	private String admin_name 	  = new String("admin");
	private String admin_password = new String("admin");
	private String user_name,user_password;
	JButton b1,b2;
	JPanel  panel,panel1,panel2;
	Label	label1,label2;
	JTextField lanuch_name;
	JPasswordField pass_word;
	boolean flag = false;
	public Lanuch() {
		
		this.setTitle("用户登录");
		this.setLayout(new GridLayout(3,1));
		this.setSize(250, 200);
		this.setLocation(550, 200);
		
		panel  = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		//容器panel添加按钮
		b1 = new JButton("确定");
		b2 = new JButton("取消");
		//添加监听
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		
		//容器panel 1/2 添加 用户/密码 输入
		label1 = new Label("用户名:");
		label2 = new Label("  密  码:");
		
		//为用户名和密码创建文本的输入域，密码以点显示
		lanuch_name  = new JTextField(10); 		
		pass_word = new JPasswordField(10);
		
		//add的先后顺序影响位置先后
		panel1.add(label1);
		panel1.add(lanuch_name);
		panel2.add(label2);
		panel2.add(pass_word);
		this.add(panel1);
		this.add(panel2);
		this.add(panel,BorderLayout.SOUTH); //将按钮放置在容器的最下方
		
		//显示窗口
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void lanuch() {		
		user_name     = lanuch_name.getText();
		user_password = String.valueOf(pass_word.getPassword());//getText过时。需要用getPassword
		if(user_name.equals(admin_name) && user_password.equals(admin_password)) 
		{
			flag = true;
			dispose();
		}
		else 
		{
			flag = false;
			//dispose();
			JOptionPane.showMessageDialog(null,"登录失败！","提示消息",JOptionPane.ERROR_MESSAGE);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ComponentDemo frame = new ComponentDemo();
		if(e.getActionCommand() == "确定")
		{
			lanuch();
			frame.setVisible(this.flag);	
		}
		else if(e.getActionCommand() == "取消")
		{
			dispose();
			flag = false;
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lanuch lanuch = new Lanuch(); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
