import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = citations.length;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int curr = (citations.length - 1) - i;
            if (citations[curr] >= (i + 1)) {
                continue;
            } else {
                answer = i;
                break;
            }
        }
        return answer;
    }
}