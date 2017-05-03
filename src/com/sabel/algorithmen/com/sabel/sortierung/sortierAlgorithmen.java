package com.sabel.algorithmen.com.sabel.sortierung;

import java.util.Arrays;

/**
 * Created by m.strohmayer on 03.05.2017.
 */
public class sortierAlgorithmen {
    public static void main(String[] args) {

        int[] test = {45,12,97,42,13,13,66,1};
        int[] ergebnis = sort(test);
        System.out.println(Arrays.toString(ergebnis));
    }

    // Merge-Sort
    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }

    public static int[] sort(int[] a) {
        int l = a.length / 2;
        if (l == 0) {
            return a;
        }
        int[] b = new int[l];
        int[] c = new int[a.length - l];
        for (int i = 0; i < l; i++) {
            b[i]= a[i];
        }

        for (int i = l;i < a.length; i++) {
            c[i-l] = a[i];
        }
        return merge(sort(b),sort(c));
    }
}
