class Solution {

    public boolean isVowel(char s){
        return s=='a' || s=='e' || s=='i' || s=='o' || s=='u';
    }
    public int maxVowels(String s, int k) {
        
        int n = s.length();
        int count = 0;
        int maxcount = 0;
        int start = 0;
        for(int end=0; end<k; end++){
            if(isVowel(s.charAt(end))){
                count++;
            }
        }
        maxcount = count;
        for(int end=k; end<n; end++){
            if(isVowel(s.charAt(start))){
                count--;
            }
            if(isVowel(s.charAt(end))){
                count++;
            }
            maxcount = Math.max(count, maxcount);
            start++;
        }
        
        return maxcount;
    }
}