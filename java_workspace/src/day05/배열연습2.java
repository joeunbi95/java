package day05;

public class 배열연습2 {

	public static void main(String[] args) {
		/* 5개 값을 가지는 배열을 생성 후
		 * 1~50사이의 랜덤값을 저장 후 출력
		 * */

		int arr[]=new int[6];		
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<arr.length; j++) {				
				if(arr[i]<arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;					
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("향상된 for문 >>");
		//향상된 for문
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		
	}

}
