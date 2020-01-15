package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java_swing_study.ch10.mouse.MouseAdaptorEx;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ImgIconEx extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImgIconEx frame = new ImgIconEx();
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
	public ImgIconEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				super.mouseClicked(e);
				System.out.println("mouseClicked");
			}
			
		});
		
		
		//String dirPath = System.getProperty("user.dir"); 
		//System.out.println(dirPath);  //D:\workspace\workspace_java\java_swing_study
		String dirPath = System.getProperty("user.dir")+"\\img\\";
		lblNewLabel.setIcon(new ImageIcon(dirPath+ "beauty.jpg"));
		//lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\workspace_java\\java_swing_study\\img\\beauty.jpg")); //현재공간에서만 나오고 
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

}
