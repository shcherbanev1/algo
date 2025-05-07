package medium.task986;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if (start <= end) {
                list.add(List.of(start, end));
            }
            if (firstList[i][1] > secondList[j][1]) {
                j++;
            } else {
                i++;
            }
        }
        return list.stream().map(it -> new int[]{it.get(0), it.get(1)}).toArray(int[][]::new);
    }

}
