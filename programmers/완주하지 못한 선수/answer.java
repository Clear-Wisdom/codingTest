import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> countParticipant = new HashMap<>();
        Map<String, Integer> countCompletion = new HashMap<>();

        for (String s : participant) {
            countParticipant.put(s, countParticipant.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            countCompletion.put(s, countCompletion.getOrDefault(s, 0) + 1);
        }

        for (String key : countParticipant.keySet()) {
            int isInParticipant = countParticipant.getOrDefault(key, 0);
            int isInCompletion = countCompletion.getOrDefault(key, 0);
            if (isInCompletion != isInParticipant) {
                answer = key;
            }
        }

        return answer;
    }
}