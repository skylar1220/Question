
public class Circle {
	
	// 인스턴스 멤버 변수 (static 안 붙은 애들은 다)
//	private double radius = 0 ; 

	private double radius2 = 0 ; 
	public int MAXCIRCLENUM2 = 200 ;

	
	// 정적 멤버 변수 
		// 2. 따라서 final에는 static 자동 붙여라
		// 위 두개의 차이는 1. static 이 붙으면 demo 파일에서 굳이 
		// 2. circle c 객체 만들어서 c.max로 부를 필요 없이, 그냥 circle.max로 클래스로 부를 수 있음
		// static은 이런 변수도 되지만 메소드에 붙여도 됨
	
	private static double radius = 0 ; 

	public static final int MAXCIRCLENUM = 100 ;
	
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Circle() {
	}
	

	
	// 인스턴스 메소드 : 안에서는 static 정적 요소를 사용할 수 있음
	public double getSize() {
		System.out.println(MAXCIRCLENUM2);
		return radius * radius * 3.14 ;
	}
	
	public static double getSize2() {
//		System.out.println(MAXCIRCLENUM2);
		return radius * radius * 3.14 ;
	}
	
	// 정적 메소드 : 안에서는 인스턴스 요소를 사용할 수 없다.


}
