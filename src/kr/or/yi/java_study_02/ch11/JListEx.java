package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

public class JListEx extends JFrame implements ActionListener, ListSelectionListener {

	private JPanel contentPane;
	//616
	private ArrayList<String> listFruits;
	private JPanel p1;
	private JList<String> strList;
	private JPanel pBtns1;
	private JButton btnAddSet1;
	private JButton btnNewButton_1;
	private JPanel p2;
	private JPanel panel;
	private JButton btnSet2;
	private JButton btn22;
	private JScrollPane scrollPane;
	private JList imgList;
	private JPanel p3;
	private JTextField textField;
	private JPanel panel_2;
	private JScrollPane scrollPane_1;
	private JList list22;
	
	private Vector<String> v= new Vector<String>();
	private JList<String> nameList = new JList<String>();
	private ArrayList<ImageIcon> imagess;


 	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListEx frame = new JListEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JListEx() {
		loadListData();
		initialize();
		
	
	}



	private void loadListData() {
		listFruits = new ArrayList<String>();
		listFruits.add("apple");
		listFruits.add("banana");
		listFruits.add("kiwi");
		listFruits.add("mango");
		listFruits.add("pear");
		listFruits.add("peach");
		listFruits.add("berry");
		listFruits.add("strawberry");
		listFruits.add("blackberry");
		
		imagess = new ArrayList<ImageIcon>();
		String dirPath = System.getProperty("user.dir")+"\\img\\";
		imagess.add(new ImageIcon(dirPath+"icon1.png"));
		imagess.add(new ImageIcon(dirPath+"icon2.png"));
		imagess.add(new ImageIcon(dirPath+"icon3.png"));
		imagess.add(new ImageIcon(dirPath+"icon4.png"));
	}
	private void initialize() {
		setTitle("JList & JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 10, 10));
		
		p1 = new JPanel();
		p1.setBorder(new TitledBorder(null, "JList\uC608\uC81C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(p1);
		p1.setLayout(new BorderLayout(0, 0));
		
		strList = new JList<>(new Vector<>(listFruits)); //원래는arrayList못들어감
		strList.addListSelectionListener(this);
		p1.add(strList, BorderLayout.CENTER);
		
		pBtns1 = new JPanel();
		p1.add(pBtns1, BorderLayout.NORTH);
		pBtns1.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnAddSet1 = new JButton("확인");
		btnAddSet1.addActionListener(this);
		pBtns1.add(btnAddSet1);
		
		btnNewButton_1 = new JButton("선택하기");
		btnNewButton_1.addActionListener(this);
		pBtns1.add(btnNewButton_1);
		
		p2 = new JPanel();
		p2.setBorder(new TitledBorder(null, "JListIcon", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(p2);
		p2.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		p2.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnSet2 = new JButton("확인");
		btnSet2.addActionListener(this);
		panel.add(btnSet2);
		
		btn22 = new JButton("선택하기");
		panel.add(btn22);
		
		scrollPane = new JScrollPane();
		p2.add(scrollPane, BorderLayout.SOUTH);
		
		imgList = new JList(new Vector<>(imagess));
		p2.add(imgList, BorderLayout.CENTER);
		
		p3 = new JPanel();
		contentPane.add(p3);
		p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
		
		textField = new JTextField();
		textField.addActionListener(this);
		p3.add(textField);
		textField.setColumns(10);
		
		panel_2 = new JPanel();
		p3.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		list22 = new JList();
		scrollPane_1.setViewportView(list22);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSet2) {
			btnSet2ActionPerformed(e);
		}
		if (e.getSource() == textField) {
			textFieldActionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			btnNewButton_1ActionPerformed(e);
		}
		if (e.getSource() == btnAddSet1) {
			btnAddSet1ActionPerformed(e);
		}
	}
	protected void btnAddSet1ActionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "선택한 과일은? " + strList.getSelectedValue());
	}
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource() == strList) {
			strListValueChanged(e);
		}
	}
	protected int strListValueChanged(ListSelectionEvent e) {
	  System.out.println(e);
	  return e.getLastIndex();
	
	}
	
	protected void btnNewButton_1ActionPerformed(ActionEvent a) {
	   strList.setSelectedIndex(5);
	   
	}
	protected void textFieldActionPerformed(ActionEvent e) {
	    String aa = textField.getText().trim();
	    v.add(aa);
	    
	    list22.setListData(v);
	    textField.setText("");
	    
	
	}
	protected void btnSet2ActionPerformed(ActionEvent e) {
		
		ImageIcon icon = imagess.get(imgList.getSelectedIndex());
		String fullName = icon.getDescription();
		JOptionPane.showMessageDialog(null, fullName.substring(fullName.lastIndexOf("\\")+1));
	}
}
