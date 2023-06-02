package day09;

public class CardPackMain {

	public static void main(String[] args) {
		/* 카드 생성
		 * 
		 * */
		CardPack cp=new CardPack();
//		Card tmp=cp.pick();        //가장위에 있는 카드 한장을 pick Card 객체에 저장
//		tmp.print();
//		tmp = cp.pick();
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				Card tmp=cp.pick();
				tmp.print();
			}
			System.out.println();
		}
		System.out.println("------------------------");
		
		cp.init();
		cp.shuffle();
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				Card tmp=cp.pick();
				tmp.print();
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		a: for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				Card tmp=cp.pick();
				if(tmp != null) {
					tmp.print();
				}else {
					System.out.println("카드가 없습니다. 초기화 하세요.");
					break a;
				}
			}
		}
	
		//모양대로 4열횡대
		//한 모양이 끝나면 줄바꿈
		
	}

}
