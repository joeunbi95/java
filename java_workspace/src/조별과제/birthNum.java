package 조별과제;

import java.util.ArrayList;

public class birthNum {		//입력받은 생년월일의 각 숫자를 받아 더해주는 클래스

	public birthNum() {}
	public int birthNumCreate(String fortuneBrithdate) {
		int birthSum = 0;
		ArrayList<String> birthlist = new ArrayList<>();
    	ArrayList<Integer> birthNumList = new ArrayList<>();
    	String []fortuneBrithdatetmp = new String[8] ;
    	
    	fortuneBrithdatetmp = fortuneBrithdate.split("");	//받은 string을 하나씩 쪼갬

    	for(String tmp : fortuneBrithdatetmp) {				// 쪼갠 String을 리스트에 하나씩 넣음
    		birthlist.add(tmp);
    	}    	
    	
    	
    	for(String tmp : birthlist) {
    		birthNumList.add(Integer.parseInt(tmp));		//리스트에 들어간 string을 int로 치환
    	}
    	
    	for(int tmp : birthNumList) {
    		birthSum = birthSum + tmp;				//int로 치환된 생년월일을 모두더함    		
    	}
    	
    	return birthSum;					//모두 더한값을 리턴함
	}
	
	
	
}