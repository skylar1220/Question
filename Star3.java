
public class Star3 {

	public static void main(String[] args) {

		// #10
		System.out.println("\n\n#10");
		for ( int i = 1;  i < 6;  i++ ) {
			for ( int j = 5 ;  j > i ;  j-- ) {
				System.out.print(" ");
			}
			for ( int j = 1 ; j < i*2 ; j++ ) {
				System.out.print( "*" ) ;
			}
			System.out.println();
		}
		
		// #10-1 
		System.out.println("\n\n#10-1");
		for ( int i = 1;  i < 10;  i+=2 ) {
			for ( int j = 9 ;  j > i ;  j-=2 ) {
				System.out.print(" ");
			}
			for ( int j = 0 ; j < i ; j++ ) {
				System.out.print( "*" ) ;
			}
			System.out.println();
		}


		// #11
		System.out.println("\n\n#11");
			for ( int i = 1;  10 > i ;  i+=2 ) {
				for ( int j = 2; j < i ;  j +=2 ) {  // j=2 일 때 맨 처음에 아예 실행이 안되서 +2도 안되고 패스된 게 맞나?
					System.out.print(" ");
				}
				for ( int j = 10 ;  j > i ;  j-- ) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			// #11 -1  --- 버전으로 다시 풀어보기 
			System.out.println("\n\n#11-1");

			
			// #12
			System.out.println("\n\n#12");
			for ( int i = 1 ;  i < 18 ;  i += 2 ) {
				if ( i < 10) {
						for ( int j = 8 ;  j > i ;  j-=2 ) {
							System.out.print(" ");
						}
						for ( int j = 0 ; j < i ; j++ ) {
							System.out.print( "*" ) ;
						}
						System.out.println();
					}
				else {
					for ( int j = 10; j < i ;  j +=2 ) {  // j=2 일 때 맨 처음에 아예 실행이 안되서 +2도 안되고 패스된 게 맞나?
						System.out.print(" ");
					}
					for ( int j = 18 ;  j > i ;  j-- ) {
						System.out.print("*");
					}
					System.out.println();
					
				}
				}
			
			// #13
			System.out.println("\n\n#12");
			for ( int i = 10 ;  i > 0 ;  i-=2 ) {
				for ( int j = 1 ;  i > j ;  j+=2 ) {
					System.out.print("*");
				}
				for ( int j = 11 ;  i < j ;  j-- ) {
					System.out.print(" ");
				}
				for ( int j = 1 ;  i > j ;  j+=2 ) {
					System.out.print("*");
				}
				System.out.println();
			}
			for ( int i = 3;  i < 10 ;  i +=2 ) {
				for ( int j = 0 ;  i >j ;  j += 2) {
					System.out.print("*");
				}
				for ( int j = 10 ;  i < j ;  j-- ) {
					System.out.print(" ");
				}
				for ( int j = 0 ;  i >j ;  j += 2) {
					System.out.print("*");
				}
				System.out.println();
			}
			

			
			
			
		} //여기부터 시스템 }
		
		
	}  
 

/* 


#13
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****

 
*/