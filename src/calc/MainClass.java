package calc;

import java.util.Scanner;

import LSH.util.Util;

public class MainClass {

	public static void main(String[] args) {
		
		
//계산기 4.0
		
		
		

// 계산기 3.0
		
		System.out.println("계산기 프로그램");
		System.out.println("오늘날짜");
		System.out.println(Util.getCurrentDate("yyyyMMdd"));

		Calc3 cc3 = new Calc3();
		// 입력
		cc3.inputNum();
		cc3.inputOp();
		// 출력
		cc3.printResult();

	}
}


// 계산기 2.0
//				System.out.println("계산기 프로그램");
//				System.out.println("오늘날짜");
//				System.out.println(Util.getCurrentDate("yyyyMMdd"));
//				// 두개의 정수 입력받기
//
//				// 계산기 클래스를 선언(객체생성, 인스턴스 생성)
//				Calc2 cc2 = new Calc2();
//				do {
//				// 두개의 숫자를 입력하시오
//				System.out.println("두개의 숫자를 입력하시오.");
//				cc2.inputNumber();
//				// 연산자를 입력하시오
//				System.out.println("연산자를 입력하시오.");
//				cc2.inputOper();
//				} while (cc2.checkNum()); 
//				// 결과
//				cc2.printResult();
//
//			}
//
//		} 
//		


// 계산기 1.0
// 두개의 정수
//		int num1 = 10;
//		int num2 = 2;
//
//		int cash = 1000000;
//
//		int result = 0;
//
//		Calc cc = new Calc();
//
//		// 더하기
//		result = cc.add(num1, num2);
//		System.out.println("두수의 더하기: " + result);
//
//		// 빼기
//		result = cc.sub(num1, num2);
//		System.out.println("두수의 빼기: " + result);
//
//		// 곱하기
//		result = cc.mul(num1, num2);
//		System.out.println("두수의 곱기: " + result);
//
//		// 나누기
//		result = cc.div(num1, num2);
//		System.out.println("두수의 나누기: " + result);
//


// 돈 복사
//
//		int ans;
//		System.out.println("저는 당신의 돈을 3배로 만들어 드립니다.");
//		System.out.println("하지만 그 돈은 당신이 알지 못하는 누군가의 계좌로부터 오는 돈 입니다.");
//		System.out.println("그래도 진행하시고 싶다면 '1', 진행을 원하지 않는다면 '2'를 입력해주세요");
//		Scanner sc = new Scanner(System.in);
//		ans = sc.nextInt();
//
//		if (ans == 1) {
//			result = cc.cheat(cash);
//			System.out.println("당신의 돈은 3배가 되어 " + String.format("%,d", result) + "원이 되었습니다.");
//			System.out.println(
//					"하지만 오늘도 열심히 일한 누군가의 계좌에서 " + String.format("%,d", result - cash) + "원이 아무도 모르게 증발했겠군요...");
//		}
//		if (ans == 2) {
//			System.out.println("양심을 지킨 당신에게 선물을 드리겠습니다");
//			result = cc.cheat2(cash);
//			System.out.println(
//					"당신의 돈은 10배가 되어 " + String.format("%,d", result) + "원이 되었습니다. 걱정마십시오. 이 이익금은 제가 드리는 것 입니다.");
//		}
//
//
//	}
//
//}