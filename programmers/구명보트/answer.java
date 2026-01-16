import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int distance = right - left;

        while (distance >= 0) {
            if ((limit - people[right]) < 40 || (people[left] + people[right]) > limit) {
                answer++;
                right--;
                distance = right - left;
                continue;
            } else {
                answer++;
                left++;
                right--;
                distance = right - left;
                continue;
            }
        }
        return answer;
    }
}