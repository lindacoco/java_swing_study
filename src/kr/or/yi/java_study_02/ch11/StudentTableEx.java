package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.management.RuntimeErrorException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kr.or.yi.java_study_02.ch11.exam.Student;
import kr.or.yi.java_study_02.ch11.exam.StudentPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentTableEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private StudentPanel pStudent;
	private JPanel pList;
	private JPanel pResult;
	private JScrollPane scrollPane;
	private JButton btnAdd;
    private JButton btnCancel;
	private ArrayList<Student> stds; // = new ArrayList<Student>();
	private Component StudentTblPanel;
	private JList<Student> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentTableEx frame = new StudentTableEx();
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
	public StudentTableEx() {
		
		
//		stds = new ArrayList<Student>();
//		stds.add(new Student(1,"서현진",80,90,60));
//		stds.add(new Student(2,"남궁민",88,90,60));
//		stds.add(new Student(3,"장현서",60,99,60));
		
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pStudent = new StudentPanel();
		contentPane.add(pStudent, BorderLayout.NORTH);
		
		pList = new JPanel();
		
		contentPane.add(pList, BorderLayout.CENTER);
		pList.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		pList.add(scrollPane, BorderLayout.CENTER);
		
		StudentTblPanel stp = new StudentTblPanel();
		pList.add(stp);
		
		
		table = new JTable();
	
		
		
		scrollPane.setViewportView(table);
		
		pResult = new JPanel();
		contentPane.add(pResult, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pResult.add(btnAdd);
		
		btnCancel = new JButton("취소");
		pResult.add(btnCancel);
		
//		loadData(); //제일 마지막에 넣어줌 table생성
		stp.setPopupMenu(createpopup());
		 //pList.setComponentPopupMenu(createpopup());
		
		
		}

//	private void loadData() {
//		table.setModel(new DefaultTableModel(getRows(),getColumnNames())); //한줄로 만듦
//	}

//	private Object[][] getRows() {
//		Object[][] rows = new Object[stds.size()][];
//		for(int i=0; i<rows.length; i++) {
//			rows[i] = toArray(stds.get(i)); //i번째 학생정보, 메소드만듦 toArray
//		}
//		return rows;
//		return new Object[][] { //이차원 배열 -일차원 배열이 여러개 들어가있다. 
//			{null, null, null, null, null, null, null},
//		};
//	}

//	private Object[] toArray(Student std) {
//		
//		return new Object[] {std.getStdNo(), std.getStdName(), std.getKor(), std.getEng(), std.getMath(), std.total(), String.format("%.2f", std.avg())};
//	}

//	private String[] getColumnNames() {
//		return new String[] {"학생번호", "학생명","국어","영어","수학","총점","평균"};
//	}
	
 private JPopupMenu createpopup() {
	JPopupMenu popMenu = new JPopupMenu();
	JMenuItem updateItem = new JMenuItem("수정");
	updateItem.addActionListener(myPopupMenuListener);
	popMenu.add(updateItem);
	updateItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//pStudent.setItem();
			btnAdd.setText("수정");
			
		}
	});
	
	
	JMenuItem deleteItem = new JMenuItem("삭제");
	deleteItem.addActionListener(myPopupMenuListener);
	popMenu.add(deleteItem);
	deleteItem.addActionListener(new ActionListener() {
		
		StudentTblPanel stp = new StudentTblPanel();
		@Override
		public void actionPerformed(ActionEvent e) {
	//		try { stp.remove
			
		}
	});
	return popMenu;
	
	
 
 }
   
    ActionListener myPopupMenuListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
//			if(e.getActionCommand().equals("수정")) {
//				//System.out.println("수정");
//				
//					//int idx = list.getSelectedIndex();
//				//JOptionPane.showMessageDialog(null, list.getSelectedValue());
//					pStudent.setItem(list.getSelectedValue());
//					btnAdd.setText("수정");
//					//String b = stds.get(idx).toString();
//					//JOptionPane.showMessageDialog(null, b.toString());
//					//pStudent.setItem(stds.get(idx));
//					//JOptionPane.showMessageDialog(null, a.toString());
					
		  
			}
//			if(e.getActionCommand().equals("삭제")) {
//				System.out.println("삭제");
//				int selIdx = list.getSelectedIndex();
//				System.out.println("selIdx = " + selIdx);
//				//list 에서 선택된 것이 있는지 판단 하고
//				//선택된 번호 또는 Student index또는 value를 가져온 후에 
//				//arrayList에서 일치하는 것 삭제
//				//jlist에서 setListDate()호출해서 변경된 arrayList를 보여주도록 한다 
//				if(list.isSelectionEmpty() == false) {
//					int idx = list.getSelectedIndex();
//					stds.remove(idx);
//					list.setListData(new Vector<>(stds));
//					btnCancel.setText("취소");
//				}
//			} 
//			
//		}
	};
    private JTable table;
  
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
	}
	protected void btnAddActionPerformed(ActionEvent e) {
//	   Student a = pStudent.getItem();
//	   stds.add(a);
//	   list.setListData(new Vector<Student>(stds));
	
	}
	
}
