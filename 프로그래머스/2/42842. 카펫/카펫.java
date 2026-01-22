class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        
        for(int h=3; h<=Math.sqrt(total); h++) {
            int w = 0;
            if(total % h == 0) {
                w = total / h;
            } 
            if((h-2) * (w-2) == yellow) {
                return new int[] {w, h};
            }
        }
        
        return answer;
    }
    
}