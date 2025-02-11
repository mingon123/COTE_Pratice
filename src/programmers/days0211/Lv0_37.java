package programmers.days0211;
/*

문제 설명
문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. 
my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.


my_string	                     index_list	                             result
"cvsgiorszzzmrpaqpe"	    [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
"zpiaz"	                    [1, 2, 0, 0, 3]	                            "pizza"
 */
public class Lv0_37 {

	class Solution {
		
		public String solution(String my_string, int[] index_list) {
			String answer = "";
			
			for(int num : index_list) {
				answer += my_string.charAt(num);
			}
			return answer;
		}
	}
}
