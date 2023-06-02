package day11;

public class VipCustomer extends Customer {

	double saleRatio;
	
	public VipCustomer() {}
	
	public VipCustomer(int ID, String Name) {
		super(ID,Name);
		customerGrade="VIP";
		bounsRatio=0.05;
		saleRatio=0.1;
	}

	@Override
	public int calcPrice(int price) { //10000 - 1000 = 9000
		bounsPoint= (int)(price*bounsRatio);
		return price-(int)(price*saleRatio);		
	}

	@Override
	public void costomerInfo() {
		// TODO Auto-generated method stub
		super.costomerInfo();
		System.out.println(customerName+"님의 전담상담사 번호는 010-2206-0488 입니다.");
	}
	
}
