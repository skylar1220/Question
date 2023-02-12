
public class CircleDemo {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.setRadius(4.0);
		System.out.println(c.getSize());
		
		Circle c2 = new Circle();
		c2.setRadius(5.0);
		System.out.println(c2.getSize());

		System.out.println(c.getSize()); //radius를 static화 하면 얘까지 같이 바뀌어 버림
		
		
//		L7_pr1.MAXCIRCLENUM = 300 ;
		System.out.println(Circle.MAXCIRCLENUM); // 이렇게 객체 선언 없이 클래스로 부를 수 있음 
		
	}

}
