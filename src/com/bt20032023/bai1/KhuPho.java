package com.bt20032023.bai1;

import com.shared.SharedMethods;
import java.util.ArrayList;

public class KhuPho {
  private static final SharedMethods sm = new SharedMethods();

  private static HoDan initHoDan(int index) {
    System.out.println("Hộ dân thứ " + (index + 1));
    HoDan hoDan = new HoDan();
    hoDan.input();
    return hoDan;
  }

  public static void main(String[] args) throws Exception {
    try {
      int n = sm.inputInt("n", "positive");
      ArrayList<HoDan> danhSachHoDan = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        danhSachHoDan.add(initHoDan(i));
      }
      System.out.println("\nThông tin khu phố:\n");
      int i = 0;
      for (HoDan hoDan : danhSachHoDan) {
        System.out.println("Hộ dân thứ " + (i + 1) + ":");
        hoDan.display();
        System.out.println();
        i++;
      }
      sm.sc.nextLine();
      String x = sm.inputString("họ tên người cần tìm");
      boolean found = false;
      for (HoDan hoDan : danhSachHoDan) {
        if (hoDan.findByHoTen(x) != null) {
          System.out.println("Thông tin người cần tìm:");
          System.out.printf("%-30s%-10s%-10s%-30s\n", "Họ tên", "Tuổi", "Năm sinh", "Nghề nghiệp");
          hoDan.findByHoTen(x).display();
          found = true;
          break;
        }
      }
      if (!found) {
        System.out.println("Không có thông tin người cần tìm.");
      }
    } catch (Exception e) {
      throw new Exception(e.getMessage());
    }
  }
}
