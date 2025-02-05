package programmers.days0205;

import java.util.Scanner;

/*
 
 문제 설명
문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

abcde

a
b
c
d
e
 */
public class Lv0_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char b;
		for(int i = 0; i < s.length(); i++) {
			b = s.charAt(i);
			System.out.println(b);
			
		}
		
	}
}
