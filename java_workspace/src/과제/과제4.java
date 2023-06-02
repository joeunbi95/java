package 과제;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class 과제4 {
	public static void main(String[] args) {
		/* 두 배열을 하나로 합치는 ArrayList를 구성
		arr1 = a,e,f;
		arr2 = d,b,c;
		list = a,e,f,d,b,c; =>출력
		list를 정렬
		list = a,b,c,d,e,f; => 출력
		Iterator 사용
		 */		
		ArrayList<String> hg = new ArrayList<String>();
		
		String arr1[] = new String[] {"가","마","다"};
		String arr2[] = new String[] {"사","나","라"};
		
		for(int i=0; i<arr1.length; i++) {
			hg.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			hg.add(arr2[i]);
		}

		System.out.println("======== 출력 ========");
		System.out.println(hg);
		
		System.out.println("====== 정렬 출력 ======");
		Collections.sort(hg);
		System.out.println(hg);
		
		
		System.out.println("==== Iterator 출력 ====");
		Iterator<String> it = hg.iterator();
		
		while(it.hasNext()) {
			String tmp = it.next(); 
			System.out.print(tmp+ " ");
		}
		
	}
}