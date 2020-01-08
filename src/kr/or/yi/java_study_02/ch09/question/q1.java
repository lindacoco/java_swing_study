package kr.or.yi.java_study_02.ch09.question;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class q1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;


	public q1() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 431, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(7, 5));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("North");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("Center");
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1, BorderLayout.CENTER);
		
		btnNewButton_2 = new JButton("West");
		contentPane.add(btnNewButton_2, BorderLayout.WEST);
		
		btnNewButton_3 = new JButton("East");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("South");
		contentPane.add(btnNewButton_4, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			btnNewButton_1ActionPerformed(e);
		}
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
	}
}
