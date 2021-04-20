package alex.left.first.course03;

/**
 * 双向链表节点
 *
 * @author alex
 * @version 1.0
 * @date 2021/4/20 5:50 下午
 */
public class DoubleNode {

    public int value;
    public DoubleNode last;
    public DoubleNode next;

    public DoubleNode(int value) {
        this.value = value;
    }
}
