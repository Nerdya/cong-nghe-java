package com.chuong3;

public class TapChi extends TaiLieu {
  int soPhatHanh;
  int thangPhatHanh;

  public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
  }

  public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh,
      int thangPhatHanh) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
    this.soPhatHanh = soPhatHanh;
    this.thangPhatHanh = thangPhatHanh;
  }

  public int getSoPhatHanh() {
    return soPhatHanh;
  }

  public void setSoPhatHanh(int soPhatHanh) {
    this.soPhatHanh = soPhatHanh;
  }

  public int getThangPhatHanh() {
    return thangPhatHanh;
  }

  public void setThangPhatHanh(int thangPhatHanh) {
    this.thangPhatHanh = thangPhatHanh;
  }

  @Override
  public void input() {
    super.input();
    setSoPhatHanh(inputInt("số phát hành", "whole"));
    setThangPhatHanh(inputInt("tháng phát hành", "positive"));
    sc.nextLine();
  }

  @Override
  public void print() {
    super.print();
    System.out.println("Số phát hành: " + getSoPhatHanh());
    System.out.println("Tháng phát hành: " + getThangPhatHanh());
  }
}
