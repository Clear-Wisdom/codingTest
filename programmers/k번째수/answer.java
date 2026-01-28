import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] sliced = Arrays.stream(array, commands[i][0] - 1, commands[i][1]).toArray();
            Arrays.sort(sliced);
            answer[i] = sliced[commands[i][2] - 1];
        }
        return answer;
    }
}