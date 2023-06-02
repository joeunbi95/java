package day13;

import java.util.HashMap;
import java.util.Scanner;

public class 과제2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복(0)
		 * 과목과 점수를 입력해 주세요.
		 * 국어 : 89
		 * 수학 : 97
		 * 0 종료
		 * 입력받은 map 출력 후 합계: 평균:
		 * */
		HashMap<String, Integer> map = new HashMap<String, Integer>();	
		System.out.println("성적 계산기");		
		double sum = 0;
		double avg = 0;	
		int end = 1;
		int cnt = 0;			
		while(true) {
			if (end ==0) {
				System.out.println("성적 계산을 종료합니다.");
				break;
			}else {
				System.out.println("과목과 점수를 입력해 주세요.");
				String a1 = sc.next();
				Integer b1 = sc.nextInt();
				map.put(a1, b1);
				cnt++;
				sum=sum+b1;					
				avg=sum/cnt;
				System.out.println(map);	
				System.out.println("종료 = 0 진행 = 1");
				end = sc.nextInt();
			}
		}
		System.out.println("점수의 합: "+(double)sum+" 평균 :"+(double)avg);
		sc.close();
	}
	

}
