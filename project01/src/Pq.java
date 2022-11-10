
public class Pq {

	public static void main(String[] args) {
		
		boolean  bool1 = true;  	
		boolean  bool2; 
		bool2 = false; 	
		System.out.println(bool1); // ture
		System.out.println(bool2); // false
		
		
		//유니코드로 저장하는 법 : 전 세계의 글자를 3byte 로 저장 
		
		char value2 = '\u0041'; //A 
		char value3 = '\uac00'; //가
		char value4 = '\u0033'; //3
		
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
		// 문제 자신의 이름의 유니코드를 찾아서 변수에 할당
	    char value5 = '\uc774';
	    char value6 = '\ud76c';
	    char value7 = '\uc5f0';
	    
	    System.out.print(value5);
	    System.out.print(value6);
	    System.out.print(value7);
	    
	    
	    double value9 = 1.12345678910111213; 
		System.out.println(value9);
		
	    
	    //문자열 (string ) : 여러 글자를 담을수 있다 .
	    	// 기본바료헝이 아니다. 참조 자료형 (객체)
	    // 변수의 값을 할당하는 	
           String value8 = "반갑습니다 ";
	    
	    
	    System.out.println(value8);
	    
	    
	}	

}
