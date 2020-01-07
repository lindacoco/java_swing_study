package kr.or.yi.java_study_02.ch09.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LayoutMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnFlowlayout;
	private JButton btnBorderLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutMain frame = new LayoutMain();
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
	public LayoutMain() {
		initialize();
	}
	private void initialize() {
		setTitle("배치레이아웃 해제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		btnFlowlayout = new JButton("Flowlayout");
		btnFlowlayout.addActionListener(this);
		contentPane.add(btnFlowlayout);
		
		btnBorderLayout = new JButton("BorderLayout");
		btnBorderLayout.addActionListener(this);
		contentPane.add(btnBorderLayout);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorderLayout) {
			btnBorderLayoutActionPerformed(e);
		}
		if (e.getSource() == btnFlowlayout) {
			btnFlowlayoutActionPerformed(e);
		}
	}
	protected void btnFlowlayoutActionPerformed(ActionEvent e) {
		FlowLayoutEx frame = new FlowLayoutEx();
		frame.setVisible(true);
	}
	protected void btnBorderLayoutActionPerformed(ActionEvent e) {
		BorderLayoutEx frame = new BorderLayoutEx();
		frame.setVisible(true);
	}
}
