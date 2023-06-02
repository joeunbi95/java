package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02_2번 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MapEx02_2번 ex = new MapEx02_2번();
		HashMap<String, Integer>map = new HashMap<>();
		ex.make(map);
		ex.print(map);
		

	}
	private int sum=0;
	private int end=1;
	
	public void make(HashMap<String, Integer>map) {
		while(end!=0) {
			System.out.println("상품명 : ");
			String menu = sc.next();
			System.out.println("가격 : ");
			Integer price = sc.nextInt();
			sum+=price;
			map.put(menu, price);
			System.out.println("종료는 : 0 진행은 : 1");
			end = sc.nextInt();
		}
	}
	
	public void print(HashMap<String, Integer>map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String menu = it.next();
			Integer price = map.get(menu);
			System.out.println("상품명 : "+menu+" 가격 : "+price);
		}
		System.out.println("총 가격 : "+sum);
	}

}
