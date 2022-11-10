package chapter02.ex01;

//2. Scanner 객체를 import (ctrl + shift + o)
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Scanner 사용법 : 이클립스에서 콘솔로 값을 인풋 받을 수 있다.
		// 콘솔로 값을 받아서 변수에 저장하고 값을 출력할수 있다. 
		
		// 1. 스케너 선언  
		// 객체 객체변수 = 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//3. 사용할 변수 선언 : 스캐너( 콘솔에서 인풋 받음 )로 인풋 받아서 저장, 변수 선언
		String name;      //이름 저장하는 변수 // sc.next(); 문자열
		int p1;                           // sc.nextint(); 정수           
		int p2;      
		int p3;
		int p4;
		int p5; 
		
		System.out.println("--------------------------------------");
		System.out.println("이름을 입력하세요 >>>");
		name = sc.next();        //문자열 받도록 하는것
		System.out.println("국어점수를 입력 하세요>>>");
		p1 = sc.nextInt();      //정수를 인풋 받음
		System.out.println("영어점수를 입력 하세요>>>");
		p2 = sc.nextInt();		//정수를 인풋 받음
		System.out.println("수학 점수를 입력하세요>>>");
		p3 = sc.nextInt();		//정수를 인풋 받음
		System.out.println("음악 점수를 입력 하세요>>>");
		p4 = sc.nextInt();		//정수를 인풋 받음
		System.out.println("과학 점수를 입력 하세요>>>");
		p5 = sc.nextInt();		//정수를 인풋 받음
		
		int sum ;          //합계 
		sum = p1+p2+p3+p4+p5;
		double avg;        //평균
		avg = sum/5.0;
		System.out.println("당신의 이름은 "+ name + "이고");
		System.out.println("점수의 합계는" + sum + "이고");
		System.out.println("평균은" + avg + "입니다.");
		
		
		
		
	}

}
