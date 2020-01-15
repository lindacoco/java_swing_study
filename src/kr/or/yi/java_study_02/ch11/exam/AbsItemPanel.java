package kr.or.yi.java_study_02.ch11.exam;

import javax.swing.JPanel;

public abstract class AbsItemPanel<T> extends JPanel {
	
	//인터페이스로하면 Jpanel못들어가서 못한다 
	public abstract T getItem() ;
	
	public abstract void clearTf();
	
	public abstract void setItem(T std);
}
