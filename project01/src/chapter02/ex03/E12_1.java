package chapter02.ex03;

import java.util.Scanner;

public class E12_1 {

	public static void main(String[] args) {
		// do while문으로 무한루프를 돌립니다.
				// 스캐너에서 정수1을 넣으면 평균 출력 2 합계출력 3이름 출력 4 프로그램 종료
				//1~4 이외의 번호를 넣으면 잘못된 입력입니다 1~4까지만 넣어주세요 
			do {
				System.out.println("------------------------------------------------");
				System.out.println("1. 평균 출력 | 2.합계 출력 | 3. 이름 출력 | 4.프로그램 종료");
				System.out.println("------------------------------------------------");
				int select;
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("위의 숫자를 입력하세요");
				select = sc.nextInt();
				
					
					if(select == 1) {
						System.out.println("국어 영어 수학 점수를 차례대로 입력하세요");
						int a= sc.nextInt();
						int b= sc.nextInt();
						int c= sc.nextInt();
						int sum = a+b+c;
						
						System.out.println("점수의 합계는"+ sum +"입니다");
						sum = a + b + c ;
						
					}else if(select == 2) {
						System.out.println("국어 영어 수학 점수를 차례대로 입력하세요");
						int a = sc.nextInt();
						int b = sc.nextInt();
						int c = sc.nextInt();
						double avg = a+ b+ c ;
						System.out.println("점수의 평균"+ avg +"입니다");
						
					}else if(select ==3) {
						String name;
						System.out.println("이름을 입력하세요");
						name = sc.next();
						System.out.println("당신의 이름은 "+ name +" 입니다");
						
					}else if(select == 4){
						System.out.println("프로그램을 종료합니다");
						break;
						
					}else {
						System.out.println("잘못된 입력입니다 1~4까지만 넣어주세요");
					}
					
					
			 }while(true);
				System.out.println("do while 뮨을 빠져나왔습니다");
	}

}
