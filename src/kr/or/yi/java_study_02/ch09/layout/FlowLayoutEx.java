package kr.or.yi.java_study_02.ch09.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlowLayoutEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnmul;
	private JButton btndiv;
	private JButton btnCalculate;

	
	public FlowLayoutEx() {
		initialize();
	}
	private void initialize() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		
		btnAdd = new JButton("add");
		contentPane.add(btnAdd);
		
		btnSub = new JButton("sub");
		contentPane.add(btnSub);
		
		btnmul = new JButton("mul");
		btnmul.addActionListener(this);
		contentPane.add(btnmul);
		
		btndiv = new JButton("div");
		contentPane.add(btndiv);
		
		btnCalculate = new JButton("Calculate");
		contentPane.add(btnCalculate);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnmul) {
			btnNewButtonActionPerformed(e);
		}
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
	}
}
