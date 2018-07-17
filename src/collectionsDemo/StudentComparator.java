package collectionsDemo;

import java.util.Comparator;

public class StudentComparator {
	private String studentname;
	private int rollno;
	private int studentage;

	public StudentComparator(int rollno, String studentname, int studentage) {
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

	public static Comparator<StudentComparator> StuNameComparator = new Comparator<StudentComparator>() {

		public int compare(StudentComparator s1, StudentComparator s2) {
			// s1 is 1st element s2 oth element
			String StudentName1 = s1.getStudentname().toUpperCase();
			String StudentName2 = s2.getStudentname().toUpperCase();
			System.out.println(StudentName1 + " " + StudentName2 + " compare "
					+ StudentName1.compareTo(StudentName2));
			// ascending order
			return StudentName1.compareTo(StudentName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	/* Comparator for sorting the list by roll no */
	public static Comparator<StudentComparator> StuRollno = new Comparator<StudentComparator>() {

		public int compare(StudentComparator s1, StudentComparator s2) {

			int rollno1 = s1.getRollno();
			int rollno2 = s2.getRollno();

			/* For ascending order */
			System.out.println(rollno1 + " " + rollno2);
			return rollno1 - rollno2;

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	/* Comparator for sorting the list by age */
	public static Comparator<StudentComparator> StudAge = new Comparator<StudentComparator>() {

		public int compare(StudentComparator s1, StudentComparator s2) {

			int age1 = s1.getStudentage();
			int age2 = s2.getStudentage();
			System.out.println(age1 + " " + age2);
			/* For ascending order */
			return age1 - age2;

			/* For descending order */
			// age2-age1;
		}
	};

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age="
				+ studentage + "]";
	}
}
