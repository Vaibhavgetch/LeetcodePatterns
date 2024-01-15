package DSA.POTD;

import java.util.*;

public class Leetcode2254 {

    public static void main(String[] args) {
        //   int[][] twoDArray = {{2, 3}, {1, 3}, {5, 4},{6, 4}};

        int[][] twoDArray = {
                {1, 3},
                {2, 3},
                {3, 6},
                {5, 6},
                {5, 7},
                {4, 5},
                {4, 8},
                {4, 9},
                {10, 4},
                {10, 9}
        };
        List<List<Integer>> winners = findWinners(twoDArray);
        System.out.println(winners);

    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lMap = new HashMap<>();

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] arr : matches) {
            int lose = arr[1];

            if(!lMap.containsKey(lose)){
                lMap.put(lose, 1);
            }
            else{
                lMap.put(lose,lMap.get(lose) + 1);
            }
        }

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for (int[] arr : matches){
            int win = arr[0];
            int lose = arr[1];

            if(!lMap.containsKey(win)){
                ans.get(0).add(win);
                lMap.put(win, 2);
            }
            if(lMap.get(lose) == 1){
                ans.get(1).add(lose);
            }
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}


