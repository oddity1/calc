package calc;

public class Test {
	// 매소드
	public void method() {

		System.out.println("나는 method");

	}

//매소드 이름은 같지만 매개변수로 구분할 수 있기에 오류가 나지 않음
	public void method(int number) {

		System.out.println("나는 숫자를 받을 수 있는 method");

	}

	public void method(String str) {

		System.out.println("나는 문자열을 받을 수 있는 method");

	}

}
