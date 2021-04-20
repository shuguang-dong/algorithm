package alex.left.first.course03;

import java.util.LinkedList;
import java.util.List;

/**
 * 反转双链表
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/20 8:42 下午
 */
public class Code02ReverseDoubleNode {

    public static void main(String[] args) {
        DoubleNode a = new DoubleNode(1);
        DoubleNode b = new DoubleNode(2);
        DoubleNode c = new DoubleNode(3);
        DoubleNode d = new DoubleNode(4);
        System.out.println(reverseDoubleNode(a).value);
    }

    /**
     * 反转双链表
     *
     * @param head head
     * @return new head
     */
    public static DoubleNode reverseDoubleNode(DoubleNode head) {
        if (head == null || head.next == null) return head;
        DoubleNode pre = null;
        DoubleNode next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

}
