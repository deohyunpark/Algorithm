package com.example.demo.baekjoon;


import java.util.Scanner;

public class p_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        int b = Integer.parseInt(sc.next());
        int[] result = N.chars()
                .map(c -> Character.isDigit(c) ? c - '0' : Character.toUpperCase(c) - 'A' + 10)
                .toArray();

        int tmp = 0;
        for (int i = 0; i < result.length; i++) {
            tmp += result[i] * (int) Math.pow(b, (result.length - (i + 1)));
        }
        System.out.println(tmp);
    }
}
