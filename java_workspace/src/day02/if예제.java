package day02;

import java.util.Scanner;

public class if예제 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 풀력.
		 * */
		
		Scanner scan=new Scanner(System.in);//ctrl+shift+o
		int num = scan.nextInt();
		if (num % 2 ==0) {
			System.out.println(num + " 짝수 ");
		} else {
			System.out.println(num + " 홀수 ");
		}

		
		scan.close();
		
			
	}

}
