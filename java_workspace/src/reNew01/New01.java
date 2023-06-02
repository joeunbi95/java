package reNew01;

public class New01 {

	public static void main(String[] args) {
		// 홍길동의 주민등록번호 : 881002-1234567
		// 출력형태 : 생년월일 : 881002 성별 : 남
		String pin = "881002-1234567";
		
		System.out.println("홍길동의 주민등록번호 : " + pin);
//		System.out.println(pin.charAt(7));
		if(pin.charAt(7) == '1') {
			System.out.println("생년월일 : " + pin.substring(0,6) + "," + " 성별 : 남");
		}else {
			System.out.println("여");
		}
		
		System.out.println("-------------------------------");
		
		String birth = pin.substring(0,pin.indexOf("-"));
		System.out.println("birth: "+birth);
		char ch = pin.charAt(pin.charAt('-'));

	}
}