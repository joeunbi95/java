package day07;

import java.util.Scanner;

public class Method08 {
	static Scanner sc = new Scanner(System.in);	
	public static void main(String[] args) {
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * */
		int arr[]=new int[] {3,5,7,9,13,15,17,19,20,21,25,1,4,2};
		System.out.println("---- 정렬전 -----");
		
		PrintArray(arr);
		sortArray(arr);
		
		System.out.println();
		System.out.println("---- 정렬후 -----");
		
		PrintArray(arr);
		
		System.out.println();
		System.out.println("---- random 배열 출력 -----");
		
		int arr1[]=randomArray(15);
		PrintArray(arr1);
		sortArray(arr1);
		
		System.out.println();
		System.out.println("---- 정렬후 -----");
		
		sortArray(arr1);
		PrintArray(arr1);
	}
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : PrintArray
	 * 옆으로 출력 / 5개씩 한줄에 나열
	 * */
	public static void PrintArray(int arr[]){
		for(int i=0; i<arr.length; i++) {
			if(i%5==0 && i !=0) {
				System.out.println();
			}
			System.out.printf("%3d",arr[i]);
		}
	}
			
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : 정수배열 int arr[]
	 * 리턴타입 : void
	 * 메서드명 : sortArray
	 * */
	public static void sortArray (int arr[]) {
		for(int i=0;i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j]= tmp;
				}
			}
		}		
	}
	/* 새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	 * 랜덤수 범위 (1~100까지)
	 * 매개변수 : 사이즈 => int size
	 * 리턴타입 : 배열 => int[]
	 * 메서드명 : randomArray
	 * */
	public static int[] randomArray (int size) {
//		System.out.println("배열의 개수를 입력하세요.");
//		int n=sc.nextInt();		
		int arr[]= new int[size];
		for(int i=0; i<arr.length; i++) {
			 arr[i]=(int)(Math.random()*100)+1;
		}		 		
		return arr;
	}
}
