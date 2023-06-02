package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 * 합계 :
		 * 평균 : 
		 * */
		
		/* 1. Scanner
		 * 2. 배열 선언
		 * 3. 값 추가
		 * 4. for문
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int sum=0; double avg=0;
		int arr[]= new int[5];
		int max=0; int min=999;
	
		
		System.out.println("5명의 점수를 입력해주세요.");
		for(int i=0; i<arr.length; i++) {			
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
			min=arr[0];
//			max=Math.max(max, arr[i]);
//			min=Math.min(min, arr[i]);
			if(arr[i]>max) {
				max= arr[i];
	    	}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
					
		avg=(double)sum/arr.length;
		
		System.out.println("합계 : "+ sum);
		System.out.printf("평균 : "+ avg);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
	
		scan.close();
		
		

	}

}
