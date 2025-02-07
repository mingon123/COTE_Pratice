package programmers.days0207;
/*
 문제 설명
정수가 담긴 리스트 num_list가 주어집니다. 
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

num_list	     result
[3, 4, 5, 2, 1]	 393
[5, 7, 8, 3]	 581
 */
public class Lv0_24 {

//	static int [] num_list = {3,4,5,2,1};
//	 public static void main(String[] args) {
//		
//	}
	 public int solution(int[] num_list) {
	        int answer = 0;
	        
	        String odd  = ""; // 홀수
	        String even = ""; // 짝수
	        
	        
	        for(int idx = 0; idx < num_list.length; idx++) {
	        	
	            if((num_list[idx] % 2) == 1 ){
	            	odd += (num_list[idx] + "");
	            }
	            else {
	            	even += (num_list[idx] + "");
	            }
	            
	        }
	        int odd_int = Integer.parseInt(odd);
	        int even_int = Integer.parseInt(even);
	        
			return answer = odd_int + even_int;
	        
	    }
}
