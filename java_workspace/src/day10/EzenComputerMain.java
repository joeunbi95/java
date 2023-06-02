package day10;

public class EzenComputerMain {

	public static void main(String[] args) {
		
		EzenComputer ez = new EzenComputer();
		
		ez.setName("조은비");
		ez.setBirthdate("1995-03-21");
		ez.setAge(29);
		ez.setPhonNumber("010-2206-0488");
		ez.Studentprint();
		System.out.println();
		System.out.println("--------------------------");
	
		ez.setBranch("인천점");
		ez.brandprint();
		
		System.out.println("--------------------------");
		
		ez.insertsubject("java", "2개월");	
		ez.insertsubject("DB", "1개월");
		ez.insertsubject("html", "3개월");
		ez.insertsubject("Sping", "6개월");
		ez.subjectprint();
		System.out.println();
		System.out.println("--------------------------");
		
		EzenComputer ez2 = new EzenComputer("조은비","95.03.21",29,
				"010-22060-0488","인천");
		ez2.Studentprint();
		System.out.println();
		ez2.brandprint();
		System.out.println();
		//배열로 5명의 학생을 등록 후
		//학생 이름으로 검색
		//지점명으로 검색
		
		EzenComputer[] std=new EzenComputer[5];
		std[0]=new EzenComputer("김아무개", "010 111 222", "인천");
		std[1]=new EzenComputer("박아무개", "010 111 222", "서울");
		std[2]=new EzenComputer("이아무개", "010 111 222", "인천");
		std[3]=new EzenComputer("최아무개", "010 111 222", "서울");
		std[4]=new EzenComputer("홍아무개", "010 111 222", "인천");
		
		String searchName = "홍아무개"; //홍아무개가 상담받은 지점정보 출력/ 개인정보 출력
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {//위치가 바뀌어도 값은 같다.
				std[i].brandprint();
				std[i].Studentprint();
			}
		}		
		System.out.println();
		System.out.println("-------------------");
		String serchBrench = "서울"; //지점정보 / 개인정보 출력
		for(EzenComputer tmp : std) {
			if(tmp.getBranch().equals(serchBrench)) {//위치가 바뀌어도 값은 같다.
				tmp.Studentprint();
				tmp.brandprint();			
			}
		}		
		System.out.println("-------------------");
		String serchBrench2 = "인천"; 
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch().equals(serchBrench2)) {//위치가 바뀌어도 값은 같다.
				std[i].Studentprint();
				std[i].brandprint();
			}
		}
	}

}
