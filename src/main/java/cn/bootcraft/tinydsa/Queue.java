package cn.bootcraft.tinydsa;

/**
 * Queue — 基于 ArrayDeque 的队列实现（FIFO）。
 *
 * <p>将 ArrayDeque 作为底层，通过委托调用实现队列语义。
 * enqueue 在尾端，dequeue/front 在头端。</p>
 */
public class Queue {

    private final ArrayDeque deque;

    public Queue() {
        this.deque = new ArrayDeque();
    }

    /** 将元素加入队尾。 */
    public void enqueue(int val) {
        throw new UnsupportedOperationException("TODO: S05");
    }

    /** 取出并返回队首元素。空队列返回 -1。 */
    public int dequeue() {
        throw new UnsupportedOperationException("TODO: S05");
    }

    /** 查看队首元素但不取出。空队列返回 -1。 */
    public int front() {
        throw new UnsupportedOperationException("TODO: S05");
    }

    /** 返回队列中元素个数。 */
    public int queueSize() {
        throw new UnsupportedOperationException("TODO: S05");
    }
}
