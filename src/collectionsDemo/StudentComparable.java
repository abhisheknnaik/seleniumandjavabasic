package collectionsDemo;

public class StudentComparable implements Comparable {
	private String studentname;
	private int rollno;
	private int studentage;

	public StudentComparable(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public int compareTo(Object comparestu) {
		//int compareage = ((StudentComparable) comparestu).getStudentage();
		int compareage = ((StudentComparable) comparestu).studentage;
		/* For Ascending order */
		 return this.studentage-compareage;

		/* For Descending order do like this */
		 //return compareage-this.studentage;

		// for name
		//String name = ((StudentComparable) comparestu).getStudentname();
		// for decending order
		// return name.compareTo(this.studentname);
		// For ascending order
		//return this.studentname.compareTo(name);
	}
}
