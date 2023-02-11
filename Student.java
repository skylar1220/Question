
public class Student {
	
	private String major ;
	private int number ; 

	
	public String getMajor() {
		return major;
	}

	public Student setMajor(String major) {
		this.major = major;
		return this;
	}

	public int getNumber() {
		return number;
	}

	public Student setNumber(int number) {
		this.number = number;
		return this;

	}


	
	
	public Student() { // 얘는 의미 없이 그냥 입력해놓는 건가?
		
	}
	
	void show() {
		System.out.printf("당신의 전공은 %s, 학번은 %d번 이군요!", major, number);
	}
	

}
