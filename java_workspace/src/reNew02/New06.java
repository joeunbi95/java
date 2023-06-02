package reNew02;

import java.util.HashMap;
import java.util.Scanner;

public class New06 {

	public static void main(String[] args) {
		// 단어장 map 단어 : 의미
		// hello : 안녕
		// 입력받을 단어의 개수를 입력받아서 그만큼 map에 단어와 의미를 추가
		// 콘솔출력
		//메서드에서 리턴해온 map을 출력
		
		printWord();
				

	}
	//단어 : 의미 입력받아서 map으로 구성한 후 리턴
	
	public static HashMap<String, String> creatWord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("단어의 갯수를 입력해주세요 >");
		int size = sc.nextInt();
		
		HashMap<String, String> map = new HashMap<String, String>();
		while(map.size() < size) {
			System.out.println("단어를 입력해주세요 >");
			String word = sc.next();
			System.out.println("의미를 입력해주세요 >");
			String mean = sc.next();
			map.put(word, mean);
		}
		return map;
	}
	
	public static void printWord() {
		HashMap<String, String> map1 = creatWord();
		for(String tmp : map1.keySet()) {
			System.out.println("단어 : "+tmp+", 의미 : "+map1.get(tmp));
		}
	}

}
