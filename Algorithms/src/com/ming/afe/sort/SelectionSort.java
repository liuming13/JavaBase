package com.ming.afe.sort;

import org.junit.Test;

/**
 * TODO 选择排序
 * @author Mingl lxm210787@gmail.com
 * @date 2022/9/12 - 21:19
 */
public class SelectionSort extends SortExampleAbs {
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // 将a[1]和a[i+1..N]中最小的元素交换
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }

    @Test
    public void selectionSortTest() {
        new SelectionSort().test();
    }
}
