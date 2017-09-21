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
public class Number35 {


    public int searchInsert(int[] nums, int target) {

        int index=0;

        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                index=i;
                break;
            }else if (nums[nums.length-1]<target){

                index=nums.length;

            }else if (nums[0]>target){
                index=0;
                break;
            } else if (nums[i]<target&&target<nums[i+1]){
                index= i+1;
                break;

            }
        }

        return index;



    }


    @Test
    public void test(){
        int[] a={1,3,5,6};
        int p=searchInsert(a,7);
        System.out.println(p);



    }
}
