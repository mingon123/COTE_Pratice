package Clear;

public class Lv0_38 {
	public String solution(String code) {
		String ret = "";
		int mode = 0;
		
		
		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);
			
			if (mode == 0) {
				if ( c != '1' ) { 
					if (i % 2 == 0) ret += c;
				} else {
					mode = 1;
				}
			} else {
				if ( c != '1' ) { 
					if (i %2 == 1) ret += c;
				} else {
					mode = 0;
				}
			} 
		}
		return ret.isEmpty() ? "EMPTY" : ret;
	}
}
