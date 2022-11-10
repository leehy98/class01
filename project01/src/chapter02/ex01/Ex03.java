package chapter02.ex01;

public class Ex03 {

	public static void main(String[] args) {
		//같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산 
		int value1 = 3+5 ; //5 
		int value2 = 8/5 ; //1 int/int = int 
		 
		System.out.println(value1); 
		System.out.println(value2); 
		
		float data1 = 3.0f + 5.0f ; 
		System.out.println(data1); //8.0
		
		double data2 = 8.0/5.0 ; 
		System.out.println(data2); //1.6
		
		double data3 = 8/5 ;         //1 int/int = int
		System.out.println(data3); //1.0 
		
		double data4 = 8/5.0 ;
		System.out.println(data4); //정수8(int)가 double형으로 업캐스팅되어 연산됨 
		
		//warning : 평균을 계산할때 double로 계산해야한다 
		
		System.out.println("---------------------------------------------");
		 //다른 자료형 간의 연산 ( 작은 자료형은 높은 자료형으로 업캐스팅이 되며 연산 )
		
		int data5 = (int)5 + (int)3.5 ;  // int data = 5 + 3.5 ! 오류발생 !
		System.out.println(data5); //8 
		
		double data6 = 5 +3.5 ;  // 5.0 + 3.5 업캐스팅 연산 
		System.out.println(data6); //8.5
		
		int data7 = 5 + (int) 3.5; // 8  int + int
		
		int data8 = (int) (5 + 3.5); //8 (int + double)
		
		double data9 = 5/5.2 ; //정수 5가 double로 업캐스팅  
		System.out.println(data9);
		
		double data10 = 5/2 ; 
		System.out.println(data10);  //2.0
		
		
		System.out.println("------------------------------------");
		
		int data11 = 50; 
		double data12 = 33.14;
		
		System.out.println(data11 + data12); //data11 --> double로 업캐스팅 (자동)
		System.out.println(data11/data12);   //data11 --> double로 업캐스팅 (자동)
		System.out.println(data11 /(int)data12);// data12 --> int 다운캐스팅 (수동)
		
		//문제 
		//국어 : 90 수학 88 영어 77 음악 90 과학 99
		// 각 과목점수를 정수형 변수에 만들어서 저장후 합계(sum) 평균(avg) 값을 출력
		System.out.println("-----------------------------------");
		int p1 =90;
		int p2 =88;
		int p3 =77;	
		int p4 =90;
		int p5 =99; 
		
		double sum = p1+p2+p3+p4+p5 ;
		double avg = sum/5 ;
		System.out.println("합계는 "+avg);		
		System.out.println("평균은 "+sum);
		
		
		
		
		
		
		
		
		
	}

}
