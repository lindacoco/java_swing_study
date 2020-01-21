package kr.or.yi.java_study_02.ch11;

import javax.management.RuntimeErrorException;
import javax.management.modelmbean.ModelMBean;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.yi.java_study_02.ch11.exam.Student;
import kr.or.yi.java_study_02.ch11.exam.StudentPanel;

import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class StudentTblPanel extends JPanel {
	private JScrollPane scrollPane;
	private JTable table;
	private NotEditableModel model;

	
	public StudentTblPanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.setViewportView(table);
		//스크롤팬에도 팝업메뉴 달아야함
		
		
		//테스트용
		ArrayList<Student> stds = new ArrayList<Student>();
		stds = new ArrayList<Student>();
		stds.add(new Student(1,"서현진",80,90,60));
		stds.add(new Student(2,"남궁민",88,90,60));
		stds.add(new Student(3,"장도로",60,99,60));
		//외부에서 호출하도록 할 것이다 
		loadData(stds);
		
	// 지움 외부에서 가져올거라서	setPopupMenu();
	}
	void setPopupMenu(JPopupMenu popupMenu) {
		scrollPane.setComponentPopupMenu(popupMenu);
		table.setComponentPopupMenu(popupMenu);
	}
	private void loadData(ArrayList<Student> stds) {
		model = new NotEditableModel(getRows(stds),getColNames());
		
		
		table.setModel(model);
		//데이터 들어간 다음 각 컬럼의 폭과 셀의 수평정렬 할거임
		
		setTblWidthAlign();
	}
	private void setTblWidthAlign() {
		tableSetWidth(50,150,50,50,50,70,70); //폭  매개변수로 주면 편하다... 가변인수
		tableCellAlign(SwingConstants.CENTER,0,1,2,4); //메소드 생성 센터로 해라 01234컬럼은 가운데정렬
		tableCellAlign(SwingConstants.RIGHT,5,6);
		tableCellAlign(SwingConstants.LEFT,3);
	}
	
	private void tableCellAlign(int align,int...idx) {
		//가운데 정렬 5개는 가운데정렬 총점 평균 오른쪽정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align); 
		
		TableColumnModel cModel = table.getColumnModel();  //복사 테이블마다 각각적용
		
		for(int i =0; i<idx.length; i++) {
			cModel.getColumn(idx[i]).setCellRenderer(dtcr);
		}
//        cModel.getColumn(0).setCellRenderer(dtcr);
//        cModel.getColumn(1).setCellRenderer(dtcr);	
//        cModel.getColumn(2).setCellRenderer(dtcr);	
//        cModel.getColumn(3).setCellRenderer(dtcr);	
//        cModel.getColumn(4).setCellRenderer(dtcr);	
		
		
		
	}
	private void tableSetWidth(int ...width) { //가변인수
		TableColumnModel cModel = table.getColumnModel(); 
		for(int i =0; i<width.length; i++) {
			cModel.getColumn(0).setPreferredWidth(width[i]);
			//System.out.print(width[i] + " ");
		}
		//컬럼 수 7개
//		cModel.getColumn(0).setPreferredWidth(50); //0번째 컬럼 - 학생번호
//		cModel.getColumn(1).setPreferredWidth(150); //이름
//		cModel.getColumn(2).setPreferredWidth(50);  //국어
//		cModel.getColumn(3).setPreferredWidth(50);  //영어
//		cModel.getColumn(4).setPreferredWidth(50);  //수학
//		cModel.getColumn(5).setPreferredWidth(70);
//		cModel.getColumn(6).setPreferredWidth(70);
	}
	
	
	
	
	private String[] getColNames() {
		return new String[] {"번호", "학생명","국어","영어","수학","총점","평균"};
	}
	private Object[][] getRows(ArrayList<Student> stds) {
		Object [][] rows = new Object[stds.size()][];
		for(int i=0; i<rows.length; i++) {
			rows[i] = toArray(stds.get(i));
		}
		//외부에서 arrayList호출	
		return rows;
	}
	 private Object[] toArray(Student std) {
		 return new Object[] {String.format("%03d", std.getStdNo()), 
				 std.getStdName(), 
				 std.getKor(), 
				 std.getEng(), 
				 std.getMath(), 
				 std.total(), 
				 String.format("%.2f", std.avg())};
	}
	 
	 
	 
	 
	 
	 public void removeRow() {
		 //어떤 row를 삭제해야할지 알아야 함 
		 int selectedIdx = table.getSelectedRow();
		// System.out.println(selectedIdx);
		 if(selectedIdx == -1) {
			 throw new RuntimeErrorException(null, "해당학생을 선택하세요");
			// JOptionPane.showMessageDialog(null, "해당학생을 선택하세요");
			 //return;
		 }else {
			 model.removeRow(selectedIdx);
			 
		 }
	 }
	 
	 
	 public void updateRow(Student std, int updateIdx) { //이렇게 안하고 넘버 찾아서 던져줘도 된다.. 
		 	 
		model.setValueAt(String.format("%03d",std.getStdNo() ), updateIdx, 0); 
		model.setValueAt(std.getStdName(), updateIdx, 1);
		model.setValueAt(std.getKor(), updateIdx, 2);
		model.setValueAt(std.getEng(), updateIdx, 3);
		model.setValueAt(std.getMath(), updateIdx, 4);
		model.setValueAt(std.total(), updateIdx, 5);
	
		model.setValueAt(String.format("%.2f", std.avg()), updateIdx, 6);
	}
	 
	 public void addItem(Student std) {
		  model.addRow(toArray(std)); //이미 만들어놓은 배
		 
	 }
	 
	 
	 
	 public Student getSelectedItem() {
		 //선택한 row 알아야함
		 int selectedIdx = table.getSelectedRow(); // 복붙
		 //model에서 가져오는거
		// int stdNo = (int)model.getValueAt(selectedIdx, 0); //학생번호는 0번 컬럼에 있음 object라서 캐스트해줘야함 001이라 오류뜸
		 int stdNo = Integer.parseInt((String)model.getValueAt(selectedIdx, 0));
		 String stdName = (String)model.getValueAt(selectedIdx, 1);
		 int kor = (int)model.getValueAt(selectedIdx, 2);
		 int math = (int)model.getValueAt(selectedIdx, 3);
		 int eng = (int)model.getValueAt(selectedIdx, 4);
		 
		 return new Student(stdNo, stdName, kor, math, eng);
	 }
	 
	 //수정금지하기 위한 모델 상속받을 것
	 private class NotEditableModel extends DefaultTableModel{
 //슈퍼클래스 상속 잊으면 안됨 
		public NotEditableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}
		@Override
		public boolean isCellEditable(int row, int column) {
			return false; //수정 불가능 
		}
	 }
 
	//테스트용 나중에 지워야함 
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setBounds(10,10,450,500); //기본적으로 보더레이아웃
		
		
		
		StudentTblPanel tbl = new StudentTblPanel();
		frame.add(tbl);
		frame.setVisible(true);
		
		//만들어서 리스트에 추가할거임
		
		JPopupMenu popMenu = new JPopupMenu();
		
		JMenuItem addItem = new JMenuItem("추가");
		addItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Student newStudent = new Student(10,"장현서",80,90,70);
				tbl.addItem(newStudent);
				
			}
		});
		popMenu.add(addItem);
		
		
//		JPopupMenu popMenu = new JPopupMenu();
		JMenuItem updateItem = new JMenuItem("수정");
		updateItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Student upStd = new Student(2,"이상원",100,100,100);
				
					
				tbl.updateRow(upStd, 1); //수정하려는 로우의 번호를 알아서 찾아서 수정해야한다 여기서는 1번 학생  -남궁민학생을 이상원 학생으로 변경
				
				//확인버튼도 한개 더 달아야한 ....다 ㅜ 
				
				}
		});
		popMenu.add(updateItem);
		
		JMenuItem getSelectedItem = new JMenuItem("선택한 학생확인");
		getSelectedItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Student selectedStd = tbl.getSelectedItem(); //하나의 로우 = 학생정보를 가져오는 메소드
				JOptionPane.showMessageDialog(null, "선택한 학생은"+selectedStd);
				
			}
		});
		popMenu.add(getSelectedItem);
		
		JMenuItem deleteItem = new JMenuItem("삭제");
		deleteItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 try{tbl.removeRow();
				 
				 }catch(RuntimeErrorException el) {
					 JOptionPane.showMessageDialog(null, el.getMessage());
				 }
			}
		});
		popMenu.add(deleteItem);
		
		tbl.setPopupMenu(popMenu);
	}

}
