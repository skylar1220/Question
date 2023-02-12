package lesson7;

public class TvDemo {

	public static void main(String[] args) {
		Tv t = new Tv();
		
		t.volumeUp(2);
		System.out.println(t.getVolume());
		
		Tv t2 = new Tv();
		
		Tv t3 = new Tv();

		System.out.println(t.getSerialNumber());
		System.out.println(t2.getSerialNumber());
		System.out.println(t3.getSerialNumber());


	}

}
