package java_swing_study.ch09;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame2 extends JFrame {

	private JPanel ㅇㄹㅇ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame2() {
		setTitle("300X300스윙프레임만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		ㅇㄹㅇ = new JPanel();
		ㅇㄹㅇ.setBorder(new EmptyBorder(5, 5, 5, 5));
		ㅇㄹㅇ.setLayout(new BorderLayout(0, 0));
		setContentPane(ㅇㄹㅇ);
	}

}
