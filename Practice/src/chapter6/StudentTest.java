package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("태백산맥1", "조정래");
		studentLee.addBook("태백산맥2", "조정래");
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addBook("토지1", "박경리");
		studentKim.addBook("토지2", "박경리");
		studentKim.addBook("토지3", "박경리");
		
		Student studentCho = new Student(1003, "Cho");
		
		studentCho.addBook("해리포터1", "조앤 롤링");
		studentCho.addBook("해리포터2", "조앤 롤링");
		studentCho.addBook("해리포터3", "조앤 롤링");
		studentCho.addBook("해리포터4", "조앤 롤링");
		studentCho.addBook("해리포터5", "조앤 롤링");
		studentCho.addBook("해리포터6", "조앤 롤링");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}
}
