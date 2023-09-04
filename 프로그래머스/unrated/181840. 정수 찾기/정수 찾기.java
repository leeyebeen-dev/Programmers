class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        int count = 0;
        
        for(int i=0; i< num_list.length; i++){
            if(num_list[i] == n)
                return 1;
            else
                count++;
        }
        
        
        
        return answer = (count == num_list.length)?0:1;
    }
}