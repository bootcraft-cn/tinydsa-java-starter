// TestS04.java — S04 Array Deque test driver
// Provided by tinydsa-starter. Do NOT modify.
// The tester compiles and runs this file to verify your ArrayDeque implementation.

import cn.bootcraft.tinydsa.ArrayDeque;

public class TestS04 {
    public static void main(String[] args) {
        // --- 基本操作 ---
        ArrayDeque deque = new ArrayDeque();
        emit("initial_size", String.valueOf(deque.size()));  // 0

        // --- addLast ---
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        emit("to_array_after_add_last", arrStr(deque.toArray()));  // 10,20,30
        emit("size_after_add_last", String.valueOf(deque.size()));  // 3

        // --- addFirst ---
        ArrayDeque deque2 = new ArrayDeque();
        deque2.addFirst(30);
        deque2.addFirst(20);
        deque2.addFirst(10);
        emit("to_array_after_add_first", arrStr(deque2.toArray()));  // 10,20,30
        emit("size_after_add_first", String.valueOf(deque2.size()));  // 3

        // --- 混合 addFirst/addLast ---
        ArrayDeque deque3 = new ArrayDeque();
        deque3.addFirst(20);
        deque3.addLast(30);
        deque3.addFirst(10);
        deque3.addLast(40);
        emit("to_array_mixed", arrStr(deque3.toArray()));  // 10,20,30,40
        emit("size_mixed", String.valueOf(deque3.size()));  // 4

        // --- get（逻辑索引） ---
        emit("get_0", String.valueOf(deque3.get(0)));  // 10
        emit("get_1", String.valueOf(deque3.get(1)));  // 20
        emit("get_3", String.valueOf(deque3.get(3)));  // 40
        emit("get_out_of_bounds", String.valueOf(deque3.get(10)));  // -1
        emit("get_negative", String.valueOf(deque3.get(-1)));  // -1

        // --- removeFirst ---
        ArrayDeque deque4 = new ArrayDeque();
        deque4.addLast(10); deque4.addLast(20); deque4.addLast(30);
        emit("remove_first_val", String.valueOf(deque4.removeFirst()));  // 10
        emit("size_after_remove_first", String.valueOf(deque4.size()));  // 2
        emit("to_array_after_remove_first", arrStr(deque4.toArray()));  // 20,30

        // --- removeFirst 空队列 ---
        ArrayDeque deque5 = new ArrayDeque();
        emit("remove_first_empty", String.valueOf(deque5.removeFirst()));  // -1

        // --- removeLast ---
        ArrayDeque deque6 = new ArrayDeque();
        deque6.addLast(10); deque6.addLast(20); deque6.addLast(30);
        emit("remove_last_val", String.valueOf(deque6.removeLast()));  // 30
        emit("size_after_remove_last", String.valueOf(deque6.size()));  // 2
        emit("to_array_after_remove_last", arrStr(deque6.toArray()));  // 10,20

        // --- removeLast 空队列 ---
        ArrayDeque deque7 = new ArrayDeque();
        emit("remove_last_empty", String.valueOf(deque7.removeLast()));  // -1

        // --- 交替 removeFirst/removeLast ---
        ArrayDeque deque8 = new ArrayDeque();
        deque8.addLast(10); deque8.addLast(20); deque8.addLast(30); deque8.addLast(40);
        emit("alternate_remove_first", String.valueOf(deque8.removeFirst()));  // 10
        emit("alternate_remove_last", String.valueOf(deque8.removeLast()));  // 40
        emit("to_array_after_alternate", arrStr(deque8.toArray()));  // 20,30
        emit("size_after_alternate", String.valueOf(deque8.size()));  // 2

        // --- 环绕测试（addFirst 造成 head 环绕） ---
        ArrayDeque deque9 = new ArrayDeque();
        deque9.addLast(10);
        deque9.addLast(20);
        deque9.addLast(30);
        deque9.addFirst(5);
        deque9.addFirst(1);
        emit("to_array_wraparound", arrStr(deque9.toArray()));  // 1,5,10,20,30
        emit("size_wraparound", String.valueOf(deque9.size()));  // 5
        emit("get_0_wraparound", String.valueOf(deque9.get(0)));  // 1
        emit("get_4_wraparound", String.valueOf(deque9.get(4)));  // 30

        // --- 扩容测试（addLast 超过默认容量 8） ---
        ArrayDeque deque10 = new ArrayDeque();
        for (int i = 1; i <= 9; i++) {
            deque10.addLast(i);
        }
        emit("to_array_after_resize", arrStr(deque10.toArray()));  // 1,2,3,4,5,6,7,8,9
        emit("size_after_resize", String.valueOf(deque10.size()));  // 9
        emit("get_8_after_resize", String.valueOf(deque10.get(8)));  // 9

        // --- 扩容测试（addFirst 超过默认容量 8） ---
        ArrayDeque deque11 = new ArrayDeque();
        for (int i = 1; i <= 9; i++) {
            deque11.addFirst(i);
        }
        emit("to_array_add_first_resize", arrStr(deque11.toArray()));  // 9,8,7,6,5,4,3,2,1
        emit("size_add_first_resize", String.valueOf(deque11.size()));  // 9

        // --- 删空再添加 ---
        ArrayDeque deque12 = new ArrayDeque();
        deque12.addLast(10); deque12.addLast(20);
        deque12.removeFirst(); deque12.removeLast();
        emit("size_after_clear", String.valueOf(deque12.size()));  // 0
        deque12.addFirst(88); deque12.addLast(99);
        emit("to_array_after_refill", arrStr(deque12.toArray()));  // 88,99
        emit("size_after_refill", String.valueOf(deque12.size()));  // 2

        // --- toArray 空队列 ---
        ArrayDeque deque13 = new ArrayDeque();
        emit("to_array_empty", arrStr(deque13.toArray()));  // (empty string)
    }

    private static void emit(String testName, String result) {
        System.out.println("TEST:" + testName);
        System.out.println("RESULT:" + result);
    }

    private static String arrStr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(",");
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
