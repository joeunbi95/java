package day11;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수로만 이루어진 것.
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 : 미완성 클래스 = > 객체를 생성할 수 없다.
		 * 키워드 : abstract
		 * abstract 클래스명 앞/ 메서드 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 부모 클래스에서 상속 받았을 때 특정 메서드가 자식 클래스에 자주 오버라이딩 될 때
		 * 해당 메서드를 추상 메서드로 작성
		 * 
		 * - 상속을 받은 클래스에서는 추상메서드가 있다면 반드시 구현해야 한다.
		 * 
		 * 인터페이스 : 상수와 추상메서드만으로 구성
		 * 키워드 : interface
		 * - 기능요약서
		 * - 자체적으로는 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 * - 구현 키워드 : implements
		 * - 인터페이스는 멤버변수가 없음. 항상 이 부분을 염두에 두고 메서드 정리를 해야한다.
		 * */
		Dog d = new Dog("뽀삐","개과");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("나비","고양이과");
		c.printInfo();
		c.howl();
		
		Dog d1 = new Dog();
		d1.name="삐뽀";
		d1.category="강아지과";
		d1.printInfo();
		d1.howl();
		
	}

}
//Animal 클래스 = 추상클래스
//추상클래스는 객체 생성 불가.
abstract class Animal{
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println("-------------");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
		System.out.println("-------------");
	}
	
	abstract public void howl(); //추상메서드

	
}

class Dog extends Animal{
	
	public Dog() {}
	
	public Dog(String name, String category) {
		super.name=name;
		super.category=category;
	}

	@Override
	public void howl() {
		System.out.println("--"+name+"울음소리--");
		System.out.println("멍멍");
	}
	
}
//추상클래스를 상속받는 자식클래스는 반드시 추상메서드를 구현해야한다.
//자식클래스가 추상클래스면 구현안해도 됨.
class Cat extends Animal{
	
	public Cat (String name, String category) {
		super.name=name;
		super.category=category;
	}
	
	@Override
	public void howl() {
		System.out.println("--"+name+"울음소리--");
		System.out.println("야옹");
	}
	
}














