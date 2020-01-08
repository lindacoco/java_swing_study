package kr.or.yi.java_study_02.ch09.question;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Color;

public class q5 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;


	public q5() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 4, 0, 0));
		
		lblNewLabel = new JLabel("0");
		lblNewLabel.setBackground(new Color(32, 178, 170));
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(135, 206, 250));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("2");
		lblNewLabel_2.setBackground(new Color(255, 105, 180));
		lblNewLabel_2.setOpaque(true);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("3");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(255, 165, 0));
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBackground(new Color(216, 191, 216));
		lblNewLabel_3.setOpaque(true);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("5");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(new Color(255, 228, 225));
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_12 = new JLabel("New label");
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_9 = new JLabel("New label");
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("New label");
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("New label");
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_13 = new JLabel("New label");
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("New label");
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("New label");
		contentPane.add(lblNewLabel_15);
	}

}
