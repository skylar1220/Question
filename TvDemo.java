package Practice;
// lesson7 복제본 만들다 말았음
public class TvDemo {

	public static void main(String[] args) {
		// 객체 생성될 때 마다 시리얼 넘버를 하나씩 올려 넣어주려면 어떻게 해야할까?
		Tv t = new Tv();
		
		Tv t2 = new Tv();

		
		System.out.println(t.getSerialNumber());
		System.out.println(t2.getSerialNumber());


	}

}
