package chapter02.ex02;

import java.util.Scanner;

public class E6 {

	public static void main(String[] args) {
		
		
		//스캐너에서 번호를 인풋받아서 아래 내용을 작동 시키는 프로그램 작성 
		//if 
		Scanner input = new Scanner(System.in);
		int select;//번호 선택
		int kor;//과목
		int eng;
		int math;
		int a; //홀짝
		String aName; //이름 식별 
		String bName;
		aName = "이희연"; 
		bName = "이희연";
		
		System.out.println("---------------------------------------");
		System.out.println("1.학점의 합계/평균 | 2.홀수/짝수 | 3.같은이름 식별");
		System.out.println("---------------------------------------");
		System.out.println("위의 번호를 선택하세요>>>>");
		select = input.nextInt();
		
		
		if (select==1) {
			System.out.println("국어점수");
			kor = input.nextInt();
			System.out.println("영어점수");
			eng = input.nextInt();
			System.out.println("수학점수");
			math = input.nextInt();
			
			int sum;
			sum = kor + eng + math ;
			double avg;
			avg = sum/3.0;
			System.out.println("점수의 합계는" + sum );
			System.out.println("점수의 평균은" + avg );
			
			
		}else if(select == 2) {
			System.out.println("정수를 입력하세요");
			int number = input.nextInt();
			System.out.println(number);
			
			if (number % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			
		}else if(select == 3) {
			System.out.println("이름2개를 입력하세요");
			aName =input.next();
			bName =input.next();
			if (aName.equals(bName)) { //참조변수 이므로 equals() 사용하여 값비교 
				System.out.println("같은 이름입니다");
			}else {
				System.out.println("다른 이름입니다");
			}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
