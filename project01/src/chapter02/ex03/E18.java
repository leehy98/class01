package chapter02.ex03;

import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {
		//문제
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1.인풋값을 받아 방의 크기 지정 후 7의 배수,3의배수 저장후 출력                      |");
		System.out.println("2.인풋값을 받아 방의 크기 지정 후 1씩 증가하도록 값을 넣는데 4배수 제외 출력           |");
		System.out.println("3.인풋값을 받아 방의 크기 지정 후 3의 배수만 저장 하는데 그중6의 배수는 빼고 저장후 출력 |");
		System.out.println("4.프로그램 종료                                                           |");
		System.out.println("------------------------------------------------------------------------");
		Scanner sc =new Scanner(System.in);
		int select = sc.nextInt();
		do {
			if(select ==1) {
				System.out.println("방의 크기 지정");
				int a= sc.nextInt();
				int[] arr1 = new int [a];
				int[] arr2 = new int [a];
				for(int i =0; i< arr1.length;i++) {
					
				}
			}else if(select==2) {
				System.out.println("방의 크기 지정 후 1씩 증가 4의 배수 제외");
			}else if (select==3) {
				System.out.println("방의 크기 지정 후 3의 배수 출력 6의 배수 제외");
			}else if (select==4) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
