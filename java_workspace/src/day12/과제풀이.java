package day12;

public class 과제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv1 t = new Tv1();
		t.trunOn();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		
	}

}
interface Remocon1{
	void trunOn();
	void trunOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class Tv1 implements Remocon1{
	private boolean power;
	private int ch;
	private int vol;
	
	
	@Override
	public void trunOn() {
		System.out.println("전원이 켜졌습니다.");
		power=true;
	}

	@Override
	public void trunOff() {
		System.out.println("전원이 꺼졌습니다.");
		power=false;
	}

	@Override
	public void channelUp() {
		if(power) {
			ch++;
			if(ch>10) {
				ch=0;
			}
			System.out.println("채널 : "+ch+"번");
		}else {
			System.out.println("전원을 먼저 켜주세요.");
		}
		
	}

	@Override
	public void channelDown() {
		if(power) {
			ch--;
			if(ch<0) {
				ch=0;
			}
			System.out.println("채널 : "+ch+"법");
			
		}else {
			System.out.println("전원을 먼저 켜주세요.");
		}
		
	}

	@Override
	public void volUp() {
		if(power) {
			vol++;
			if(vol>20) {
				vol=20;
				System.out.println("볼륨이 최대입니다.");
			}
			System.out.println("볼륨 : "+vol);
		}else {
			System.out.println("전원을 먼저 켜주세요.");
		}
		
	}

	@Override
	public void volDown() {
		if(power) {
			vol--;
			if(vol<0) {
				System.out.println("음소거");
			}
			System.out.println("볼륨 : "+vol);
		}else {
			System.out.println("전원을 먼저 켜주세요.");
		}
	}
	
}