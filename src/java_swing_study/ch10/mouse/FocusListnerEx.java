package java_swing_study.ch10.mouse;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FocusListnerEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblName;
	private JTextField tfName;
	private JLabel lblNo;
	private JTextField tfNo;
	private JLabel lblDept;
	private JTextField tfDept;
	private JLabel lblSubj;
	private JTextField tfSubj;
	private JLabel res;
	private JPasswordField pw1;
	private JPasswordField pw2;
	private JLabel lblconfirm;
	private JButton btnOk;
	private JButton btnCancel;

	public FocusListnerEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(351,257);
		setLocation(100,100);
		//setBounds(100, 100, 351, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 5));
		
		lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblName);
		
		tfName = new JTextField();
		tfName.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				msg();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				msg();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				msg();
			}
			
			public void msg() {
				res.setText(String.format("%s 길이 : %d %n",tfName.getText(), tfName.getText().length()));
			}
			
		});
		
	
		contentPane.add(tfName);
		tfName.setColumns(10);
		tfName.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(tfName.getText().length() ==0) {
					JOptionPane.showMessageDialog(null, "이름을 입력하세요");
				}				
			}
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblNo);
		
		tfNo = new JTextField();

		tfNo.setColumns(10);
		contentPane.add(tfNo);
		
		lblDept = new JLabel("학과");
		lblDept.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblDept);
		
		tfDept = new JTextField();
		tfDept.setColumns(10);
		contentPane.add(tfDept);
		
		lblSubj = new JLabel("과목");
		lblSubj.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblSubj);
		
		tfSubj = new JTextField();
		tfSubj.setFocusable(true);
		tfSubj.requestFocus();
		tfSubj.setColumns(10);
		contentPane.add(tfSubj);
		
		tfSubj.setRequestFocusEnabled(true);
		
		res = new JLabel("이름필드 글자수");
		contentPane.add(res);
		
		lblconfirm = new JLabel("");
		lblconfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblconfirm.setFont(new Font("굴림", Font.BOLD, 22));
		lblconfirm.setForeground(Color.RED);
		contentPane.add(lblconfirm);
		
		pw1 = new JPasswordField();
		pw1.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				isEualPw();
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				isEualPw();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				isEualPw();
				
			}
			public void isEualPw() {
				   //pw1.getPassword();
				   String pass1 = new String(pw1.getPassword());
				   String pass2 = new String(pw2.getPassword());
				   
				   System.out.printf("pw1 %s pw2 %s %n",pass1,pass2);
				   
				   if(pass1.equals(pass2)) {
					   lblconfirm.setText("일치");
				   }else {
					   lblconfirm.setText("일치하지 않음");
				   }
				}
		});
		contentPane.add(pw1);
		
		pw2 = new JPasswordField();
		pw2.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				isEualPw();
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				isEualPw();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				isEualPw();
			}
			
			public void isEualPw() {
			   //pw1.getPassword();
			   String pass1 = new String(pw1.getPassword());
			   String pass2 = new String(pw2.getPassword());
			   
			   System.out.printf("pw1 %s pw2 %s %n",pass1,pass2);
			   
			   if(pass1.equals(pass2)) {
				   lblconfirm.setText("일치");
			   }else {
				   lblconfirm.setText("일치하지 않음");
			   }
			}
		});
		contentPane.add(pw2);
		
		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		contentPane.add(btnOk);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		contentPane.add(btnCancel);
	}

	
	public JTextField getTfSubj() {
		return tfSubj;
	}
	public static void main(String[] args) {
		FocusListnerEx frame = new FocusListnerEx();
		frame.setVisible(true);
		
//		frame.getTfSubj().requestFocus();
		
//		frame.getTfSubj().setFocusable(true);
//   	frame.getTfSubj().requestFocus();
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			btnCancelActionPerformed(e);
		}
		if (e.getSource() == btnOk) {
			btnOkActionPerformed(e);
		}
	}
	protected void btnOkActionPerformed(ActionEvent e) {
		String a = tfName.getText();
		int b= Integer.parseInt(tfNo.getText());
		String c=tfDept.getText();
		String d=tfSubj.getText();
		//JOptionPane.showMessageDialog(null, "ddddd");
		//Student student = new Student(tfName.getText(),Integer.parseInt(tfNo.getText()),tfDept.getText(),tfSubj.getText());
		Student student = new Student(a,b,c,d);
		//JOptionPane.showMessageDialog(null, student);
		System.out.println(student.toString());
	}
	protected void btnCancelActionPerformed(ActionEvent e) {
		//sfName.setText("");
		tfName.setText("");
		tfNo.setText("");
		tfDept.setText("");
		tfSubj.setText("");
	}
}
