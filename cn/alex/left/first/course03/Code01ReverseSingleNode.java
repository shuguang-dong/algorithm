package alex.left.first.course03;

/**
 * 单链表的反转
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/20 5:51 下午
 */
public class Code01ReverseSingleNode {

    public static void main(String[] args) {
        SingleNode a = new SingleNode(1);
        SingleNode b = new SingleNode(2);
        SingleNode c = new SingleNode(3);
        a.next = b;
        b.next = c;
        System.out.println(reverseSingleNode(a).value);
    }


    /**
     * 反转单链表
     * <p>
     * a -> b -> c -> null
     * 反转后：
     * c -> b -> a -> null
     *
     * @param head 单链表头结点
     * @return 反转后的单链表头结点
     */
    public static SingleNode reverseSingleNode(SingleNode head) {
        if (head == null || head.next == null) return head;
        SingleNode pre = null;
        SingleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
