import java.util.Date;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        Date d1 = new Date(date1[0],date1[1],date1[2]);
        Date d2 = new Date(date2[0],date2[1],date2[2]);
        
        if(d1.before(d2))
            answer = 1;
        else
            answer = 0;
        
        return answer;
    }
}