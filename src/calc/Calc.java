package calc;

/*
 * 사칙 연산 클래스
 */
public class Calc {

	// 더하기 메소드
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	// 빼기 메소드
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	// 곱하기 메소드
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	// 나누기 메소드
	public int div(int num1, int num2) {
		return num1 / num2;
	}

	// 돈 복사기 메소드(3배 뻥튀기)
	public int cheat(int cash) {
		return cash * 3;
	}

	public int cheat2(int cash) {
		return cash * 10;
	}
}
