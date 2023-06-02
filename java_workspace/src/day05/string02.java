package day05;

public class string02 {

	public static void main(String[] args) {
		/* 이것이자바다.txt 파일에서 파일명과 확장자를 분히라여 출력
		 * */
		String str= "이것이자바다.txt";
		System.out.println("파일명 : " + str.substring(0,6));
		System.out.println("확장자 : "+str.substring(str.indexOf(".")+1));
		
		//contains(str) : 해당 글자가 포함되있는지를 체크 boolean
		System.out.println(str.contains("자바"));

	}

}
