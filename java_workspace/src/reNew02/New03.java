package reNew02;

public class New03 {

	public static void main(String[] args) {
		// car 객체 생성 후 전원켜기, 스피드 올리기, 차 정보출력(2개 생성)
		Car c = new Car("red", 2);
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		
		System.out.println(c);
			
		Car c2 = new Car();
		c2.setColor("green");
		c2.setDoor(4);
		
		c2.toString();
	}

}

class Car{
	boolean Power = false;
	int Speed = 0;
	int door = 0;
	String color = null;
	
	public Car() {}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
	public void powerOn() {
		System.out.println("자동차의 시동이 켜졌습니다.");
		Speed = 0;
		Power = true;
	}
	
	public void powerOff() {
		System.out.println("자동차의 시동이 꺼졌습니다.");
		Speed = 0;
		Power = false;
	}
	
	public void speedUp() {
		if(Speed>=0) {
			Speed += 10;
			System.out.println("속도 : "+Speed);
		}else {
			System.out.println("시동이 꺼져있습니다.");
			Speed = 0;
		}
	}
	
	public void speedDown() {
		if(Speed>0) {
			Speed -= 10;
			System.out.println("속도 : "+Speed);
		}else {
			System.out.println("시동이 꺼져있습니다.");
			Speed = 0;
		}
	}
	
	public void printCarinfo() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "Car [Power=" + Power + ", Speed=" + Speed+", door"+door +", color=" + color +"]";
	}

	public boolean isPower() {
		return Power;
	}

	public void setPower(boolean power) {
		Power = power;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
