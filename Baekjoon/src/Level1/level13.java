/*
(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
     	4 7 2 ..........(1)
 	  * 3 8 5 ..........(2)
------------------------
   	  2 3 6 0 ..........(3)  
 	3 7 7 6   ..........(4)  
  1 4 1 6     ..........(5)
------------------------
  1 8 1 7 2 0 ..........(6) 


(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
(3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

-- ó�� �� ����
�Է¹��� �� �� (2)���� �� �ڸ� �� ���� ���� ������ �;���
�׸��� ���� �� ����ؾ���

-- Ǯ�� ���
b%10 , b%100 �̷� ������ �������� a�� ������
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
