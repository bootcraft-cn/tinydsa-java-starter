package cn.bootcraft.tinydsa;

/**
 * ArrayDeque — 基于环形缓冲区的双端队列。
 *
 * <p>使用 head/tail 指针在固定数组上实现两端 O(1) 插入和删除，
 * 满时翻倍扩容。通过取模运算实现首尾环绕。</p>
 */
public class ArrayDeque {

    private static final int DEFAULT_CAPACITY = 8;

    private int[] data;
    private int head;
    private int tail;
    private int size;

    public ArrayDeque() {
        this.data = new int[DEFAULT_CAPACITY];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    /** 在头部插入元素。均摊 O(1)。 */
    public void addFirst(int val) {
        throw new UnsupportedOperationException("TODO: S04");
    }

    /** 在尾部插入元素。均摊 O(1)。 */
    public void addLast(int val) {
        throw new UnsupportedOperationException("TODO: S04");
    }

    /** 删除并返回头部元素。空队列返回 -1。O(1)。 */
    public int removeFirst() {
        throw new UnsupportedOperationException("TODO: S04");
    }

    /** 删除并返回尾部元素。空队列返回 -1。O(1)。 */
    public int removeLast() {
        throw new UnsupportedOperationException("TODO: S04");
    }

    /** 按逻辑索引访问元素。越界返回 -1。O(1)。 */
    public int get(int index) {
        throw new UnsupportedOperationException("TODO: S04");
    }

    /** 返回当前元素个数。 */
    public int size() {
        throw new UnsupportedOperationException("TODO: S04");
    }

    /** 将队列元素按逻辑顺序转为 int 数组。 */
    public int[] toArray() {
        throw new UnsupportedOperationException("TODO: S04");
    }
}
