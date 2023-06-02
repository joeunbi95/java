package day05;

import java.util.Scanner;

public class 배열연습4 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리수 합계 출력
		 * ex) 11456 ==> 65411 => 6+5+4+1+1
		 * ex) 19874 ==> 47891 => 4+7+8+9+1
		 * 힌트 /,%
		 * */
		
		Scanner scan=new Scanner(System.in);
		int arr[]= new int[5];
		int num;
		int sum=0;
		
		System.out.println("5자리의 수를 입력해주세요.");
		num=scan.nextInt();
		
//		arr[4]=num/10000;
//		arr[3]=(num%10000)/1000;
//		arr[2]=(num%1000)/100;
//		arr[1]=(num%100)/10;
//		arr[0]=num%10;
//		
		for(int i=0; i<arr.length; i++) {
			arr[i]=num%10;
			num=num/10;
			sum=arr[i]+sum;						
		}		
		for(int tmp : arr) {
			System.out.print(tmp);			
		}		
		System.out.println();
		System.out.println("합계 : "+sum);
		
		scan.close();
		
		
		
		
		//풀이
		
		//1. 스캐너열기
//		Scanner scan =new Scanner (System.in);
		
		//2. 입력 받기
		System.out.println("5자리 정수를 입력해주세요.");
		int num1 =scan.nextInt(); //12345
		//3. 배열 선언, 변수들 선언
		int arr1[]=new int[5];
		int sum1=0, i=0;		
		//4. 반복문 이용하여 마지막자리가 없어질 때까지 배열에 저장 / 합계
		// /, % while문을 이용
		
		while(num1>0) {//입력받은 num가 0이 되기전까지 반복
			int b = num1%10; //마지막 자리
			arr1[i] =b;
			sum1 = sum1+b;
			num1 = num1 /10; //몫만 저장 => 소수점은 버려짐.
			System.out.print(arr1[i]+" ");
			i++;
		}
		System.out.println();
		System.out.println("sum : "+ sum1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
