package programmers.days0211;

import java.util.ArrayList;

/*
문제 설명
정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.

변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.

만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.

arr	              result
[1, 4, 2, 5, 3]	[1, 2, 3]
 */
public class Lv0_34 {

	public class Solution{

		int [] arr = { 1, 4, 2, 5, 3};
		
		
		
		public int[] solution(int[] arr) {
	        int[] stk = {};
	        
	        ArrayList<Integer> newStk = new ArrayList<>();
	       
	        for(int i = 0; i < arr.length; i++ ) {
	        	
	        	if(newStk.isEmpty() || newStk.get(newStk.size()-1) < arr[i]) {
	        		
	        		newStk.add(arr[i]);
	        		
	        	}else
	        	{
	        		newStk.remove(newStk.size() - 1);
	        		i--;
	        	}
	        	
	        }
	        stk = newStk.stream().mapToInt(Integer::intValue).toArray();
	        return stk;
	    }
	}
	}