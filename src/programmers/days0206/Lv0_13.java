package programmers.days0206;

/*
 
 문제 설명
문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class Lv0_13 {
	
	public static void main(String[] args) {
		/* 실행결과 테스트
		// String my_string = "string";
		// int k = 3;
		// solution(my_string,k);
	    */
		
	}
	// String my_string = "string";
	// int k = 3;
	public /* static */ String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++){
           System.out.print(my_string);
           answer += my_string;
        }
        
        return answer;
    }
}
