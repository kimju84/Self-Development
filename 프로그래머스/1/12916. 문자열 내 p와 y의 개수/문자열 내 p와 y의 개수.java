import java.util.Arrays;
import java.io.*;
class Solution {
    boolean solution(String s) {
       // System.out.println(s.charAt(0).equals("p"));
        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.toLowerCase(s.charAt(i)) == 'p') pCnt ++;
            else if(Character.toLowerCase(s.charAt(i)) == 'y') yCnt++;
        }
        System.out.println(pCnt);
        System.out.println(yCnt);
        return pCnt == yCnt ? true : false;
    }
}