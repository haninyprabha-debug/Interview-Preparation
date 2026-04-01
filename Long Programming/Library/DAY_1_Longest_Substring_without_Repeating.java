class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> se =new HashSet<>();
        int res=0;
        int left=0;

        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);

            while(se.contains(c)){
                se.remove(s.charAt(left));
                left++;
            }

            se.add(c);
            res=Math.max(res,right-left+1);
        }
      return res;
    }
}
