package day12;

public class 과제 {

	public static void main(String[] args) {
		/* TV의 채널은 0~10까지 있음. 10=>0 순환
		 * vol 0~20까지 있음. 0이 되면 음소거라고 출력
		 * vol은 0이하로 내려가지 않음. 20이상 올라가지 않음.
		 * 
		 * */
				
		Tv t = new Tv();
		t.trunOn();
		t.volUp();
		t.volDown();
		t.volDown();
	}

}
interface Remocon{
	void trunOn();
	void trunOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class Tv implements Remocon{
	boolean power;
	int ch = 0;
	int vol =0;

	@Override
	public void trunOn() {
		System.out.println("전원이 켜졌습니다.");
		power = true;
	}

	@Override
	public void trunOff() {
		System.out.println("전원이 꺼졌습니다.");
		power = false;
		
	}

	@Override
	public void channelUp() {
		if(power) {	
			if(ch>=0 && ch<10) {
				ch++;
				System.out.println("채널 : "+ch);	
			}else if(ch>=10) {
				ch=0;
				System.out.println("채널 : "+ch);
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	@Override
	public void channelDown() {
		if(power) {
			if(ch>0 && ch<=10) {				
				ch--;
				System.out.println("채널 : "+ch);				
			}else if(ch<=0) {
				ch=10;
				System.out.println("채널 : "+ch);
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		
	}

	@Override
	public void volUp() {
		if(power) {	
			if(vol>=0 && vol<20) {
				vol++;
				System.out.println("볼륨 : "+vol);	
			}else if(ch>=20) {
				vol=20;
				System.out.println("볼륨 : "+vol);
			}
		}		
		else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	@Override
	public void volDown() {
		if(power) {
			if(vol>0 && vol<=20) {				
				vol--;
				System.out.println("볼륨 : "+vol);				
			}else if(vol<=0) {
				vol=0;
				System.out.println("음소거");
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
}
