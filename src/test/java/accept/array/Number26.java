package accept.array;

import org.testng.annotations.Test;

/**
 * @author chengyongjun
 * @date 2017/9/21
 * @time 10:18
 * @descriptionGiven a sorted array, remove the duplicates in place
 * such that each element appear only once and return the new length.
 *
 */
public class Number26 {


    public int removeDuplicates(int[] nums) {
        int n=nums.length;

       if (n<2){
           return n;
       }
        int id=1;

        for (int i=1;i<n;i++){
            if(nums[i] != nums[i-1]) nums[id++] = nums[i];

        }

        return id;

    }


    @Test
    public void test(){
        int[] a={1,1,1,1};
        int l=removeDuplicates(a);
        System.out.println(l);


    }
}
