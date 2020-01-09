package java_swing_study.ch10.mouse;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class MouseAdaptorEx extends JFrame {

	private JPanel contentPane;
	private JLabel lbl;


	public MouseAdaptorEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				lbl.setLocation(x, y);
				
				System.out.printf("마우스 (%d,%d%n",x,y);
				System.out.printf("마우스 (%d,%d%n",e.getXOnScreen(),e.getYOnScreen());
			}
			
			
		});
		
		lbl = new JLabel("New label");
		lbl.setBounds(172, 95, 57, 15);
		contentPane.add(lbl);
		
	}
}
