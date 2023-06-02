package reNew03;

public class Singleton {

	private static Singleton instance;	
	
	//생성자를 private으로 선언
	//객체 생서을 막기위해 private 설정	
	private Singleton() {}
	
	//getInstance 메서드
	public static Singleton getInstance() {
		//null 일 때 만 생성, 미미 생성되어 있다면 기존 객체 반환
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
