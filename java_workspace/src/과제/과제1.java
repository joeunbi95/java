package 과제;

import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* For문, If문을 이용하여 문제를 해결하시오.?
		1. String ans = "a:b:c:d";? => a#b#c#d?
		? ?:? => # 변경하여 출력??
		*/		
		System.out.println("----1번 문제----");
		
		String ans = "a:b:c:d";
		
		for(int i=0; i<ans.length(); i++) {
			if(ans.charAt(i)==':') {
				System.out.print("#");
			}else {
				System.out.print(ans.charAt(i));
			}
		}		
		
		System.out.println();		

		/*
		2. 홍길동의 주민등록번호 881120-1068234이다.? 생년월일과 성별을 출력
		출력형태 생년월일 : 881120?
		성별 : 남
		*/		
		System.out.println("----2번 문제----");
		String name = "881120-1668234";
		System.out.println("생년월일 : "+name.substring(0,name.indexOf('-')));
				
		if(name.charAt(7)=='1') {
			System.out.print("남");
		}else {
			System.out.print("여");
		}		
		
		System.out.println();	
		
		/*
		3. scanner를 이용하여 1부터 내가 입력한 수까지 3의배수를 출력
		? 내가 입력한 수 : 100
		? 1~100까지 3의배수 출력
		*/
		System.out.println("----3번 문제----");
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();			
		
		/*
		4. switch문을 이용하여 입력받은 월이 봄(3-5), 여름(6-8), 가을(9-11), 겨울(12-2)인지 판별하여 출력
		*/
		System.out.println("----4번 문제----");
		System.out.println("숫자를 입력해주세요.");
		int num1 = sc.nextInt();
		
		switch(num1) {
		case 3, 4, 5 : System.out.println(num1+"월은 봄입니다."); break;
		case 6, 7, 8 : System.out.println(num1+"월은 여름입니다."); break;
		case 9, 10, 11 : System.out.println(num1+"월은 가을입니다."); break;
		case 12, 1, 2 : System.out.println(num1+"월은 겨울입니다."); break;
		default : System.out.println("잘못됫 숫자입니다.");
		}				
		
		/*
		5. while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.

		*
		**
		***
		****
		*****
		*/
		
		System.out.println("----5번 문제----");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
