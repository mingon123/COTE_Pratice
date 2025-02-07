package clear.d0207;


/*
접미사 배열

문제 설명
어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string은 알파벳 소문자로만 이루어져 있습니다.
1 ≤ my_string의 길이 ≤ 100
입출력 예
my_string	result
"banana"	["a", "ana", "anana", "banana", "na", "nana"]
"programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
입출력 예 설명
입출력 예 #1

예제 1번의 my_string는 "banana"로 모든 접미사는 문제의 설명과 같습니다. 
이를 사전순으로 정렬하면 "a", "ana", "anana", "banana", "na", "nana"이므로 ["a", "ana", "anana", "banana", "na", "nana"]를 return 합니다.
입출력 예 #2

예제 2번의 my_string는 "programmers"이고 모든 접미사는 "programmers", "rogrammers", "ogrammers", "grammers", "rammers", "ammers", "mmers", "mers", "ers", "rs", "s"입니다.
 이를 사전순으로 정렬한 문자열 배열 ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]를 return 합니다.
 */

import java.util.ArrayList;

public class Lv0_60 {
    public String[] solution(String my_string) {
        ArrayList<String> al = new ArrayList<String>(); // ArrayList 사용        
        for (int i = 0; i < my_string.length(); i++) {  
        	al.add(my_string.substring(i)); // i번~잘라옴(앞부터 한글자씩 잘라옴)
		} // for i			
        al.sort(null); // 정렬
        String[] answer = al.toArray(new String[al.size()]) ; // 반환값 String[] 객체 생성 및 크기 지정
        return answer;
    }
}

// 문제요약 : my_string을 읽어와서 앞에 한글자씩 빼면서 저장, + 정렬(오름차순)

/*
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
    	String[] answer = new String [my_string.length()] ;       
    	for (int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i);			
		} // for i
    	Arrays.sort(answer);
        return answer;
    }
}
*/
// AL 안쓰고 arrays.sort 쓰는게 더 좋아보임