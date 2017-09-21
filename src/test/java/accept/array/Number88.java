package accept.array;

import org.testng.annotations.Test;

/**
 * @author chengyongjun
 * @date 2017/9/21
 * @time 10:18
 * @description
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
public class Number88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1, j=n-1, k=m+n-1;
        while (i>-1 && j>-1) nums1[k--]= (nums1[i]>nums2[j]) ? nums1[i--] : nums2[j--];
        for (int c=0;c<m+n;c++){
            System.out.println(nums1[c]);
        }

    }


    @Test
    public void test(){
        int[] a={0};
        int[] b={1};
        merge(a,0,b,1);

    }
}
