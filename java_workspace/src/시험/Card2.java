package 시험;

public class Card2 {
	
	private char shape;  // 하트(♥), 클로버(♣), 다이아(◆), 스페이드(♠)
	private int num;  // A 2~10 J Q K
	
	public Card2() {}
	
	public Card2(char shape, int num) {
		shape='♥';
		num=1;
	}
	
	//카드 정보 출력
	public void printCard2() {
		System.out.print(shape);
		switch(num) {
		case 1: 
			System.out.print("A ");
			break;
		case 11: 
			System.out.print("J ");
			break;
		case 12: 
			System.out.print("Q ");
			break;
		case 13: 
			System.out.print("K ");
			break;	
		default: 
			System.out.print(num+" ");
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥':case '◆':case '♣':case '♠':
			this.shape=shape;
			break;			
		default :
			this.shape='♥';			
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num>1 || num<=13) {			
			this.num=num;
		}else{
			this.num=num=1;
		}
	}
	
}
