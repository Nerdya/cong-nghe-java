package com.kt2_2;

import com.shared.SharedMethods;

public class TaiLieu extends SharedMethods {
  private String maTaiLieu;
  private String tenTaiLieu;
  private int soXB;

  public TaiLieu() {
  }

  public TaiLieu(String maTaiLieu, String tenTaiLieu, int soXB) {
    this.maTaiLieu = maTaiLieu;
    this.tenTaiLieu = tenTaiLieu;
    this.soXB = soXB;
  }

  public String getMaTaiLieu() {
    return maTaiLieu;
  }

  public void setMaTaiLieu(String maTaiLieu) {
    this.maTaiLieu = maTaiLieu;
  }

  public String getTenTaiLieu() {
    return tenTaiLieu;
  }

  public void setTenTaiLieu(String tenTaiLieu) {
    this.tenTaiLieu = tenTaiLieu;
  }

  public int getSoXB() {
    return soXB;
  }

  public void setSoXB(int soXB) {
    this.soXB = soXB;
  }

  public void input() {
    setMaTaiLieu(inputString("mã tài liệu"));
    setTenTaiLieu(inputString("tên tài liệu"));
    setSoXB(inputInt("số xuất bản", "whole"));
    sc.nextLine();
  }

  public void print() {
    System.out.println("Mã tài liệu: " + getMaTaiLieu());
    System.out.println("Tên tài liệu: " + getTenTaiLieu());
    System.out.println("Số xuất bản: " + getSoXB());
  }
}
