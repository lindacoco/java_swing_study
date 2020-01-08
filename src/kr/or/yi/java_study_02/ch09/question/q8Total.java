package kr.or.yi.java_study_02.ch09.question;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class q8Total extends JFrame {

	private JPanel contentPane;
	private q8Top panel;
	private q8Bottom panel_1;
	private q8Center panel_2;


	public q8Total() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new q8Top();
		contentPane.add(panel, BorderLayout.NORTH);
		
		panel_1 = new q8Bottom();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		panel_2 = new q8Center();
		contentPane.add(panel_2, BorderLayout.CENTER);
	}

}
