package clear.d0210;

/*
A 강조하기

문제 설명
문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.

제한사항
1 ≤ myString의 길이 ≤ 20
myString은 알파벳으로 이루어진 문자열입니다.
입출력 예
myString	result
"abstract algebra"	"AbstrAct AlgebrA"
"PrOgRaMmErS"	"progrAmmers"
입출력 예 설명
입출력 예 #1

0번, 5번, 9번, 15번 인덱스의 "a"는 소문자이므로 전부 대문자로 고쳐줍니다.
다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
따라서 "AbstrAct AlgebrA"를 return 합니다.
입출력 예 #2

0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 "A"가 아닌 대문자이므로 전부 소문자로 고쳐줍니다.
5번 인덱스의 "a"는 소문자이므로 대문자로 고쳐줍니다.
다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
따라서 "progrAmmers"를 return 합니다.
 */

public class Lv0_95 {
    public String solution(String myString) {
    	String answer = "";
    	for (int i = 0; i < myString.length(); i++) {
    		char c = myString.charAt(i); 
			if(c=='a') answer += 'A'; // 소문자a면 대문자로 'A'로 변경
			else if (!(c=='A')) answer+=Character.toLowerCase(c); // 'A'제외 나머지는 소문자로 변경
			else answer+=c; // 'A'도 추가(생각!)
		} // for i
    	return answer;
    }
}

// 문제 요약 : myString에서 a는 대문자, 나머지는 소문자로 변환

// 한줄 코딩 가능 : return myString.toLowerCase().replace('a', 'A');



