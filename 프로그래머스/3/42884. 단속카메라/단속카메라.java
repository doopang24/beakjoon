import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int count = 0;
        int lastCameraPos = -30001;
        
        // 진출 시점 기준으로 routes 오름차순 정렬
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        // 가장 먼저 나가는 차량의 진출 시점에 첫 번째 카메라 설치
        lastCameraPos = Math.max(lastCameraPos, routes[0][1]);
        count = 1;
        
        for(int[] route : routes) {
            if(route[0] > lastCameraPos) {
                count++;
                lastCameraPos = route[1];
            }
        }
        return count;
    }
}