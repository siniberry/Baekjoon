/*
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     	4 7 2 ..........(1)
 	  * 3 8 5 ..........(2)
------------------------
   	  2 3 6 0 ..........(3)  
 	3 7 7 6   ..........(4)  
  1 4 1 6     ..........(5)
------------------------
  1 8 1 7 2 0 ..........(6) 


(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

-- 처음 내 생각
입력받은 수 중 (2)번의 각 자리 수 별로 빼서 가지고 와야함
그리고 곱한 값 출력해야함

-- 풀이 방법
b%10 , b%100 이런 식으로 나머지를 a랑 곱해줌
 */

package Level1;

import java.util.Scanner;

public class level13 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c = ( b % 10) * a;
		int d = ( b % 100)/10 * a;
		int e = ( b / 100) * a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a * b);
		
		
	}
}
