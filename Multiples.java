
public class Multiples {

	public static void main(String[] args) {

		int[] multi3 = new int[40] ;
		for ( int i = 1; i < 100 ; i++ ) {
			if ( i % 3 == 0 ) {
				multi3[i] = i ;
			}
		}
	}

}

//10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//
//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.