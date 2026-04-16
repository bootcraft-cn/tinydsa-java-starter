// TestS05.java — S05 Stack & Queue test driver
// Provided by tinydsa-starter. Do NOT modify.
// The tester compiles and runs this file to verify your Stack and Queue implementation.

import cn.bootcraft.tinydsa.Stack;
import cn.bootcraft.tinydsa.Queue;

public class TestS05 {
    public static void main(String[] args) {
        // ===== Stack Tests =====

        // --- 基本操作 ---
        Stack s = new Stack();
        emit("stack_initial_size", String.valueOf(s.stackSize()));  // 0

        // --- push + pop (LIFO) ---
        s.push(1);
        s.push(2);
        s.push(3);
        emit("stack_pop_1", String.valueOf(s.pop()));  // 3
        emit("stack_pop_2", String.valueOf(s.pop()));  // 2
        emit("stack_pop_3", String.valueOf(s.pop()));  // 1

        // --- 空栈 pop ---
        emit("stack_pop_empty", String.valueOf(s.pop()));  // -1

        // --- peek ---
        Stack s2 = new Stack();
        s2.push(10);
        s2.push(20);
        emit("stack_peek", String.valueOf(s2.peek()));  // 20
        emit("stack_size_after_peek", String.valueOf(s2.stackSize()));  // 2

        // --- 空栈 peek ---
        Stack s3 = new Stack();
        emit("stack_peek_empty", String.valueOf(s3.peek()));  // -1

        // --- push + pop + size ---
        Stack s4 = new Stack();
        s4.push(10);
        s4.push(20);
        s4.push(30);
        emit("stack_size_3", String.valueOf(s4.stackSize()));  // 3
        s4.pop();
        emit("stack_size_after_pop", String.valueOf(s4.stackSize()));  // 2

        // --- 多次 push/pop 交替 ---
        Stack s5 = new Stack();
        s5.push(1);
        s5.push(2);
        emit("stack_alternate_pop_1", String.valueOf(s5.pop()));  // 2
        s5.push(3);
        emit("stack_alternate_peek", String.valueOf(s5.peek()));  // 3
        emit("stack_alternate_pop_2", String.valueOf(s5.pop()));  // 3
        emit("stack_alternate_pop_3", String.valueOf(s5.pop()));  // 1
        emit("stack_alternate_size", String.valueOf(s5.stackSize()));  // 0

        // ===== Queue Tests =====

        // --- 基本操作 ---
        Queue q = new Queue();
        emit("queue_initial_size", String.valueOf(q.queueSize()));  // 0

        // --- enqueue + dequeue (FIFO) ---
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        emit("queue_dequeue_1", String.valueOf(q.dequeue()));  // 1
        emit("queue_dequeue_2", String.valueOf(q.dequeue()));  // 2
        emit("queue_dequeue_3", String.valueOf(q.dequeue()));  // 3

        // --- 空队列 dequeue ---
        emit("queue_dequeue_empty", String.valueOf(q.dequeue()));  // -1

        // --- front ---
        Queue q2 = new Queue();
        q2.enqueue(10);
        q2.enqueue(20);
        emit("queue_front", String.valueOf(q2.front()));  // 10
        emit("queue_size_after_front", String.valueOf(q2.queueSize()));  // 2

        // --- 空队列 front ---
        Queue q3 = new Queue();
        emit("queue_front_empty", String.valueOf(q3.front()));  // -1

        // --- enqueue + dequeue + size ---
        Queue q4 = new Queue();
        q4.enqueue(10);
        q4.enqueue(20);
        q4.enqueue(30);
        emit("queue_size_3", String.valueOf(q4.queueSize()));  // 3
        q4.dequeue();
        emit("queue_size_after_dequeue", String.valueOf(q4.queueSize()));  // 2

        // --- 多次 enqueue/dequeue 交替 ---
        Queue q5 = new Queue();
        q5.enqueue(1);
        q5.enqueue(2);
        emit("queue_alternate_dequeue_1", String.valueOf(q5.dequeue()));  // 1
        q5.enqueue(3);
        emit("queue_alternate_front", String.valueOf(q5.front()));  // 2
        emit("queue_alternate_dequeue_2", String.valueOf(q5.dequeue()));  // 2
        emit("queue_alternate_dequeue_3", String.valueOf(q5.dequeue()));  // 3
        emit("queue_alternate_size", String.valueOf(q5.queueSize()));  // 0
    }

    private static void emit(String testName, String result) {
        System.out.println("TEST:" + testName);
        System.out.println("RESULT:" + result);
    }
}
