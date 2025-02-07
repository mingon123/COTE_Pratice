package programmers.days0207;
/* 
문제 설명
1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.

세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요

a	b	c	result
2	6	1	9
5	3	3	473
4	4	4	110592
 */
public class Lv0_22 {

//	int a = 2;
//	int b = 1;
//	int c = 3;
	
	 
	public int solution(int a, int b, int c) {
        int answer = 0;
        int result = a + b + c;
        
        int pow2_sum = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2);
        int pow3_sum = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3);
        int idx;
        if((a == b) && (b == c)) {
        	 answer =  result * pow2_sum * pow3_sum;
        }
        else if((a != b) && (a != c) && (b != c)) {
        	 answer = result;
        }
        else
        	 answer = result * pow2_sum;

        return answer;
    }
}
