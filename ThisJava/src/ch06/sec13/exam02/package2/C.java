package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class C {

	//필드 선언
	A a1 = new A(true);		//다른 패키지여도 public 접근 제한이기 때문에 접근 가능
  //A a2 = new A(1);		//default 생성자 접근 불가(컴파일 에러)
  //A a3 = new A("문자열");	//private 생성자 접근 불가(컴파일 에러)
}
