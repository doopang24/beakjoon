import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> dictionary = new ArrayList<String>();
    String[] vowels = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int answer = 0;
        generateDictionary("", 0);
        answer = dictionary.indexOf(word);
        
        return answer;
    }
    
    public void generateDictionary(String prefix, int length) {
        dictionary.add(prefix);
        if(length == 5) return;
        for(int i=0; i<5; i++) {
            generateDictionary(prefix + vowels[i], length + 1);
        }
    }
}

