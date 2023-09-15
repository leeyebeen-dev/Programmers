class Solution {
    public int solution(String number) {
        
        int answer = 0;
        int sum = 0;
        
        String[] num_arr = number.split("");
        
        for(int i=0; i<num_arr.length; i++){
            sum += Integer.parseInt(num_arr[i]);
        }
        
        answer = sum % 9;
        
        return answer;
    }
}