package cn.bootcraft.tinydsa;

/**
 * DynamicArray — 手动扩容动态数组。
 *
 * <p>底层使用固定长度的 int[] 原生数组。
 * 禁止使用 ArrayList 等 java.util 集合类。</p>
 *
 * <p>初始容量 8，满时扩容为 2 倍，使用率低于 25% 时缩容为 1/2（最小容量 8）。</p>
 */
public class DynamicArray {

    private static final int DEFAULT_CAPACITY = 8;

    private int[] data;
    private int size;

    public DynamicArray() {
        this.data = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /** 在末尾追加元素。若数组已满，先扩容再追加。 */
    public void add(int val) {
        throw new UnsupportedOperationException("TODO: S01");
    }

    /** 按索引访问元素。越界返回 -1。 */
    public int get(int index) {
        throw new UnsupportedOperationException("TODO: S01");
    }

    /** 按索引修改元素。越界不做任何操作。 */
    public void set(int index, int val) {
        throw new UnsupportedOperationException("TODO: S01");
    }

    /**
     * 按索引删除元素并返回被删除的值。
     * 删除后右侧元素左移一位。越界返回 -1。
     * 若删除后 size &lt; capacity / 4，缩容为 capacity / 2（最小 8）。
     */
    public int removeAt(int index) {
        throw new UnsupportedOperationException("TODO: S01");
    }

    /** 返回当前元素个数。 */
    public int size() {
        throw new UnsupportedOperationException("TODO: S01");
    }

    /** 返回当前底层数组的容量。 */
    public int capacity() {
        throw new UnsupportedOperationException("TODO: S01");
    }

    // ------------------------------------------------------------------
    // 内部方法（提示：你可能需要实现以下辅助方法）
    // ------------------------------------------------------------------

    /**
     * 将底层数组扩容/缩容到 newCapacity。
     * 分配新数组，用 System.arraycopy 复制已有元素，替换旧数组。
     */
    private void resize(int newCapacity) {
        throw new UnsupportedOperationException("TODO: S01");
    }
}
