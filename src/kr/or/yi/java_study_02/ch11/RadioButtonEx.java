package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class RadioButtonEx extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private JPanel pLeft;
	private JPanel pRight;
	private JPanel pRdbBtns;
	private JPanel pLblImg;
	private JRadioButton rdbtnApple;
	private JRadioButton rdbtnPear;
	private JRadioButton rdbtnCherry;
	private JLabel lblImg;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	
	//
	private HashMap<String,ImageIcon> icons;
	private JButton btnApple;
	private JButton btn2;
	private JButton btn4;
	private JButton btn3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonEx frame = new RadioButtonEx();
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
	public RadioButtonEx() {
		
		//미리 아이콘 만들어둔다
		icons = new HashMap<String, ImageIcon>();
		//이미지 추가
		String imgDirPath = System.getProperty("user.dir")+"\\img\\";
		icons.put("사과", new ImageIcon(imgDirPath+"apple.jpg"));
		icons.put("배", new ImageIcon(imgDirPath+"pear.jpg"));
		icons.put("체리", new ImageIcon(imgDirPath+"cherry.jpg"));
		
		initialize();
	}
	private void initialize() {
		setTitle("라디오버튼예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "라디오버튼 예제", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 0));
		
		pLeft = new JPanel();
		pLeft.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pRdbBtns = new JPanel();
		pLeft.add(pRdbBtns, BorderLayout.NORTH);
		
		rdbtnApple = new JRadioButton("사과");
		
		
		buttonGroup.add(rdbtnApple);
		pRdbBtns.add(rdbtnApple);
		
		rdbtnPear = new JRadioButton("배");
		
		buttonGroup.add(rdbtnPear);
		pRdbBtns.add(rdbtnPear);
		
		rdbtnCherry = new JRadioButton("체리");
		
		buttonGroup.add(rdbtnCherry);
		pRdbBtns.add(rdbtnCherry);
		
		pLblImg = new JPanel();
		pLblImg.setBorder(new EmptyBorder(10, 10, 10, 10));
		pLeft.add(pLblImg, BorderLayout.WEST);
		pLblImg.setLayout(new BorderLayout(0, 0));
		
		lblImg = new JLabel("");
		lblImg.setHorizontalAlignment(SwingConstants.CENTER);
		pLblImg.add(lblImg, BorderLayout.NORTH);
		
		pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnApple = new JButton("사과 선택");
		btnApple.addActionListener(this);
		pRight.add(btnApple);
		
		btn2 = new JButton("배 선택");
		btn2.addActionListener(this);
		pRight.add(btn2);
		
		btn3 = new JButton("체리 선택");
		btn3.addActionListener(this);
		pRight.add(btn3);
		
		btn4 = new JButton("선택한 과일 확인");
		btn4.addActionListener(this);
		pRight.add(btn4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("ㅇㅇㄹㄴㄹㅇㄹ");
		pRight.add(textField);
		textField.setColumns(10);
		
		rdbtnApple.addItemListener(this);
		rdbtnPear.addItemListener(this);
		rdbtnCherry.addItemListener(this);
		rdbtnApple.setSelected(true);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rdbtnCherry) {
			rdbtnCherryItemStateChanged(e);
		}
		if (e.getSource() == rdbtnPear) {
			rdbtnPearItemStateChanged(e);
		}
		if (e.getSource() == rdbtnApple) { //e.getItem()
			rdbtnAppleItemStateChanged(e);
		}
		
		//리스너는 젤 밑에 
		
	}
	protected void rdbtnAppleItemStateChanged(ItemEvent e) {
		//뭘 판단해야하나 선택되었는지 여부
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//JOptionPane.showMessageDialog(null,rdbtnApple.getText());
			//선택되었다면 lblIMG에
			lblImg.setIcon(icons.get(rdbtnApple.getText()));
		}
	}
	protected void rdbtnPearItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//JOptionPane.showMessageDialog(null,((JRadioButton)e.getItem()).getText());
			lblImg.setIcon(icons.get(rdbtnPear.getText()));
		}
	}
	protected void rdbtnCherryItemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			//JOptionPane.showMessageDialog(null,((JRadioButton)e.getItem()).getText());
			lblImg.setIcon(icons.get(rdbtnCherry.getText()));
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn4) {
			btn4ActionPerformed(e);
		}
		if (e.getSource() == btnApple) {
			btn1ActionPerformed(e);
		}
		if (e.getSource() == btn3) {
			btn3ActionPerformed(e);
		}
		if (e.getSource() == btn2) {
			btn2ActionPerformed(e);
		}
	}
	protected void btn2ActionPerformed(ActionEvent e) {
		rdbtnPear.setSelected(true);
		System.out.println("배");
	}
	protected void btn3ActionPerformed(ActionEvent e) {
		rdbtnCherry.setSelected(true);
		System.out.println("체리");
	}
	protected void btn1ActionPerformed(ActionEvent e) {
		rdbtnApple.setSelected(true);
		System.out.println("사과");
	}
	protected void btn4ActionPerformed(ActionEvent e) {
		if(rdbtnPear.isSelected()) {
			JOptionPane.showMessageDialog(null, "선택된 과일은 배 입니다");
		}if(rdbtnApple.isSelected()) {
			JOptionPane.showMessageDialog(null, "선택된 과일은 사과 입니다");
		}if(rdbtnCherry.isSelected()) {
			JOptionPane.showMessageDialog(null, "선택된 과일은 체리 입니다");
		}
		System.out.println("all");
	}
}
