import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        
        while(n!=1){
            if(n%2==0)
                n /= 2;
            else
                n = n * 3 + 1;
            list.add(n);
        }
        
        Integer[] answer = list.toArray(new Integer[list.size()]);
        
        int[] ans = Arrays.stream(answer).mapToInt(i->i).toArray();
        
        return ans;
    }
}