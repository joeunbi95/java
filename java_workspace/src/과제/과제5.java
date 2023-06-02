package 과제;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
public class 과제5 {
	public static void main(String[] args) {
		TreeSet<Integer> com= new TreeSet<>();
		TreeSet<Integer> user= new TreeSet<>();
		
		while(com.size()<7) {
			int random= new Random().nextInt(45)+1;
			com.add(random);
		}
		while(user.size()<6) {
			int random= new Random().nextInt(45)+1;
			user.add(random);
		}
		
		System.out.println("로또번호 :"+com);
		System.out.println("유저번호 :"+user);
		
		Iterator<Integer> it= user.iterator();
		int cnt=0;
		while(it.hasNext()) {
			int tmp= it.next();
			if(com.subSet(com.first(),com.last()).contains(tmp)) {
				cnt++;
			}
		}
		switch(cnt) {
		case 6: 
			System.out.println("1등"); break;
		case 5:
			if(user.contains(com.last())) {
				System.out.println("2등");
			}else {
				System.out.println("3등");
			}
			break;
		case 4: 
			System.out.println("4등"); break;
		case 3: 
			System.out.println("5등"); break;
		default: 
			System.out.println("꽝");
		}
	}
}
