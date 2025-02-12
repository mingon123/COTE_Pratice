package programmers.days0212;

/*

문제 설명
문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.


my_string	     queries	                          result
"rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"

 */
public class Lv0_39 {
	class Solution {
		  public String solution(String my_string, int[][] queries) {
				String answer = "";
				StringBuilder sb = new StringBuilder(my_string);
				
				int start = 0;
				int end = 0;
				for(int [] query : queries) {
					start = query[0];
					end = query[1];
				
				
				while(start < end) {
					char temp = sb.charAt(start);
					sb.setCharAt(start, sb.charAt(end));
					sb.setCharAt(end, temp);
					start++;
					end--;
				}
		        }
				return answer = sb.toString();
		            
			}
		}
}

