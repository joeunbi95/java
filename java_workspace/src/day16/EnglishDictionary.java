package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

class EnglishDictionary{
	
	static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {

	int menu=0;
	EnglishDictionary wm = new EnglishDictionary();
	do{
		System.out.println("메뉴>");
		System.out.println("1.단어등록");
		System.out.println("2.단어출력");
		System.out.println("3.종료");
		menu = scan.nextInt();
		switch(menu) {
		case 1 : wm.makeWord(); break;
		case 2 : wm.printWord(); break;
		case 3 : break;
		}
	}while(menu != 3);
	System.out.println("단어장 종료");
}

	
	public EnglishDictionary() {}
	
	//hellow: 안녕, 아침인사, 반가움, 비슷한말 hi	
	private Map<String,ArrayList<String>> words = new HashMap<>();
	private String newWord;
	private String mean;
	/*	y를 입력하면 단어를 입력, n을 입력하면 종료
	 * 	단어가 이미 있다면 등록할수 없다는 메세지
	 * 	메서드명 : make word
	 * 	
	 * */
	
	public void makeWord() {
		ArrayList<String> meanList = new ArrayList<>();
		char isMake = 'y';
		a: while(isMake == 'y') {
		System.out.println("입력할 단어명 : ");
		newWord = scan.next();
			for(String tmp : words.keySet()) {
				if(tmp.equals(newWord)) {
					System.out.println("이미 있는 단어입니다");					
					break a;
				}
			}		
			while(isMake == 'y') {
				System.out.println("의미 입력 : ");
				mean = scan.next();
				meanList.add(mean);				
				System.out.println("입력되었습니다");
				System.out.println(newWord+"의 의미를 더 입력하시겠습니까(y:추가입력/n:종료)");
				isMake = scan.next().charAt(0);				
		}
			words.put(newWord, meanList);
		}		
	}		
	
	/*	단어출력 메서드
	 * 	메서드명 : printWord
	 */	
	public void printWord() {
		Iterator<String> it = words.keySet().iterator();
		while(it.hasNext()) {
			String Word = it.next();
			ArrayList<String> List = words.get(Word);
			System.out.println("단어 :"+Word);
			System.out.print("의미 :"+List);
			System.out.println();
		}
	}
}
