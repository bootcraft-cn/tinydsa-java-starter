// TestS02.java — S02 Singly Linked List test driver
// Provided by tinydsa-starter. Do NOT modify.
// The tester compiles and runs this file to verify your SinglyLinkedList implementation.

import cn.bootcraft.tinydsa.SinglyLinkedList;

public class TestS02 {
    public static void main(String[] args) {
        // --- 基本操作 ---
        SinglyLinkedList sll = new SinglyLinkedList();
        emit("initial_size", String.valueOf(sll.size()));  // 0

        // --- addFirst ---
        sll.addFirst(30);
        sll.addFirst(20);
        sll.addFirst(10);
        emit("size_after_3_add_first", String.valueOf(sll.size()));  // 3
        emit("to_array_after_add_first", arrStr(sll.toArray()));  // 10,20,30

        // --- addLast ---
        SinglyLinkedList sll2 = new SinglyLinkedList();
        sll2.addLast(10);
        sll2.addLast(20);
        sll2.addLast(30);
        emit("to_array_after_add_last", arrStr(sll2.toArray()));  // 10,20,30

        // --- 混合 addFirst/addLast ---
        SinglyLinkedList sll3 = new SinglyLinkedList();
        sll3.addFirst(20);
        sll3.addLast(30);
        sll3.addFirst(10);
        emit("to_array_mixed", arrStr(sll3.toArray()));  // 10,20,30
        emit("size_mixed", String.valueOf(sll3.size()));  // 3

        // --- get ---
        emit("get_0", String.valueOf(sll3.get(0)));  // 10
        emit("get_1", String.valueOf(sll3.get(1)));  // 20
        emit("get_2", String.valueOf(sll3.get(2)));  // 30
        emit("get_out_of_bounds", String.valueOf(sll3.get(5)));  // -1
        emit("get_negative", String.valueOf(sll3.get(-1)));  // -1

        // --- removeFirst ---
        SinglyLinkedList sll4 = new SinglyLinkedList();
        sll4.addLast(10); sll4.addLast(20); sll4.addLast(30);
        emit("remove_first_val", String.valueOf(sll4.removeFirst()));  // 10
        emit("size_after_remove_first", String.valueOf(sll4.size()));  // 2
        emit("to_array_after_remove_first", arrStr(sll4.toArray()));  // 20,30

        // --- removeFirst 空链表 ---
        SinglyLinkedList sll5 = new SinglyLinkedList();
        emit("remove_first_empty", String.valueOf(sll5.removeFirst()));  // -1

        // --- removeLast ---
        SinglyLinkedList sll6 = new SinglyLinkedList();
        sll6.addLast(10); sll6.addLast(20); sll6.addLast(30);
        emit("remove_last_val", String.valueOf(sll6.removeLast()));  // 30
        emit("size_after_remove_last", String.valueOf(sll6.size()));  // 2
        emit("to_array_after_remove_last", arrStr(sll6.toArray()));  // 10,20

        // --- removeLast 空链表 ---
        SinglyLinkedList sll7 = new SinglyLinkedList();
        emit("remove_last_empty", String.valueOf(sll7.removeLast()));  // -1

        // --- removeLast 连续至空 ---
        SinglyLinkedList sll8 = new SinglyLinkedList();
        sll8.addLast(10); sll8.addLast(20); sll8.addLast(30);
        emit("remove_last_3", String.valueOf(sll8.removeLast()));  // 30
        emit("remove_last_2", String.valueOf(sll8.removeLast()));  // 20
        emit("remove_last_1", String.valueOf(sll8.removeLast()));  // 10
        emit("size_after_remove_all", String.valueOf(sll8.size()));  // 0
        emit("remove_last_when_empty", String.valueOf(sll8.removeLast()));  // -1

        // --- 删空再添加 ---
        SinglyLinkedList sll9 = new SinglyLinkedList();
        sll9.addFirst(10); sll9.addFirst(20);
        sll9.removeFirst(); sll9.removeFirst();
        emit("size_after_clear", String.valueOf(sll9.size()));  // 0
        sll9.addLast(99);
        emit("get_after_refill", String.valueOf(sll9.get(0)));  // 99
        emit("size_after_refill", String.valueOf(sll9.size()));  // 1

        // --- toArray 空链表 ---
        SinglyLinkedList sll10 = new SinglyLinkedList();
        emit("to_array_empty", arrStr(sll10.toArray()));  // (empty string)
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
