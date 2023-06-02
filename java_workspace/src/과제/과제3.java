package 과제;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class 과제3 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*	id가 일치하지 않으면 "잘못된 ID입니다." 
		id는 일치하고, password가 일치하지 않으면 "비밀번호 불일치!!"
		입력값 id = Kim,  pw = 1235   => 잘못된 ID
		입력값 id = Lee,  pw = 1235   => 비밀번호 불일치
		입력값 id = Lee,  pw = 1234   => 로그인 성공
		*/
		
		과제3 p = new 과제3();
		Map<String, Integer> map = new HashMap<>();	
		map.put("Lee", 1234);
		map.put("Kim", 1236);
		map.put("Cho", 1239);
		p.print(map);
		
		
	}
	public void print(Map<String, Integer> map) {
		
		while(true) {			
			System.out.println("ID를 입력해주세요.");
			String id = sc.next();
			System.out.println("PassWord를 입력해주세요.");
			Integer pw = sc.nextInt();
			
			if(map.containsKey(id)) {
				if(map.containsValue(pw)) {
					System.out.println("Login 성공");
					break;
				}else {
					System.out.println("PassWord 불일치");
				}
			}else {
				System.out.println("ID 불일치");
			}
			
		}		
		sc.close();
	}
}
