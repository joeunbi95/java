package day02;

public class for문2 {

	public static void main(String[] args) {
		/* 2단 출력
		 * 2*1=2, 2*2=4, 2*3=6...2*9=18
		 * */
		int num=2;
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}		
		}	
		
		System.out.println();
		
		/* 1~10까지의 홀수의 합, 짝수의 합을 출력
		 * */
		int evenSum=0, oddSum=0;
		for(int i=1; i<=10; i++) {
			if (i % 2 == 0) {//짝수의 조건
				evenSum = evenSum+i;//짝수의 합
			} else { 
				oddSum = oddSum+i;//홀수의 합
			}
		}
			System.out.println("짝수의 합"+evenSum);
			System.out.println("홀수의 합"+oddSum);
		
		
		/* 이중 for문
		 * 구구단
		 * */
			
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i+"*"+j+"="+(j*i)+" ");
			}		
				System.out.println();//줄바꿈
		}	
		
	}

}
