package day10;

import java.util.Scanner;

public class 과제 {
	public static void main(String[] args) {
		/* Product 클래스 : 상품을 등록하는 클래스
		 * 멤버변수 - 상품명, 가격
		 * 상품등록메서드 - insertProduct
		 * 출력메서드
		 * getter/setter
		 * */

		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품등록 후 리스트 출력
		 * 
		 * 스캐너를 통해서 상품 등록.
		 * 상품을 등록하시겠습니까?(y/n)
		 * y => 상품등록 반복 n => stop 
		 * 상품이름과 가격을 등록받아 상품 배열에 등록.
		 * 
		 * n => 등록된 제품 리스트 출력
		 * */
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
	
	
		Product[]list = new Product[10];
		int cnt=0;
		int sum=0;
		
		while (cnt<10) {
			System.out.println("상품을 등록 하시겠습니까?(y/n)");
			char ch=sc.next().charAt(0);		
			if(ch =='y') {
				System.out.println("상품명을 입력해주세요.");
				String name=sc.next();
				System.out.println("가격을 입력해주세요.");
				int price=sc.nextInt();
				p.insertProduct(name, price);
				list[cnt]=new Product(name, price);
				cnt++;
			}else if(ch !='y') {
				System.out.println("상품등록 종료");
				break;
			}			
		}
		
		for(int i=0;i<cnt; i++) {
			list[i].print();
			sum=sum+list[i].getPrice();
		}
		System.out.println("장바구니 가격 : "+sum+"원");
	}
}



















