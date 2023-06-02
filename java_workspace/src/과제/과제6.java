package 과제;
public class 과제6 {
	
	public static void main(String[] args) {
	
		Animal1 hAnimal = new Human();
		Animal1 tAnimal = new Tiger();
		Animal1 eAnimal = new Eagle();
		Animal1 dAnimal = new Dog();
		
		
		Animal1[] AnimalList=new Animal1[4];
		int cnt = 0;
		AnimalList[cnt] = hAnimal;
		cnt++;
		AnimalList[cnt] = tAnimal;
		cnt++;
		AnimalList[cnt] = eAnimal;
		cnt++;
		AnimalList[cnt] = dAnimal;
		cnt++;
		
		
		
		과제6 test = new 과제6();
		test.moveAnimal1(hAnimal);
		test.moveAnimal1(tAnimal);
		test.moveAnimal1(eAnimal);
		test.moveAnimal1(dAnimal);
		
		System.out.println("---다운 캐스팅---");
		test.testDownCasting1(AnimalList);	
		
		
		
	}
	public void moveAnimal1(Animal1 animal1) {
		animal1.move();
	}
	
	
	public void testDownCasting1(Animal1[] List) {			
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
	
	public void eat() { 
		System.out.println("사람이 밥을 먹습니다.");
	}
}
class Tiger extends Animal1{
	public void move() {
		System.out.println("호랑이가 어슬렁 거립니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	public void eat() { 
		System.out.println("호랑이가 먹이를 먹습니다.");
	}
}
class Eagle extends Animal1{
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");
	}
	
	public void fly() {
		System.out.println("독수리가 두 날개를 쫙 폅니다.");
	}
	
	public void eat() { 
		System.out.println("독수리가 먹이를 먹습니다.");
	}
}
class Dog extends Animal1{
	public void move() {
		System.out.println("강아지가 바닦을 뒹굽니다.");
	}
	
	public void bark() {
		System.out.println("강아지가 시끄럽게 짖습니다.");
	}
	
	public void eat() { 
		System.out.println("강아지가 사료를 먹습니다.");
	}
}