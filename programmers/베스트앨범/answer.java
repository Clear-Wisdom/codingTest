import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        // 1. key가 geners, value가 index+plays인 hashmap 만들기
        HashMap<String, ArrayList<int[]>> albums = new HashMap<>();
        
        // 2. 재생수 누적을 위한 hashmap 만들기
        HashMap<String, Integer> score = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String key = genres[i];
            if (!albums.containsKey(key)) {
                // HashMap에 처음 삽입되는 genre일 경우
                ArrayList<int[]> info = new ArrayList<>();
                info.add(new int[]{i, plays[i]});
                albums.put(key, info);
                score.put(key, plays[i]);
            } else {
                // 이미 존재하는 genre일 경우
                ArrayList<int[]> info = albums.get(key);
                info.add(new int[]{i, plays[i]});
                
                int currScore = score.get(key);
                currScore += plays[i];
                score.put(key, currScore);
            }
        }
        // 3. 재생 수 누적 HashMap에서 재생 수 누적 순으로 정렬
        ArrayList<String> scoreBoard = new ArrayList<>(score.keySet());
        scoreBoard.sort((o1, o2) -> score.get(o2) - score.get(o1));        
        
        ArrayList<Integer> finalAnswer = new ArrayList<>();
        for (String genre: scoreBoard) {
            ArrayList<int[]> songs = albums.get(genre);
            songs.sort((a, b) -> {
                if (a[1] == b[1]) {
                    // 재생 수가 같을 경우 인덱스가 작은게 앞
                    return a[0] - b[0];
                } else{
                    // 재생 수가 큰게 앞
                    return b[1] - a[1];
                }
            });
            finalAnswer.add(songs.get(0)[0]);
            if (songs.size() > 1) {
                finalAnswer.add(songs.get(1)[0]);
            }
        }
        
        answer = new int[finalAnswer.size()];
        for (int i = 0; i < finalAnswer.size(); i++) {
            answer[i] = finalAnswer.get(i);
        }
        
        return answer;
    }
}