package programmers.days0207;

/*
문제 설명
정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

num_list	     result
[3, 4, 5, 2, 1]	 1
[5, 7, 8, 3]	 0
 */

public class Lv0_23 {

//    int [] num_list = {3,4,5,2,1};

	 public int solution(int[] num_list) {
	        
		    int answer = 0;
	        int pow = 0;
	        int sum =0;
	        int mul = 1;
	         
	        for (int idx = 0; idx < num_list.length; idx++) {
	        	mul *= num_list[idx];
	        	sum += num_list[idx];
	        	
	        }
	        pow = (int) Math.pow(sum,2);
	        if(mul > pow) {
	        	
	        	return answer = 0;
	        }
	        else if(mul < pow)
	        {
	        	return answer = 1;
	        }
	        return answer;

	 }
	
}
