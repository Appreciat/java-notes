package javanotes.leetcode.p0005;

public class LongestPalindromicSubstring {

    class Solution {
        public String longestPalindrome(String s) {
            if(s.isEmpty()) {
                return "";
            }

            int maxLen = 0;
            int start = 0;
            for(int i = 0;i < s.length();i++){
                for(int j = i;j < s.length();j++){
                    if( helper(s, i, j) && j - i > maxLen){
                        maxLen = j - i;
                        start = i;
                    }
                }
            }
            return s.substring(start, start + maxLen + 1);
        }

        private boolean helper(String s,int l,int r){
            while(l <= r){
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l++; r--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
//        Solution solution = new LongestPalindromicSubstring().new Solution();
//        System.out.println(solution.longestPalindrome("babad"));

        String s = "abcdefg";
        System.out.println(s.substring(0, 1));
    }
}
