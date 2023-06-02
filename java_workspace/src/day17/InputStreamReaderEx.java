package day17;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		/* 한글 여러글자를 읽고 출력*/
		
		System.out.println("한글로 입력해주세요.(Enter)");
		int i;
		
		//InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in); // 보조스트림의 경우 입력기반(System.in)을 넣어줘야함
		try {
			while((i = isr.read()) != '\n') { // \n => 줄바꿈, Enter와 같음
				System.out.print((char)i);
			}
				
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
