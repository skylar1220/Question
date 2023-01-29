package Practice;

// 다시 한 번 풀어보기... 어렵다..

import java.util.Arrays;

public class Q2__CountTo1000 {

	public static void main(String[] args) {
		int box[] = new int[10] ;
		for (int i = 1; i<= 1000 ; i++ ) {
			box[i % 10]++  ;  // 일의 자리별 박스 만들기 : i=3,13...993 => box[3] =  box[3] + 1 
			if ( i>=10 ) box [ (i/10)%10 ]++ ; 		// 십의 자리 i=10,11,12..110,111...918,919 =>  box[1] = i/10%10
			if ( i>=100 ) box [ (i/100)%10 ]++ ; 	// 백의 자리 i=500,501...599 =>  box[5] =  i/100%10(?)
			if ( i==1000 ) box [ 1 ]++ ; 	// 천의 자리 i=1000  =>  box[1] ++
		}
		System.out.println(Arrays.toString(box));
	}

}
