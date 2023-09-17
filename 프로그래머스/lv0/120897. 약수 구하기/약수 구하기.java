import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        
        
        for(int i=1; i<=n; i++){
            if(n%i==0)
                array.add(i);
            
        }
        
        return array.stream().mapToInt(i -> i).toArray();
    }
}