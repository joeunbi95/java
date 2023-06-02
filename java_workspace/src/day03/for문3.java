package day03;

import java.util.Scanner;

public class for문3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		/* 1~100까지의 합계
		 * */
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		/* 약수구하기.
		 * 약수 : 나누어서 떨어지는 수들의 모임.
		 * 12의 약수 :  1,2,3,4,6,12 
		 * num=12;
		 * 1부터 num까지의 수를 num와 나누어 떨어지는(나머지가 0이되는)수를 출력
		 * 초기값 : 1부터
		 * 조건값 : num까지
		 * 증감식 : 1씩 증가
		 * 
		 * 실행문 : 나머지가 0이되는 수를 출력
		 * */
		
		
		int num1 = 12;
		for (int i=1; i<=num1; i++) {
			if(num1 % i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		
		System.out.println("숫자를 입력해주십시오.");
		int num2 = scan.nextInt();
		for (int i=1; i<=num2; i++) {
			if(num2 % i == 0) {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}

}
