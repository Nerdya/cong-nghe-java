package com.chuong3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Bao extends TaiLieu {
  LocalDate ngayPhatHanh;

  public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
  }

  public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, LocalDate ngayPhatHanh) {
    super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
    this.ngayPhatHanh = ngayPhatHanh;
  }

  public LocalDate getNgayPhatHanh() {
    return ngayPhatHanh;
  }

  public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
    this.ngayPhatHanh = ngayPhatHanh;
  }

  @Override
  public void input() {
    super.input();
//    setNgayPhatHanh(inputLocalDate("ngày phát hành"));
  }

  @Override
  public void print() {
    super.print();
    System.out.println("Ngày phát hành: " + getNgayPhatHanh());
  }
}
