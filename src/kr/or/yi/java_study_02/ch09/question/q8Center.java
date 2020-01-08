package kr.or.yi.java_study_02.ch09.question;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class q8Center extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel la2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel label;
	private JLabel label_1;

	/**
	 * Create the panel.
	 */
	public q8Center() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		
		/*
		 * String newLabel [] = new String [10]; for(int i=0; i<10; i++) { newLabel[i] =
		 * new JLabel(Integer.toString(i)); }
		 */
		lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setBounds(178, 87, 57, 15);
		add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("*");
		lblNewLabel.setBounds(253, 5, 6, 15);
		add(lblNewLabel);
		
		la2 = new JLabel("*");
		la2.setBounds((int)Math.random()*50,(int)Math.random()*50,(int)Math.random()*50,(int)Math.random()*50);
		add(la2);
		
		lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setBounds(168, 201, 57, 15);
		add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("*");
		lblNewLabel_3.setBounds(325, 174, 57, 15);
		add(lblNewLabel_3);
		
		label_1 = new JLabel("*");
		label_1.setBounds(12, 174, 57, 15);
		add(label_1);
		
		label = new JLabel("*");
		label.setBounds(74, 41, 57, 15);
		add(label);
	}

}
