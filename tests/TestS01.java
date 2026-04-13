// TestS01.java — S01 Dynamic Array test driver
// Provided by tinydsa-starter. Do NOT modify.
// The tester compiles and runs this file to verify your DynamicArray implementation.

import cn.bootcraft.tinydsa.DynamicArray;

public class TestS01 {
    public static void main(String[] args) {
        // --- 基本操作 ---
        DynamicArray arr = new DynamicArray();
        emit("initial_size", String.valueOf(arr.size()));           // 0
        emit("initial_capacity", String.valueOf(arr.capacity()));   // 8

        // --- add + get ---
        arr.add(10);
        arr.add(20);
        arr.add(30);
        emit("size_after_3_adds", String.valueOf(arr.size()));       // 3
        emit("get_0", String.valueOf(arr.get(0)));                   // 10
        emit("get_1", String.valueOf(arr.get(1)));                   // 20
        emit("get_2", String.valueOf(arr.get(2)));                   // 30

        // --- get 越界 ---
        emit("get_out_of_bounds", String.valueOf(arr.get(5)));       // -1
        emit("get_negative", String.valueOf(arr.get(-1)));           // -1

        // --- set ---
        arr.set(1, 99);
        emit("get_after_set", String.valueOf(arr.get(1)));           // 99
        arr.set(100, 42);  // 越界，不操作
        emit("size_after_oob_set", String.valueOf(arr.size()));      // 3

        // --- 扩容 ---
        DynamicArray arr2 = new DynamicArray();
        for (int i = 0; i < 8; i++) arr2.add(i);
        emit("cap_before_expand", String.valueOf(arr2.capacity()));  // 8
        arr2.add(8);  // 第 9 个元素触发扩容
        emit("cap_after_expand", String.valueOf(arr2.capacity()));   // 16
        emit("size_after_expand", String.valueOf(arr2.size()));       // 9
        emit("get_8_after_expand", String.valueOf(arr2.get(8)));     // 8

        // --- 扩容后数据完整性 ---
        boolean intact = true;
        for (int i = 0; i < 9; i++) {
            if (arr2.get(i) != i) { intact = false; break; }
        }
        emit("data_intact_after_expand", String.valueOf(intact));    // true

        // --- removeAt 基本 ---
        DynamicArray arr3 = new DynamicArray();
        arr3.add(10); arr3.add(20); arr3.add(30); arr3.add(40);
        int removed = arr3.removeAt(1);
        emit("removeAt_return", String.valueOf(removed));             // 20
        emit("size_after_remove", String.valueOf(arr3.size()));        // 3
        emit("get_1_after_remove", String.valueOf(arr3.get(1)));       // 30
        emit("get_2_after_remove", String.valueOf(arr3.get(2)));       // 40

        // --- removeAt 越界 ---
        emit("removeAt_oob", String.valueOf(arr3.removeAt(10)));     // -1

        // --- 缩容 ---
        DynamicArray arr4 = new DynamicArray();
        for (int i = 0; i < 16; i++) arr4.add(i);
        emit("cap_16_elements", String.valueOf(arr4.capacity()));     // 16

        for (int j = 0; j < 13; j++) arr4.removeAt(arr4.size() - 1);
        emit("size_after_removes", String.valueOf(arr4.size()));       // 3
        emit("cap_after_shrink", String.valueOf(arr4.capacity()));     // 8

        // --- 缩容后数据完整性 ---
        emit("get_0_after_shrink", String.valueOf(arr4.get(0)));       // 0
        emit("get_1_after_shrink", String.valueOf(arr4.get(1)));       // 1
        emit("get_2_after_shrink", String.valueOf(arr4.get(2)));       // 2

        // --- 删空再添加 ---
        DynamicArray arr5 = new DynamicArray();
        arr5.add(1); arr5.add(2);
        arr5.removeAt(0); arr5.removeAt(0);
        emit("size_empty", String.valueOf(arr5.size()));               // 0
        arr5.add(100);
        emit("get_after_refill", String.valueOf(arr5.get(0)));         // 100
        emit("size_after_refill", String.valueOf(arr5.size()));         // 1
    }

    private static void emit(String testName, String result) {
        System.out.println("TEST:" + testName);
        System.out.println("RESULT:" + result);
    }
}
