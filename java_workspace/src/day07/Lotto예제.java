package day07;

public class Lotto예제 {

	public static void main(String[] args) {
		/* 로또번호를 생성 (1~10까지 랜덤으로 번호를 생성)
		 * 로또번호 = 사용자번호 6자리(1~10) : 자동번호
		 * 당첨번호 = 당첨번호 7자리 6자리+1자리(보너스번호)(1~10)
		 * 
		 * 사용자 번호, 당첨번호를 랜덤으로 발생시켜
		 * 로또의 등수를 확인
		 * */
		//배열은 main에서 생성
				
		int lotto[] = new int [7]; //당첨번호
		int user[] = new int [6]; //사용자번호
		
		System.out.println(">> 당첨번호 (7자리) ");
		randomArray(lotto);
		PrintArray(lotto);		 
		System.out.println(">> 자동번호 (6자리) ");
		randomArray(user);
		PrintArray(user);
		
		int rank = lottoRank(lotto, user);
		if(rank==-1) {
			System.out.println(" 꽝 ~ !!");
		}else {
			System.out.println(rank+ "등 당첨~!!");
		}
				
		
		
	}
	/* 1. 번호를 랜덤으로 생성 기능. (랜덤번호 1개만 생성 후 리턴)
	 * 1~10범위의 랜덤번호 생성후 리턴
	 * 리턴타입 : int
	 * 매개변수 : x
	 * 메서드명 : random 
	 * */
	
	public static int random() {				
		return (int)(Math.random()*10)+1;
	}
	
	/* 2.랜덤 번호를 배열에 저장하는 기능.
	 * 리턴타입 : void
	 * 매개변수 : int arr[]
	 * 메서드명 : randomArray
	 * */
	
	public static void randomArray(int arr[]) {		
		// 중복 상관없이 배열 채우기
//		for(int i=0; i<arr.length; i++ ) {
//			//중복체크를 해서 이전에 담은 랜덤값이 중복되지 않았다면 채우기
//			arr[i]=random();
//		}
		
		
	//for문 채우기	
//		for(int i=0; i<arr.length; i++) {
//			int r= random();
//			if(isContain(arr, r)) {
//				arr[i] = r;
//			}else { //true면 넘어가니까 else로 전으로 돌려놓기
//				i--;
//			}
//			
//		}	
		
	//while문 채우기	
		int i=0;
		while(i<arr.length) {
			int r=random();
			if(!isContain(arr, r)) {
				arr[i] =r;
				i++;
			}
		}
		
	}
		

	
	/* 3. 정수 배열을 콘솔에 출력하는 기능.
	 * 리턴타입 : void
	 * 매개변수 : int arr[]
	 * 메서드명 : PrintArra
	 * */
	
	public static void PrintArray(int arr[]){
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");		
		}
		System.out.println();
	}		
	
	
	/* 4. 중복 제거
	 * 배열에 생성한 랜덤값이 있는지 체크(있으면 true, 없으면 false)
	 * 리턴타입 : boolean
	 * 매개변수 : int arr[],random
	 * 메서드명 : isContain
	 * */
	
	public static boolean isContain(int arr[], int random){
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	/* 5. 등수 체크하는 기능.
	 * 리턴타입 : int 등수 리턴
	 * 매개변수 : 당첨번호, 사용자번호 => int lotto[], int user[]
	 * 메서드명 : lottoRank
	 */
	public static int lottoRank(int lotto[], int user[]) {
		//lotto배열과 user 배열은 개수가 다름.
		//배열의 순서가 바뀌거나, 같은 배열을 넣었을 경우
		if(lotto.length <= user.length) {
			return-1;
		}
		
		int cnt =0; //당첨번호의 개수 카운트
		for(int i=0; i<user.length;i++) {
			//user : 1 2 3 4 5 6
			//lotto : 1 2 7 8 5 4   9
			if(isContain(user, lotto[i])) {
				cnt++; //보너스 번호 제외
			}
		}
		
		// switch문을 이용하여 랭크 결정
		switch(cnt) {
		case 6: return 1;
		case 5: 
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
//			return(isContain(user,lotto[lotto.length-1])? 2:3); 
		case 4: return 4;
		case 3: return 5;
			default :return -1;
						
		}
	}
	
	 /* - 당첨기준
	 * 6개일치 : 1등
	 * 5개 +보너스 -2등
	 * 5개 -3등
	 * 4개- 4등
	 * 3개 -5등
	 * 나머지 꽝
	 */	
}