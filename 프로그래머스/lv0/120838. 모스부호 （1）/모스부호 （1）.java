class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] Letter = letter.split(" ");
        
        for(String str : Letter){
            for(int i=0; i<morseList.length; i++){
                if(str.equals(morseList[i]))
                    answer += Character.toString(i + 97);
            }
        }
        
        return answer;
    }
}