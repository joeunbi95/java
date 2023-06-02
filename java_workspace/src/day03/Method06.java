package day03;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력하는 메서드
		 * 7 단 
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력하세요.");
		int num=scan.nextInt();
		num9(num);
		scan.close();
	}
	
	public static void num99(int num) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				
				 System.out.print(i+" * "+j+" = "+(j*i)+"   ");
			}
			System.out.println();
			
		}
	}
	public static void num9(int num) {
		for(int i=num; i<=num; i++) {
			for(int j=1; j<=9; j++) {
				
				 System.out.println(i+" * "+j+" = "+(j*i)+"   ");
			}
			System.out.println();
			
		}
	}

}
