package day12;

public class Exception05 {

	public static void main(String[] args) {
		int arr[]=null;
		int max = 10, nim = 1, size = 5;
		
		Exception05 ex05 = new Exception05();
		
		try {
			
			int arr1[]=ex05.Index(size, max, size);
			ex05.randomIndex(arr1, max, size);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//메서드 생성
	/* 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 배열을 돌려주는 메서드
	 * 값은 random으로 반환 => random의 범위는 max, mind으로 받아 처리
	 * - size가 0보다 작다면 예외발생 
	 * - max가 0보다 작다면 예외발생
	 * */
	
	public int[] Index(int size, int max, int min) {
		
		if(size <= 0) {
			throw new RuntimeException("size는 0이될 수 없습니다.");
		}		
		if(max <= 0) {
			throw new RuntimeException("max는 0이될 수 없습니다.");
		}	
		
		int arr[] = new int [size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+min;
		}
		return arr;
	}
	
	/* 배열을 받아서 배열에 랜덤값을 채우는 메서드
	 * 
	 * - 배열이 null일경우
	 * - 배열의 길이가 0보다 작을 경우
	 * */
	public void randomIndex(int arr[],int max, int min) {
		if(arr == null) {
			throw new RuntimeException("배열의 길이는 0이될 수 없습니다.");
		}
		if(arr.length==0) {
			throw new RuntimeException("배열의 길이는 0이될 수 없습니다.");
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*(max-min+1))+min;
		}		
	}
}
