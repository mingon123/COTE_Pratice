package programmers.days0211;

import java.util.Arrays;

/*

문제 설명
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

입출력 예
a	b	c	d	result
2	2	2	2	2222
4	1	4	4	1681
6	3	3	6	27
2	5	2	6	30
6	4	2	5	2
 */
public class Lv0_36 {

public class Solution{

	
	 public int solution(int a, int b, int c, int d) {
	        int answer = 0;
	        int [] dice = {a,b,c,d};
	        Arrays.sort(dice);
	        
	        if(dice[0] == dice[3]) {
	        	
	        	return answer = 1111 * dice[0];
	        	
	        }if (dice[0] == dice[2] && dice[2] != dice[3]) {
	            return (int) Math.pow((10 * dice[0]) + dice[3], 2);
	        }
	        else if (dice[1] == dice[3] && dice[0] != dice[1]) {
	            return (int) Math.pow((10 * dice[1]) + dice[0], 2);
	        }
	        else if ((dice[0] == dice[1]) && (dice[2] == dice[3])) {
	        
	        	int p = dice[0];
	        	int q = dice[3];
	        	return answer = (p+q) * Math.abs(p-q);
	        	
	        }	
	        // 4. 두 개가 같고 나머지 두 개가 서로 다를 때
	        else if (dice[0] == dice[1]) {
	            return answer = dice[2] * dice[3];
	        } 
	        else if (dice[1] == dice[2]) {
	            return answer = dice[0] * dice[3];
	        } 
	        else if (dice[2] == dice[3]) {
	            return answer = dice[0] * dice[1];
	        }
	        
	        else 
	        	return answer = dice[0];
	        	
	        
		}}
}
