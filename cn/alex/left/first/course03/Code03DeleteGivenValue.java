package alex.left.first.course03;

/**
 * 在单链表中删除给定值
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/20 9:11 下午
 */
public class Code03DeleteGivenValue {

    /**
     * 一个链表的头节点 head 和一个整数 val ，删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点
     *
     * @param head  head
     * @param value value
     * @return new head
     */
    public static SingleNode deleteGivenValue(SingleNode head, int value) {
        // 先找出链表中第一个不是value的头结点
        while (head != null) {
            if (head.value == value) head = head.next;
            else {
                break;
            }
        }
        // 遍历链表，删除值为value的数据
        SingleNode pre = head;
        SingleNode current = head;
        while (current != null) {
            if (current.value == value) pre.next = current.next;
            else pre = current;
            current = current.next;
        }
        return head;
    }
}
