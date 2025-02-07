package programmers.days0206;

/*
 문제 설명
문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.

두 수가 n과 m이라면
">", "=" : n >= m
"<", "=" : n <= m
">", "!" : n > m
"<", "!" : n < m
두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 
그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.

ineq	eq	n	m	result
"<"	    "="	20	50	1
">"	    "!"	41	78	0
 */
public class Lv0_18 {

//	String ineq = "<";
//	String eq = "=";
//	int n = 20;
//	int m = 50;
	
	// 솔직히 이건 풀긴 했는데 왜 됐는지 모르겠다 ㅋㅋㅋㅋㅋㅋㅋㅋㅋ 다시 풀어보기
	public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals("<") && n <= m && eq.equals("=") != eq.equals("!")) {
        	return answer = 1;
        }
        else if(ineq.equals(">") && n >= m && eq.equals("=") != eq.equals("!")) {
        	return answer = 1;
        }
        else if(ineq.equals("<") && n < m ){
        	return answer = 1;
        }
        else if(ineq.equals(">") && n > m) {
        	return answer = 1;
        }
        else
            return answer =  0;
    }
}
