class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int cnt = 0;
        int n = x;
        
        
        while (n>0){
            cnt += n % 10;
            n = n/10;
        }
        
        return answer = (x%cnt == 0)? true: false;
    }
}