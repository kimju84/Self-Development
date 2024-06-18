class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        // ex [13, 12]
        // numer1 = 1 demon1 = 3 
        // numer2 = 3 demon2 = 4
        int children = (numer1 * denom2) + (numer2 * denom1);// 13
        int parent = denom1 * denom2; // 12
        
        for(int i = children-1; i > 1; i--) {
            // 기약분수로 만들기
            if(children % i == 0 && parent % i == 0) { 
                children /= i;
                parent /= i;
            }
        }
        int[] answer = { children, parent };
        return answer;
    }
}