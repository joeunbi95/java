package day08;
import java.util.Scanner;
public class 과제 {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9까지만)
		 * 유저가 3자리의 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치 : strike
		 * 숫자만 일치하면 : ball, 아무것도 안맞으면 out
		 * 3 5 7
		 * 3 4 6
		 * 1s
		 * 
		 * 3 7 8
		 * 1s 1b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * out
		 * 
		 * */
				
		int com[]=new int[3];
		int user[]=new int[3];
		System.out.println("┌─────────────────┐");
		System.out.println("│  § 야 구 게 임 §  │");
		System.out.println("│ Computer 준비완료 │");
		System.out.println("└─────────────────┘");	
		comArray(com);
		user(user);
		System.out.println("┌─ U s e r ─┐");
		PrintArray(user);
		System.out.println();
		System.out.println("└───────────┘");
		Macth(user, com);
		
		
	}
	
	//랜덤 번호 생성
	public static int random() {
		return (int)(Math.random()*9)+1;
		
	}
	
	//유저 숫자 입력
	public static void user(int arr[]) {
		System.out.println("┌────[ User ]─────┐");
		System.out.println("│ 숫자 3개 입력하세요~│");
		System.out.println("└─────────────────┘");
		
		String myStr=sc.next(); //789==> 한자리씩 잘라서 배열에 저장
		String[]myNumstrarr= myStr.split("");//한글자씩 잘라서 배열로 저장
		for(int i=0; i<arr.length; i++) {
		arr[i]=Integer.parseInt(myNumstrarr[i]); //String - > int Intrger.parseInt
		}		
	}
	
	//com 중복 확인
	public static void comArray (int arr[]) {		
		int i=0;
		while(i<arr.length) {
			int r=random();
			if(!isContain(arr, r)) {
				arr[i] =r;
				i++;
			}
		}
	}
	
	//숫자 중복 제거
	public static boolean isContain(int arr[], int random){
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	//배열 출력
	public static void PrintArray(int arr[]){		
		for(int i=0;i<arr.length; i++) {			
			System.out.print(" ["+arr[i]+"]");		
		}
	}	
	
	//비교
	public static void Macth(int arr[], int arr1[]) {
		int count=0; //게임 횟수
		while(true) {
			int Strik =0, Ball=0;
			count++;
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i]==arr1[j]) {
						if(i==j) Strik++;
						else Ball++;
					}					
				}
			}
			if(Strik==3) {
				System.out.println("★ Perfect ★ "+"게임횟수 : "+count);
				break;
			}else if(Strik==0 && Ball==0) {
				System.out.println("┌─────────┐");			
				System.out.println("│  o u t  │");
				System.out.println("└─────────┘ ");
			}else {
				
				System.out.println("┌─────────┐");
				System.out.println("│Strik " + "["+Strik+"]│");
				System.out.println("└─────────┘ ");
				System.out.println("┌─────────┐");
				System.out.println("│ Ball " + "["+Ball+"]│");
				System.out.println("└─────────┘ ");
			}
			
			user(arr);
		}
		System.out.println();
		System.out.println("┌──Computer──┐");
		PrintArray(arr);
		System.out.println();
		System.out.println("└────────────┘ ");
	}
	
		
}