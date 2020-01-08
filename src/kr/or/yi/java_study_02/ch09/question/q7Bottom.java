package kr.or.yi.java_study_02.ch09.question;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class q7Bottom extends JPanel {
	private JLabel lblNewLabel;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public q7Bottom() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(255, 127, 80));
		
		lblNewLabel = new JLabel("계산결과");
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(20);
	}

}
