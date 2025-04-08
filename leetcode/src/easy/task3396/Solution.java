package easy.task3396;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int minimumOperations(int[] nums) {
        Map<Integer, List<Integer>> indexesForNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexesForNumber.putIfAbsent(nums[i], new ArrayList<>());
            indexesForNumber.get(nums[i]).add(i);
        }
        int farest = -1;
        for (Map.Entry<Integer, List<Integer>> entry : indexesForNumber.entrySet()) {
            List<Integer> list = entry.getValue();
            if (list.size() > 1) {
                farest = Math.max(list.get(list.size() - 2), farest);
            }
        }
        if (farest == -1) {
            return 0;
        }
        return farest / 3 + 1;
    }

}
