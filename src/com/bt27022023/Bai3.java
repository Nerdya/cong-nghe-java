package com.bt27022023;

import java.io.IOException;
import java.util.Scanner;

public class Bai3 {
  static char ch;
  static int code;

  public static char readCharInput() throws IOException {
    System.out.print("Nhập 1 ký tự: ");
    char input = (char) System.in.read();
    while (System.in.available() > 0) {
      System.in.read();
    }
    return input;
  }

  public static void main(String[] args) {
    try {
      ch = readCharInput();
      System.out.println("Bạn nhập: " + ch);
    } catch (IOException e) {
      System.err.println("Lỗi xảy ra khi đọc ký tự: " + e.getMessage());
    }
    code = ch;
    System.out.println("Mã ASCII của " + ch + " là " + code);
    System.out.println("Ký tự trước của " + ch + " là " + (char) (code - 1));
    System.out.println("Ký tự sau của " + ch + " là " + (char) (code + 1));
  }
}
