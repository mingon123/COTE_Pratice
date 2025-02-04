package codingtraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgrammingEx {
	/* https://www.acmicpc.net/problem/2747 백준 2747번 피보나치수
	 * 
	 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
	 *  그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
	 *  이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
	 *  n=17일때 까지 피보나치 수를 써보면 다음과 같다.
	 *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
	 *  n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
	 *  입력
	 *  첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.
	 *  출력
	 *  첫째 줄에 n번째 피보나치 수를 출력한다.
	 * 
	 */
	
	//DP -> 문제를 쪼개서 해결 예시 코드를 보면 쉽게 이해가 갈것
	
	static int N; // 입력받을 피보나치수의 자릿수
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[] dp = new int[N+1]; // N번째 인덱스가 필요하기떄문에 N+1을 길이로 줌
		
		if(N == 1) {
			System.out.println(1);
			return;
		}
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2 ; i <= N ; i++) {
			dp[i] = dp[i-1] + dp[i-2];
			//dp[2] = dp[1] + dp[0]; 처럼 "이미 정해진 답"을 이용해서 다음 식을 구할수있음
			//통상 재귀호출로 구현하는 경우도 있으나 메모리, 수행시간면에서 매우 좋지않음 (재귀는 어지간하면 코테에서 좋지않음)
		}
		System.out.println(dp[N]);
	}

}
