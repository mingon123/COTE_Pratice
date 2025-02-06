package programmers.days0206;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*

문제 설명
***문자들이 담겨있는 배열 arr가 주어집니다***
 arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 
 -> 나는 내가 문자열을 직접 만들어서 하는 줄 알았음 그래서 동적으로 배열 만들어서 직접 값 넣고 확인하는 코드를 만든 거 였는데 
    문제는 그냥 일단 있으니 출력을 하라는 의미였다.
    문해력 빵점의 사나이....
 */

class Solution {
	
	public String solution(String[] arr) {
        String answer = ""; 
        for (int i = 0; i < arr.length; i++) { // 정답
            answer += arr[i];
        }
        return answer;
    }
	
}
/* 내가 짠 코드 그냥 문제 이해 자체를 잘못했음 진짜 짜증난다~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class Solution {
	
	
    public String solution(String[] arr) {
        String answer = "";
        List<Object> l = new ArrayList<>();
	    
        Scanner sc = new Scanner(System.in);
	    boolean enter = sc.hasNextLine();
	    String result = null;
        
        answer = sc.next();
        
        
        for(int i = 0; i < 200; i++) {
        	if(l.add(i) == enter)
        	{
        		break;
        	}
        	else {
        		l.add(answer);
        	}
        
        	result = l.toString();
        }
        return answer = result;
    }
}

*/