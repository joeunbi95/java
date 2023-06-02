package 시험;

public class For_조은비 {

	public static void main(String[] args) {
		int[][] a = {{10,20,30},{20,30,15},{100,110,120}};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				sum += a[i][j];
			}			
		}
		System.out.println("총 합:"+sum);
		

	}

}
