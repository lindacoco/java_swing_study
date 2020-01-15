package kr.or.yi.java_study_02.ch11.exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class StudentFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private StudentPanel stdPanel;
	private JPanel btnPanel;
	private JButton btnAdd;
	private JButton btnDel;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFrame frame = new StudentFrame();
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
	public StudentFrame() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		stdPanel = new StudentPanel();
		stdPanel.setBounds(5, 5, 590, 331);
		contentPane.add(stdPanel);
		
		btnPanel = new JPanel();
		btnPanel.setBounds(5, 346, 597, 65);
		contentPane.add(btnPanel);
		btnPanel.setLayout(null);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		btnAdd.setBounds(187, 20, 97, 23);
		btnPanel.add(btnAdd);
		
		btnDel = new JButton("취소");
		btnDel.addActionListener(this);
		btnDel.setBounds(318, 20, 97, 23);
		btnPanel.add(btnDel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 421, 590, 202);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDel) {
			btnDelActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
		Student a = stdPanel.getItem();
		//System.out.println(a.toString());
		textArea.append(a.toString()+"\n");
	}
	protected void btnDelActionPerformed(ActionEvent e) {
		stdPanel.clearTf();
	}
}
