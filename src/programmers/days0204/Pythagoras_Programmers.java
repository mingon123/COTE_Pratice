package programmers.days0204;
import java.util.Scanner;
// 2025/02/04
/*
 * 직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.

직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
 */

public class Pythagoras_Programmers {


	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int c = sc.nextInt();

			int b_square = (c*c) - (a*a); // 정답
			// 피타고라스의 정리 공식을 이해하고 b_square는 제곱이기 때문에 제곱값을 구하기 위해 항이동을 통해 연산
			// int b_square = c - a; 기존 문제

			System.out.println(b_square);
			
			
		}

}