package Example;

class Exception2 {
	public static void main(String args[]) {
      try {
         Exception e = new Exception("고의로 발생시킴");
         throw e; // 예외를 발생시킴
         // throw new Exception("고의로 발생시킴"); --> 위에 두줄을 한줄로 표현

      	} catch (Exception e){
          System.out.println("예외메세지 : " + e.getMessage());
          e.printStackTrace();
      	}
      	System.out.println("프로그램이 정상 종료되었음." );
	}
}