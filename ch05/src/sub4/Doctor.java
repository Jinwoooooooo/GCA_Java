package sub4;

public class Doctor extends Person {

	private String specialty;
	
	public Doctor(String name, int age, String specialty) {
		super(name, age);
		this.specialty = specialty;
	}
	
	public void work() {
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "세 입니다.");
		System.out.println("저는 의사이며 전공은 " + specialty + "입니다.");
	}
	
}
