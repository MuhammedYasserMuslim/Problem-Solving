package com.java;

import java.util.*;

public class Advantage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            List<Long> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                long s = input.nextLong();
                list.add(s);
            }

            List<Long> list2 = new ArrayList<>(list);
            Collections.sort(list2);
            long max = list2.get(list2.size() - 1);
            long J = list2.get(list2.size() - 2);

            for (int j = 0; j < n; j++) {
                if (j != list.indexOf(max)) {
                    System.out.print(list.get(j) - max + " ");
                } else {
                    System.out.print((max - J) + " ");
                }

            }
            System.out.println();
        }
    }


}









