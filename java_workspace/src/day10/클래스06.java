package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있음.
		 * final : 수정할 수 없다.
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩을 할 수 없다.
		 * final 클래스 : 상속 할 수 없다. 부모 클래스가 될 수 없다.
		 * */
		EzenStudent e= new EzenStudent();
		
		System.out.println(e);
		e.setBranch("강남점");
		e.setName("조은비");
		e.setGroup("Java");
		e.setPhonNumber("010 2206 0488");
		e.print();
		System.out.println();
		
		EzenStudent ez= new EzenStudent("인천점","조은비","Java","010 2206 0488");
		ez.print();
		System.out.println();
		System.out.println(ez.toString());
	}

}
/* 초기화 방법 : 기본값, 명시적 초기값, 초기화블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수 선언과 동신에 초기값 지정
 * 2. 초기화 블럭 : {}멤버변수 초기화
 * 3. 생성자 : 객체를 생성할 때 초기화 해서 생성
 * 초기값 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자
 * */

//맴버변수 : 지점, 이름, 반, 전화번호
class EzenStudent{
	private String branch;
	private String name;
	private String group;
	private String phonNumber;//int:연산이 필요한 경우
	{
		//초기화 블럭 : 멤버변수들을 초기화;
		branch ="incheon";
		group ="미정";
	}	
	public EzenStudent() {}
	
	public EzenStudent(String branch, String name,String group,String phonNumbers) {
		this.branch=branch;
		this.name=name;
		this.group=group;
		this.phonNumber=phonNumbers;
	}
	

	@Override
	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", group=" + group + ", phonNumber=" + phonNumber
				+ "]";
	}

	public void print() {
		System.out.println("지점 : "+branch);
		System.out.println("이름 : "+name);
		System.out.println("반 : "+group);
		System.out.println("전화번호 : "+phonNumber);
		
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
}
