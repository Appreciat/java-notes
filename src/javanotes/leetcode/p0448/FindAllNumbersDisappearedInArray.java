package javanotes.leetcode.p0448;

import java.util.*;

public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        return solution1(nums);
    }

    private List<Integer> solution1(int [] nums){
        Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            hash.put(num, hash.get(num) + 1);
        }

        for(int i = 0;i < n;i++){
            if(!hash.containsKey(i)){
                result.add(i);
            }
        }
        return result;
    }
}
