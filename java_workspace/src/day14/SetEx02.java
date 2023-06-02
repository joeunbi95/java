package day14;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {
		// 점수들 중 가장 큰점수와 가장 작은 점수 출력
		int[] score= {80,98,75,48,95,62,57,80};
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		System.out.println("min : "+set.first());
		System.out.println("max : "+set.last());
		
		System.out.println("--------------------");
		
		//headSet : 지정된 객체보다 작은 값(미만), tailSet : 지정된 객체보다 큰 값(이상)
		System.out.println(set.headSet(80)); //80보다 작은 객체(미만)
		System.out.println(set.tailSet(80)); //80보다 큰 객체(이상)
		
		//범위 검색(70(이상)은 포함, 뒷쪽 값(미만)은 미포함)
		System.out.println(set.subSet(70, 90));
		
		//내림차순
		NavigableSet<Integer> set1 =set.descendingSet();
		System.out.println(set1);
		
		
	}

}
