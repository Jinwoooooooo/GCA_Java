package ch07.sec11;

public class SealedExample {
	public static void main(String[] args) {
		
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}
}

/*
 기본적으로 final 클래스를 제외한 모든 클래스는 부모 클래스가 될 수 있다.
 그러나 Java 15부터는 무분별한 자식 클래스 생성을 방지하기 위해 봉인된(sealed) 클래스가 도입되었다.
 다음과 같이 Person의 자식 클래스는 Employee와 Manager만 가능하고,
 그 이외는 자식 클래스가 될 수 없도록 Person을 봉인된 클래스로 선언할 수 있다.

 sealed 키워드를  사용하면 permits 키워드 뒤에 상속 가능한 자식 클래스르 지정해야 한다.
 봉인된 Person 클래스를 상속하는 Employee와 Manager는 final 또는 non-sealed 키워드로 다음과 같이 선언하거나,
 sealed 키워드를 사용해서 또 다른 봉인 클래스로 선언해야 한다.
 
 final은 더 이상 상속할 수 없다는 뜻이고, non-sealed는 봉인을 해제한다는 뜻이다.
 따라서 Employee는 더 이상 자식 클래스를 만들 수 없지만 Manager는 다음과 같이 자식 클래스를 만들 수 있다.
*/ 