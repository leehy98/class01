package chapter02.ex02;

import java.util.Scanner;

public class E8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//같은 값을 가지고있는 case끼리 묶어 스케너로 인풋받는 값에따라 출력
		System.out.println("일수를 알고싶은 월의 숫자를 입력하세요");
		int month = input.nextInt();
		int day ;
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 0;
				System.out.println("존재하지 않는 달 입니다");
			
		}
		System.out.println(month + "월은" + day + "일입니다");
	}

}
