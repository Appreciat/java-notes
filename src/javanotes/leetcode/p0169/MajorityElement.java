package javanotes.leetcode.p0169;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        Solution.majorityElement(new int[]{6,2,2,3,3,4});
    }

    class Solution {
        public static int majorityElement(int[] nums) {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return nums[nums.length / 2];
        }

    }
}
