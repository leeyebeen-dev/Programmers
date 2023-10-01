class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int sum = Integer.valueOf(Integer.toString(a) + Integer.toString(b));
        answer = (sum > 2*a*b)? sum : 2*a*b;
        
        return answer;
    }
}