package kr.or.yi.java_study_02.ch09.layout;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import kr.or.yi.java_study_02.ch09.layout.openchallenger.OpenChallengeEx;
import kr.or.yi.java_study_02.ch09.question.q1;
import kr.or.yi.java_study_02.ch09.question.q4;
import kr.or.yi.java_study_02.ch09.question.q5;
import kr.or.yi.java_study_02.ch09.question.q7total;
import kr.or.yi.java_study_02.ch09.question.q8Total;

import javax.swing.UIManager;
import java.awt.Color;

@SuppressWarnings("serial")
public class LayoutMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pLeft;
	private JButton btnFlow;
	private JButton btnBorder;
	private JButton btnGrid;
	private JButton btnAbsolute;
	private JButton btnOpenchallenge;
	private JPanel pRight;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

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
		setTitle("레이아웃예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC81C9\uC7A5 GUI\uAE30\uCD08", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 0));
		
		pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "\uB808\uC774\uC544\uC6C3\uC608\uC81C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		pLeft.setLayout(new GridLayout(0, 2, 10, 10));
		
		btnFlow = new JButton("FlowLayout");
		pLeft.add(btnFlow);
		
		btnBorder = new JButton("BorderLayout");
		pLeft.add(btnBorder);
		
		btnGrid = new JButton("GridLayout");
		pLeft.add(btnGrid);
		
		btnAbsolute = new JButton("AbsoluteLayout");
		pLeft.add(btnAbsolute);
		
		btnOpenchallenge = new JButton("OpenChallenge");
		pLeft.add(btnOpenchallenge);
		
		pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "\uC2E4\uC2B5\uBB38\uC81C\uD480\uC774", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 2, 10, 10));
		
		btnNewButton = new JButton("2번");
		btnNewButton.addActionListener(this);
		pRight.add(btnNewButton);
		
		btnNewButton_2 = new JButton("4번");
		btnNewButton_2.addActionListener(this);
		pRight.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("5번");
		btnNewButton_1.addActionListener(this);
		pRight.add(btnNewButton_1);
		
		btnNewButton_3 = new JButton("7번");
		btnNewButton_3.addActionListener(this);
		pRight.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("8번");
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.addMouseListener(new MouseAdapter() {
		   @Override
		   public void mouseClicked(MouseEvent e) {
			   System.out.println(e.getButton() + ": " +e.getClickCount());
		   }
		});
		
		pRight.add(btnNewButton_4);
	}

	public void actionPerformed(ActionEvent e) {
	//	JOptionPane.showMessageDialog(null, e.getSource());
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());
		
		if (e.getSource() == btnNewButton_4) {
			btnNewButton_4ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_3) {
			btnNewButton_3ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			btnNewButton_1ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			btnNewButton_2ActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			btnNewButtonActionPerformed(e);
		}
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		q1 frame = new q1();
		frame.setVisible(true);
	}
	protected void btnNewButton_2ActionPerformed(ActionEvent e) {
		q4 frame = new q4();
		frame.setVisible(true);
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		q5 frame =new q5();
		frame.setVisible(true);
	}
	protected void btnNewButton_3ActionPerformed(ActionEvent e) {
		q7total frame = new q7total();
		frame.setVisible(true);
	}
	protected void btnNewButton_4ActionPerformed(ActionEvent e) {
		q8Total frame = new q8Total();
		frame.setVisible(true);
	}
}
