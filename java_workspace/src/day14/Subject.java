package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Subject {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/* map을 이용 성적관리 프로그램 생성
		 * >>menu
		 * 1. 성적추가 (국어 97)
		 * 2. 성적조회 (전체출력) : 합계/평균 같이 출력
		 * 3. 성적조회 (과목) : 서치후 일치하는 과목 출력
		 * 4. 성적수정 : 서치 후 수정
		 * 5. 성적삭제 
		 * 6. 종료
		 * 
		 * C(create) 생성 
		 * R(read) 읽기/조회
		 * U(update) 수정
		 * D(delete) 삭제
		 * */
		Subject s = new Subject();
		s.menu();
		s.subject();
		
		
	}
	
	private HashMap<String, Integer> map = new HashMap<>();
		
	public void menu() {
		System.out.println("----성적관리 프로그램---");
		System.out.println("1> 성적 추가");
		System.out.println("2> 성적 조회(전체출력)");
		System.out.println("3> 성적 조회(과목출력)");
		System.out.println("4> 성적 수정");
		System.out.println("5> 성적 삭제");
		System.out.println("6> 프로그램종료");
		System.out.println("--------------------");
	}
	
	
	//성적추가
	public void insert() {	
		System.out.println("과목명을 입력해주세요.");
		String subject =sc.next();
		System.out.println("점수를 입력해주세요.");
		Integer score = sc.nextInt();
		if(score<0 || score>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		if(map.get(subject)==null) {
			map.put(subject, score);
		}else {
			System.out.println(subject+"는 이미 존재합니다.");
		}		
		map.put(subject, score);		
	}
	
	
	//성적 조회(전체출력)
	public void printall() {
		int sum=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject =it.next();
			int score = map.get(subject);
			sum= sum+score;
			System.out.println(subject+":"+score);
		}		
		System.out.println("점수 합계 : "+sum+" 평균 : "+sum/map.size());
	}
	
	
	//성적 조회(과목출력) 서치.
	public void printsubject() {
		
		System.out.println(map);
	}
	
	
	//서치
	public void search() {
		System.out.println("조회할 과목을 입력해주세요.");
		String subject = sc.next();		
		
		Integer score = map.get(subject);
		if(score==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			System.out.println(subject+":"+score);
		}		
	}
	
	
	//성적 수정
	public void modify() {
		System.out.println("수정할 과목을 입력해주세요.");
		String subject = sc.next();	
		System.out.println("점수를 입력해주세요.");
		Integer score = sc.nextInt();
		if(score<0 || score>100) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		map.put(subject, score); //map의 key는 중복불가 중복되면 덮어쓰기됨.
		System.out.println(subject+"성적이 "+score+"으로 변경되었습니다.");		
	}
	
	
	//성적 삭제
	public void delete() {
		System.out.println("삭제할 과목을 입력해주세요.");
		String subject = sc.next();	
		if(map.get(subject)==null) {
			System.out.println(subject+"는 없는 과목입니다.");
		}else {
			map.remove(subject);
			System.out.println(subject+"과목이 삭제되었습니다.");
		}
	}
	

	
	public void subject() {
		int num=sc.nextInt();		
			switch(num) {
			case 1:{
				insert();	
				menu();
				subject();
				break;	
			}
			case 2:{
				printall();
				menu();
				subject();
				break;	
			}
			case 3:{
				search();
				menu();
				subject();
				break;	
			}
			case 4:{
				modify();
				menu();
				subject();			
				break;	
			}
			case 5:{
				delete();
				menu();
				subject();
				break;	
			}
			case 6: System.out.println("프로그램을 종료합니다."); break;		
			
			default:{
				System.out.println("잘못된 메뉴입니다.");			
			}			
		}
	}
	
}
