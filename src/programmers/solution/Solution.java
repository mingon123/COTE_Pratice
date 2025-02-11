package programmers.solution;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;


/*
문제 설명
음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.

number	                   result
"123"	                    6
"78720646226947352489"	    2
*/
class Solution {
	
	 String number = "123";
	 
	 public int solution(String number) {
	        int answer = 0;
	        int result = 0;
	        
	        
	        
	        
	        for(int i = 0; i < number.length(); i++) {
	        	char n = number.charAt(i);
	        	result = n + '0';
	        }
	        return answer = (result % 9);
	        
	    }
}


