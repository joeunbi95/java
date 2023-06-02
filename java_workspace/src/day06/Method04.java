package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균:double 을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드
		 * 
		 * main에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * */
		int arr[]=random();
		double avg=avg(arr);
		Print(arr, avg);
		System.out.println("-----------");
		Print(arr, avg(arr));
		

	}	
	public static int[] random(){		
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}			
		return arr;		
	}	
	public static double avg(int arr[]){
		int sum= 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return (double)sum /arr.length;
		
	}	
	public static void Print(int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("평균 : "+avg);
	}
	
	
}
