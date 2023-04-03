package com.bt27022023;

import com.shared.SharedMethods;

public class Bai2 {
  static char ch;
  static SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    ch = sm.inputChar("ký tự");
    int code = ch;
    System.out.println("Mã ASCII của " + ch + " là " + code);
    System.out.println("Ký tự trước của " + ch + " là " + (char) (code - 1));
    System.out.println("Ký tự sau của " + ch + " là " + (char) (code + 1));
  }
}
