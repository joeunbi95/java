package day10;

public class EzenComputer {
	/* - 학생기본정보 : 이름, 생년월일, 나이, 전화번호
	 * - 학원정보 : 학원이름 = "EZEN", 지점  ->final
	 * - 수강정보 : 수강과목, 기간
	 * - 한명의 학생은 여러과목을 수강할 수 있음.
	 * 과목, 기간 => 배열로처리 길이=5
	 * 
	 * 홍길동, 990101, 20, 010-1111-2222
	 * EZEN, 인천
	 * 자바(6개월), DB(1개월), HTML(2개월)
	 * 
	 * 기능
	 * 학생의 기본정보 출력
	 * 학생의 학원정보 출력
	 * 학생의 수강정보 출력
	 * 학생의 수강정보를 추가하는 기능
	 * */
	
	//학생의 기본정보
	private String name;
	private String birthdate;
	private int age;
	private String PhonNumber;	
	
	//학원 정보
	public final static String brand="EZEN";
	private String branch;
	
	//수강 정보
	private String group[]=new String[5];//수강과목
	private String period[]=new String[5];//수강기간
	private int cnt; //수강과목, 수강기간의 index를 처리
	
	//생성자
	public EzenComputer() {}
	
	public EzenComputer(String name, String birthdate, int age,
			String PhonNumber, String branch) {
		this.name=name;
		this.birthdate=birthdate;
		this.age=age;
		this.PhonNumber=PhonNumber;
		this.branch=branch;
	}
	
	public EzenComputer(String name, String PhonNumber, String branch) {
		this.name=name;
		this.PhonNumber=PhonNumber;
		this.branch=branch;
	}
	
	//학생의 기본정보 출력
	public void Studentprint() {
		System.out.print("[학생정보] ");
		System.out.print("이름:"+name);
		System.out.print("  생년월일:"+birthdate);
		System.out.print("  나이:"+age+"세");
		System.out.print("  전화번호:"+PhonNumber);
	}
	
	//학생의 학원 정보 출력
	public void brandprint() {
		System.out.print("[학원정보] ");
		System.out.print("학원명:"+brand);
		System.out.println("  지점명:"+branch);
	}
	
	//학생의 수강 정보 출력
	public void subjectprint() {
		System.out.print("과정 : ");
		if(group.length == 0 || cnt == 0) {
			System.out.println("수강이력이 없습니다.");
			return;
		}
		for(int i=0; i<cnt; i++) { //cnt:추가되지 않은값을 출력x
			System.out.print(group[i]+"("+period[i]+")"+", ");
		}				
	}
//			if(group[i]!= null) {
//				System.out.print(" "+ group[i]);
//				System.out.print("("+period[i]+")" + ",");
//			}else {
//				break;
//			}
	
	//학생의 수강 정보 추가
	public void insertsubject(String group, String period) {
		this.group[cnt]=group;
		this.period[cnt]=period;
		cnt++; //index 증가.
	}
	
//		for(int i=0; i<this.group.length; i++) {
//			if(this.group[i]==null) {
//				this.group[i]=group;
//				this.period[i]=period;
//				break;
//			}		
//		}		
	
		

	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonNumber() {
		return PhonNumber;
	}

	public void setPhonNumber(String phonNumber) {
		PhonNumber = phonNumber;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getGroup() {
		return group;
	}

	public void setGroup(String[] group) {
		this.group = group;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public static String getBrand() {
		return brand;
	}

	public int getCnt() {
		return cnt;
	}
	
}
