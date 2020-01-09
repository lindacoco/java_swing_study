package java_swing_study.ch10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventListnerEx extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btn01;
	private final JButton btn8 = new JButton("익명윈도우빌더");
	private JButton btn10;
	private JButton btn6;
    private JButton btn7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventListnerEx frame = new EventListnerEx();
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
	public EventListnerEx() {
		initialize();
	}
	private void initialize() {
		setTitle("이벤트리스너작성방법");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		btn01 = new JButton("독립클래스");
		btn01.addActionListener(new MyActionListner());
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("독립클래스2");
		btn02.addActionListener(new MyActionListner());
		btn02.addActionListener(new MyActionListener2());
		contentPane.add(btn02);
		
		JButton btn3 = new JButton("내부클래스");
		btn3.addActionListener(new MyAction3Listener());
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("익명클래스");
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				
			}
		});
		contentPane.add(btn4);
		
		
		JButton btn5 = new JButton("내부클래스2");
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, e.getActionCommand());
				
			}
		});
		contentPane.add(btn5);
		
		
		btn6 = new JButton("부모클래스에서 정의");
		btn6.addActionListener(this);
		contentPane.add(btn6);
		
	    btn7 = new JButton("부모클래스2");
		btn7.addActionListener(this);
		contentPane.add(btn7);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8ActionPerformed(e);
			}
		});
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("내부클래스(윈도우빌더)");
		btn9.addActionListener(new Btn9ActionListener());
		contentPane.add(btn9);
		
		btn10 = new JButton("부모클래스(윈도우빌더)");
		btn10.addActionListener(this);
		contentPane.add(btn10);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton);
	}
     class MyAction3Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "내부클래스 이벤트 리스너");			
		}
    	 
     }
     private class Btn9ActionListener implements ActionListener {
     	public void actionPerformed(ActionEvent e) {
     		JOptionPane.showMessageDialog(null, "잠온다");
     	}
     }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn10) {
			btn10ActionPerformed(e);
		}
	
		if(e.getSource()== btn6) {
			JOptionPane.showMessageDialog(null, e.getActionCommand());
		}
		if(e.getSource()== btn7) {
			actionPerformedBtn7(e);
		}
	}

	private void actionPerformedBtn7(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"btn7" + e.getActionCommand());
	}
	protected void btn8ActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "윈도우빌더-익명");
	}
	protected void btn10ActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "짜증나무");
	}
}
