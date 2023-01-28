package Practice;

public class Q1_Multiples {

	public static void main(String[] args) {
		int count = 0 ;
		int sum = 0 ;
		for ( int i = 1 ;  i<1000 ; i++ ) {
			if ( i%3 == 0 || i%5 == 0 ) {
				sum += i ;
				count++ ;
			}
		}
		System.out.println(sum);
		System.out.println("\n갯수: " + count );
	}
}


// 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.

// 1000미만의 자연수에서 3의 배수의 개수를 구하라.


// 1000미만의 자연수에서 3,5의 배수의 총합을 구하라.