package com.bt20032023.bai1;

import com.kt1.BienLai;
import com.shared.SharedMethods;
import java.util.ArrayList;

public class HoDan {
  private static final SharedMethods sm = new SharedMethods();
  private Integer soNha;
  private Integer soThanhVien;
  private ArrayList<Nguoi> danhSachThanhVien;

  public HoDan() {
  }

  public HoDan(Integer soNha, Integer soThanhVien, ArrayList<Nguoi> danhSachThanhVien) {
    this.soNha = soNha;
    this.soThanhVien = soThanhVien;
    this.danhSachThanhVien = danhSachThanhVien;
  }

  public Integer getSoNha() {
    return soNha;
  }

  public void setSoNha(Integer soNha) {
    this.soNha = soNha;
  }

  public Integer getSoThanhVien() {
    return soThanhVien;
  }

  public void setSoThanhVien(Integer soThanhVien) {
    this.soThanhVien = soThanhVien;
  }

  public ArrayList<Nguoi> getDanhSachThanhVien() {
    return danhSachThanhVien;
  }

  public void setDanhSachThanhVien(ArrayList<Nguoi> danhSachThanhVien) {
    this.danhSachThanhVien = danhSachThanhVien;
  }

  private static Nguoi initNguoi(int index) {
    System.out.println("Thành viên thứ " + (index + 1) + ":");
    Nguoi nguoi = new Nguoi();
    nguoi.input();
    return nguoi;
  }

  public void input() {
    setSoNha(sm.inputInt("số nhà", "positive"));
    setSoThanhVien(sm.inputInt("số thành viên", "positive"));
    ArrayList<Nguoi> list = new ArrayList<>();
    for (int i = 0; i < getSoThanhVien(); i++) {
      list.add(initNguoi(i));
    }
    setDanhSachThanhVien(list);
  }

  public void display() {
    System.out.println("Số nhà: " + getSoNha());
    System.out.println("Số thành viên: " + getSoThanhVien());
    System.out.println("Danh sách thành viên: ");
    System.out.printf("%-30s%-10s%-10s%-30s\n", "Họ tên", "Tuổi", "Năm sinh", "Nghề nghiệp");
    for (Nguoi nguoi : getDanhSachThanhVien()) {
      nguoi.display();
    }
  }

  public Nguoi findByHoTen(String hoTen) {
    for (Nguoi nguoi : danhSachThanhVien) {
      if (nguoi.getHoTen().equals(hoTen)) {
        return nguoi;
      }
    }
    return null;
  }
}
