package level2;

import java.util.*;

public class Solution_오픈채팅방_kakao {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan","Enter uid1234 Prodo"})));
	}
	
	 static public String[] solution(String[] record) {
	        
	        HashMap<String, String> nickname = new HashMap<>();
	        int size = record.length;
	        for(String comm : record){
	            switch(comm.split(" ")[0]){
	                case "Enter":
	                	nickname.put(comm.split(" ")[1], (comm.split(" ")[2]));
	                    break;
	                case "Change":
	                	size--;
	                	nickname.put(comm.split(" ")[1], (comm.split(" ")[2]));
	                    break;
	            }
	        }
	        
	        String[] answer = new String[size];
	        int idx = 0;
	        for(int i = 0; i < record.length ; i++) {
	        	
	            switch(record[i].split(" ")[0]){
	                case "Enter":   
	                	String resEnter = nickname.get(record[i].split(" ")[1]);
	                	resEnter += "님이 들어왔습니다.";
	                	answer[idx++] = resEnter;
	                    break;
	                case "Leave":
	                	String resLeave = nickname.get(record[i].split(" ")[1]);
	                	resLeave += "님이 나갔습니다.";
	                	answer[idx++] = resLeave;
	                    break;
	            }
	        }
	        return answer;
	    }
}
