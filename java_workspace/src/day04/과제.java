package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤수 하나를 생성 후 맞추는 게임
		 * 예) 컴퓨터가 랜덤수를 생성했습니다. : 45
		 * 사용자 입력 : 20
		 * up!
		 * 사용자 입력 : 30
		 * up!
		 * 사용자 입력 : 49
		 * Down!
		 * 사용자 입력 : 45
		 * 정답~
		 * */
		Scanner scan = new Scanner(System.in);
		
//		int num = (int)(Math.random()*50)+1;
//		int i;
//		System.out.println(num);
//		
//		do {
//			System.out.println("랜덤수 맞추기 게임");
//			i = scan.nextInt();
//			System.out.println("사용자 입력 : "+i);
//			
//			if(i<num) {
//				System.out.println(" up! ");
//			}else if(i>num) { 
//				System.out.println(" down! ");
//			}else if(i==num) {
//				System.out.println("★정답★");
//				break;
//			}
//				
//		}while(true);		
//		
		int random =(int)(Math.random()*50)+1;
		int m=0, count=0;
		System.out.println("컴퓨터가 랜덤수를 결정했습니다.(1~50까지)");
		//반복문 열기
		while(m!=random) {
			System.out.println("사용자 입력 : ");
			m=scan.nextInt();
			System.out.println("게임 횟수(제한 10회): "+ ++count);//사용자가 입력했을 때 1증가
			//비교
			if(m<1||m>50) {
				System.out.println("입력 범위를 벗어났습니다.(1~50)");
			}else {
				if(m>random) {
					System.out.println("down~");
				}else if(m<random) {
					System.out.println("up~");
				}else {
					System.out.println("정답입니다~");
				}
				if(count>=10) {
					System.out.println("횟수 제한 게임 오버");
					break;
				}
			}
		}
		scan.close();
		
		
		
		
		
				

	}

}
