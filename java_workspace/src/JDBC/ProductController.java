package JDBC;

import java.util.List;
import java.util.Scanner;

public class ProductController {

	//상품등록, 상품전체리스트보기, 상품상세페이지보기, 상품수정, 상품삭제
	//데이터베이스 연동한 후 컨트롤러에서 모든 메뉴를 분기처리
	//컨트롤러 -> 서비스를 호출, 서비스-> DAO를 호출(DB구문 연결 호출)
	//controller -> service(interface) -> serviceimpl(구현체)
	
	private Scanner scan;
	private Service svc;	
	private boolean flag;   /*종료변수 (flag => false) == 종료*/
	
	//생성자
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductService();  /*service 구현 객체*/
		flag = true;
		printMenu(); /*method 호출*/
	}
	
	private void printMenu() {
		while(flag) {
			System.out.println("-상품관리시스템-");
			System.out.println("1.등록 2.목록 3.찾기 4.수정 5.삭제 etc종료");
			System.out.println("메뉴선택 > ");
			int menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("register메뉴");					
					register(); /*실행메서드 추가*/
					break;
				case 2:
					System.out.println("list메뉴");
					list(); /*실행메서드 추가*/
					break;
				case 3:
					System.out.println("detail메뉴");
					detail(); /*실행메서드 추가*/
					break;
				case 4:
					System.out.println("edit메뉴");
					edit(); /*실행메서드 추가*/
					break;
				case 5:
					System.out.println("remove메뉴");
					remove(); /*실행메서드 추가*/
					break;
					
				default:
					flag = false;
					break;
			}
		}
	}
	//삭제메뉴
	private void remove() {
		System.out.println("삭제 상품번호 >>");
		int pno = scan.nextInt();	
		
		int isOk = svc.remove(pno);
		
		System.out.println("상품삭제 "+(isOk > 0 ? "성공":"실패"));	
				
	}
	
	
	//수정메뉴
	private void edit() {
		System.out.println("수정 상품번호 >>");
		int pno = scan.nextInt();		
		System.out.println("수정 상품명 >>");
		String pname = scan.next();
		System.out.println("수정 상품가격 >>");
		int price = scan.nextInt();
		scan.nextLine(); /*윗쪽 공백(Enter)를 하단 madeby가 등록하는 것을 막기위한 공백날림용*/
		System.out.println("수정 상품상세 >>");
		String madeby = scan.nextLine();	
		
		//update의 리턴 결과는 Query OK, 0 rows affected (0.00 sec)
		int isOk = svc.edit(new Product(pno, pname, price, madeby));
		System.out.println("상품수정 "+(isOk > 0 ? "성공":"실패"));	
		
	}
	
	
	
	//세부 정보 보기
	private void detail() {
		//select 내가 선택한 번호의 전체 내용을 리턴
		System.out.println("상품번호 >>");
		int pno = scan.nextInt();
		
		//번호를 줄테니 그에 맞는 product 객체를 리턴
		Product pvo = svc.detail(pno);		
		
		//출력
		System.out.println(pvo);
		
	}
	
	//전체 리스트 보기
	private void list() {
		//전체 DB의 리스트
		//select pno, pname, regdate from product
		//pno, pname, regdate
		List<Product> list = svc.list();
		
		//출력
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
	
	//각종 메뉴들에 대한 분기처리. C(등록 : register, insert, add)
	//DAO의 메서드명은 DB명 그대로 많이쓰이는 편.
	//R(조회 : list, select...)
	//U(수정 : edit, update)
	//D(삭제 : remove, delete)
	
	//등록메뉴
	private void register() {
		System.out.println("상품명 >>");
		String pname = scan.next();
		System.out.println("상품가격 >>");
		int price = scan.nextInt();
		scan.nextLine(); /*윗쪽 공백(Enter)를 하단 madeby가 등록하는 것 을 막기위한 공백날림용*/
		System.out.println("상품상세 >>");
		String madeby = scan.nextLine();		
		//isOk DB에 등록요청을 하고, 요청이 올바르게 이루어진 후 리턴 받는 값
		//0:실패, 1:성공
		
		//원래 처리는 method 구문을 먼저 만들고, main에서 호출해오는 형태
		//main에서 호출하면 역으로 method를 생성(메서드명, 매개변수 결정해서 생성)
		int isOk = svc.register(new Product(pname, price, madeby));
		System.out.println("상품등록 "+(isOk > 0 ? "성공":"실패"));		
	}
	
	
	
	
	
	
	
	
	
	
	
}
