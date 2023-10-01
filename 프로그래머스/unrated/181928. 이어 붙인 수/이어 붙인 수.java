class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String oddsum = "";
        String evensum = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                evensum += Integer.toString(num_list[i]);
            } else {
                oddsum += Integer.toString(num_list[i]);
            }
        }
        
        answer = Integer.valueOf(evensum) + Integer.valueOf(oddsum);
        
        return answer;
    }
}