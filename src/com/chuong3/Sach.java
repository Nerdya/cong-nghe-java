package com.chuong3;

public class Sach extends TaiLieu {
  String tenTacGia;
  int soTrang;

  public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
  }

  public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia,
      int soTrang) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
    this.tenTacGia = tenTacGia;
    this.soTrang = soTrang;
  }

  public String getTenTacGia() {
    return tenTacGia;
  }

  public void setTenTacGia(String tenTacGia) {
    this.tenTacGia = tenTacGia;
  }

  public int getSoTrang() {
    return soTrang;
  }

  public void setSoTrang(int soTrang) {
    this.soTrang = soTrang;
  }

  @Override
  public void input() {
    super.input();
    setTenTacGia(inputString("tác giả"));
    setSoTrang(inputInt("số trang", "whole"));
    sc.nextLine();
  }

  @Override
  public void print() {
    super.print();
    System.out.println("Tác giả: " + getTenTacGia());
    System.out.println("Số trang: " + getSoTrang());
  }
}
