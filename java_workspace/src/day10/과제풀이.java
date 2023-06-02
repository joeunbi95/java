package day10;

import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		Product[] p = new Product[10];
		Scanner sc = new Scanner(System.in);
		
		char menu = 'y';
		int sum=0; 
		int cnt = 0; //p객체의 index 핸들링하기 위한 변수
		
		while(menu!= 'n') {
			System.out.println("상품을 등록하시겠습니까?(y/n)");
			menu=sc.next().charAt(0);
			
			if(menu == 'y') {
				System.out.println("상품명 > ");
				String name = sc.next();
				
				System.out.println("가격 > ");
				int price = sc.nextInt();
				//입력받은 값을 바로 합계
//				sum = sum+ price;
				//생성자를 이용하여 객치 생성 후 배열에 객체 담기
//				Product tmp = new Product(name, price);
//				p[cnt]=tmp;
				
				//insertProduct 메서드를 활용하여 객체 생성 후 등록
				p[cnt] = new Product();
				p[cnt].insertProduct(name, price);
				
				cnt++;//index증가				
			}else {
				if(menu == 'n') {
					System.out.println("상품등록 종료");
				}else {
					System.out.println("y/n만 입력가능합니다.");
				}
			}
		}
		
		System.out.println("--등록된 제품 리스트--");
		for(int i=0; i<cnt; i++) {
			//toString 사용한 경우
//			System.out.println((i+1)+"번째 상품 : "+p[i]);
			//메서드 사용한 경우
			p[i].print();
			sum=sum+p[i].getPrice();
		}
		System.out.println("장바구니 : "+sum+"원");
		
		
		sc.close();	

	}

}
