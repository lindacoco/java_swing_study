package kr.or.yi.java_study_02.ch09.question;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class q8Bottom extends JPanel {
	private JButton btnNewButton;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public q8Bottom() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(135, 206, 250));
		
		btnNewButton = new JButton("Word Input");
		add(btnNewButton);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(20);
	}

}
