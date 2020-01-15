package kr.or.yi.java_study_02.ch11.exam;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class StudentPanel extends AbsItemPanel<Student> {
	private JLabel lblstdNo;
	private JTextField tfNo;
	private JLabel lblstdName;
	private JTextField tfName;
	private JLabel lblKor;
	private JTextField tfKor;
	private JLabel lblMath;
	private JTextField tfMath;
	private JLabel lblsEng;
	private JTextField tfEng;

	/**
	 * Create the panel.
	 */
	public StudentPanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uD559\uC0DD\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 10, 10));
		
		lblstdNo = new JLabel("학생번호");
		lblstdNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblstdNo);
		
		tfNo = new JTextField();
		add(tfNo);
		tfNo.setColumns(10);
		
		lblstdName = new JLabel("학생이름");
		lblstdName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblstdName);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		add(tfName);
		
		lblKor = new JLabel("국어");
		lblKor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblKor);
		
		tfKor = new JTextField();
		tfKor.setColumns(10);
		add(tfKor);
		
		lblMath = new JLabel("수학");
		lblMath.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblMath);
		
		tfMath = new JTextField();
		tfMath.setColumns(10);
		add(tfMath);
		
		lblsEng = new JLabel("영어");
		lblsEng.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblsEng);
		
		tfEng = new JTextField();
		tfEng.setColumns(10);
		add(tfEng);
	}
	
	public void clearTf() {
		tfNo.setText("");
		tfName.setText("");
		tfKor.setText("");
		tfMath.setText("");
		tfEng.setText("");
	}
	

	/*
	 * protected void setStudent(ActionEvent e) { Student newStudent = new
	 * Student(1,"장현서",80,90,70); setStudent(newStudent); }
	 */
	@Override
	public Student getItem() {
		int a = Integer.parseInt(tfNo.getText().trim());
		String b= tfName.getText().trim();
		int c= Integer.parseInt(tfKor.getText().trim());
		int d= Integer.parseInt(tfMath.getText().trim());
		int e =Integer.parseInt(tfEng.getText().trim()); 
		Student student = new Student(a,b,c,d,e);
		return student;
	}
	@Override
	public void setItem(Student item) {
		tfNo.setText(item.getStdNo()+"");
		tfName.setText(new String(item.getStdName()+""));
		tfKor.setText(item.getKor()+"");
		tfMath.setText(item.getMath()+"");
		tfEng.setText(item.getEng()+"");
	}
}
