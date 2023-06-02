package reNew03;

public class SingletonCounter {

	public static void main(String[] args) {
		/* 싱글턴 패턴을 활용한 카운터 만들기
		 * */
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		System.out.println(c1.countMethod());
		System.out.println(c1.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c1.countMethod());
	}

}

class Counter{
	//싱글턴 패턴으로 객체 생성
	private static Counter instance;
	private int count;
	
	//private 생성자
	private Counter() {}
	
	//getInstance()
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	//count()
	public int countMethod() {
		count++;
		return count;
	}
}