package cn.bootcraft.tinydsa;

/**
 * Stack — 基于 ArrayDeque 的栈实现（LIFO）。
 *
 * <p>将 ArrayDeque 作为底层，通过委托调用实现栈语义。
 * push/pop/peek 操作均基于 Deque 尾端。</p>
 */
public class Stack {

    private final ArrayDeque deque;

    public Stack() {
        this.deque = new ArrayDeque();
    }

    /** 将元素压入栈顶。 */
    public void push(int val) {
        throw new UnsupportedOperationException("TODO: S05");
    }

    /** 弹出并返回栈顶元素。空栈返回 -1。 */
    public int pop() {
        throw new UnsupportedOperationException("TODO: S05");
    }

    /** 查看栈顶元素但不弹出。空栈返回 -1。 */
    public int peek() {
        throw new UnsupportedOperationException("TODO: S05");
    }

    /** 返回栈中元素个数。 */
    public int stackSize() {
        throw new UnsupportedOperationException("TODO: S05");
    }
}
