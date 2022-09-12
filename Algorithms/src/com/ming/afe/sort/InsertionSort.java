package com.ming.afe.sort;

/**
 * @author Mingl lxm210787@gmail.com
 * @date 2022/9/12 - 21:48
 */
public class InsertionSort extends SortExample {
    @Override
    public void sort(Comparable[] a) {
        // 将a[]按升序排列
        int N = a.length;
        for (int i = 1; i < N; i++) {
            // 将a[i]插入到a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        new InsertionSort().test();
    }
}
