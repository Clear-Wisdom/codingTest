class Solution {
    public int solution(int n) {
        int answer = 0;
        int fibMinusOne = 1;
        int fibMinusTwo = 0;

        for (int i = 2; i <= n; i++) {
            answer = (fibMinusOne + fibMinusTwo) % 1234567;
            fibMinusTwo = fibMinusOne % 1234567;
            fibMinusOne = answer;
        }

        return answer;
    }
}