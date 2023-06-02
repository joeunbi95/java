package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승 패 무의 결과를 출력
		 * 삼항연산자 (조건식)? true : false;
		 * 
		 * int num = 3;
		System.out.println((num % 2 == 0)? "짝수" : "홀수");*/
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("가위 바위 보 게임~ 입력해주세요~(0:가위, 1:바위, 2:보)");
//		
//		int num = scan.nextInt();
//		int random = (int)(Math.random()*3);
//		System.out.println(random);
//		if(random == 0) {
//			if(num == random) {
//				System.out.println("무승부!");
//			}else if(num == 2) {
//				System.out.println("졌다..");
//			}else {
//				System.out.println("이겼다!!");
//			}
//		}	
//		if(random == 1) {
//			if(num == random) {
//				System.out.println("무승부!");
//			}else if(num == 0) {
//				System.out.println("졌다..");
//			}else {
//				System.out.println("이겼다!!");
//			}
//		}	
//		if(random == 2) {
//			if(num == random) {
//				System.out.println("무승부!");
//			}else if(num == 1) {
//				System.out.println("졌다..");
//			}else {
//				System.out.println("이겼다!!");
//			}
//		}
		
		
		//풀이
		
		System.out.println("가위, 바위, 보 게임시작 >");
		
		int comNum =(int)(Math.random()*3)+0; // 0,1,2
		System.out.println("컴퓨터가 결정을 완료하였습니다.");
		System.out.println("가위/바위/보 중 하나를 선택하세요 >");
		String myChoice= scan.next(); //내선택
		
		//컴퓨터의 선택을 String으로 변환
		String comChoice =(comNum == 0)?"가위":(comNum ==1)? "바위" :"보";
		System.out.println("com 선택 > "+comChoice);
		
		//비교 .equals=같은경우
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println((myChoice.equals("바위")? "이겼습니다." : "졌습니다."));
			}else if(comChoice.equals("바위")) {
				System.out.println((myChoice.equals("보")? "이겼습니다." : "졌습니다."));
			}else {
				System.out.println(myChoice.equals("가위")? "이겼습니다." : "졌습니다.");
			}
				
		}
		System.out.println("게임종료!!");
		
		
		scan.close();
	}
}