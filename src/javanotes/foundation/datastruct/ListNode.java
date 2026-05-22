package javanotes.foundation.datastruct;

/**
 * Java语言实现单链表
 * @author 杨渡翔
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        this.val = x;
    }

    public ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }

    public boolean insertAfter(ListNode newNode) {
        if (newNode == null) {
            return false;
        }
        newNode.next = this.next;
        this.next = newNode;
        return true;
    }

}
