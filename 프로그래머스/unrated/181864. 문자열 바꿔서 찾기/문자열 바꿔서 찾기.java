class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] mystr = myString.split("");
        String mystring = "";
        
        for(int i=0; i<mystr.length; i++){
            if(mystr[i].equals("A")){
                mystring += "B";
            } else if(mystr[i].equals("B")){
                mystring += "A";
            }
        }
        
        if(mystring.contains(pat))
            answer = 1;
        else
            answer = 0;
        
        return answer;
    }
}