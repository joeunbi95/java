package day06;

import java.util.Scanner;

public class 과제 {
	//멤버변수 자리
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 계산기 (+ - * / %) 각각 메서드 만들기 
		 * 메서드에서 바로 출력 (3 + 2 = 5)
		 * 1. 숫자를 입력받는 메서드 
		 *    - 숫자는 배열로 입력받기
		 * 2. 메뉴 메서드
		 * 	  - 원하는 계산을 선택해주세요 > 
		 * 	  - 1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지
		 * 3. 각 기능 메서드 => 메서드에서 바로 출력 (3 + 2 = 5)
		 * main에서 처리되어야 되는 부분
		 * 	 1) 1번 메서드 호출 => 숫자를 배열로 저장 
		 * 	 2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 *   3) switch(2번 return)
		 *   4) case 에 따라 계산기 메서드 호출
		 * */
		
		int num[] = num();
		
		switch(menu()) {
		case 1: 
			System.out.println("계산 : "+num[0]+"+"+num[1]+"="+(num[0]+num[1]));
			break;
		case 2: 
			System.out.println("계산 : "+num[0]+"+"+num[1]+"="+(num[0]-num[1]));
			break;
		case 3: 
			System.out.println("계산 : "+num[0]+"+"+num[1]+"="+(num[0]*num[1]));
			break;
		case 4: 
			System.out.println("계산 : "+num[0]+"+"+num[1]+"="+(num[0]/num[1]));
			break;
		default: 
			System.out.println("계산 : "+num[0]+"+"+num[1]+"="+(num[0]%num[1]));
			break;			
		}
		
		
		
		
	}
	/* 각 기능에 대한 메서드
	 * 리턴 : void
	 * 매개변수 : 배열
	 * */
	public static int[] num() {
		int arr[]=new int [2];
		System.out.println("----계산기-----");
		System.out.println("연산 숫자 입력 : ");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		return arr;
	}
	
	public static int menu() {
		System.out.println("원하시는 연산자를 선택해주세요.");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int op =sc.nextInt();
		return op;
	}
}