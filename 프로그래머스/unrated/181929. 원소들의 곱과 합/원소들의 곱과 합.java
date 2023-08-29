class Solution {
    public int solution(int[] num_list) {

        double sum1 = 1, sum2 = 0;
        
        for(int i=0; i< num_list.length; i++){
            sum1 *= num_list[i];
            sum2 += num_list[i];
        }
        
        sum2 = Math.pow(sum2,2);
        
        if(sum1 < sum2){
            return 1;
        } else {
            return 0;
        }

    }
}