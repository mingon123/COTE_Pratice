package programmers.days0205;

import java.util.Scanner;

/*

 문제 설명
자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 */
public class Lv0_9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if((n % 2) == 1) {
        	System.out.printf("%d is odd ", n);
        }
        else
        {
        	System.out.printf("%d is even ", n);
        }
    }
}
