
public class Student {

	private int grade;
	private int age;
	
	static int sumGrade;
	static int sumAge;
	static int sumStudents;
	public Student(int grade, int age) {
		super();
		this.grade = grade;
		this.age = age;
		Student.sumGrade +=grade;
		Student.sumAge +=age;
		Student.sumStudents++;
	}
	public static int getAvrGrade() {
		return sumGrade/sumStudents;
	}
	
	public static int getAvrAge() {
		return sumAge/sumStudents;
	}

	
}
