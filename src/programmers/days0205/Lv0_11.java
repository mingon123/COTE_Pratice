package programmers.days0205;

import java.util.Scanner;

/*
 
 문제 설명
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 */
public class Lv0_11 {
	
	static Scanner sc = new Scanner(System.in);
    static String str1 = sc.next();
    static String str2 = sc.next();
    
    public static void main(String[] args) {
		solution(str1, str2);
	}
	 public static String solution(String str1, String str2) {
	        String answer = "";
	        StringBuilder sb = new StringBuilder(answer);  // 일단 수정하기 편하게 스트링 버퍼
	        for(int i = 0; i < str1.length(); i++) { // 번갈아가면서 넣기 위해 반복 
	        	char ca = str1.charAt(i); // 문자열을 캐릭터 형으로 한글자씩 받아오기
	        	System.out.printf("%c",ca); 
	        	char cb = str2.charAt(i); // 문자열을 캐릭터 형으로 한글자씩 받아오기
	        	System.out.printf("%c",cb);
	        	
	        	sb.append(ca); // 값을 넣어주는 과정
	            sb.append(cb); // 값을 넣어주는 과정
	            
	            answer = sb.toString(); // 출력값 저장
	        }
	       
	       
	        return answer;
	    }
	 
	 // 아 풀이 써야하는데 ㅋㅋ
}
