package reNew03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class New09 {

	public static void main(String[] args) {
		//https://www.leelin.co.kr/index.html
		URL url = null;
		BufferedReader input = null;
		String address = "https://www.leelin.co.kr/index.html";
		String line = "";
		
		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
