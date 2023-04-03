package com.bt20032023.bai3;

import com.shared.SharedMethods;

public class HocVien {
  private static final SharedMethods sm = new SharedMethods();
  private String maHV;
  private String hoTen;
  private String queQuan;
  private float diemThi;

  public HocVien() {
  }

  public HocVien(String maHV, String hoTen, String queQuan, float diemThi) {
    this.maHV = maHV;
    this.hoTen = hoTen;
    this.queQuan = queQuan;
    this.diemThi = diemThi;
  }

  public String getMaHV() {
    return maHV;
  }

  public void setMaHV(String maHV) {
    this.maHV = maHV;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getQueQuan() {
    return queQuan;
  }

  public void setQueQuan(String queQuan) {
    this.queQuan = queQuan;
  }

  public float getDiemThi() {
    return diemThi;
  }

  public void setDiemThi(float diemThi) {
    this.diemThi = diemThi;
  }

  public void input() {
    setMaHV(sm.inputString("mã học viên"));
    setHoTen(sm.inputString("họ tên"));
    setQueQuan(sm.inputString("quê quán"));
    setDiemThi(sm.inputFloat("điểm thi", "0..10"));
    sm.sc.nextLine();
  }

  public void display() {
    System.out.printf("%-10s%-30s%-30s%-10.2f\n", getMaHV(), getHoTen(), getQueQuan(), getDiemThi());
  }
}
