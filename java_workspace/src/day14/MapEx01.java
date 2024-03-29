package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {
	//1번형태
	//멤버변수 자리
	private HashMap<String, String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	private int size = 5;
	public static void main(String[] args) {
		//단어장 - > 메서드로 변경
		//단어를 입력받는 메서드 생성
		
		//1. 저장공간을 아디에다가 둘지
			//- 1. 멤버변수 => 공용변수로 있는 형태
			//- 2. main(별로 안좋음.) => 매개변수로 받는 형태
			//- 3. 메서드내부에 생성 => 리턴의 형태
		
		//2. 매개변수와 리턴타입, 메서드명을 결정 => interface 생성
		
		MapEx01 ex =new MapEx01();
		//map이 static이 아닌 인스턴스변수(메서드)라서 반드시 생성해야지만 접근가능.
		
		//1번  맴버변수형태
		ex.make();
//		Iterator<String> it = ex.map.keySet().iterator();
//		while(it.hasNext()) {
//			String word = it.next(); //Key값 반환
//			String mean = ex.map.get(word); // Value값 반환
//			System.out.println("단어 : "+word+" = 의미 : "+mean);
//		}
		
		
		//2번 형태
		//main에서 생성
//		HashMap<String, String> map = new HashMap<>();
//		ex.make2(map);
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String word = it.next(); //Key값 반환
//			String mean = map.get(word); // Value값 반환
//			System.out.println("단어 : "+word+" = 의미 : "+mean);
//		}
		
		
		//3번 형태
//		MapEx01 ex = new MapEx01();
		HashMap<String, String> map = ex.make3();
		
		//출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next(); //Key값 반환
			String mean = map.get(word); // Value값 반환
			System.out.println("단어 : "+word+" = 의미 : "+mean);
		}
	}
	
	//메서드 자리 : 리턴타입, 매개변수, 매서드명을 결정
	//1. 멤버변수로 map이 있는 형태 (공용) 리턴x, 받을것도없음.
	public void make() {
		while(map.size()<size) {
			System.out.println("단어 :");
			String word = sc.next();
			System.out.println(" = 의미 : ");
			String mean = sc.next();
			
			map.put(word, mean);
		}
		
	}
	

	//2. 외부에 map이 있는 형태(매개변수로 map을 가져오기
	public void make2(HashMap<String, String>map) {
		
	}
	
	//3. 메서드 내부에서 map 생성하는 형태(리턴이 map인 형태)
	public HashMap<String, String> make3() {
		HashMap<String, String> map = new HashMap<>();
		while(map.size()<size) {
			System.out.println("단어 :");
			String word = sc.next();
			System.out.println(" = 의미 : ");
			String mean = sc.next();
			
			map.put(word, mean);
		}
		return map;
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}
