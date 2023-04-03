package com.kt2_2;

public class Sach extends TaiLieu {
  String tacGia;
  int namXuatBan;
  int giaTien;

  public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
  }

  public Sach(String maTaiLieu, String tenTaiLieu, int soXuatBan, String tacGia, int namXuatBan,
      int giaTien) {
    super(maTaiLieu, tenTaiLieu, soXuatBan);
    this.tacGia = tacGia;
    this.namXuatBan = namXuatBan;
    this.giaTien = giaTien;
  }

  public String getTacGia() {
    return tacGia;
  }

  public void setTacGia(String tacGia) {
    this.tacGia = tacGia;
  }

  public int getNamXuatBan() {
    return namXuatBan;
  }

  public void setNamXuatBan(int namXuatBan) {
    this.namXuatBan = namXuatBan;
  }

  @Override
  public void input() {
    super.input();
    setTacGia(inputString("tác giả"));
    setNamXuatBan(inputInt("năm xuất bản", "whole"));
    sc.nextLine();
  }

  @Override
  public void print() {
    super.print();
    System.out.println("Tác giả: " + getTacGia());
    System.out.println("Số trang: " + getNamXuatBan());
  }
}
