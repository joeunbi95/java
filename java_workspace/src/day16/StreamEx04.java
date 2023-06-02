package day16;

import java.util.ArrayList;

public class StreamEx04 {

	public static void main(String[] args) {		
		ArrayList<Travel> tr = new ArrayList<>();
		
		tr.add(new Travel("최미연", 57));
		tr.add(new Travel("조은비", 29));
		tr.add(new Travel("조영찬", 10));
		System.out.println("");
		tr.stream().forEach(n->{
			String name=n.getName();
			int age = n.getAge();
			int expense = n.getExpense();
			System.out.println();
			System.out.println("----------- 고객정보 -------------");
			System.out.println();
			System.out.println("이름:"+name+" | 나이:"+age+"살 | 비용:"+expense+"만원");
			System.out.println();
			System.out.println("--------------------------------");
		}); 
		
		int sum = tr.stream().mapToInt(n->n.getExpense()).sum();
		System.out.println();
		System.out.println("[총 여행비용 : "+sum+"만원]");
		System.out.println();
		
		double avg = tr.stream().mapToDouble(n->n.getExpense()).average().getAsDouble();
		System.out.printf("[인당 비용 : %.2f 만원]",avg);
		System.out.println();
		
		
		//20세 이상 성인만 이름을 정렬하여 출력
		System.out.println();
		tr.stream().filter(n->n.getAge()>=20).sorted().forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int expense = n.getExpense();
			System.out.println("----------- 고객정보 -------------");
			System.out.println();
			System.out.println("이름:"+name+" | 나이:"+age+"살 | 비용:"+expense+"만원");
			System.out.println();
			System.out.println("--------------------------------");
		});
	}
	
}
