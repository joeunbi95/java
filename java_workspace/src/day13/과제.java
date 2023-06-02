package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* 단어장 단어 : 의미 => hello : 안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장을 출력
		 * */
		HashMap<String, String>map= new HashMap<String, String>();
		
		int size = 5;
		
		while(map.size() < size) {
			//입력
			System.out.println("단어를 입력해주세요.");
			String word = sc.next();
			System.out.println("뜻 입력해주세요.");
			String mean = sc.next();
			
			map.put(word, mean);			
		}
		
		//출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next(); //Key값 반환
			String mean = map.get(word); // Value값 반환
			System.out.println("단어 : "+word+" = 의미 : "+mean);
		}
		
	}

}
