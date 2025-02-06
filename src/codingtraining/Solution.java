package codingtraining;
//60

import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> al = new ArrayList<String>();        
        al.add(my_string);
        for (int i = 0; i < my_string.length()-1; i++) {
	
        	al.indexOf(0);
        	
        	al.add(my_string);        
		} // for i			
		
        String[] answer = new String[al.size()];
        al.sort(null);
        answer[0] = al.toString();
        
        return answer;
    }
}
