package java_swing_study.ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListner implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();    
        if(btn.getText().equals("Action")) {
        	btn.setText("액션");
        }else {
        	btn.setText("Action");
        }
        	
	}

}
