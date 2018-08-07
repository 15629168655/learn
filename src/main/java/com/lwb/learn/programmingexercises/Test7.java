package com.lwb.learn.programmingexercises;

/**
 * 斐波那契数列
 *
 * 题目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Test7 {

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = -1;
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int i = 1;
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }
}
