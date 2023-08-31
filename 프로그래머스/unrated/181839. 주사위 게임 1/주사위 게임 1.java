class Solution {
    public int solution(int a, int b) {
        
        if(a%2==0 && b%2==0){
            if(a-b > 0){
                return a-b;
            }else{
                return b-a;
            }
        }
        else if(a%2==0 || b%2==0){
            return 2 * (a+b);
        }
        else {
            return a*a + b*b;
        }
    }
}