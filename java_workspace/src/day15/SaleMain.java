package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		SaleManager sm = new SaleManager();
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		do {
			sm.printmenu();
			menu = sc.nextInt();
			switch(menu) {
			case 1: sm.add();
				break;
			case 2: sm.printProduct();
				break;
			case 3:	sm.orderPick(sc);
				break;
			case 4: sm.printOrder();
				break;
			case 5: 
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=5);
		sc.close();

	}
}

