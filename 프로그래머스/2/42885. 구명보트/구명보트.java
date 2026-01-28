import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int lifeboat = 0;
        int lp = 0, rp = people.length - 1;
        
        Arrays.sort(people);
        
        while(lp <= rp) {
            if(people[lp] + people[rp] <= limit) {
                lp++;
            }
            rp--;
            lifeboat++;
        }
        return lifeboat;
    }
}