package StudentProgrem;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramtManagers implements ProgreemInterface{
	
	private ArrayList<Students> std = new ArrayList<>();  

	@Override
	public void printStudent() {
		System.out.println("===학생정보===");
		for(Students s : std) {
			s.stdPrint();
			System.out.println("============");		
			s.subPrint();
			System.out.println("============");	
		}
	}



	@Override
	public void insertStudent(Scanner sc) {
		//학번, 이름, 주민번호, 학부, 학과, 수강과목
		System.out.println("==학생등록==");
		System.out.println("이름>");
		String name = sc.next();
		System.out.println("학번>");
		String sNum = sc.next();
		System.out.println("주민번호>");
		String rNum = sc.next();
		System.out.println("학부>");
		String faculy = sc.next();
		System.out.println("학과>");
		String major = sc.next();
		System.out.println("=========");	
		Students s = new Students(sNum, name, rNum, faculy, major);
		std.add(s);
	}



	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 이름 입력>");
		String searchName = scan.next();
		int index =-1; 
		for(int i=0; i<std.size();i++) {
			if(std.get(i).getStdName().equals(searchName)) {
				System.out.println("===학생정보===");
				std.get(i).stdPrint();
				System.out.println("============");	
				std.get(i).subPrint();
				System.out.println("============");	
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("학생정보가 없습니다.");			
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강 신청할 학생명>");
		String name = scan.next();
		int index = -1;
		for(int i=0; i<std.size(); i++) {
			if(std.get(i).getStdName().equals(name)) {				
				index=i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			System.out.println("수강신청 과목>");
			String subn = scan.next();				
			Students sj = new Students(subn);			
			System.out.println("수강신청이 완료되었습니다.");
		}
	}



	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강 철회할 학생명>");
		String name = scan.next();
		int index=-1;
		for(int i=0; i<std.size();i++) {
			if(name.equals(std.get(i).getStdName())) {
				System.out.println("수강철회 과목>");
				String sName = scan.next();
				std.get(index).deleteSubject(sName);
				index=i;
				break;
			}
		}		
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}
		
	}	

}
