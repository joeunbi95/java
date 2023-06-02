package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import day15.Word;

public class WordManager {

	/* package day 15에서 생성한 Word 클래스 객체화해서 사용
	 * 단어장 프로그램 작성
	 * 1. 단어등록
	 * 2. 단어검색
	 * 3. 단어수정
	 * 4. 단어출력
	 * 5. 파일로 출력
	 * 6. 종료
	 * */
	
	private ArrayList<Word> list = new ArrayList<>();
	
	//메뉴출력
	public void printMenu() {
		System.out.println();
		System.out.println(">단어장 프로그램<");
		System.out.println(">>메뉴선택");
		System.out.println("1.단어등록");
		System.out.println("2.단어검색");
		System.out.println("3.단어수정");
		System.out.println("4.단어출력");
		System.out.println("5.단어삭제");
		System.out.println("6.파일로 단어출력");
		System.out.println("7.종료");
		System.out.println(">> 선택:");	
	}
	
	//기본단어등록
	public void addword() {
		list.add(new Word("dog", "강아지"));
		list.add(new Word("cat", "고양이"));
		list.add(new Word("apple", "사과"));
		list.add(new Word("banana", "바나나"));
		list.add(new Word("orange", "오렌지"));
	}
	
	//단어등록
	public void insertWord(Scanner sc) {
		System.out.println("단어입력>");
		String word =sc.next();
		System.out.println("의미입력>");
		String mean =sc.next();
		
		list.add(new Word(word, mean));
		
//		Word w =new Word
//		w.setWord(word);
//		w.setMean(mean);
//		list.add(w);
		
	}
	
	//단어검색
	public void searchWord(Scanner sc) {
		System.out.println("검색단어>");
		String sword = sc.next();
		for(Word w : list) {
			if(w.getWord().equals(sword)) {
				System.out.println("검색결과>");
				System.out.println(w);
				return;
			}
		}
		System.out.println("검색 단어가 없습니다.");
	}
	
	//단어수정
	public void modifyWord(Scanner sc) {
		System.out.println("검색단어>");
		String sword = sc.next();
		System.out.println("수정단어>");
		String mword =sc.next();
		System.out.println("수정단어의미>");
		String mean = sc.next();
		Word w =new Word(mword, mean);		
			
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(sword)) {				
				list.set(i, w);//수정
				System.out.println("수정되었습니다.");
				return;								
			}
		}
		System.out.println("검색 단어가 없습니다.");
	}
	
	//단어출력	
	public void printWord() {
		System.out.println("-----단어장-----");
		Collections.sort(list);
		for(Word w : list) {
			System.out.println(w);
		}
		System.out.println("--------------");
	}
	
	//단어삭제
	public void deleteWord(Scanner sc) {
		System.out.println("삭제단어>");
		String word =sc.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		System.out.println("검색 단어가 없습니다.");
	}
	
	//단어 파일로 출력
	public void fileWord() throws IOException {
		FileWriter fs = new FileWriter("Word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		//단어장의 list의 값을 String화 하기 위해서 StringBuffer
		//객체생성
		StringBuffer sb = new StringBuffer();
		String data = null;
		sb.append("단어장");
		sb.append("\r\n");
		int cnt=0;
		Collections.sort(list);
		while(cnt<list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n"); //줄바꿈
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();
		
	}
}
