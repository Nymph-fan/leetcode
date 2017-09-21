package accept.array;

import org.testng.annotations.Test;

/**
 * @author chengyongjun
 * @date 2017/9/18
 * @time 15:14
 * @description
 * Given nums = [2, 7, 11, 15], target = 9,
   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
 */
public class Number1 {

    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] a=new int[2];
        for(int i=0;i<n;i++) {

            for (int j = i+1; j < n ; j++) {
                if (nums[i] + nums[j] == target) {
                   a[0]=i;a[1]=j;
                    break;
                }
            }
        }

        return a;

    }


    @Test
    public void test(){
        int[] num={2,7,11,15};
        int[] result=twoSum(num,9);
        System.out.println(result[0]+" "+result[1]);
    }



}
