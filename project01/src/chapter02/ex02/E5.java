package chapter02.ex02;

import java.util.Scanner;

public class E5 {

	public static void main(String[] args) {
		// if 문을 사용해서
		// 스캐너를 사용해서 가지고있는 돈을 입금 받습니다.
		// 0 ~ 3000 : 걸어서 다닌다 
		// 3000 ~ 30000 : 지하철 타고 다닌다
		// 30000 ~ 100000 : 택시를 탄다
		// 100000 ~ : 비행기를 탄다
		System.out.println("돈을 입급해주세요");
		Scanner input = new Scanner(System.in);
		int number ;
		number = input.nextInt();
		if (number >=0 && number <3000 ) {
			System.out.println("걸어서간다");
			
		}else if (number >=3000 && number <30000) {
			System.out.println("지하철을 타고 간다");
			
		}else if (number >=30000 && number< 100000) {
			System.out.println("택시를 탄다");
			
		}else {
			System.out.println("비행기를 탄다");
		}
		
	}

}
