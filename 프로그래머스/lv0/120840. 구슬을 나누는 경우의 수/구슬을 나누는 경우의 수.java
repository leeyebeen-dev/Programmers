class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        
        answer = combination(balls, share);
        
        return answer;
    }
    
    public static int combination(int A, int B){
        if(A == B || B == 0)
            return 1;
        else
            return combination(A-1, B-1) + combination(A-1, B);
    }
}