package day01;

public class if문2 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80이상이면 합격, 아니면 불합격
		 * 출력 : 합계, 평균, 평가
		 */

		int 국어 = 75;
		int 영어 = 85;
		int 수학 = 95;
		
		int sum;
		double avg;
		sum = 국어 + 영어 + 수학;
		avg = sum / 3.0;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(avg>=80) {
			System.out.println("평가 : 합격");
		} else {System.out.println("평가 : 불합격");}
		
		// 평가를 A(평균>=90), B(평균>=80), C(평균>=70), D(평균>=60), F(평균<=60),
		
		
		if(avg>=90) {
			System.out.println("A등급");
		} else if(avg>=80) {
			System.out.println("B등급");
		} else if(avg>=70) {
			System.out.println("C등급");
		} else if(avg>=60) {
			System.out.println("D등급");
		} else if(avg<=60) {
			System.out.println("F등급");
		}
		
		
		
		
		
		
		
		
		
	}

}
