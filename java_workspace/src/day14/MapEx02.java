package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// map에 상품명과 가격을 입력받고, 출력
		// 총 지불가격 출력
		// 입력 => 메서드 출력 = > 메서드로 구현
	MapEx02 ex = new MapEx02();
	
	ex.make();
	ex.print();
		
		
	}
	private HashMap<String, Integer> map = new HashMap<>();
	private int sum=0;
	private int end=1;
	
	
	public void make() {
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
	
	public void print() {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String menu = it.next();
			Integer price = map.get(menu);
			System.out.println("상품명 : "+menu+" 가격 : "+price);
		}
		System.out.println("총 가격 : "+sum);
	}
	

}
