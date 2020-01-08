package kr.or.yi.java_study_02.ch09.question;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class q8Top extends JPanel {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Create the panel.
	 */
	public q8Top() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(255, 160, 122));
		
		btnNewButton = new JButton("열기");
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("닫기");
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("나가기");
		add(btnNewButton_2);
	}

}
