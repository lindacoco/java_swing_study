package java_swing_study.ch09;

import java.awt.EventQueue;

import javax.swing.JPanel;



public class SwingMain {

	    
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ContentPaneEx frame = new ContentPaneEx();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}


