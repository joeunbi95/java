package day14;

import java.util.Calendar;


public class Date01 {

	public static void main(String[] args) {
		/* 날짜시간 클래스
		 * Calendar 클래스 사용. => 추상 클래스
		 * 직접 객체는 생성 할 수 없음.
		 * new 연산자를 통해 객체 구현 X
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스컨스를 얻어 옴.
		 * 
		 * month : 0월 ~ 11월 +1
		 * week : 1=일 2=월 ...
		 * am_pm : am=0, pm=1
		 * 
		 * 
		 * */
		
//		Date d = new Date();
//		d.getDate(); //depercated 비권장
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year+"년");
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month+"월");
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day+"일");
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year+"년"+month+"월"+day+"일");
		
		//hour, minute, second
		
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(ampm);
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour+"시");
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute+"분");
		int second = now.get(Calendar.SECOND);
		System.out.println(second+"초");
		if(ampm==0) {
			System.out.print("AM ");
		}else {
			System.out.print("PM ");
		}
		System.out.println(hour+":"+minute+":"+second);
		
		
		//2023-02-17(금)
		//오후 2:42
		int year1 = now.get(Calendar.YEAR);	
		int month1 = now.get(Calendar.MONTH)+1;		
		int day1 = now.get(Calendar.DAY_OF_MONTH);		
		int day2 = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d-%02d-%d-%d",year1,month1,day1,day2);
		
		switch(day2) {
		case 1:System.out.println("(일)");break;
		case 2:System.out.println("(월)");break;
		case 3:System.out.println("(화)");break;
		case 4:System.out.println("(수)");break;
		case 5:System.out.println("(목)");break;
		case 6:System.out.println("(금)");break;
		case 7:System.out.println("(토)");break;	
		}
		
		int ampm1 = now.get(Calendar.AM_PM);		
		int hour1 = now.get(Calendar.HOUR);		
		int minute1 = now.get(Calendar.MINUTE);		
		int second1 = now.get(Calendar.SECOND);
		System.out.print(ampm1==0?"오전":"오후 ");		
		System.out.printf("%02d:%02d:%02d",hour1,minute1,second1);
		
		
		
		
		
		
		
		
		
		
	}

}
