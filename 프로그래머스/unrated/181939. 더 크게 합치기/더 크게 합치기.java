class Solution {
    public int solution(int a, int b) {
        int answer = 0, answer1 = 0, answer2 = 0;
        
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        
        answer1 = Integer.valueOf(A + B);
        answer2 = Integer.valueOf(B + A);
        
        if(answer1 > answer2){
            answer = answer1;
        } else{
            answer = answer2;
        }
        
        return answer;
    }
}