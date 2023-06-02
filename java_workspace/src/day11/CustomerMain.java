package day11;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customerList[]=new Customer[10];
		//업캐스팅 => 묵시적인 형변환이 가능
		Customer c = new Customer(950321,"조은비");
		Customer g = new GoldCustomer(940321, "조성은");
		Customer v = new VipCustomer(980515, "조영찬");
		
		//다운캐스팅 => 반드시 명시적으로 형변환.
		//instancof : 원래 인스턴스의 형이 맞는 여부를 체크하는 명령어 맞으면 true/false
//		if(v instanceof VipCustomer) {			
//			VipCustomer vv=(VipCustomer)v;
//		}else if(v instanceof GoldCustomer){
//			GoldCustomer vv=(GoldCustomer)v;
//		}else {
//			System.out.println("error");
//		}
		
		int cnt=0;
		customerList[cnt]=c;
		cnt++;
		customerList[cnt]=g;
		cnt++;
		customerList[cnt]=v;
		cnt++;
		
		System.out.println("----- 고객 정보 출력 -----");
		for(int i=0; i<cnt; i++) {
			customerList[i].costomerInfo();
		}
		
		System.out.println("=== 할인율과 포인트 계산 ===");
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].getName()+"님의 지불하실 금액은 "+
		customerList[i].calcPrice(price)+"입니다.");
			
			System.out.println(customerList[i].getName()+"님의 보너스 포인트는 "+
		customerList[i].bounsPoint+"입니다.");
			System.out.println("-------------------------------");
		}
		
		
		
//		
//		int cost = c.calcPrice(price);
//		System.out.println(c.customerName+"님의 지불하실 금액은 "+ cost+"원 입니다.");
//		System.out.println(c.customerName+"님의 현재 포인트는 "+c.bounsPoint+" 입니다.");
//		System.out.println();
//		
//		int cost1 = g.calcPrice(price);
//		System.out.println(g.customerName+"님의 지불하실 금액은 "+ cost1+"원 입니다.");
//		System.out.println(g.customerName+"님의 현재 포인트는 "+g.bounsPoint+" 입니다.");
//		System.out.println();
//		
//		int cost2 = v.calcPrice(price);
//		System.out.println(v.customerName+"님의 지불하실 금액은 "+ cost2+"원 입니다.");
//		System.out.println(v.customerName+"님의 현재 포인트는 "+v.bounsPoint+" 입니다.");
//		
		
	}
}