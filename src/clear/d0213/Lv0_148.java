package clear.d0213;

/*
문자열 정렬하기 (2)

문제 설명
영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < my_string 길이 < 100
입출력 예
my_string	result
"Bcad"	"abcd"
"heLLo"	"ehllo"
"Python"	"hnopty"
입출력 예 설명
입출력 예 #1

"Bcad"를 모두 소문자로 바꾸면 "bcad"이고 이를 알파벳 순으로 정렬하면 "abcd"입니다.
입출력 예 #2

"heLLo"를 모두 소문자로 바꾸면 "hello"이고 이를 알파벳 순으로 정렬하면 "ehllo"입니다.
입출력 예 #3

"Python"를 모두 소문자로 바꾸면 "python"이고 이를 알파벳 순으로 정렬하면 "hnopty"입니다.
 */

import java.util.Arrays;

public class Lv0_148 {
    public String solution(String my_string) {
    	String answer = "";
    	char[] c = my_string.toLowerCase().toCharArray(); // 소문자 + char[]로 만듦
        Arrays.sort(c); // 정렬
        for (char d : c) { // 각 문자를 asnwer에 추가해서 String형으로 만듦
			answer += d;
		} // foreach
    	return answer;  
    	// return new String(c); 이걸로 foreach문 생략가능
    }
}

//문제 요약 : my_string을 모두 소문자로 바꾸고 정렬



