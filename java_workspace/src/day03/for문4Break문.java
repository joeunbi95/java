package day03;

import java.util.Scanner;

public class for문4Break문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// Break문 : 반복문을 빠져나오는 역할을 하는 키워드
		// 반복문에서 조건(if)문을 동반하다.
		
		//1~100까지의 합
		int i=1, sum=0;
		for(;;) {
			System.out.print(i+" ");
			sum=sum+i; //합계			
			if(i==100) {
				break;
			}
			i++; //i=i+1
		}
		System.out.println();
		System.out.println("1~100까지의 합 : "+sum);
		
		/* 한글자를 입력받아 그대로 글자를 출력
		 * y를 입력받으면 종료
		 * a->a, b->b, c->c, y-종료
		 * */
		
		 for(;;) {
			 System.out.println("한글자를 입력해주십시오.(y|Y : 종료)");//반복문
			 char ch = scan.next().charAt(0); //chatAt : 지정한 문자의 위치를 추출 0부터 시작
			 System.out.println(ch);
			 
			 if(ch=='y' || ch=='Y') {//break 조건
				 System.out.println("종료되었습니다.");
				 break;
			 } 
		 }
		
		 
		 
		
	}

}
