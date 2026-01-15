class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int extent = brown + yellow;

        for (int height = 3; height < extent; height++) {
            int width = 0;
            if (extent % height == 0) {
                width = extent / height;

                int yellowWidth = width - 2;
                int yellowHeight = height - 2;
                if (width >= height && (yellowWidth * yellowHeight) == yellow) {
                    answer = new int[] { width, height };
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return answer;
    }
}