package com.kt1;

import com.shared.SharedMethods;
import java.util.ArrayList;

public class QuanLyBienLai extends SharedMethods {

  private static BienLai initBienLai() {
    BienLai bienLai = new BienLai();
    bienLai.input();
    return bienLai;
  }
  private static final SharedMethods sm = new SharedMethods();

  public static void main(String[] args) {
    int n = sm.inputInt("số hộ dân", "positive");
    System.out.println();
    ArrayList<BienLai> bienLaiArrayList = new ArrayList<>();
    BienLai max, min;
    System.out.println("Hộ dân thứ " + 1 + ":");
    bienLaiArrayList.add(initBienLai());
    max = min = bienLaiArrayList.get(0);
    for (int i = 1; i < n; i++) {
      System.out.println("Hộ dân thứ " + (i + 1) + ":");
      bienLaiArrayList.add(initBienLai());
      if (max.soDien() < bienLaiArrayList.get(i).soDien()) {
        max = bienLaiArrayList.get(i);
      }
      if (min.soDien() > bienLaiArrayList.get(i).soDien()) {
        min = bienLaiArrayList.get(i);
      }
    }
    System.out.println();
    System.out.println("Danh sách các biên lai đã nhập:");
    for (int i = 0; i < n; i++) {
      System.out.println();
      System.out.println("Hộ dân thứ " + (i + 1) + ":");
      bienLaiArrayList.get(i).print();
    }
    System.out.println();
    System.out.println("Hộ dân có số điện sử dụng nhiều nhất:");
    max.print();
    System.out.println();
    System.out.println("Hộ dân có số điện sử dụng ít nhất:");
    min.print();
  }
}
