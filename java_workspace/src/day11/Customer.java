package day11;

public class Customer {
	/* 일반고개 / Gold고객 / VIP고객
	 * 
	 * 고객 ID : customerID
	 * 고객이름 : customerName
	 * 고객등급 : customerGrade
	 * 보너스포인트 : bonusPoint
	 * 보너스포인트적립비율 : bounsRatio
	 * 
	 * - Customer 객체생성시
	 * 기본 customerGrade = silver
	 * 기본 bounsRatio = 0.01
	 * 
	 * - Gold 등급
	 * - 제품을 살때 10% 할인 /보너스 포인트 2% 적립
	 * 
	 * - VIP 등급
	 * - 제품을 살때 10% 할인/보너스 포인트 5% 적립
	 * - 전담상담사 갖는다.
	 * 
	 * - 메서드
	 * - 보너스 적립 계산 메서드 (메서드명 : calcPrice)
	 *   => 보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴
	 * - 구매금액을 주고, 적립보너스를 계산 bounsPoint에 누적
	 * - 출력 메서드(메서드명 : customerInfo)
	 * - 홍길동 님의 등급은 VIP이며, 보너스포인트는 1000입니다.
	 * */
	
	protected int customerID; //고객id =>1001
	protected String customerName; //고객명
	protected String customerGrade; //고객등급
	int bounsPoint; //포인트
	double bounsRatio; //적립비율
	
	public Customer() {} //기본생성자는 반드시 있는게 좋다.
		
	public Customer(int ID, String Name) {
		this.customerID=ID;
		this.customerName=Name;
		initCustomer();
	}
	
	private void initCustomer() {
		this.customerGrade="Silver";
		bounsRatio=0.01;		
	}
	
	public int calcPrice(int price) {
		//가격을 매개변수로 받아 포인트를 적립.
		bounsPoint=bounsPoint+(int)(price*bounsRatio);		
		return price;
	}
	
	public void costomerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며"+" 보너스포인트는 "+bounsPoint+"입니다.");
	}
	

	public int getID() {
		return customerID;
	}

	public void setID(int iD) {
		customerID = iD;
	}

	public String getName() {
		return customerName;
	}

	public void setName(String name) {
		customerName = name;
	}

	public String getGrade() {
		return customerGrade;
	}

	public void setGrade(String grade) {
		customerGrade = grade;
	}

}

