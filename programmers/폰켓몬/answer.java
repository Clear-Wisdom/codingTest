import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxPick = nums.length / 2;

        HashSet<Integer> types = new HashSet<>();
        for (int n : nums) {
            types.add(n);
        }

        return Math.min(maxPick, types.size());
    }
}