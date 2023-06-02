package day02;

public class switch문3 {

	public static void main(String[] args) {
		/* 계절을 출력
		 * 1~12월까지 랜덤으로 생성 후 월과 계절을 출력
		 * 3~5:봄, 6~8:여름, 9~11:가을, 12~2:겨울*/
		
		/* (1) || (2)  => or 둘중 하나의 조건만 맞으면 true
		 * (1) && (2)  => and 둘다 맞아야 true
		 * !(true)  => not 조건의 반대
		 */
		
		int num = (int)(Math.random()*12)+1;
		
		if(num>3 && num<6) {
			System.out.println(num + "월 봄입니다.");
		} else if(num>5 && num<9) {
			System.out.println(num + "월 여름입니다.");
		} else if(num>8 && num<12) {
			System.out.println(num + "월 가을입니다.");
		} else if(num>11 && num<3) {
			System.out.println(num + "월 겨울입니다.");
		}	
		
		switch(num) {
		case 3: case 4: case 5:
			System.out.println(num+"월의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(num + "월의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(num + "월의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(num + "월의 계절은 겨울입니다.");
			break;
		}
		
	}

}
