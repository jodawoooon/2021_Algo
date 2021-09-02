package level1;

import java.util.*;

public class Solution_완주하지못한선수_Hash {
	public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
			if(map.get(p)==null) {
				map.put(p, 1);
			}else { //이름중복일경우
				map.put(p, map.get(p)+1);
			}
		}
        
        for (String p : completion) {
        	if(map.get(p)!=0) {
        		map.put(p, map.get(p)-1);
        	}
		}
        
        for (String key : map.keySet()) {
			if(map.get(key)!=0) {
				return key;
			}
		}
        
        return answer;
    }
}
