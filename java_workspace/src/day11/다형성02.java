package day11;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class 다형성02 {

	/* 객체지향프로그램의 4가지 특징
	 * - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임.
	 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리.
	 * - 추상화, 캡슐화(정보은닉), 상속, 다형성
	 * 
	 * 추상화 (Abstraction) - 핵심적인 코드만 보여주기
	 * - 인터페이스와 구현을 분리한다. 
	 * - 불필요한 부분은 숨긴다.
	 * 
	 * 캡슐화(encapsulation) - 데이터 보호 (정보은닉)
	 * - 멤버변수(필드)와 메서드를 하나로 묶는 것
	 * - 멤버변수(필드)는 숨기고 메서드로 접근
	 * - 은닉화 : 객체의 내부의 정보는 숨겨 외부로 드러나지 않게 함.
	 *           외부에서 데이터를 직접 접근하는 것을 방지
	 *
	 * 상속(inheritance) - 코드 재사용 (확장)
	 * - 클래스를 상속받아 수정하여 사용하게 되면 중복 코드를 줄일 수 있다.
	 * 
	 * 다형성(polymorphism) - 객체 변경 용이
	 * */
	
	public static void main(String[] args) {
		/* 다형성(polymorphism) : 하나의 코드가 여러 자료형으로 구성되어 실행되는 것.
		 * 같은 코드에서 여러 다른 실행결과를 얻을 수 있음.
		 * 다형성을 잘 활용하면 유연하고, 확성있는, 유지보가 편리한 프로그램을 만들 수 있음.
		 * */
		Animal1 hAnimal1 = new Human();
		Animal1 tAnimal1 = new Tiger();
		Animal1 eAnimal1 = new Eagle();
		
		
		
		Animal1[] AnimalList=new Animal1[3];
		int cnt = 0;
		AnimalList[cnt] = hAnimal1;
		cnt++;
		AnimalList[cnt] = tAnimal1;
		cnt++;
		AnimalList[cnt] = eAnimal1;
		cnt++;
		
		
		다형성02 test = new 다형성02();
		test.moveAnimal(hAnimal1);
		test.moveAnimal(tAnimal1);
		test.moveAnimal(eAnimal1);
		
		System.out.println("---다운 캐스팅---");
		test.testDownCasting(AnimalList);
		
 		
		
		
		
		
	}
	//method 생성
	public void moveAnimal(Animal1 animal1) {
		animal1.move();
	}
	
	//다운캐스팅 메서드 작성
	//리턴=void, 매개변수(AnimalList[] list)
	//메서드명 testDownCasting
//		if(hAnimal1 instanceof Human) {//형변환이 가능하다면 true
//			Human human = (Human)hAnimal1;
//			human.read();
//		}
	
	public void testDownCasting(Animal1[] List) {			
		for(int i=0; i<List.length; i++) {
			if(List[i] instanceof Human) {
				Human hh = (Human)List[i];
				hh.read();
			}else if(List[i] instanceof Tiger) {
				Tiger tt = (Tiger)List[i];
				tt.hunting();
			}else if(List[i] instanceof Eagle) {
				Eagle ee = (Eagle)List[i];
				ee.fly();
			}
		}
	}
	
	
}

class Animal1{
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}

class Human extends Animal1{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
		}
	
	public void read() { 
		System.out.println("사람이 공부를 합니다.");
	}
}

class Tiger extends Animal1{
	public void move() {
		System.out.println("호랑이가 어슬렁 거립니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal1{
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}
	
	public void fly() {
		System.out.println("독수리가 두 날개를 쫙 폅니다.");
	}
}












