package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제풀이 {

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
		
		
		int exit = 1; //exit = 0이면 종료
		
		while(exit !=0) {
			//입력
			System.out.println("과목과 점수를 입력해주세요.");
			String subject = sc.next();
			int score = sc.nextInt();
			
			map.put(subject, score);
			System.out.println("계속 : 1 종료 : 0");
			exit = sc.nextInt();
		}
		int sum =0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum+=score;
			System.out.println(subject+":"+score);
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/map.size());
	}

}
