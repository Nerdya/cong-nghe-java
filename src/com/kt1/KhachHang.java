package com.kt1;

import com.shared.SharedMethods;

public class KhachHang extends SharedMethods {
  private String hoTen;
  private String soNha;
  private int maSoCongTo;

  public KhachHang() {
  }

  public KhachHang(String hoTen, String soNha, int maSoCongTo) {
    this.hoTen = hoTen;
    this.soNha = soNha;
    this.maSoCongTo = maSoCongTo;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getSoNha() {
    return soNha;
  }

  public void setSoNha(String soNha) {
    this.soNha = soNha;
  }

  public int getMaSoCongTo() {
    return maSoCongTo;
  }

  public void setMaSoCongTo(int maSoCongTo) {
    this.maSoCongTo = maSoCongTo;
  }

  public void input() {
    setHoTen(inputString("họ tên"));
    setSoNha(inputString("số nhà"));
    setMaSoCongTo(inputInt("mã số công tơ", "whole"));
    sc.nextLine();
  }

  public void print() {
    System.out.println("Họ tên: " + getHoTen());
    System.out.println("Số nhà: " + getSoNha());
    System.out.println("Mã số công tơ: " + getMaSoCongTo());
  }
}
