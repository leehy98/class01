package chapter02.ex02;

import java.util.Scanner;

public class E3_1 {

	public static void main(String[] args) {
		//문제 스캐너로 정수값을 인풋받고 인풋받은 정수값이 홀수이면 "홀수" 짝수이면 "짝수"
		
		Scanner input = new Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		int number = input.nextInt();
		System.out.println(number);
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
	}

}
