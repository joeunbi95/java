package day11;

public class GoldCustomer extends Customer {
	
	//할인율 saleRatio
	
	double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(int ID, String Name) {
		super(ID,Name);
		customerGrade="Gold";
		bounsRatio=0.02;
		saleRatio=0.1;
	}

	@Override
	public int calcPrice(int price) { //10000 - 1000 = 9000
		bounsPoint= (int)(price*bounsRatio);
		return price-(int)(price*saleRatio);		
	}
	
	
	
}
