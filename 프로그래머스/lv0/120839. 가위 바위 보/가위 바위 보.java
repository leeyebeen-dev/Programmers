class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] RSP = rsp.split("");
        
        for(int i=0; i<RSP.length; i++){
            if(RSP[i].equals("0"))
                answer += "5";
            if(RSP[i].equals("2"))
                answer += "0";
            if(RSP[i].equals("5"))
                answer += "2";
        }
        
        return answer;
    }
}