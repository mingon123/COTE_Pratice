package codingtraining;
//103
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
    	List<String> list = new ArrayList<>();
    	for (String s : myString.split("x")) {
			list.add(s);
		}
    	list.sort(null);
    	return list.toArray(String[]::new);
    }
}

// 문제 요약 : myString "x" 기준으로 잘라서 사전순으로 정렬('x'포함x)






