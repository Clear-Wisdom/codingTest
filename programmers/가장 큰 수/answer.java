import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strNums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        if (strNums[0].equals("0")) {
            answer = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String s : strNums) {
                sb.append(s);
            }
            answer = sb.toString();
        }

        return answer;
    }
}