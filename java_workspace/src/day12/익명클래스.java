package day12;

public class 익명클래스 {

	public static void main(String[] args) {
		/* 익명클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 때 클래스 없이 바로 구현
		 * 익명클래스 사용하는 이유
		 * 인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우.
		 * 메서드의 매개변수로 주로 사용.
		 * */
//		Tv t = new Tv();		
//		t.trunOn();
//		t.trunOff();
//		product(t);
		
		//익명클래스로 작업한 경우
		product(new Power() {

			@Override
			public void trunOn() {
				System.out.println("전원 ON");
				
			}

			@Override
			public void trunOff() {
				System.out.println("전원 OFF");
				
			}
			
		});
		
		
	}
	public static void product(Power p) {
		p.trunOn();
		System.out.println("Tv가 작동중입니다.");
		p.trunOff();
	}
}

interface Power{
	void trunOn();
	void trunOff();
}

//class Tv implements Power{
//
//	@Override
//	public void trunOn() {
//		System.out.println("전원이 켜졌습니다.");
//		
//	}
//
//	@Override
//	public void trunOff() {
//		System.out.println("전원이 꺼졌습니다.");
//		
//	}
//	
//}