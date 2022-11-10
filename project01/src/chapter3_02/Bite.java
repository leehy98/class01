package chapter3_02;

public class Bite {

	public static void main(String[] args) {
		// 다양한 진법 표현과 비트연산자
		//1. 자바 코드를 사용해서 진법 변환 (10진수, 16진수 8진수, 2진수)
		int data = 13;
		System.out.println(Integer.toBinaryString(data)); //2진수로 변환 1101
		System.out.println(Integer.toOctalString(data)); //8진수로 변환 15
		System.out.println(Integer.toHexString(data)); //16진수로 변환 d
		System.out.println("-------------------------------------------");
		
		//2. 2진수 8진수 16진수 ---? 10진수로 변환
		System.out.println(Integer.parseInt("1101", 2));  //2진수를 10진수로  13
		System.out.println(Integer.parseInt("15", 8));	  //8진수 10진수로	 13 
		System.out.println(Integer.parseInt("d", 16));	  //16진수 10진수로	 13
		
		System.out.println("------------------------------------");
		//3. 다양한 진법 표현 (0b : 2진수, 0 : 8진수, 0x : 16진수 )
		System.out.println(0b1101); 	//13
		System.out.println(015);		//13
		System.out.println(0xd);		//13
		
		System.out.println("----------------------");
		
		//4. 비트 연산자 (AND) : 모두 2진법으로 변환해서 각 비트를 연산 
				//4-1. AND   (&)
					// 0 & 0 = 0, 1 & 0 = 0, 0 & 1 = 0, 1 & 1= 2
				System.out.println(3 & 10); //2
				System.out.println(0b0011 & 0b1010); //2
				System.out.println(0x03 & 0x0A);	 //2
				System.out.println("----------------------");
				
				//4-2. OR (|)
					//0 | 0 = 0, 1 | 0 = 1, 0 | 1 = 1= , 1 | 1 = 1
				System.out.println(3 | 10); //11
				
				//4-3. XOR (^)  : 앞뒤 값이 다를땐 1 같을떈 0
				System.out.println(3^10); //9 
				
				//4-4. NOT (~)
				System.out.println(~3);   //-4
				System.out.println(~10);  //-11
				System.out.println(~11);  //-12
				System.out.println(~1);   //-2
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
