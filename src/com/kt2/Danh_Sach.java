package com.kt2;

import com.shared.SharedMethods;
import java.util.ArrayList;

public class Danh_Sach {
  private static final SharedMethods sm = new SharedMethods();

  private static HocVien initHocVien(int index) {
    System.out.println("Học viên thứ " + (index + 1) + ":");
    HocVien hocVien = new HocVien();
    hocVien.input();
    return hocVien;
  }

  public static void main(String[] args) {
    int n = sm.inputInt("n", "positive");
    ArrayList<HocVien> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(initHocVien(i));
    }
    System.out.println("\nDanh sách học viên:\n");
    System.out.printf("%-10s%-30s%-30s%-10s\n", "Mã HV", "Họ tên", "Quê quán", "Điểm thi");
    for (HocVien hocVien : list) {
      hocVien.display();
    }
    int count = 0;
    float max = list.get(0).getDiemThi();
    for (HocVien hocVien : list) {
      if (hocVien.getDiemThi() >= 7.00) {
        count++;
      }
      if (max < hocVien.getDiemThi()) {
        max = hocVien.getDiemThi();
      }
    }
    float ratio = (float) count / n;
    System.out.printf("\nTỷ lệ học viên đạt điểm 7 trở lên: %.2f\n", ratio);
    System.out.println("Các học viên có điểm cao nhất danh sách:");
    System.out.printf("%-10s%-30s%-30s%-10s\n", "Mã HV", "Họ tên", "Quê quán", "Điểm thi");
    for (HocVien hocVien : list) {
      if (hocVien.getDiemThi() == max) {
        hocVien.display();
      }
    }
  }
}
