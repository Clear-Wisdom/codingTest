import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        // 경우의 수 = (A종류의 개수 + 1(입지않는 경우의 수) * (B종류의 옷 개수 + 1) * ... - 1(아무것도 안입는 경우의 수
        // 제외))
        int answer = 1;
        HashMap<String, Integer> count = new HashMap<>();

        for (String[] cloth : clothes) {
            count.put(cloth[1], count.getOrDefault(cloth[1], 0) + 1);
        }
        for (int num : count.values()) {
            answer *= num + 1;
        }

        return (answer - 1);
    }
}