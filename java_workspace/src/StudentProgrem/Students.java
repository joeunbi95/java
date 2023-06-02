package StudentProgrem;

import java.util.ArrayList;

import studentmanager.Subject;

public class Students extends Subjects{
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스 
	- 학번, 이름, 주민번호, 학부, 학과, 수강과목	  
	- 생성자, getter/setter, 출력메서드(print) - 2가지 형태로
	*/
	
	private String stdNum; //학번
	private String stdName; //이름
	private String registerNum; //주민번호
	private String faculty; //학부
	private String major; //학과
	private String subName; //과목
	private ArrayList<Students> subList = new ArrayList<>();
	private int subCount;
	
	public Students() {}
	
	public Students(String subName) {
		this.subName = subName;
	}
	
	public Students(String stdNum, String stdName, String registerNum, String faculty, String major) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.registerNum = registerNum;
		this.faculty = faculty;
		this.major = major;
	}
	
	//print method : 학생정보만 출력
	public void stdPrint() {
		System.out.println("학생명:"+stdName+" 학번:"+stdNum+"학번");
		System.out.println("학부:"+faculty+" 학과:"+major);		
	}
	
	public void subPrint() {
		int subCount = 0;
		
		if(subCount==0) {
			System.out.println("수강중인 과목이 없습니다.");
		}
		for(int i=0; i<subCount; i++) {
			System.out.println(subList);
		}
	}
	
	public void insertSubject(ArrayList<Students> subName) {
		subList = subName;
		subCount++; 
	}
	
	public void deleteSubject(String subName) {
		int index = -1;
		if(subName == null) {
			return;
		}		
		for(int i=0; i<subCount; i++) {
			if(subList.get(i).getSubName().equals(subName)) {
				index = i;
				break;
			}
		}		
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}		
		for(int i=0; i<subCount; i++) {
			subList.remove(index);
			System.out.println("삭제되었습니다.");
		}
		
	}	
	

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void print () {
		
	}	
	

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "학생이름:" + stdName +" 학번:" + stdNum +"학번 "+"학부:" + faculty + " 학과:" + major;
	}
	
	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}
	
	
}
