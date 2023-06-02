package day07;

import java.util.Scanner;

public class 과제풀이 {
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9까지만) <= 중복 발생 제거
		 * 유저가 3자리의 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치 : strike
		 * 숫자만 일치하면 : ball, 아무것도 안맞으면 out
		 * 3 5 7
		 * 3 4 6
		 * 1s
		 * 
		 * 3 7 8
		 * 1s 1b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * out
		 * 
		 * */
		// 1. Scanner 열기
		Scanner sc = new Scanner(System.in);
		
		// 2. 변수들을 선언
		int comNum[]=new int [3]; //컴퓨터 번호
		int myNum[]=new int [3];	//유저 번호
		int count=0; // 게임횟수
		
		// 3. 컴퓨터가 결정한 3가지 숫자를 중복되지않게 추출
//		for(int i=0; i<comNum.length; i++) {
//			comNum[i]=(int)(Math.random()*9)+1; //1~9까지 랜덤숫자
//			for(int j=0; j<i; j++) {
//				if(comNum[i] == myNum[j]) {
//					i--;
//					break; //for(j의 구문을 빠져나감)
//				}
//			}
//		}
		Lotto예제 L=new Lotto예제();
		L.randomArray(comNum);
		L.PrintArray(comNum);
		
	
		// 4. 사용자 숫자 입력받기
		while(true) {
			int s=0 ,b=0;		
			count++;						
			System.out.println("--야구게임 시작--");
			System.out.println("Conputer 선택 완료");
			System.out.println("User > 숫자 입력 (1~9, 숫자3개)");			
			//숫자로 입력받는 경우
//			for(int i=0; i<myNum.length; i++) {
//				myNum[i]=sc.nextInt();
//				System.out.print("["+myNum[i]+"]");
//			}
			
			String myStr=sc.next(); //789==> 한자리씩 잘라서 배열에 저장
			String[]myNumstrarr= myStr.split("");//한글자씩 잘라서 배열로 저장
			for(int i=0; i<myNum.length; i++) {
				myNum[i]=Integer.parseInt(myNumstrarr[i]); //String - > int Intrger.parseInt
			}
			
				
						
		//숫자 비교
			for(int i=0; i<myNum.length; i++) {
				for(int j=0; j<comNum.length; j++) {
					if(myNum[i]==comNum[j] && i == j) {
						s++;
					}else if(myNum[i]==comNum[j] && i != j) {
						b++;
					}
				}
			}
		//출력
		//out 조건 (아무것도 안맞을 경우)
			if(s == 0 && b == 0) {
				System.out.println("out");
			}else if(s==3) {
				System.out.println("정답!");
				System.out.println("시도횟수 : "+count);
				break;
			}else {
				System.out.println("> "+"S : "+s+" B : "+b);
			}			
		
	}
		sc.close();
	}

}
