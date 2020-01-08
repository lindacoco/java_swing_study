package kr.or.yi.java_study_02.ch09.layout.openchallenger;

import javax.swing.JPanel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CenterPanel extends JPanel {
	private JLabel lblHello;
	private JLabel lblLove;
	private JLabel lblJava;

	/**
	 * Create the panel.
	 */
	public CenterPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		lblHello = new JLabel("Hello");
		lblHello.setBounds(115, 68, 57, 15);
		add(lblHello);
		
		lblLove = new JLabel("Love");
		lblLove.setBounds(328, 130, 57, 15);
		add(lblLove);
		
		lblJava = new JLabel("Java");
		lblJava.setBounds(91, 207, 57, 15);
		add(lblJava);
	}

}
