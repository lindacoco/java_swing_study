package kr.or.yi.java_study_02.ch09.question;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

public class q7Center extends JPanel {
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt5;
	private JButton bt4;
	private JButton bt8;
	private JButton bt6;
	private JButton bt9;
	private final JButton bt10 = new JButton("9");
	private JButton bt11;
	private JButton bt7;
	private JButton bt12;
	private JButton bt13;
	private JButton bt14;
	private JButton bt15;
	private JButton bt16;

	/**
	 * Create the panel.
	 */
	public q7Center() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(4, 4, 0, 0));
		
		bt1 = new JButton("0");
		add(bt1);
		
		bt2 = new JButton("1");
		add(bt2);
		
		bt3 = new JButton("2");
		add(bt3);
		
		bt4 = new JButton("3");
		add(bt4);
		
		bt5 = new JButton("4");
		add(bt5);
		
		bt6 = new JButton("5");
		add(bt6);
		
		bt7 = new JButton("6");
		add(bt7);
		
		bt8 = new JButton("7");
		add(bt8);
		
		bt9 = new JButton("8");
		add(bt9);
		add(bt10);
		
		bt11 = new JButton("CE");
		add(bt11);
		
		bt12 = new JButton("계산");
		add(bt12);
		
		bt13 = new JButton("+");
		bt13.setBackground(new Color(255, 182, 193));
		add(bt13);
		
		bt14 = new JButton("-");
		bt14.setBackground(new Color(255, 192, 203));
		add(bt14);
		
		bt15 = new JButton("x");
		bt15.setBackground(new Color(255, 192, 203));
		add(bt15);
		
		bt16 = new JButton("/");
		bt16.setBackground(new Color(255, 192, 203));
		add(bt16);
	}

}
