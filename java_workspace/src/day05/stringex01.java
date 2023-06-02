package day05;

import java.util.Scanner;

public class stringex01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는
		 * 파일들을 출력하도록 코드를 작성.
		 * 
		 * 클럽에 제출
		 * */

		Scanner scan =new Scanner(System.in);
		
		String[] fileName = {"java의 정석.txt", "이것이 java다.jpg", "String 메서드.txt",
				"String 함수.jpg", "java의 정석 표시.jpg"};
		
		//ex)java => java의 정석.txt 이것이 java다.jpg java의 정석 표시.jpg
		// jpg => 이것이 java다.jpg String 함수.jpg java의 정석 표시.jpg
		// String => String 메서드.txt String 함수.jpg
		int count = 0;
		System.out.println("단어를 입력해주세요.");
		String str = scan.nextLine();
		System.out.println("--- 검색 값 : "+ str + " ---");
			for(String tmp : fileName) {
				if(tmp.contains(str)) {
					System.out.println(tmp);
					count++;
				}				
			}
			if(count == 0) {
				System.out.println("검색 값이 없습니다.");
			}
		scan.close();
			
	}

}
