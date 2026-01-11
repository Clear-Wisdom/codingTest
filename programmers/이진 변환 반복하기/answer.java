class Solution {
    public int[] solution(String s) {
        int iterCount = 0;
        int zeroCount = 0;
        String afterBinary = s;

        while (true) {
            if (afterBinary.length() != 1) {
                int beforeLength = afterBinary.length();
                int afterLength = 0;

                String deletedZero = afterBinary.replace("0", "");
                afterLength = deletedZero.length();

                zeroCount += (beforeLength - afterLength);

                afterBinary = Integer.toBinaryString(afterLength);
                iterCount++;
            } else {
                break;
            }
        }
        int[] answer = { iterCount, zeroCount };
        return answer;
    }
}