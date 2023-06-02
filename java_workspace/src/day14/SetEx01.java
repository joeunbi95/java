package day14;

import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		//로또번호 출력: Set
		//random으로 생성 1~45까지 중 6개
		
		//Math 클래스에서 제공하는 random메서드 사용
		//int a = (int)(Math.random()*45)+1;
		
		SetEx01 set = new SetEx01();
		set.random();
		
		
	}
	
	TreeSet<Integer> set = new TreeSet<Integer>();	
	
	public void random() {
		int size = 6;
		
		while(set.size()<size) {		
			Integer a= new Random().nextInt(45)+1;
			set.add(a);
		}		
		System.out.println("로또번호"+set);
		System.out.println("첫번호 "+set.first());
		
		System.out.print(set.pollFirst()+" <=첫 번호 지움");//첫번째꺼 꺼내고 값을 지움.
		System.out.println(set);
		
		System.out.println("끝번호"+set.last());
	}
	
}
