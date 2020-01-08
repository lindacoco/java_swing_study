package kr.or.yi.java_study_02.ch09.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AbsoluteLayoutEx extends JFrame {

	private JPanel contentPane;
	private JLabel la;

	public AbsoluteLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("AbsoluteLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		la = new JLabel("Hello ,Press Buttons!");
		la.setHorizontalAlignment(SwingConstants.LEFT);
		la.setFont(new Font("AR CHRISTY", Font.PLAIN, 16));
		la.setBounds(130, 50, 200, 20);
		contentPane.add(la);
		
		for(int i=1; i<10; i++) {
			JButton btn = new JButton(Integer.toString(i)); //숫자넣으면 스트링으로 리턴
			btn.setBounds(i*15, i*15, 50, 20);
			contentPane.add(btn); //이거해야지만 버튼이생성된다
			
		}
	}
}
