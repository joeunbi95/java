package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx03 {

	public static void main(String[] args) {
		ArrayList<Student> std = new ArrayList<>();
		
		std.add(new Student("김씨", 80));
		std.add(new Student("이씨", 74));
		std.add(new Student("박씨", 90));
		std.add(new Student("최씨", 61));
		std.add(new Student("오씨", 88));
		std.add(new Student("호씨", 70));
		
		//class에 toString 존재하면
		//std.stream.forEach(System.out::println);
		
		//이름 : 점수 출력
		Stream<Student> st = std.stream();
		st.forEach(n->System.out.println("이름: "+n.getName()+"  점수: "+n.getScore()+"점"));
		System.out.println();
		
		std.stream().forEach(n->{
			String name =n.getName();
			int score = n.getScore();
			System.out.println("이름> "+name+"  점수> "+score+"점");
		});
		System.out.println();

		//점수 합계 출력
		int sum = std.stream().mapToInt(n->n.getScore()).sum();		
		
		//총인원 출력
		long cnt = std.stream().count();
		
		System.out.println("총점수 : "+sum+"점 "+" 총인원 : "+cnt+"명");
		System.out.println();
		
		//점수가 70점이상인 친구들의 합계
		int upSum = std.stream().mapToInt(n->n.getScore()).filter(f->f>=70).sum();
		System.out.println("점수가 70점이상인 친구들의 합계 : "+upSum);
		System.out.println();
		
		//평균출력
		double avg = std.stream().mapToInt(n->n.getScore()).average().getAsDouble();
		System.out.printf("총평균 : %.2f점",avg);
	}

}
