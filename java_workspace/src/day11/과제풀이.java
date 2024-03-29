package day11;

import java.util.Scanner;

public class 과제풀이 {
	
	public static void main(String[] args) {
		
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지파일 형식은 (jpg png gif jpeg)
		 * String[]fileName = {"java.txt", "String.jpg", "method.png",
		 * "String.pdf","java.pdf"}
		 * 
		 * --이미지 파일--
		 * String.jpg
		 * method.png
		 * */
		Scanner sc = new Scanner(System.in);
//		String[]fileName = {"java.txt", "String.jpg", "method.png",
//				  "String.pdf","java.pdf"};
		String[]fileName = new String[5];
		System.out.println("파일명 5개 입력해주세요.");
		for(int i=0; i<fileName.length; i++) {
			fileName[i]= sc.next();
		}
//		String search = fileName[2].substring(fileName[2].indexOf(".")+1);
//		System.out.println(search);
		String[]img = {"jpg", "png", "gif", "jpeg"};
		
		System.out.println("---이미지 파일 검색---");
		for(String tmpFile : fileName) {
			String search = tmpFile.substring(tmpFile.indexOf(".")+1);
			if(isContains(img, search)) {
				System.out.println(tmpFile);
			}
		}

	}
	public static boolean isContains(String arr[], String search) {
		if(arr==null || arr.length==0) {
			return false;
		}
		if(search == null) {
			return false;
		}
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false;
	}
	
}
