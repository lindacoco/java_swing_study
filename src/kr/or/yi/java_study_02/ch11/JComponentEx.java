package kr.or.yi.java_study_02.ch11;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ContainerListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ContainerEvent;

public class JComponentEx extends JFrame implements ActionListener, ContainerListener {
   
	private JPanel contentPane;
	private JPanel pLeft;
	private JPanel pRight;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btn4;
	private JButton btn5;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponentEx frame = new JComponentEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JComponentEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 5, 5));
		
		pLeft = new JPanel();
		pLeft.addContainerListener(this);
		pLeft.setBorder(new TitledBorder(null, "11-1\uC608\uC81C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLeft);
		
		btn1 = new JButton("Magenta/Yellow Button");
		btn1.setBackground(Color.ORANGE);
		btn1.setForeground(Color.MAGENTA);
		btn1.setFont(new Font("Arial", Font.PLAIN, 18));
		btn1.addActionListener(this);
		pLeft.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pLeft.add(btn1);
		
		btn2 = new JButton("Disabled Button");
		pLeft.add(btn2);
		btn2.setEnabled(false);
		
		btn3 = new JButton("getX(), getY()");
		btn3.addActionListener(this);
		pLeft.add(btn3);
		
		btnAdd = new JButton("Right Panel Add Btn");
		btnAdd.addActionListener(this);
		pLeft.add(btnAdd);
		
		btnRemove = new JButton("Right Panel Remove Btn");
		btnRemove.addActionListener(this);
		pLeft.add(btnRemove);
		
		pRight = new JPanel();
		pRight.addContainerListener(this);
		pRight.setBorder(new TitledBorder(null, "JComponent\uBA54\uC18C\uB4DC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pRight);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRemove) {
			btnRemoveActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
		if (e.getSource() == btn3) {
			btn3ActionPerformed(e);
		}
		if (e.getSource() == btn1) {
			btnNewButtonActionPerformed(e);
		}
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		if(btn2.isEnabled() ==  false) {
		      btn2.setEnabled(true);
		  }else {
			  btn2.setEnabled(false);
		  }
		}
	protected void btn3ActionPerformed(ActionEvent e) {
		JButton b= (JButton)e.getSource();
		JComponentEx frame =(JComponentEx)b.getTopLevelAncestor();
		frame.setTitle(b.getX()+","+b.getY());
	}
	
	
	
	protected void btnAddActionPerformed(ActionEvent e) {
		JButton btn = new JButton("added");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
               JFrame frame = new JFrame("Test");
               frame.addWindowListener(new WindowListener() {
				
				@Override
				public void windowOpened(WindowEvent e) {
                       System.out.printf("%s()%n","windowOpened");					
				}
				
				@Override
				public void windowIconified(WindowEvent e) {
					System.out.printf("%s()%n","windowIconified");	
				}
				
				@Override
				public void windowDeiconified(WindowEvent e) {
					System.out.printf("%s()%n","windowDeiconified");	
					
				}
				
				@Override
				public void windowDeactivated(WindowEvent e) {
					System.out.printf("%s()%n","windowDeactivated");	
					
				}
				
				@Override
				public void windowClosing(WindowEvent e) {
					System.out.printf("%s()%n","windowClosing");	
					
				}
				
				@Override
				public void windowClosed(WindowEvent e) {
					System.out.printf("%s()%n","windowClosed");	
					
				}
				
				@Override
				public void windowActivated(WindowEvent e) {
					System.out.printf("%s()%n","windowActivated");	
					
				}
			});
               frame.setBounds(200,200,450,300);
               frame.setVisible(true);
			}
		});
		
		pRight.add(btn);
		btn.revalidate();
		
				
				//btn2 = new JButton("Disabled Button");
				//pLeft.add(btn2);
				//btn2.setEnabled(false);
	}
	protected void btnRemoveActionPerformed(ActionEvent e) {
		for(Component c :pRight.getComponents()) {
			if(c instanceof JButton) {
				pRight.remove(c);
				revalidate();
				repaint();
				break; //한개만 
			}
		}
	}
	public void componentAdded(ContainerEvent e) {
		if (e.getSource() == pRight) {
			pRightComponentAdded(e);
		}
	}
	public void componentRemoved(ContainerEvent e) {
		if (e.getSource() == pRight) {
			pRightComponentRemoved(e);
		}
	}
	protected void pRightComponentAdded(ContainerEvent e) {
		JOptionPane.showMessageDialog(null, "버튼이 추가되었습니다");
	}
	protected void pRightComponentRemoved(ContainerEvent e) {
		JOptionPane.showMessageDialog(null, "버튼이 삭제되었습니다");
	}
}
