package 과제;
public class 과제2 {
	public static void main(String[] args) {
		// 자동차 클래스 구현.  
		//Car  interface 와  SamSung 클래스를 구현 / 상속하여  SamSungCar  클래스를 완성하시오.
		//SamSungCarMain 클래스에서 객체생성 후 출력해보기.
		SamSungCar sc = new SamSungCar();
		
		sc.PowerOn();
		sc.wipersOn();
		sc.wipersOff();
		sc.speedUp();
		sc.speedDown();
		sc.speedDown();
		sc.PowerOff();
		sc.wipersOn();
		sc.wipersOff();
		sc.speedUp();
		sc.speedDown();
	}
	
}
class SamSung{
		
	protected String logo = "SamSung";
		
}
interface Car{
	    void PowerOn();  //시동켜기
	    void PowerOff(); //시동끄기
	    void speedUp(); 
	    void speedDown();
	    void wipersOn();  //와이퍼켜기
	    void wipersOff();  //와이퍼끄기
	}
class SamSungCar extends SamSung implements Car{
	
	private boolean power;
	private int speed;
	@Override
	public void PowerOn() {
		System.out.println(logo+"의 시동이 켜졌습니다.");
		power=true;
	}
	@Override
	public void PowerOff() {
		System.out.println(logo+"의 시동이 꺼졌습니다.");
		power=false;
	}	
	@Override
	public void speedUp() {
		if(power) {
			speed+=10;
			System.out.println(logo+" 속도 : "+speed);
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
		
	}
	@Override
	public void speedDown() {
		if(power) {
			if(speed<=0) {
				System.out.println(logo +" 속도 : " + 0);
			}else {
				speed-=10;
				System.out.println(logo+" 속도 : "+speed);
			}
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
		
	}
	@Override
	public void wipersOn() {
		if(power) {
			System.out.println("와이퍼가 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
		
	}
	@Override
	public void wipersOff() {
		if(power) {
			System.out.println("와이퍼가 꺼졌습니다.");
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
		
	}
	
}
