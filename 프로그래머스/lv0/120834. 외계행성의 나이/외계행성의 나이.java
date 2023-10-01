class Solution {
    public String solution(int age) {
        String answer = "";
        String Age = "abcdefghij";
        
        String[] ageArray = String.valueOf(age).split("");
        
        for(int i=0; i<ageArray.length; i++){
            answer += Age.charAt(Integer.valueOf(ageArray[i]));
        }
        
        return answer;
    }
}