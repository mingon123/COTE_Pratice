package programmers.days0205;

/*
문제 설명
영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 */
import java.util.Scanner;

public class Lv0_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String answer = ""; // 최종 문자열 변수 선언
		char b; // 한글자씩 저장할 변수 선언
		
		for(int i = 0; i < a.length(); i++) {  // 문자열의 길이만큼 반복
			b = a.charAt(i); // b에다가 한글자씩 담을 수 있게 만듦
			if(Character.isUpperCase(b)) { // 만약 글자중에 대문자가 발견되면
				answer +=  Character.toLowerCase(b); // answer에 b를 소문자로 변환 시켜주기
			}
			else if(Character.isLowerCase(b)) { // 만약 글자중에 소문자가 발견되면
				answer += Character.toUpperCase(b); // answer에 b를 대문자로 변환 시켜주기
			}
		}
		System.out.println(answer);
	    
	}
}
