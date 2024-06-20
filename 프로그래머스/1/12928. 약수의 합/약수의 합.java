class Solution {
    public int solution(int n) {
        int answer =  n ;
        if(n == 0)
        {
            return answer = 0;
        }
        else if (n == 1)
        {
            return answer = 1;
        }
        for (int i = 1; i < n; i++)
        {
            
            if (n % i == 0)
            {
                answer += i;
            }
        }
        return answer;
    }
}