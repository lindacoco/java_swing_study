package kr.or.yi.java_study_02.ch11.exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JCheckBox ckEditable;
	private JCheckBox ckHide;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1 frame = new Q1();
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
	public Q1() {
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 157);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));

		panel = new JPanel();
		contentPane.add(panel);

		ckEditable = new JCheckBox("버튼 비활성화");
		ckEditable.addActionListener(this);
		panel.add(ckEditable);

		ckHide = new JCheckBox("버튼감추기");
		ckHide.addActionListener(this);
		panel.add(ckHide);

		panel_1 = new JPanel();
		contentPane.add(panel_1);

		btnNewButton = new JButton("test button");
		panel_1.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ckHide) {
			ckHideActionPerformed(e);
		}
		if (e.getSource() == ckEditable) {
			ckEditableActionPerformed(e);
		}
	}

	protected void ckEditableActionPerformed(ActionEvent e) {
		if (ckEditable.isSelected()) {
			btnNewButton.setEnabled(false);
		} else {
			btnNewButton.setEnabled(true);
		}
	}

	protected void ckHideActionPerformed(ActionEvent e) {
		if (ckHide.isSelected()) {
			btnNewButton.setVisible(false);
		} else {
			btnNewButton.setVisible(true);
		}
	}
}
