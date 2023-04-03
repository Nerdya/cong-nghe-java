package com.chuong3;

import com.shared.SharedMethods;

public class TaiLieu extends SharedMethods {
  private String maTaiLieu;
  private String tenNhaXuatBan;
  private int soBanPhatHanh;

  public TaiLieu() {
  }

  public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
    this.maTaiLieu = maTaiLieu;
    this.tenNhaXuatBan = tenNhaXuatBan;
    this.soBanPhatHanh = soBanPhatHanh;
  }

  public String getMaTaiLieu() {
    return maTaiLieu;
  }

  public void setMaTaiLieu(String maTaiLieu) {
    this.maTaiLieu = maTaiLieu;
  }

  public String getTenNhaXuatBan() {
    return tenNhaXuatBan;
  }

  public void setTenNhaXuatBan(String tenNhaXuatBan) {
    this.tenNhaXuatBan = tenNhaXuatBan;
  }

  public int getSoBanPhatHanh() {
    return soBanPhatHanh;
  }

  public void setSoBanPhatHanh(int soBanPhatHanh) {
    this.soBanPhatHanh = soBanPhatHanh;
  }

  public void input() {
    setMaTaiLieu(inputString("mã tài liệu"));
    setSoBanPhatHanh(inputInt("số bản phát hành", "whole"));
    sc.nextLine();
    setTenNhaXuatBan(inputString("nhà xuất bản"));
  }

  public void print() {
    System.out.println("Mã tài liệu: " + getMaTaiLieu());
    System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
    System.out.println("Nhà xuất bản: " + getTenNhaXuatBan());
  }
}
