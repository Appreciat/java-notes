package javanotes.leetcode.p0077;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    class Solution {
        private List<List<Integer>> res = new ArrayList<List<Integer>>();
        private List<Integer> t = new ArrayList<Integer>();

        void backTracking(int cur,int n,int k){

            if(t.size() == k){
                res.add(new ArrayList<>(t));
                return ;
            }

            for(int i = cur;i <= n;i++){
                t.add(i);
                backTracking(i + 1,n,k);
                t.remove(t.size() - 1);
            }
        }

        public List<List<Integer>> combine(int n, int k) {
            backTracking(1,n,k);
            return res;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();
        List<List<Integer>> res = solution.combine(4, 2);
        System.out.println(res.toString());
    }
}
