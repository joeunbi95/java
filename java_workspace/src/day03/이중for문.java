package day03;

public class 이중for문 {

	public static void main(String[] args) {
		/* for (1 초기화; 3 14 22 조건식; 13 21 증감식){//1 2 3
		 *      4 15 실행문;
		 *      for(5 16 초기화; 6 9 12 17 20 조건식; 8 11 19 증감식){//1~끝까지, 1~끝까지
		 *          7 10 18 실행문;
		 *      }
		 * }
		 * 1-> 1 -> 끝까지, 1-> 2 -> 1~끝까지     
		 *          
		 * */
		
		/* *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * 가로/세로 5*5의 별을 찍어보자
		 * */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
			}
			System.out.println();
		}

		
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		
		for(int i=1; i<=5; i++) {
			//공백
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}	
			//별
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			//다 찍고나서 줄바꿈.
			System.out.println();
		}
		
		/*if문을 이용한 방법
		 * */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {//j=1, i=1
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
