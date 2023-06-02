package day06;

import java.util.Scanner;

public class 과제풀이 {
	static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {

			int nums[] =getnums();
//			System.out.println(nums[0]);
//			System.out.println(nums[1]);
			int select = getselsct();
			switch(select) {
			case 1: getsumResult(nums); break;
			case 2: getsubResult(nums); break;
			case 3: getmulResult(nums); break;
			case 4: getmodResult(nums); break;
			case 5: getdivResult(nums); break;
			default : System.out.println("잘못된 선택입니다.");
			}
			System.out.println("프로그램 종료");
			
			
	}
	public static int[] getnums() {
		int[]nums=new int[2];
		for(int i=0; i<nums.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요.");
			nums[i] = sc.nextInt();
		}
		return nums;
	}
	public static int getselsct() {
		System.out.println("원하는 계산을 선택해주세요.");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int selsct =sc.nextInt();
		return selsct;		
	}
	
	public static void getsumResult(int nums[]) {
		int result =0;
		for(int i=0;i<nums.length; i++) {
			result = result +nums[i];
		}
		System.out.println(nums[0]+"+"+nums[1]+"="+result);
	}
	public static void getsubResult(int nums[]) {
		int result =nums[0]- nums[1];
		System.out.println(nums[0]+"-"+nums[1]+"="+result);
	}
	public static void getmulResult(int nums[]) {
		int result =nums[0]* nums[1];
		System.out.println(nums[0]+"*"+nums[1]+"="+result);
	}
	public static void getdivResult(int nums[]) {
		int result =nums[0]/ nums[1];
		System.out.println(nums[0]+"/"+nums[1]+"="+result);
	}
	public static void getmodResult(int nums[]) {
		int result =nums[0]%nums[1];
		System.out.println(nums[0]+"%"+nums[1]+"="+result);
	}
	
}
