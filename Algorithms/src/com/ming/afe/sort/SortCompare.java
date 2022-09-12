package com.ming.afe.sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * TODO 快速排序和选择排序性能测试
 *
 * @author Mingl lxm210787@gmail.com
 * @date 2022/9/12 - 22:08
 */
public class SortCompare {
    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) new InsertionSort().sort(a);
        if (alg.equals("Selection")) new SelectionSort().sort(a);
//        if (alg.equals(""))
//        if (alg.equals(""))
//        if (alg.equals(""))
//        if (alg.equals(""))
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        // 使用算法alg将T个长度为N的数组排序
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String alg1 = args[0];
        String alg2 = args[1];
        int N = Integer.parseInt(args[2]);
        int T = Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        StdOut.printf(alg1 + " need time: "+ t1 + ", " + alg2 + " need time: " + t2 + "\n");
        StdOut.printf("For %d random Doubles[%d]\n\t%s is", N, T, alg1);
        StdOut.printf(" %.1f times faster than %s\n", t2 / t1, alg2);
    }
}
