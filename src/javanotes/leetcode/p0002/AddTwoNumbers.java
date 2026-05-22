package javanotes.leetcode.p0002;

import javanotes.foundation.datastruct.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int count1 = getListNodeSize(l1);
        int count2 = getListNodeSize(l2);
        int t = 0;
        ListNode res = null;

        if(count1 >= count2){
            res = l1;
        } else {
            res = l2;
        }

        ListNode cur = res;

        while(l1 != null && l2 != null){
            int sum = t + l1.val + l2.val;

            if(sum > 9){
                sum -= 10;
                t = 1;
            }

            res.val = sum;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(t != 0){
            res.next = new ListNode(1,null);
        }

        return cur;
    }

    private int getListNodeSize(ListNode list){
        if(list == null) {
            return 0;
        }

        ListNode cur = list;
        int res = 0;

        while(cur != null){
            cur = cur.next;
            res++;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
