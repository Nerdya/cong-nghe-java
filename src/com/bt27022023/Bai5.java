package com.bt27022023;

import java.util.Scanner;

public class Bai5 {

  static Scanner sc = new Scanner(System.in);

  static int findLargestFibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int fib = 0;
    int a = 0;
    int b = 1;
    int count = 0;
    while (fib <= n) {
      fib = a + b;
      a = b;
      b = fib;
      count++;
      System.out.println("f[" + count + "] = " + fib + " | a = " + a + " | b = " + b);
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.print("Nhập n: ");
    int n = sc.nextInt();
    System.out.println("Số Fibonacci lớn nhất không vượt quá n là: " + findLargestFibonacci(n));
  }
}
