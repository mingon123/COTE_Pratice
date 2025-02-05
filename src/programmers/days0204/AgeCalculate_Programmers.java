package programmers.days0204;


/*
 * 문제 설명
나이를 세는 방법은 여러 가지가 있습니다. 
그중 한국식 나이는 태어난 순간 1살이 되며 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 
연 나이는 태어난 순간 0살이며 해가 바뀔 때마다 1살씩 더 먹게 됩니다. 
각각 나이의 계산법은 다음과 같습니다.

한국식 나이 : 현재 연도 - 출생 연도 + 1
연 나이 : 현재 연도 - 출생 연도

출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열 age_type이 주어질 때 2030년에 몇 살인지 출력하도록 빈칸을 채워 코드를 완성해 주세요.
 age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.
 */

import java.util.Scanner;
public class AgeCalculate_Programmers {



	public class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			String age_type = sc.next();
			int answer = 0;

			if (age_type.equals("Korea")) { // 문제 정답 : 한국 나이 기준이며 문제에서 Korea 입력을 나타냈기에 문자열 "Korea" 삽입
				answer = 2030 - year + 1; // 기준이 2030년이었고 한국 나이는 현재년도 - 출생년도 + 1
						
			}
			else if (age_type.equals("Year")) {

				answer = 2030 - year;  // 연나이 = 현재년도 - 출생년도 
			}

			System.out.println(answer);
		}
	}
}
