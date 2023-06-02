package day13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set 순서보장X 중복X
		 * HashSet
		 * index가 없음.
		 * */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("bananan");
		set.add("apple");
		set.add("이순신");
		set.add("peach");
		set.add("orange");
		set.add("홍길동");
		
		System.out.println(set);
		
		for(String tmp : set) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("> Iterator 출력");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		//Set 정렬 : set은 순서가 없어서 정렬이 안됨. => set => list 변환한 후 정렬
		List<String> list = new ArrayList<String>(set);
		System.out.println("--set => List");
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println(list);
		
		
		
		
		
	}

}
