package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

import kr.or.yi.java_study_02.ch11.exam.Student;

import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Combobox extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel pLeft;
	private JPanel pRight;
	private DefaultComboBoxModel<String> model;
	private JTextField tfFruit;
	private JLabel lblCon;
	private JButton btnNewButton;
	private JComboBox<Student> cmbStd;
	private JLabel lblStdCon;
	private JButton btnStd;
	private JPanel panel;
	private JLabel lblStdNo;
	private JTextField tfStdNo;
	private JButton btnSerch;
	private JComboBox<String> cmbFruit;
	private DefaultComboBoxModel<Student> stdModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combobox frame = new Combobox();
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
	public Combobox() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 0, 0));
		
		pLeft = new JPanel();
		pLeft.setBorder(new TitledBorder(null, "\uC608\uC81C11-12", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		pLeft.setLayout(new GridLayout(0, 1, 0, 0));
		
		tfFruit = new JTextField();
		tfFruit.addActionListener(this);
		
		cmbFruit = new JComboBox<>(getModel());
		cmbFruit.setSelectedIndex(-1);
		cmbFruit.addActionListener(this);
		pLeft.add(cmbFruit);
		pLeft.add(tfFruit);
		tfFruit.setColumns(10);
		
		
		lblCon = new JLabel("과일");
		lblCon.setForeground(Color.RED);
		lblCon.setHorizontalAlignment(SwingConstants.CENTER);
		pLeft.add(lblCon);
		
		pRight = new JPanel();
		pRight.setBorder(new TitledBorder(null, "\uC608\uC81C11-13", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		cmbStd = new JComboBox(getStudent());
		cmbStd.setSelectedIndex(-1);
		cmbStd.addActionListener(this);
		pRight.add(cmbStd);
		
		lblStdCon = new JLabel("학생정보");
		lblStdCon.setForeground(Color.RED);
		lblStdCon.setHorizontalAlignment(SwingConstants.CENTER);
		pRight.add(lblStdCon);
		
		btnStd = new JButton("학생확인");
		btnStd.addActionListener(this);
		pRight.add(btnStd);
		
		panel = new JPanel();
		pRight.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		lblStdNo = new JLabel("번호");
		lblStdNo.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblStdNo);
		
		tfStdNo = new JTextField();
		panel.add(tfStdNo);
		tfStdNo.setColumns(10);
		
		btnSerch = new JButton("검색");
		btnSerch.addActionListener(this);
		panel.add(btnSerch);
		
		btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(this);
		pLeft.add(btnNewButton);
	}

	private ComboBoxModel getStudent() {
       stdModel = new DefaultComboBoxModel<Student>();
		
//	     Student std1 = (new Student(1,"서현진",80,80,90));
//       Student std2 = (new Student(2,"강소라",100,88,90));
//       Student std3 = (new Student(3,"신세경",60,87,96));
//	  
//       stdModel.addElement(std1);
//       stdModel.addElement(std2);
//       stdModel.addElement(std3); 
       
       ArrayList<Student> std = new ArrayList<Student>();
       std.add(new Student(1,"서현진",80,80,90));
       std.add(new Student(2,"강소라",100,88,90));
       std.add(new Student(3,"신세경",60,87,96));
       
       for(Student a : std) {
    	   stdModel.addElement(a);
       }
		return stdModel;
	}

	private ComboBoxModel<String> getModel() {
		model = new DefaultComboBoxModel<String>();
		String[] fs = new String[] {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
//		List<String> fruit = new ArrayList<>();
		for(String f : fs) {
			model.addElement(f);
		}
		
		return model;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSerch) {
			btnSerchActionPerformed(e);
		}
		if (e.getSource() == btnStd) {
			btnStdActionPerformed(e);
		}
		if (e.getSource() == cmbStd) {
			cmbStdActionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			btnNewButtonActionPerformed(e);
		}
		if (e.getSource() == cmbFruit) {
			cmbFruitActionPerformed(e);
		}
		if (e.getSource() == tfFruit) {
			textFieldActionPerformed(e);
		}
	}
	protected void textFieldActionPerformed(ActionEvent e) {
		model.addElement(tfFruit.getText());
		tfFruit.setText("");
		
	}
	protected void cmbFruitActionPerformed(ActionEvent e) {
		lblCon.setText(cmbFruit.getSelectedItem()+"");
		
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, lblCon.getText());
	}
	protected void cmbStdActionPerformed(ActionEvent e) {
//	    System.out.println(cmbStd.getSelectedItem());
//	    String no = cmbStd.getSelectedItem().toString().substring(1, 3);
//	    String name = cmbStd.getSelectedItem().toString().substring(3, 7);
//	    String kor = cmbStd.getSelectedItem().toString().substring(7, 14);
//	    String eng = cmbStd.getSelectedItem().toString().substring(15, 19);
//	    String math = cmbStd.getSelectedItem().toString().substring(20,26 );
//	    String total = cmbStd.getSelectedItem().toString().substring(27, 30);
//	    String avg = cmbStd.getSelectedItem().toString().substring(31, 36);
//	    System.out.print(cmbStd.getSelectedItem().toString().charAt(31)+" ");
//	    System.out.print(cmbStd.getSelectedItem().toString().charAt(32)+" ");
//	    System.out.print(cmbStd.getSelectedItem().toString().charAt(33)+" ");
	    
//		lblStdCon.setText(no+name+kor+" "+eng+" "+math+" "+total+" "+avg);
		
		Student std = (Student)cmbStd.getSelectedItem();
		lblStdCon.setText(std.getStdNo()+" "+std.getStdName()+" "+std.getKor()+" "+std.getEng()+" "+std.getMath()+" "+std.total()+" "+(String.format("%.2f", std.avg())));
		
		
	}
	protected void btnStdActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, cmbStd.getSelectedItem().toString());
	}
	protected void btnSerchActionPerformed(ActionEvent e) {
//		tfStdNo.getText();
		cmbStd.setSelectedIndex(Integer.parseInt(tfStdNo.getText().trim())-1);
	}
}
