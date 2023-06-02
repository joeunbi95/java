package day11;
import java.util.Scanner;
public class 과제 {
	static Scanner sc = new Scanner(System.in);	
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
	
		String[]fileList = new String[5];		
		String[]img ={"jpg","png","gif","jpeg"};
		
		for(int i=0; i<fileList.length; i++) {
			System.out.println("파일명을 입력해주세요.");
			fileList[i] = sc.next();													
		}			
		
		System.out.println("=== 이미지 파일 검색 ===");
		for(int i=0;i<fileList.length; i++) {
			for(int j=0;j<img.length; j++) {
				if(fileList[i].contains(img[j])) {
					System.out.println(fileList[i]);
				}
			}
		}
                 sc.close();
	}	
}