import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student() ;
		
		// 입력 버전으로는 이게 최선일까? 아니면 이 입력 받는 것도 클래스 파일에 함수로 넣어서 할 수 있을까?
		Scanner sc = new Scanner(System.in);
		System.out.println("학과 입력: ");
		String inMajor = sc.next() ;
		System.out.println("학번 입력: ");
		int inNumber = sc.nextInt() ;
		s.setMajor(inMajor).setNumber(inNumber).show();
	}

}

