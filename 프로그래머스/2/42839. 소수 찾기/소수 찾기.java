import java.util.HashSet;

class Solution {
    
    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        permutation("", numbers, set);
        for(Integer number : set) {
            if(isPrime(number)) answer++;
        }
        
        return answer;
    }
    
    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) {
                set.add(Integer.parseInt(prefix));
        }
        for(int i=0; i<n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }
    }
    
    public boolean isPrime(Integer number) {
        if(number < 2) return false;
        for(int i=2; i<=Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    } 
}