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
		
		this.setTitle("�û���¼");
		this.setLayout(new GridLayout(3,1));
		this.setSize(250, 200);
		this.setLocation(550, 200);
		
		panel  = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		//����panel��Ӱ�ť
		b1 = new JButton("ȷ��");
		b2 = new JButton("ȡ��");
		//��Ӽ���
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		
		//����panel 1/2 ��� �û�/���� ����
		label1 = new Label("�û���:");
		label2 = new Label("  ��  ��:");
		
		//Ϊ�û��������봴���ı��������������Ե���ʾ
		lanuch_name  = new JTextField(10); 		
		pass_word = new JPasswordField(10);
		
		//add���Ⱥ�˳��Ӱ��λ���Ⱥ�
		panel1.add(label1);
		panel1.add(lanuch_name);
		panel2.add(label2);
		panel2.add(pass_word);
		this.add(panel1);
		this.add(panel2);
		this.add(panel,BorderLayout.SOUTH); //����ť���������������·�
		
		//��ʾ����
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void lanuch() {		
		user_name     = lanuch_name.getText();
		user_password = String.valueOf(pass_word.getPassword());//getText��ʱ����Ҫ��getPassword
		if(user_name.equals(admin_name) && user_password.equals(admin_password)) 
		{
			flag = true;
			dispose();
		}
		else 
		{
			flag = false;
			//dispose();
			JOptionPane.showMessageDialog(null,"��¼ʧ�ܣ�","��ʾ��Ϣ",JOptionPane.ERROR_MESSAGE);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ComponentDemo frame = new ComponentDemo();
		if(e.getActionCommand() == "ȷ��")
		{
			lanuch();
			frame.setVisible(this.flag);	
		}
		else if(e.getActionCommand() == "ȡ��")
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
