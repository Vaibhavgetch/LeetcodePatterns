package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
*  Leetcode : 229
* */
class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 = 0 ;
        int maj2 = 0 ;
        int count1 = 0 ;
        int count2 = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == maj1){
                count1++ ;
            }
            else if(nums[i] == maj2){
                count2++ ;
            }
            else if(count1 == 0){
                maj1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }
            else{
                count1--; count2--;
            }
        }
        int nBy3 = nums.length/ 3 ;

        int freq1 = 0 ;
        int freq2 = 0 ;
        for(int num : nums){
            if(num == maj1) freq1++;
            if(num == maj2)freq2++;
        }

        List<Integer> ans = new ArrayList<>() ;
        if(freq1 > nBy3){
            ans.add(maj1);
        }

        if(freq2 > nBy3 && maj1 != maj2){
            ans.add(maj2);
        }
        return ans ;
    }
}