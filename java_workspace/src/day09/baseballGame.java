package day09;

import java.util.Scanner;

public class baseballGame {

	public static void main(String[] args) {
		/* 야구게임 메서드로 변경...
		 * 
		 * */
		
		//메서드 : 매개변수의 개수는 정해진것이 없음.
		//리턴타입 => 하나
		
		//배열에 추가(중복메서드[Overloading])
		//출력 메서드
		//스트라이크 메서드
		//볼 메서드
		
		int com[]=new int[3];
		int user[]=new int[3];
		int max=9, min=1;//랜덤수 범위
		int s=0, b=0;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		randomArray(com, max, min);
		System.out.println("┌─────────────────┐");
		System.out.println("│  § 야 구 게 임 §  │");
		System.out.println("│ Computer 준비완료 │");
		System.out.println("└─────────────────┘");
		
		while(s!=3) {
			//사용자번호 입력받기
			System.out.println("┌────[ User ]─────┐");
			System.out.println("│    1 ~ 9 까지    │");
			System.out.println("│ 숫자 3개 입력하세요~│");
			System.out.println("└─────────────────┘");
			for(int i=0;i<user.length; i++) {
				user[i]=sc.nextInt();
			}
			count++;
			
			//결과 판정 strike / ball 각각 호출
			s=strike(com, user);
			b=ball(com, user);
			
			
		//숫자가 0일때 표현하지 않게 처리
			if(s!=0) {
				System.out.println("┌─────────┐");
				System.out.println("│Strike" + "["+s+"]│");
				System.out.println("└─────────┘ ");
			}
			if(b!=0) {
				System.out.println("┌─────────┐");
				System.out.println("│ Ball " + "["+b+"]│");
				System.out.println("└─────────┘ ");
			}
			System.out.println();
			if(s==0 && b==0) {
				System.out.println("┌─────────┐");			
				System.out.println("│  o u t  │");
				System.out.println("└─────────┘ ");
			}
		}
		System.out.println("★ Perfect ★ "+"게임횟수 : "+count);
		System.out.println();
		
		System.out.println("┌──Computer──┐");
		printArray(com);
		System.out.println("└────────────┘ ");
		
	}
	//1.랜덤번호 생성 : 매개변수로 범위를 설정 20~30 -> cnt:10 start:20
	// - 범위 => min, max 20~30 cnt =>max-min1
	//(int)(Math.random()*max-min+1)+min
	// - 매개변수 => 개수 , 시작 (int)(Math.random()*개수)시작;

//	public static int random(int start, int cnt){//(개수) 
//		return (int)(Math.random()*cnt)+start;
//	}
	public static int random(int max, int min) {
		if(max<min) {//max와 min의 숫자 값이 바뀌어서 들어올때 처리(에러 방지)
			int tmp=max;
			max=min;
			min=tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	//2. 중복확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	//3. 배열 생성 메서드(중복제거)
	//true가 리턴되면 정상적으로 배열이 생성됨을 알려주는 기능.
	public static boolean randomArray(int arr[], int max, int min) {
		if(arr==null) {
			return false;
		}
		if((max-min+1) < arr.length) {//랜덤수의 개수가 배열의 length보다 작다면 x
			return false;
		}
		int i=0;
		while (i<arr.length) {
			int r =random(max, min);
			if(!isContain(arr, r)) {
				arr[i]=r;
				i++;
			}			
		}
		return true;
	}
	
	//4. 배열 출력 메서드
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" ["+arr[i]+"]");
		}
		System.out.println();//줄바꿈
	}
	
	
	//5. 스트라이크 메서드
	// 기능 : com[], user[] 위치와 값이 일치하면 카운트증가 반환
	// 메서드명 : strike	
	public static int strike(int com[], int user[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(com[i]==user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//6. 볼 메서드
	// 기능 : com[], user[] 위치상관없이 일치하면 카운트증가 반환
	// 메서드명 : ball
	public static int ball(int com[], int user[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(isContain(user,com [i])) {
				cnt++; //자리 상관없이 일치하면 count 증가
			}
		}
		//스트라이크의 개수만큼 차감
		return cnt-strike(com, user);
	}
	
	
	
	
}
