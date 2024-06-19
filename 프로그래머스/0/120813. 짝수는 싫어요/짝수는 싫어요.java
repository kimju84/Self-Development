import java.util.Arrays;
import java.io.*;

class Solution {
    public int[] solution(int n) {
        /*
        n의 배열의 길이는 홀수일 경우 2로 나눈 몫+1, 홀수일 경우 몫
        ex 
        n = 21일 경우 길이 = 10 + 1
        [1,3,5,7,9,11,13,15,17,19,21]
        n = 24일 경우 길이 = 12
        [1,3,5,7,9,11,13,15,17,19,21,23]
        이 되어야 한다.*/

        int cnt = 0;
        int arrCnt = n%2 ==0 ? n/2 : (n/2)+1;
        int[] answer = new int[arrCnt];
        
        
        for(int i = 1; i <= n; i++) 
            {
                if(i%2 == 1)
                {
                    answer[cnt] = i;
                }
                else
                {
                    cnt++;
                }
            }
        
        return answer;
    }
}