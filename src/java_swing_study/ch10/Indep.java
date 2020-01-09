package java_swing_study.ch10;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Indep implements ActionListener {
	private JPanel contentPane;
	

	public Indep(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(contentPane.getBackground() ==Color.YELLOW) {
		contentPane.setBackground(Color.red);
		}else {
			contentPane.setBackground(Color.yellow);
		}

	}

}
