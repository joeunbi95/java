package day18;

class Bank{
	//계좌의 돈
	private int money = 10000;
	
	//입금
	public synchronized void saveMoney(int save) {
		int m = this.money;
		
		try {
			Thread.sleep(3000); // 3초 기다리는 명령어
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		setMoney(m + save);
	}

	//출금
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		
		try {
			Thread.sleep(200); //0.2초 기다리는 명려ㅛㅇ어
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m-minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}	
	
}

class Hong extends Thread{
	
	public void run() { //입금
		System.out.println("입금중 >>");
		SyncMain.myBank.saveMoney(3000); //3000원 입금
		System.out.println("입금완료 >> "+SyncMain.myBank.getMoney());
	}
}

class HongWife extends Thread{

	public void run() { //출금
		System.out.println("출금중 >>");
		SyncMain.myBank.minusMoney(1000); //1000원 출금
		System.out.println("출금완료 >> "+SyncMain.myBank.getMoney());
	}
	
}

public class SyncMain {

	public static Bank myBank = new Bank();  // 공유(static)영역 설정
	
	public static void main(String[] args) {
		// 시간 순서대로 출력하게됨 
		Hong h = new  Hong();
		h.start();
		
		HongWife hw = new HongWife();
		hw.start();
	 
	}

}
