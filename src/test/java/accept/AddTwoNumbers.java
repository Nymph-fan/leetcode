package accept;

import org.testng.annotations.Test;

/**
 * @author chengyongjun
 * @date 2017/9/18
 * @time 16:16
 * @description
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
   Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers( ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode list = null;
        ListNode next = null;
        int sum = 0;
        int b = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += b;
            if (sum > 9) {
                sum -= 10;
                b = 1;
            } else {
                b = 0;
            }
            if (list == null) {
                list = new ListNode(sum);
                next = list;
            } else {
                next.next = new ListNode(sum);
                next = next.next;
            }
            sum = 0;
        }
        if (b == 1) {
            next.next = new ListNode(b);
        }
        return list;



    }


    @Test
    public void test(){
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(5);
        addTwoNumbers(l1,l2);


    }


}
