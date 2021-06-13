package Week15_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EasyCaculate extends JFrame {
	private JTextField textField;

	private char[] Allnum = new char[100];
	private int i = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyCaculate frame = new EasyCaculate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EasyCaculate() {
		setTitle("\u7B80\u6613\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 314);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 10, 493, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '1';
				textField.setText(textField.getText()+"1");
				i++;
			}
		});
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setBounds(18, 68, 77, 31);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '2';
				textField.setText(textField.getText()+"2");
				i++;
			}
		});
		btnNewButton_1.setAlignmentX(0.5f);
		btnNewButton_1.setBounds(115, 68, 77, 31);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '3';
				textField.setText(textField.getText()+"3");
				i++;
			}
		});
		btnNewButton_1_1.setAlignmentX(0.5f);
		btnNewButton_1_1.setBounds(215, 68, 77, 31);
		getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("DEL");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i--;
				if(i < 0)
					i = 0;
				Allnum[i] = 0;
				textField.setText(String.valueOf(Allnum).substring(0,Allnum.length));
			}
		});
		btnNewButton_1_2.setAlignmentX(0.5f);
		btnNewButton_1_2.setBounds(315, 68, 77, 31);
		getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("CE");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int j=0;j<Allnum.length;j++)
				{
					Allnum[j] = 0;
				}
				i = 0;
				textField.setText(String.valueOf(Allnum).substring(0,Allnum.length));
			}
		});
		btnNewButton_1_3.setAlignmentX(0.5f);
		btnNewButton_1_3.setBounds(415, 68, 77, 31);
		getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '4';
				textField.setText(textField.getText()+"4");
				i++;
			}
		});
		btnNewButton_2.setAlignmentX(0.5f);
		btnNewButton_2.setBounds(18, 118, 77, 31);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '7';
				textField.setText(textField.getText()+"7");
				i++;
			}
		});
		btnNewButton_3.setAlignmentX(0.5f);
		btnNewButton_3.setBounds(18, 168, 77, 31);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '0';
				textField.setText(textField.getText()+"0");
				i++;
			}
		});
		btnNewButton_4.setAlignmentX(0.5f);
		btnNewButton_4.setBounds(18, 218, 174, 31);
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '6';
				textField.setText(textField.getText()+"6");
				i++;
			}
		});
		btnNewButton_2_2.setAlignmentX(0.5f);
		btnNewButton_2_2.setBounds(215, 118, 77, 31);
		getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("+");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = ' ';				
				i++;
				Allnum[i] = '+';
				i++;
				Allnum[i] = ' ';
				i++;
				textField.setText(textField.getText()+" + ");
			}
		});
		btnNewButton_2_3.setAlignmentX(0.5f);
		btnNewButton_2_3.setBounds(315, 118, 77, 31);
		getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("\u00D7");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = ' ';
				i++;
				Allnum[i] = '*';
				i++;
				Allnum[i] = ' ';
				i++;
				textField.setText(textField.getText()+" * ");
			}
		});
		btnNewButton_2_4.setAlignmentX(0.5f);
		btnNewButton_2_4.setBounds(415, 118, 77, 31);
		getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("8");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '8';
				textField.setText(textField.getText()+"8");
				i++;
			}
		});
		btnNewButton_2_5.setAlignmentX(0.5f);
		btnNewButton_2_5.setBounds(115, 168, 77, 31);
		getContentPane().add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("9");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '9';
				textField.setText(textField.getText()+"9");
				i++;
			}
		});
		btnNewButton_2_6.setAlignmentX(0.5f);
		btnNewButton_2_6.setBounds(215, 168, 77, 31);
		getContentPane().add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("-");
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = ' ';
				i++;
				Allnum[i] = '-';
				i++;
				Allnum[i] = ' ';
				i++;
				textField.setText(textField.getText()+" - ");
			}
		});
		btnNewButton_2_7.setAlignmentX(0.5f);
		btnNewButton_2_7.setBounds(315, 168, 77, 31);
		getContentPane().add(btnNewButton_2_7);
		
		JButton btnNewButton_2_8 = new JButton("\u00F7");
		btnNewButton_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = ' ';
				i++;
				Allnum[i] = '/';
				i++;
				Allnum[i] = ' ';
				i++;
				textField.setText(textField.getText()+" / ");
			}
		});
		btnNewButton_2_8.setAlignmentX(0.5f);
		btnNewButton_2_8.setBounds(415, 168, 77, 31);
		getContentPane().add(btnNewButton_2_8);
		
		JButton btnNewButton_2_11 = new JButton("=");
		btnNewButton_2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//执行运算结果
				Allnum[i] = ' ';
				i++;
				String AllString[] = String.valueOf(Allnum).split(" ");
				String result = new String();
				float A,B;
				A = Float.parseFloat(AllString[0]);
				B = Float.parseFloat(AllString[2]);				
				switch (AllString[1])
				{
					case "+":
						result = String.valueOf(A+B);
						break;
					case "-":
						result = String.valueOf(A-B);
						break;
					case "*":
						result = String.valueOf(A*B);
						break;
					case "/":
						result = String.valueOf(A/B);
						break;
				}
				
				textField.setText(textField.getText()+" = "+result);
			}
		});
		btnNewButton_2_11.setAlignmentX(0.5f);
		btnNewButton_2_11.setBounds(315, 218, 177, 31);
		getContentPane().add(btnNewButton_2_11);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Allnum[i] = '5';
				textField.setText(textField.getText()+"5");
				i++;
			}
		});
		btnNewButton_2_1.setAlignmentX(0.5f);
		btnNewButton_2_1.setBounds(115, 118, 77, 31);
		getContentPane().add(btnNewButton_2_1);
		
		
	}
}
