package day10;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속  : 부모의 것을 자식에게 물려주는 것
		 * 클래스 상속 : 부모 클래스의 멤버변수/멤버 매서드를 물려주는 것
		 * 상속을 하는 이유 : 재사용
		 * class A (부모클래스) / class B (자식클래스)
		 * 
		 * class B extends A {
		 * 
		 * }
		 * 상속 키워드 : extends
		 * 
		 * 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * 접근제한자 private은 자식클래스에서 접근 불가능.
		 * 점근제한자 protected : 상속받는 자식에게 허용하는 제어자
		 * 
		 * */
		
		A a=new A();
		a.setA(10);
		System.out.println(a);
		System.out.println("-----------------");
		
		B b=new B();
		
		b.setB(20);
		System.out.println(b.getB());
		System.out.println("------------------");
		b.print();
		b.num=100;
		System.out.println("------------------");
		b.print();
		System.out.println("------------------");
		b.toString();
		
	}

}
class A{ //부모클래스
	private int a, b, c;//나만 사용
	protected int num;//상속 가능
	
	public void print() {
		System.out.println(" a : "+a+"  b : "+b+"  c : "+c);
		System.out.println("mum : "+num);
	}
	
	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", c=" + c + ", num=" + num + "]";
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
class B extends A{ //A에서
	private int d, e, f;


//	public void print() {
//		super.print();//super : 부모의 값을 가져올 때
//		System.out.println(" d : "+d+"  e : "+e+"  f : "+f);
//	}
	
	@Override
	public String toString() {
		
		return "B [d=" + d + ", e=" + e + ", f=" + f + "]";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	
}




















