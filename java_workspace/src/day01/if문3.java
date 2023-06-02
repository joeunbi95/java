package day01;

import java.util.Scanner;

public class if문3 {

	public static void main(String[] args) {
		//Scanner 클래스 사용.
		//값을 입력받을 때 사용하는 클래스
		Scanner scan = new Scanner(System.in);
		
		/* 국어, 영어, 수학의 값을 입력받아
		 * 합계, 평균을 구하고, A, B, C, D, F 등급을 구하시오.
		 * */
		
		//입력유도 안내문자
		System.out.println("점수를 입력해주세요.(0~100) : 국어, 영어, 수학 순으로");
		//지역변수는 무조건 초기화가되어야 함.
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();
		
		if(국어<0||국어>100) {System.out.println("국어 점수 오류");} // (a<0||a>100)
		if(영어<0||영어>100) {System.out.println("영어 점수 오류");}
		if(수학<0||수학>100) {System.out.println("수학 점수 오류");}
		
		int sum; double avg;
		sum = 국어+영어+수학; avg = (sum/3.0);
		
		char ch ='F'; //초기값부여 없을시 에러
		
		System.out.println("합계 : "+sum+" 평균 : "+avg);
		if(avg>100 || avg<0) {System.out.println("평균 계산 오류");}
		else if(avg>=90) {ch='A';}
		else if(avg>=80) {ch='B';}
		else if(avg>=70) {ch='C';}		
		else if(avg>=60) {ch='D';}
		else {ch='F';}
		
		System.out.println("등급 : "+ch);
		
				
		scan.close();
		
		
		
		
		
	}

}
