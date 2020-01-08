package kr.or.yi.java_study_02.ch09.question;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class q4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;

	
	public q4() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 615, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnNewButton = new JButton("0");
		btnNewButton.setBackground(new Color(255, 0, 0));
		contentPane.add(btnNewButton);
		
		btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBackground(new Color(144, 238, 144));
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBackground(new Color(255, 0, 255));
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("3");
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("4");
		contentPane.add(btnNewButton_9);
		
		btnNewButton_4 = new JButton("New button");
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("New button");
		contentPane.add(btnNewButton_5);
		
		btnNewButton_2 = new JButton("New button");
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("New button");
		contentPane.add(btnNewButton_1);
	}

	public void actionPerformed(ActionEvent e) {
	}
}
