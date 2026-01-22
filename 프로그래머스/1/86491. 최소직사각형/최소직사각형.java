class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0, maxHeight = 0;
        
        for(int[] cards : sizes) {
            maxWidth = Math.max(maxWidth, Math.max(cards[0], cards[1]));
            maxHeight = Math.max(maxHeight, Math.min(cards[0], cards[1]));
        }
        
        answer = maxWidth * maxHeight;
        
        return answer;
    }
}
