package chapter02.ex03;

import java.util.Arrays;

public class E16 {

	public static void main(String[] args) {
		//배열변수 : arr1  배열의 방 갯수 500개  
		//배열방에 3의 배수와 5의 배수를 저장 
		//출력 : for ,Enhanced for Arrays.toString() 를 사용해 출력 
		int idx =0;
		int []arr1 = new int [500];
		for(int a=0; a<3000; a++) {
			if(a%3==0||a%5==0) {
				arr1[idx]=a;
				idx++;
				
			}
			System.out.println();
		}
	}

	
}
