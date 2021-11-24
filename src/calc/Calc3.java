package calc;

import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;

public class Calc3 {
	
	//변수 선언
	NumDto nDto = new NumDto();
	OpDto oDto = new OpDto();
	
	//메소드
	
	//숫자 입력
	public void inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력: ");
		nDto.setNum1(sc.nextInt());
		System.out.println("두번째 수를 입력: ");
		nDto.setNum2(sc.nextInt());
	}
	
	//연산자
	public void inputOp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산자를 입력: ");
		oDto.setOp(sc.next());	
	}
	
	
	
	// 결과출력
	public void printResult() {
		System.out.print(nDto.getNum1() + " ");
		System.out.print(oDto.getOp() + " ");
		System.out.print(nDto.getNum2() + " = ");
		
		if (oDto.getOp().equals("+")) {
				System.out.println(plus());
	}
	}
	
	
	// 더하기 메소드
	public int plus() {
		return nDto.getNum1() + nDto.getNum2();
		
		
	}
	
	
	
	
	
	
	
	
}
