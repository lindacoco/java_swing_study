package kr.or.yi.java_study_02.ch09.layout.openchallenger;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

@SuppressWarnings("serial")
public class NorthPanel extends JPanel {
	private JButton btnOpen;
	private JButton btnRead;
	private JButton btnClose;

	/**
	 * Create the panel.
	 */
	public NorthPanel() {

		initialize();
	}
	private void initialize() {
		setBackground(Color.LIGHT_GRAY);
		
		btnOpen = new JButton("Open");
		add(btnOpen);
		
		btnRead = new JButton("Read");
		add(btnRead);
		
		btnClose = new JButton("Close");
		add(btnClose);
	}

}
