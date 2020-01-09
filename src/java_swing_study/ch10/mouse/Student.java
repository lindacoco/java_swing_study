package java_swing_study.ch10.mouse;

public class Student {
    private String name;
    private int sno;
    private String dept;
    private String subj;
    
    
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int sno, String dept, String subj) {
		this.name = name;
		this.sno = sno;
		this.dept = dept;
		this.subj = subj;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getDept() {
		return dept;
	}





	public void setDept(String dept) {
		this.dept = dept;
	}





	public String getSubj() {
		return subj;
	}





	public void setSubj(String subj) {
		this.subj = subj;
	}





	@Override
	public String toString() {
		return String.format("Student [name=%s, sno=%s, dept=%s, subj=%s]", name, sno, dept, subj);
	}
}


