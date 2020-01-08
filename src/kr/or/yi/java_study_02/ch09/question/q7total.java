package kr.or.yi.java_study_02.ch09.question;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

public class q7total extends JFrame {

	private JPanel contentPane;
	private q7input panel;
	private q7Center panel_1;
	private final q7Bottom panel_2 = new q7Bottom();


	public q7total() {
		initialize();
	}
	private void initialize() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 357, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new q7input();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		contentPane.add(panel, BorderLayout.NORTH);
		
		panel_1 = new q7Center();
		contentPane.add(panel_1, BorderLayout.CENTER);
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}

}
