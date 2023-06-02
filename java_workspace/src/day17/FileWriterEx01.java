package day17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {
		/* 문자 기반 스트림
		 * */
		
		FileWriter fw = new FileWriter("test.txt");
		
		for(int i=1; i<=10; i++) {
			String data = i+"test \r\n";  // \r = 줄바꿈후 앞에서 시작 \n = 줄바꿈
			fw.write(data);
		}
		fw.close();
		
		// 파일을 추가모드로 열어라 ("파일명",true)
		FileWriter fw1= new FileWriter("test.txt",true);
		for(int i=11; i<=20; i++) {
			String data = i+"test append \r\n";
			fw1.write(data);
		}
		fw1.close();
		
		FileWriter fw2 = new FileWriter("SIKI.txt");
		
		for(int i=1; i<=10; i++) {
			String data = i+"번 \r\n";
			fw2.write(data);
		}
		fw2.close();
		
		FileWriter fw3 = new FileWriter("SIKI.txt",true);
		for(int i=11; i<=20; i++) {
			String data = i+"번임 \r\n";
			fw3.write(data);
		}
		fw3.close();
	}

}
