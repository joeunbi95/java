package reNew02;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {
	public static void main(String[] args) {
		// 단어장 map 단어 : 의미
		// hello : 안녕
		// 입력받을 단어의 개수를 입력받아서 그만큼 map에 단어와 의미를 추가
		// 콘솔출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 단어의 개수 >");
		int size = sc.nextInt();
		HashMap<String, String> map = new HashMap<String, String>();
		
		while(map.size() < size) {
			System.out.println("단어를 입력해주세요 >");
			String word = sc.next();
			System.out.println("의미를 입력해주세요 >");
			String mean = sc.next();
			map.put(word, mean);
		}
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		
	}
}
