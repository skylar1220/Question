package lesson7;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student() ;
		s.setName("hyun");
		System.out.println(s.getName());
		
		System.out.println("toString ver.: " + s);
	}

}
