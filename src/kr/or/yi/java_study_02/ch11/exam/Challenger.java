package kr.or.yi.java_study_02.ch11.exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Challenger extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblImage;
	private JPanel pMenu;
	private JButton btnLeft;
	private JButton btnRight;
	private String dirPath;
	private int click = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Challenger frame = new Challenger();
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
	public Challenger() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblImage, BorderLayout.CENTER);
		
		pMenu = new JPanel();
		contentPane.add(pMenu, BorderLayout.SOUTH);
		
		btnLeft = new JButton("");
		btnLeft.addActionListener(this);
		
		String dirPath =System.getProperty("user.dir")+"\\img\\";
		System.out.println(dirPath);
		btnLeft.setIcon(new ImageIcon(dirPath+"prev_btn.png"));
		pMenu.add(btnLeft);
		
		btnRight = new JButton("");
		btnRight.addActionListener(this);
		btnRight.setIcon(new ImageIcon(dirPath+"next_btn.png"));
		pMenu.add(btnRight);
		
		lblImage.setIcon(new ImageIcon(dirPath+"car1.jpg"));
	}

	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRight) {
			btnRightActionPerformed(e);
		}
		if (e.getSource() == btnLeft) {
			btnLeftActionPerformed(e);
		}
	}
	protected void btnLeftActionPerformed(ActionEvent e) {
		String dirPath =System.getProperty("user.dir")+"\\img\\";
		
		System.out.println(click);
		if(click == 1) {
			click = 5;
		}
		lblImage.setIcon(new ImageIcon(dirPath+"car"+(click-1) +".jpg"));
		click--;
		
	    	
	}
	protected void btnRightActionPerformed(ActionEvent e) {
		String dirPath =System.getProperty("user.dir")+"\\img\\";
		
		System.out.println(click);
		lblImage.setIcon(new ImageIcon(dirPath+"car"+(click+1)+".jpg"));
		click++;
		if(click+1 ==5) {
			click = 0;
		}
		
	}
}
