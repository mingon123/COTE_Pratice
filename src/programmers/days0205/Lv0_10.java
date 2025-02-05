package programmers.days0205;

import java.util.Scanner;

/*
 
 문제 설명
문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.


my_string	         overwrite_string	s	result
"He11oWor1d"	     "lloWorl"	        2	"HelloWorld"
"Program29b8UYP"	 "merS123"	        7	"ProgrammerS123"


예제 1번의 my_string에서 인덱스 2부터 
overwrite_string의 길이만큼에 해당하는 부분은 "11oWor1"이고 
이를 "lloWorl"로 바꾼 "HelloWorld"를 return 합니다.

예제 2번의 my_string에서 인덱스 7부터 
overwrite_string의 길이만큼에 해당하는 부분은 "29b8UYP"이고 
이를 "merS123"로 바꾼 "ProgrammerS123"를 return 합니다.
 */
public class Lv0_10 {


	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();  // 원본 문자열
		String overwrite_string = sc.next();  // 덮어쓸 문자열
		int s = sc.nextInt();  // 시작 위치

		System.out.print(solution(my_string, overwrite_string, s));
		
	    }
	    public static String solution(String my_string, String overwrite_string, int s) { 
	        String answer = ""; 
	        StringBuilder sb = new StringBuilder(my_string); // 문자열 수정을 위해 내가 바꾸고 싶은 문자열을 StringBulider로 선언
	        
	        for(int i = 0; i < overwrite_string.length(); i++) { // 대체하고 싶은 문자열 길이만큼 반복
	        	sb.setCharAt(s+i, overwrite_string.charAt(i)); // 일단 시작 위치를 선정 그리고 i만큼 증가시키고 바꾸고 싶은 문자열 길이만큼만 바꾸기
	        }
	        answer = sb.toString();
	        return answer;
	    }
}
	


	/*
	class Solution {
		
		Scanner sc = new Scanner(System.in);
		String my_string;
		String overwrite_string;
		static int s;
		
	    public String solution(String my_string, String overwrite_string, int s) {
	    	
			
			
			my_string = sc.next();
			overwrite_string = sc.next();
			s = sc.nextInt();
	        String answer = "";
	        
	        char ms; // my_string 캐릭터형 변수
	        char os; // overwrite_string  캐릭터형 변수
	        
	        for(int i = 0; i < s; i++) { // 문자열 길이만큼만 돌아가게?
	        	
	        	ms = my_string.charAt(i);
	        	System.out.println(ms);
	        	
	        } // for
	        
	        return answer;
	        
	    }
	}
	*/



