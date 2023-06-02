package reNew02;

import java.util.ArrayList;

public class New04 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크
		 *  - List : 순서보장, 중복가능
		 *  - Set : 순서보장 X, 중복불가능
		 *  - Map : 2가지 데이터를 쌍으로 저장, 순서보장 X
		 *  - Key(중복불가능) : value(중복가능)
		 *  */
		
		// 리스트를 생성하고 1~10까지 저장 한 후 출력
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		for(int tmp : list) {
			System.out.print(tmp+" ");
		}
		
		// 정수를 입력받아 1부터 정수까지 리스트에 추가하고
		// 합을 출력
		System.out.println();
		
		
		
	}

}
