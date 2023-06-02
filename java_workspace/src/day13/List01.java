package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * 
		 * */
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("AM 6:00 = 기상");
		list1.add("AM 6:30 = 아침식사");
		list1.add("AM 7:00 = 외출준비");
		list1.add("AM 8:00 = 외출");
		list1.add("AM 8:50 = 학원입실");
		list1.add("AM 9:00 = 학원수업시작");
		list1.add("PM 1:00 = 점심시간");
		list1.add("PM 2:00 = 점심시간 끝");
		list1.add("PM 6:00 = 학원퇴실");
		list1.add("PM 7:00 = 집도착");
		list1.add("PM 8:00 = oem작업");
		list1.add("PM 11:00 = 취침준비");
		list1.add("PM 12:00 = 취침");
	
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		for(String tmp : list1) {
			System.out.println(tmp);
		}

		System.out.println();
		System.out.println("-------------------");
		
		Iterator<String> it = list1.listIterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		System.out.println();
		System.out.println("-------------------");
		
		
		Collections.sort(list1);
		System.out.print(list1);

		
		System.out.println();
		System.out.println("-------------------");
		
		list1.sort(new Test());
		System.out.println(list1);
		
		
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
