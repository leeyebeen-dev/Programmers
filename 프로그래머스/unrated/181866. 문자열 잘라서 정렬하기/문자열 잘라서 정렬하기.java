import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        
        answer = Arrays.stream(answer)
            .filter(str -> !str.isEmpty())
            .sorted()
            .toArray(String[]::new);
        
        return answer;
    }
}