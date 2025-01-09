package sub4;

//Account 클래스 정의(설계)
public class Account {
	
	//속성(필드, 멤버 변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
	protected String bank;
	protected String id;
	protected String name;
	protected int balance;
	
	//생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환타입이 없는 메서드
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("---------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("예금주 : " + this.name);
		System.out.println("현재 잔액 : " + this.balance + "원");
		System.out.println("---------------------");
	}
	
	
	//Getter, Setter 정의(옵션) - 캡술화된 속성을 수정하기 위한 메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
}
