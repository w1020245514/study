package study.array;

import java.util.ArrayList;

/**
 * get(int index)
 * add(int value)
 * add(int index, int value)
 *
 */
public class ArrayListTest {
    private int[] data;
    private int len;

    public ArrayListTest(int capacity) {
        this.data = new int[capacity];
        this.len = capacity;
    }
}
