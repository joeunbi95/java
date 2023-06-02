package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * / % 를 작성하여 출력
		 * 두 수를 입력받아서 연산. 연산자를 입력받아 메서드를 활용하여 연산
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("계산기");
		System.out.println("연산자를 입력해 주세요.(+, -, *, /, %)");
		char ch = scan.next().charAt(0);
		System.out.println("두 수를 입력해 주세요.");
		int num = scan.nextInt();
		int num2 = scan.nextInt();		
		//다른 클래스 메서드 사용법
		Method02 m2=new Method02();
		System.out.println("Method2에서 만든 메서드");
		m2.sumPrint(num, num2);
		
		switch(ch){
			case '+':
				System.out.println(num+"+"+num2+"="+sum(num, num2));
				break;				
			case '-':
				System.out.println(num+"-"+num2+"="+sum2(num, num2));
				break;	
			case '*':
				System.out.println(num+"*"+num2+"="+sum3(num, num2));
				break;
			case '/':
				System.out.println(num+"/"+num2+"="+sum4(num, num2));
				break;
			case '%':
				double[]arr =rem(num, num2);
				System.out.println("/의 결과 : "+ arr[0]);
				System.out.println("/의 결과 : "+ arr[1]);
				break;
				//리턴을 배열로 리턴: 몫, 나머지 double로 리턴
			default :
				System.out.println("잘못된 연산자를 입력하셨습니다.");
		}
		System.out.println("계산기 종료.");
		
		scan.close();

	}	
	
	public static int sum(int num1, int num2){
		return num1+num2;
	}
	public static int sum2(int num1, int num2){
		return num1-num2;
	}
	public static int sum3(int num1, int num2){
		return num1*num2;
	}
	public static int sum4(int num1, int num2){
		return num1/num2;
	}
	/* 기능 : 두 정수를 입력받아 두정수를 나눈 몫과 나머지를 double[]배열로 리턴
	 * 리턴타입 : double[]
	 * 매개변수 : int num1, int num2
	 * 변수명 :rem
	 * */
	 
	public static double[] rem(double num1, double num2){
		double res[]=new double[2];
		res[0] = (double)num1 / num2;
		res[1] = num1%num2;
		return res;
	}
		
}	
