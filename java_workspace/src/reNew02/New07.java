package reNew02;

import java.util.ArrayList;
import java.util.Scanner;

public class New07 {

	public static void main(String[] args) {
		// 상품 클래스 생성
		// 상품 추가 , 상품 리스트 출력 , 상품 내용 수정, 상품 삭제
		// manager 사용하여 추가, 출력, 수정, 삭제 기능
		// main 이용하여 menu 출력
		// menu 1. 추가 2. 출력 3.수정 4.삭제
		
		Scanner scan = new Scanner(System.in);
		ProductManager pm = new ProductManager();
		pm.AddbasicProduc();
		int menuindex = -1;
		//메뉴
		while(menuindex != 5) {
		System.out.println("-----물품관리프로그램-----");
		System.out.println("1. 상품추가");
		System.out.println("2. 상품 리스트 출력");
		System.out.println("3. 상품 내용 수정");
		System.out.println("4. 상품 삭제");
		System.out.println("5. 종 료");
		System.out.print("메뉴입력:");
		menuindex = scan.nextInt();
		
		switch(menuindex) {
		case 1 : pm.AddProduct(); break;
		case 2 : pm.printProduct(); break;
		case 3 : pm.chProduct(); break;
		case 4 : pm.deletProdcut(); break;
		case 5 : break;
		default : System.out.println("메뉴번호를 잘못입력하셧습니다"); break;
		}
		
		}
		//
		scan.close();
	}

	
}

class ProductManager{
	Scanner scan = new Scanner(System.in);
	private ArrayList<product> PdList = new ArrayList<product>();
	int index = -1;
	String isretouch = null;
	
	// 기본적인 상품추가
	public void AddbasicProduc() {
		PdList.add(new product("홈런볼",2000,30));
		PdList.add(new product("코카콜라",2000,20));
		PdList.add(new product("빈츠",3000,100));
		PdList.add(new product("코코볼",6000,20));
		PdList.add(new product("포카리스웨트",2000,10));
	}
	
	//상품 추가 기능
	public void AddProduct() {
		System.out.println("상품명을 입력해주세요 :");
		String name = scan.next();
		System.out.println("가격을 입력해주세요 : ");
		int price = scan.nextInt();
		System.out.println("재고를 입력해주세요 : ");
		int stock = scan.nextInt();
		for(int i = 0 ; i<PdList.size();i++) {
			if(PdList.get(i).getName().equals(name)) {
				System.out.println("이미 있는 메뉴입니다");
				System.out.println("수량과 재고를 변경하시겠습니까?(y/n)");
				isretouch = scan.next();
				if(isretouch.equals("y")) {
					System.out.println("변경할 가격을 입력해주세요");
					int changePrice = scan.nextInt();
					PdList.get(i).setPrice(changePrice);
					System.out.println("변경할 수량을 입력해주세요");
					int changeStock = scan.nextInt();
					PdList.get(i).setStock(changeStock);
					index=0;
					break;
				}
				else if(isretouch.equals("n")) {
					index = 0;
					break;
				}
				
			}
		}
		
		if(index==-1) {
			product addp = new product(name, price, stock);
			PdList.add(addp);
			System.out.println(addp.getName()+":"+addp.getPrice()+"원("+addp.getStock()+"개) 추가되었습니다");
		}
			
		}
	
	//상품 출력
	public void printProduct() {
		int num = 1;
		
		for(product tmp : PdList) {
			System.out.println(num+"."+tmp.getName()+":"+tmp.getPrice()+"원("+tmp.getStock()+"개)");
			num++;
		}
	}
	
	//상품 내용 수정
	public void chProduct() {
		System.out.println("수정하실 품목의 이름을 적어주세요 :");
		String chName = scan.next();
		System.out.println("수정할 품목의 가격을 적어주세요 :");
		int chPrice = scan.nextInt();
		System.out.println("수정할 품목의 재고를 적어주세요 :");
		int chStock = scan.nextInt();
		
		for(product tmp : PdList) {
			if(tmp.getName().equals(chName)) {
				tmp.setPrice(chPrice);
				tmp.setStock(chStock);
				System.out.println(chName+"의 내용이 수정되었습니다");
			}
		}
	}
	
	public void deletProdcut() {
		System.out.println("삭제할 품목의 이름을 적어주세요 :");
		String deleteProduct = scan.next();
		
		for(int i = 0 ; i < PdList.size(); i++) {
			if(PdList.get(i).getName().equals(deleteProduct)) {
				System.out.println(deleteProduct+"가 삭제되었습니다");
				PdList.remove(i);
				
			}
		}
		

		}
	
}