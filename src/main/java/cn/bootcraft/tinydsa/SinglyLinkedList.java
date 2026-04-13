package cn.bootcraft.tinydsa;

/**
 * SinglyLinkedList — 带哨兵节点的单链表。
 *
 * <p>使用 sentinel（哨兵）节点简化头部操作。
 * 节点通过 next 引用串联，不使用连续内存。</p>
 */
public class SinglyLinkedList {

    /** 单链表节点。 */
    static class Node {
        int val;
        Node next;

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        Node() {
            this(0, null);
        }
    }

    private final Node sentinel;
    private int size;

    public SinglyLinkedList() {
        this.sentinel = new Node();
        this.size = 0;
    }

    /** 在头部插入元素。O(1)。 */
    public void addFirst(int val) {
        throw new UnsupportedOperationException("TODO: S02");
    }

    /** 在尾部插入元素。O(n)。 */
    public void addLast(int val) {
        throw new UnsupportedOperationException("TODO: S02");
    }

    /** 删除并返回头部元素。空链表返回 -1。O(1)。 */
    public int removeFirst() {
        throw new UnsupportedOperationException("TODO: S02");
    }

    /** 删除并返回尾部元素。空链表返回 -1。O(n)。 */
    public int removeLast() {
        throw new UnsupportedOperationException("TODO: S02");
    }

    /** 按索引访问元素。越界返回 -1。O(n)。 */
    public int get(int index) {
        throw new UnsupportedOperationException("TODO: S02");
    }

    /** 返回当前元素个数。 */
    public int size() {
        throw new UnsupportedOperationException("TODO: S02");
    }

    /** 将链表元素按顺序转为 int 数组。 */
    public int[] toArray() {
        throw new UnsupportedOperationException("TODO: S02");
    }
}
