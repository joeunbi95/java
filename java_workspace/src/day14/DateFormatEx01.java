package day14;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜를 문자열로 format 설정
		 * */
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		SimpleDateFormat fds = new SimpleDateFormat("a hh:mm:ss");
//		System.out.println(date); //국제표식
		String dateString = sdf.format(date);
		String dateString1 = fds.format(date);
		System.out.println(dateString);
		System.out.println(dateString1);
		
		//문자열을 날짜로
		String dateStr = sc.next();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = sdf1.parse(dateStr);
		System.out.println(date2);
	}

}
