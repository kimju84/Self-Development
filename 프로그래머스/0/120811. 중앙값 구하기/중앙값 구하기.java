import java.util.Arrays;
import java.io.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] answer2 = new int[1];
        // 1. 배열 정렬
        Arrays.sort(array);
        int division = array.length / 2;
        // 배열에서 앞 뒤 몫 만큼 요소 제거
        answer2 = Arrays.copyOfRange(array, division, array.length - division);
        return answer = answer2[0];
    }
}