package day08;

public class 클래스02 {
	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : powerOn, PowerOff, speedUp+10, speedDown-10
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 = > getter/setter 필요
		 * */
		Car c=new Car();
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		
		System.out.println();
		
		c.setColor("blue");
		System.out.println(c.getColor());
		c.speedDown();
		c.speedUp();
		
		System.out.println();
		Car c2=new Car();
		System.out.println("----다른 자동차----");
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.isPower());
		c2.setColor("Green");
		c2.powerOn();
		c2.speedUp();
		c2.speedDown();
		
	}
}

class Car{
	//멤버변수 선언
	private String color="red";
	private boolean power;
	private int speed;
	
	//멤버메서드
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		power= true;	
	}	
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power= false;	
	}	
	public void speedUp() {	
		if(power) {
			speed =speed+10;	
			System.out.println("["+color+"]"+"속도 : "+speed);					
		}else{
			System.out.println("["+color+"]"+"시동을 먼저 켜주십시오.");
		}
	}
	public void speedDown() {
		if(speed<=0) {
			System.out.println("["+color+"]"+"속도 : 0");
		}else {
			speed =speed-10; 
			System.out.println("["+color+"]"+"속도 : "+ speed);
		}
		
	}
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}	


