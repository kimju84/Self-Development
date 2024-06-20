import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        // int -> String 변환 
        String str = String.valueOf(n);
      
        for(int i = 0; i < str.length(); i ++) 
        {
            // 문자열 i번째 잘라서 answer에 더하기
            answer += Integer.parseInt(str.substring(i,i+1));
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}