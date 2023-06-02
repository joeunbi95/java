package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		/* out.txt파일을 읽어들여 map에 저장 후
		 * 이름 : 점수 
		 * 총 합계 총인원 출력
		 * */
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		double sum = 0;
		double avg = 0;
		while(true) {
			String line = br.readLine();
			if(line==null) break;			
			String name = line.substring(0,line.indexOf(' ')+1);			
			Integer score = Integer.parseInt(line.substring(line.lastIndexOf(' ')+1));			
			System.out.println("이름>"+ name +"  점수>"+score+"점");
			map.put(name,score);		
			sum = (sum+score);					
			avg= sum/map.size();
		}
		System.out.println("-----계산------");
		System.out.printf("총 합계 : %.0f점", sum);	
		System.out.println();
		System.out.println("총 인원 : "+ map.size()+"명");
		System.out.printf("총 평균 : %.2f점", avg);
		br.close();
		
		System.out.println();
		
		
		
		
	}

}
