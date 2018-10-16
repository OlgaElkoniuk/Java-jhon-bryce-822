
public class Program {

	public static void main(String[] args) {
		Student olga = new Student (78, 30);
		Student david = new Student(34, 25);
		
		System.out.println(Student.getAvrAge());
		System.out.println(Student.getAvrGrade());
	}

}
