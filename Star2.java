
public class Star2 {

	public static void main(String[] args) {
//			System.out.println();
//			// #5-1
//			System.out.println("#5-1");
//	    	for (int i=1; i<=4; i=i+1) {  			//  i가 4일때 ****, i가 3일 때 ***
//	    		for (int j=4; j<=5-i; j=j-1 ) {
//					System.out.print("*");
//	    			}
//				System.out.println();
//	    	}

		// #5-2
		System.out.println("#5-2");
		for (int i = 5; i > 0; i = i - 1) { // i가 4일때 ****, i가 3일 때 ***
			for (int j = 0; j < i; j = j + 1) {
				System.out.print("*");
			}
			System.out.println();
		}

//			// #6
//			System.out.println("#6");
//			for (int i=1; i<6; i=i+1 ) {
//				for (int j=0; j<5-i; j=j+1 );{
//					System.out.print(" ");
//				}
//				for (int k=0; k<i; k=k+1) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}

		// #6
		System.out.println("\n\n#6");
		for (int i = 1; i < 6; i = i + 1) {
			for (int j = 5; j > i; j = j - 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j = j + 1) {
				System.out.print("*");
			}
			System.out.println();
		}

		// #7
		System.out.print("\n\n#7");
		for (int i = 0; i < 9; i++) {
			if (i < 6) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		// #7-1 ( 다른 버전, 한 번 비교해보기 ) 
		System.out.println("\n\n#7-1");
		for (int i = 1; i<=5; i++) {
			for (int j=0; j<i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for ( int i=0; i<5; i++ ) {  // 아래로 갈수록 줄어드는 별 구현 (4개부터 실행)
			for ( int j=4; j>i; j-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// #8
		System.out.println("\n\n#8");
		for ( int i = 0;  i < 9 ;  i++ ) {
			if ( i < 5 ) {
				for ( int j = 5 ;  j > i ;  j--) {  
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for ( int j=3 ; j < i ; j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		// #9
		System.out.println("\n\n#9");
		for ( int i = 1 ;  i < 10 ;  i++ ) {
			if ( i < 6 ) {
				for ( int j = 5 ; j > i ;  j-- ) {
					System.out.print(" ");
				}
				for ( int j = 0 ; j < i ; j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for ( int j = 5 ; j < i ; j++  ) {
					System.out.print(" ");
				}
				for ( int j = 10 ; j > i ; j-- ) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
	}  //여기부터 시스템 }
 
}

/* 

    * i=1 j('')=5432 j(*)=0
   ** i=2 j('')=543 j(*)=01
  ***
 ****
***** i=5 /
 **** i=6 j('')=5 j(*)=10 9 8 7
  *** i=7 j('')=56 j(*)=
   **
    *

*/