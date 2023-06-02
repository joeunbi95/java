package day17;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		WordManager wm = new WordManager();
		wm.addword();
		int menu = -1;
		do {
			wm.printMenu();
			menu=sc.nextInt();		
			switch(menu) {
			case 1: wm.insertWord(sc); break;
			case 2: wm.searchWord(sc); break;
			case 3: wm.modifyWord(sc); break;
			case 4: wm.printWord();	break;
			case 5: wm.deleteWord(sc); break;
			case 6: wm.fileWord();	break;	
			case 7: System.out.println("단어장 종료.");
			break;				
				default:
					System.out.println("잘못된 메뉴입니다.");					
			}			
		}while(menu!=7);
		sc.close();

	}

}
