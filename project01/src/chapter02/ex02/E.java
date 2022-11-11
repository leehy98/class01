package chapter02.ex02;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		//스캐너 등록 어머니 성함 아버지 성함 형제 이름 내이름 
		//           나이      나이    나이     나이
		//            평균값 합계 출력
		
		Scanner sc = new Scanner(System.in);
		String name1;
		String name2;
		String name3;
		String name4;
		
		int p1;
		int p2;
		int p3;
		int p4;
		
		
		System.out.println("아버지의 성함");
		name1 = sc.next();
		System.out.println("어머니의 성함");
		name2 = sc.next();
		System.out.println("나의 이름");
		name3 = sc.next();
		System.out.println("동생의 이름");
		name4 = sc.next(); 
		System.out.println("아버지의 나이");
		p1 = sc.nextInt();
		System.out.println("어머니의 나이");
		p2 = sc.nextInt();
		System.out.println("나의 나이");
		p3 = sc.nextInt();
		System.out.println("동생의 나이");
		p4 = sc.nextInt();
		
		
		int sum;
		sum = p1+p2+p3+p4 ; 
		double avg; 
		avg = sum/4.0;
		
		System.out.println("아버지의 성함은" + name1 + "이고");
		System.out.println("어머니의 성함은" + name2 + "이고");
		System.out.println("나의 이름은" + name3 + "이고");
		System.out.println("동생의 이름은" + name4 + "입니다");
		System.out.println("나이의 합계는" + sum + "이고");
		System.out.println("나이의 평균은" + avg + "입니다" );
		
		
		
	}	

}
