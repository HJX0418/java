package whut.info.events;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.ImageIcon;

public class ComponentDemo extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxtField;
	private JLabel lblAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentDemo frame = new ComponentDemo();
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
	public ComponentDemo() {
		setTitle("Student detail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 10, 40, 17);
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblName);

		nameTxtField = new JTextField();
		nameTxtField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				nameTxtField.setText("Gain Focus");
			}

			@Override
			public void focusLost(FocusEvent e) {
				nameTxtField.setText("Lost Focus");
			}
		});
		nameTxtField.setBounds(73, 8, 130, 21);
		contentPane.add(nameTxtField);
		nameTxtField.setColumns(10);// 在flowlayout中有效

		lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAddress.setBounds(10, 54, 54, 17);
		contentPane.add(lblAddress);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 51, 130, 76);
		contentPane.add(scrollPane);

		JTextArea txtAddress = new JTextArea();
		scrollPane.setViewportView(txtAddress);
		txtAddress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtAddress.append("Mouse enter\n");
			}
		});
		txtAddress.setLineWrap(true);

		JLabel lblQualification = new JLabel("Qualification:");
		lblQualification.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblQualification.setBounds(230, 11, 85, 17);
		contentPane.add(lblQualification);

		JComboBox qualifyCmbx = new JComboBox();
		qualifyCmbx.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) { // 解决两次触发
					txtAddress.append(qualifyCmbx.getSelectedItem().toString() + "\n");
				}
			}
		});
		qualifyCmbx.setModel(new DefaultComboBoxModel(new String[] { "Graduate", "Undergraduate" }));
		qualifyCmbx.setBounds(322, 8, 85, 21);
		contentPane.add(qualifyCmbx);

		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSex.setBounds(10, 152, 54, 17);
		contentPane.add(lblSex);

		JLabel lblHobby = new JLabel("Hobby:");
		lblHobby.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblHobby.setBounds(230, 55, 54, 17);
		contentPane.add(lblHobby);

		JButton btnValidate = new JButton("Validate");
		btnValidate.setIcon(null);
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnValidate.setBounds(130, 229, 102, 23);
		contentPane.add(btnValidate);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(242, 229, 93, 23);
		contentPane.add(btnReset);

		JPanel sexPane = new JPanel();
		sexPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		sexPane.setBounds(73, 137, 130, 69);
		contentPane.add(sexPane);
		sexPane.setLayout(null);
		ButtonGroup sexGrp = new ButtonGroup();
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFemale.isSelected())
					txtAddress.append("Female radio button is selected\n");
				else
					txtAddress.append("Female radio button is  not selected\n");
			}
		});
		rdbtnFemale.setBounds(6, 31, 74, 23);
		sexPane.add(rdbtnFemale);
		sexGrp.add(rdbtnFemale);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnMale.isSelected())
					txtAddress.append("Male radio button is selected\n");
				else
					txtAddress.append("Male radio button is  not selected\n");
			}
		});
		rdbtnMale.setBounds(6, 6, 61, 23);
		sexPane.add(rdbtnMale);
		sexGrp.add(rdbtnMale);

		JPanel hobbyPane = new JPanel();
		hobbyPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		hobbyPane.setBounds(307, 54, 117, 81);
		contentPane.add(hobbyPane);
		hobbyPane.setLayout(null);

		JCheckBox chckbxReading = new JCheckBox("Reading");
		chckbxReading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxReading.isSelected())
					txtAddress.append("reading is selected\n");
				else
					txtAddress.append("reading is deselected\n");
			}
		});
		chckbxReading.setBounds(6, 6, 103, 23);
		hobbyPane.add(chckbxReading);

		JCheckBox chckbxSinging = new JCheckBox("Singing");
		chckbxSinging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxSinging.isSelected())
					txtAddress.append("singing is selected\n");
				else
					txtAddress.append("singing is deselected\n");
			}
		});
		chckbxSinging.setBounds(6, 29, 103, 23);
		hobbyPane.add(chckbxSinging);

		JCheckBox chckbxDancing = new JCheckBox("Dancing");
		chckbxDancing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxDancing.isSelected())
					txtAddress.append("dancing is selected\n");
				else
					txtAddress.append("dancing is deselected\n");
			}
		});
		chckbxDancing.setBounds(6, 54, 103, 23);
		hobbyPane.add(chckbxDancing);

	}
}
