
public class Star1 {

	public static void main(String[] args) {
		// #1
		System.out.println("#1");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}

		System.out.println('\n');
		// #2
		System.out.println("#2");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}

		System.out.println();
		// #3
		System.out.println("#3");
		for (int i = 1; i <= 5; i++) { // i가 1일때 {j가 1일 때 (*****)} 한 줄 띄고, ... i가 5일때 {j도 5 (*****)} 한 줄 띄고 끝남.
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println();
		// #4
		System.out.println("#4");
		for (int i = 1; i <= 4; i = i + 1) { // i가 1일때 *, i가 2일 때 **, i가 3일 때 ***
			for (int j = 1; j <= i; j = j + 1) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // 여기부터 시스템 }

}

/*
 ********* 
 * i=5 j(.)= j=123456789 .******* i=4 j(.)= j=1234567 ..***** i=3 j(.)=2 j=12345
 * ...*** i=2 j(.)=32 j=123 ....* i=1 j(.)=432 j=1 j=(i*2)>i
 * 
 */