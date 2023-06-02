package StudentProgrem;

import java.util.Scanner;

public interface ProgreemInterface {
	
	/* interface - program
	1. 학생 리스트 출력
	2. 학생 등록
	3. 학생 검색
	4. 수강 신청
	5. 수강 철회
    */

	void printStudent();  //학생리스트 출력
	void insertStudent(Scanner scan); // 학생등록
	void searchStudent(Scanner scan); // 학생검색
	void registerSubject(Scanner scan); // 수강신청
	void deleteSubject(Scanner scan); // 수강철회
	
}
