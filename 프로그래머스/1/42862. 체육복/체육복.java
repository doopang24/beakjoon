import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int ready = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<reserve.length; i++) {
            for(int j=0; j<lost.length; j++) {
                if(reserve[i] == lost[j]) {
                    ready++;
                    reserve[i] = -1;
                    lost[j] = -1;
                }
            }
        }
        
        for(int l : lost) {
            if(l == -1) continue;
            for(int i=0; i<reserve.length; i++) {
                if(reserve[i] == -1) continue;
                if(reserve[i] - 1 == l || reserve[i] + 1 == l ) {
                    ready++;
                    l = -1;
                    reserve[i] = -1;
                }
            }
        }
        return ready;
    }
}