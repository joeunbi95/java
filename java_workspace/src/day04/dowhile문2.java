package day04;

import java.util.Scanner;

public class dowhile문2 {

	public static void main(String[] args) {
		/* ------menu------
		 * 1.저장 2.출력 3.종료
		 * ----------------
		 * 입력 : 1
		 * 저장되었습니다.
		 * 입력 : 2
		 * 출력되었습니다.
		 * 입력 : 3
		 * 종료되었습니다. 반복문 종료
		 * */
		
		Scanner scan = new Scanner(System.in); 
		
		int num = 0;
		do {
			System.out.println("------menu------");
			System.out.println("1.저장 2.출력 3.종료");
			System.out.println("----------------");
			
			num = scan.nextInt();
			
			switch(num) {
			case 1: System.out.println("저장되었습니다.");
			break;
			
			case 2: System.out.println("출력되었습니다.");
			break;
			
			case 3: System.out.println("종료되었습니다.");
			break;
			
			default: System.out.println("잘못입력되었습니다.");
			break;
			}
			
		}while(num!=3);
		System.out.println("프로그램 종료.");
		scan.close();
		
	}

}
