A 클래스를 보면 protected로 선언된 필드, 생성자, 메소드가 있다.<br>
B 클래스는 A 클래스와 동일한 패키지에 있기 때문에 A의 protected 필드, 생성자, 메소드에 접근이 가능하다.<br>
C 클래스는 A 클래스와 다른 패키지에 있기 때문에 A의 protected 필드, 생성자, 메소드에 접근할 수 없다.<br>
D 클래스는 A 클래스와 다른 패키지에 있지만 A의 자식 클래스이므로 A의 protected 필드, 생성자, 메소드에 접근이 가능하다.<br>
단 new 연산자를 사용해서 생성자를 직접 호출할 수는 없고,<br>
자식 생성자에서 super()로 A 생성자를 호출할 수 있다.