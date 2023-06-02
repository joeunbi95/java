package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {
		public static void main(String[] args) {
		/* --메뉴판--
		 * 1.햄버거 : 7000
		 * 2.피자 : 12000
		 * 3.음료 : 2000
		 * 4.과자 2000
		 * 5.사탕 500
		 * 		
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2
		 * => 1번메뉴 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴를 선택해주세요. 3, 수량을 선택해주세요. 2
		 * => 3번메뉴 음료 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * 
		 * -- 선택한 메뉴
		 * 햄버거 2개, 음료 2개 선택 총 지불금액 :?
		 * */
		FoodManager f = new FoodManager();
		ArrayList<String> menu = new ArrayList<String>();
		ArrayList<Integer> count  = new ArrayList<Integer>();
		f.add();		
		while(true) {
			int menu1=f.printMenu();
			if(f.menu==0) {
				System.out.println("    주문 종료");				
				break;
			}
			int conut1=f.printquantity();			
			f.sale();	
			menu.add(f.food.get(menu1-1));
			count.add(conut1);
		}
		
		
		System.out.println("---- 주문확인 -----");
		for(int i=0; i<menu.size();i++) {
			System.out.print(menu.get(i)+" ");
			System.out.println(count.get(i)+" 개");
		}
		System.out.println("총 금액 : "+f.total);	
	}

}

class FoodManager{
	Scanner sc = new Scanner(System.in);
	//멤버변수 ArrayList 메뉴, ArrayList 가격	
	public ArrayList<String> food = new ArrayList<String>();
	public ArrayList<Integer> price = new ArrayList<Integer>();
	public int sum;
	public int total;
	public int menu;
	public int count;
	
	//메서드 정의
	//void printMenu(), 추가 메서드 void add(), sale(int menu, int count)
	public int printMenu() {
		System.out.println("┌──── 메 뉴 판 ────┐");		
		System.out.println("│1.불고기버거 $7000 │");
		System.out.println("│2.쿼트로피자 $12000│");
		System.out.println("│3.제로콕콜라 $2000 │");
		System.out.println("│4.닭다리너겟 $2000 │");
		System.out.println("│5.아이스크림 $500  │");
		System.out.println("│0 주 문 종 료  ㅋ  │");
		System.out.println("└──── 고 르 셈 ────┘");
		System.out.println("메뉴를 선택해 주세요.");	
		
		return menu = sc.nextInt();
	}
	
	public int printquantity() {		
		System.out.println("수량을 선택하세요.");
		return count = sc.nextInt();
	}
	
	public void add() {
		food.add("햄버거");
		food.add("피자");
		food.add("콜라");
		food.add("치킨너겟");
		food.add("소프트콘");
		
		
	}
//		total=total+sum;

	public void sale() {		
		if(menu==0) {
			System.out.println("주문을 종료합니다.");
		}else{
			sum=price.get(menu-1)*count;
			total+=sum;
			System.out.println(food.get(menu-1)+" "+count+"개 주문");		
			System.out.println("계산 금액 : "+sum);
			System.out.println("주문을 끝내시려면 0을 입력해주세요.");
		}		
		
	}	
	
}
