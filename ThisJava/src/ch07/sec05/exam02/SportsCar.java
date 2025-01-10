package ch07.sec05.exam02;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//오버라이딩을 할 수 없음
	//이 예제는 Car 클래스의 stop() 메소드를 final로 선언했기 때문에 자식 클래스인 SportsCar에서
	//stop() 메소드를 오버라이딩 할 수 없음을 보여 준다.
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
