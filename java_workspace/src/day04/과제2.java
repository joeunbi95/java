package day04;

public class 과제2 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지의 랜덤수
		 * 주사위 : 3
		 * 3칸전진 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => ~칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동횟수 : 00번
		 * 클럽에 제출
		 * */
			
//		int count = 0; //카운트
//		int sum = 0; //30칸					
//		int num = 0;
//				
//		System.out.println("주사위 게임 START~ (30칸 가즈아~)");
//		System.out.println();
//		
//		for( ; ; ){
//			num = (int)(Math.random()*6)+1;//랜덤 주사위
//			sum = sum+num;
//			count++;
//			System.out.println(num + "칸 전진!, "+ (30-sum) + "칸 남았습니다." );
//			System.out.println();
//			
//			if(sum>=30) {
//				System.out.println("도착! 총 이동횟수: " + count);	
//				break;	
//			}	
//		}		
		System.out.println();
		
		// 풀이
		
		int random=0; //주사위의 값
		int sum=0; // 이동거리 합산
		int count=0; //주사위 던진 횟수(이동 횟수)
		int last = 30; //최종 목표값
		
		while(sum <last) {//sum이 last가 될때까지 반복
			random = (int)(Math.random()*6)+1;//1~6까지 랜덤수 생성
			sum += random;//거리합산
			count++;
			System.out.println("주사위 : "+ random+", 전진 => "+(last-sum)+"칸 남았습니다.");
			
		}
		System.out.println("도착~, 총이동횟수 : "+count);
		
		
		
		
		
		
		

	}

}
