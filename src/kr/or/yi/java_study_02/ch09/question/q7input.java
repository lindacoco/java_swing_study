package kr.or.yi.java_study_02.ch09.question;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class q7input extends JPanel {
	private JLabel lblNewLabel;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public q7input() {

		initialize();
	}
	private void initialize() {
		setBackground(new Color(175, 238, 238));
		
		lblNewLabel = new JLabel("수식입력");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(20);
	}

}
