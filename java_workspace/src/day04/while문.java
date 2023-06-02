package day04;

public class while문 {

	public static void main(String[] args) {
		/* while(조건식){
		 * 	실행문; //조건식이 false가 될수있는 구문을 포함해야함.
		 *  증감식;
		 * }
		 * 
		 * 초기화
		 * while(조건식){
		 * 실행문;
		 * 증감식
		 * }
		 * 
		 * */
		/* 1~10까지 출력*/
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		System.out.println("> while문 활용");
		int i=1; //초기값
		while(i<=10) {//조건식
			//실행문
			System.out.print(i+" ");
			//증감식
			i++;
		}
		System.out.println();
		
		
		System.out.println(">> while문을 활용하여 1~10까지 짝수만 출력");		
		int j=1;
		while(j<=10) {//조건식 - 반복을 하기 위한 조건
			if(j%2==0) {//실행문
				System.out.print(j+" ");
				
			}
			j++;
		}
		System.out.println();
		
		
		System.out.println(">> while, continue문을 활용하여 1~10까지 짝수만 출력");
		int k=1;
		while(k<=10) {
			k++;
			if(k%2==1) {
				continue;
			}			
			System.out.print(k+" ");
		}
				
	}

}
