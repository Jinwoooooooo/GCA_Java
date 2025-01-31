package entity;

public class Customer {
	private String custId;
	private String name;
	private String hp;
	private String addr;
	private String rdate;
	
	public Customer(String custId, String name, String hp, String addr, String rdate) {
		this.custId = custId;
		this.name = name;
		this.hp = hp;
		this.addr = addr;
		this.rdate = rdate;
	}
	
	public Customer(String custId, String name, String hp, String addr) {
		this.custId = custId;
		this.name = name;
		this.hp = hp;
		this.addr = addr;
	}
	
	public Customer() {}
	

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
	public void showCustomer() {
		System.out.println("------------------------");
		System.out.println("| 회원번호 : " + custId + "\n| 이름 : " + name + "\n| 휴대전화 : " + hp + "\n| 주소 : " + addr + "\n| 가입일자 : " + rdate);
		System.out.println("------------------------");
	}
	
	@Override
	public String toString() {
		return "| 회원번호 : " + custId + "\n| 이름 : " + name + "\n| 휴대전화 : " + hp + "\n| 주소 : " + addr + "\n| 가입일자 : " + rdate;
	}
}
