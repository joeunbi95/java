package reNew01;

public class New02 {

	public static void main(String[] args) {
		// for문을 이용하여 1부터 10까지 출력
		// 1~10까지 합계 출력
		// 1~10까지 짝수합, 홀수합 출력
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");	
			sum = sum+i;
			if(i % 2==0) {
				sum2+=i;
			}else{
				sum3 +=i;
			}
		}
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("합계 : "+sum);
		System.out.println("--------------------------");
		
		System.out.println("짝수 합 : "+sum2 +" 홀수 합 : "+sum3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
