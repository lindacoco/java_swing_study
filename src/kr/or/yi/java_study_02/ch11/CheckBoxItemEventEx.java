package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CheckBoxItemEventEx extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private JPanel pLeft;
	private JPanel pRight;
	private JLabel lblNewLabel;
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JCheckBox chk3;
	private JLabel res;
	private int sum = 0;
	private JButton btnApple;
	private JButton btnPear;
	private JButton btnCherry;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBoxItemEventEx frame = new CheckBoxItemEventEx();
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
	public CheckBoxItemEventEx() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "\uC608\uC81C11-5", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);

		lblNewLabel = new JLabel("사과100원, 배500원, 체리 20000원");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		pLeft.add(lblNewLabel);

		chk1 = new JCheckBox("사과");
		chk1.addItemListener(this);
		chk1.setBorderPainted(true);
		pLeft.add(chk1);

		chk2 = new JCheckBox("배");
		chk2.addItemListener(this);
		chk2.setBorderPainted(true);
		pLeft.add(chk2);

		chk3 = new JCheckBox("체리");
		chk3.addItemListener(this);
		chk3.setBorderPainted(true);
		pLeft.add(chk3);

		res = new JLabel("현재 0원 입니다");
		pLeft.add(res);

		pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));

		btnApple = new JButton("사과선택");
		btnApple.addActionListener(this);
		pRight.add(btnApple);

		btnPear = new JButton("배선택");
		btnPear.addActionListener(this);
		pRight.add(btnPear);

		btnCherry = new JButton("체리선택");
		btnCherry.addActionListener(this);
		pRight.add(btnCherry);

		btnNewButton_3 = new JButton("모든과일선택");
		btnNewButton_3.addActionListener(this);
		pRight.add(btnNewButton_3);

		btnNewButton_4 = new JButton("선택한 과일 확인");
		btnNewButton_4.addActionListener(this);
		pRight.add(btnNewButton_4);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chk2) {
			chk2ItemStateChanged(e);
		}
		if (e.getSource() == chk1) {
			chk1ItemStateChanged(e);
		}
		if (e.getSource() == chk3) {
			chk3ItemStateChanged(e);
		}
	}

	private void chk3ItemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {

			sum += 20000;
			btnCherry.setText("체리 취소");

		} else {
			sum -= 20000;
			btnCherry.setText("체리선택");
		}
		res.setText("현재" + sum + "원 입니다");

	}

	private void chk2ItemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {

			sum += 500;
			btnPear.setText("배취소");
		} else {
			sum -= 500;
			btnPear.setText("배 선택");
		}
		res.setText("현재" + sum + "원 입니다");

	}

	protected void chk1ItemStateChanged(ItemEvent e) {
		// int sum = 0;
		// System.out.println(e.getItem());

		if (e.getStateChange() == ItemEvent.SELECTED) {
			sum += 100;
			btnApple.setText("사과취소");
		} else {
			sum -= 100;
			btnApple.setText("사과선택");
		}

		res.setText("현재" + sum + "원 입니다");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_4) {
			btnNewButton_4ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3) {
			btnNewButton_3ActionPerformed(e);
		}
		if (e.getSource() == btnCherry) {
			btnNewButton_2ActionPerformed(e);
		}
		if (e.getSource() == btnApple) {
			btnNewButtonActionPerformed(e);
		}
		if (e.getSource() == btnPear) {
			btnNewButton_1ActionPerformed(e);
		}
	}

	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		if (chk2.isSelected() == false) {
			chk2.setSelected(true);
			btnPear.setText("배 취소");
		} else {
			chk2.setSelected(false);
			btnPear.setText("배 선택");
		}
	}

	protected void btnNewButtonActionPerformed(ActionEvent e) {
		if (chk1.isSelected() == false) {
			chk1.setSelected(true);
			btnApple.setText("사과취소");
		} else {
			chk1.setSelected(false);
			btnApple.setText("사과선택");
		}
	}

	protected void btnNewButton_2ActionPerformed(ActionEvent e) {
		if (chk3.isSelected() == false) {
			chk3.setSelected(true);
			btnCherry.setText("체리 취소");
		} else {
			chk3.setSelected(false);
			btnCherry.setText("체리 선택");
		}
	}

	protected void btnNewButton_3ActionPerformed(ActionEvent e) {
		if (btnNewButton_3.getText() == "모든과일선택") {
			chk1.setSelected(true);
			chk2.setSelected(true);
			chk3.setSelected(true);
			btnNewButton_3.setText("모든과일 선택해제");
		} else {
			chk1.setSelected(false);
			chk2.setSelected(false);
			chk3.setSelected(false);
			btnNewButton_3.setText("모든과일선택");

		}
	}

	protected void btnNewButton_4ActionPerformed(ActionEvent e) {
		if (chk1.isSelected() && chk2.isSelected() == false && chk3.isSelected() == false) {
			JOptionPane.showMessageDialog(null, "선택한 과일은" + chk1.getText() + "입니다.");
		} else if (chk2.isSelected() && chk1.isSelected() == false && chk3.isSelected() == false) {
			JOptionPane.showMessageDialog(null, "선택한 과일은" + chk2.getText() + "입니다.");
		} else if (chk3.isSelected() && chk2.isSelected() == false && chk1.isSelected() == false) {
			JOptionPane.showMessageDialog(null, "선택한 과일은" + chk3.getText() + "입니다.");
		} else if (chk1.isSelected() && chk2.isSelected() && chk3.isSelected() == false) {
			JOptionPane.showMessageDialog(null, "선택한 과일은" + chk1.getText() + "," + chk2.getText() + "입니다.");
		} else if (chk2.isSelected() && chk3.isSelected() && chk1.isSelected() == false) {
			JOptionPane.showMessageDialog(null, "선택한 과일은" + chk2.getText() + "," + chk3.getText() + "입니다.");
		} else if (chk1.isSelected() && chk3.isSelected() && chk2.isSelected() == false) {
			JOptionPane.showMessageDialog(null, "선택한 과일은" + chk1.getText() + "," + chk3.getText() + "입니다.");
		} else if (chk1.isSelected() && chk2.isSelected() && chk3.isSelected()) {
			JOptionPane.showMessageDialog(null,
					"선택한 과일은" + chk1.getText() + "," + chk2.getText() + "," + chk3.getText() + "입니다.");
		}

		
//		String text ="현재 선택된 과일은";
//		if(chk1.isSelected()) {
//			text += "사과";
//		}if(chk2.isSelected()) {
//			text += ", 배";
//		}if(chk3.isSelected()) {
//			text += ", 체리";
//		}
//		JOptionPane.showMessageDialog(null, text);
		
	}
}
