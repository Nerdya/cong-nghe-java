package com.bt20032023.bai1;

import com.shared.SharedMethods;
import java.util.Date;

public class Nguoi {
  private static final SharedMethods sm = new SharedMethods();
  private String hoTen;
  private Integer namSinh;
  private String ngheNghiep;

  public Nguoi() {
  }

  public Nguoi(String hoTen, Integer tuoi, Integer namSinh, String ngheNghiep) {
    this.hoTen = hoTen;
    this.namSinh = namSinh;
    this.ngheNghiep = ngheNghiep;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public Integer getNamSinh() {
    return namSinh;
  }

  public void setNamSinh(Integer namSinh) {
    this.namSinh = namSinh;
  }

  public String getNgheNghiep() {
    return ngheNghiep;
  }

  public void setNgheNghiep(String ngheNghiep) {
    this.ngheNghiep = ngheNghiep;
  }

  public Integer getTuoi() {
    return new Date().getYear() - getNamSinh();
  }

  public void input() {
    setHoTen(sm.inputString("họ tên"));
    setNamSinh(sm.inputInt("năm sinh", "whole"));
    sm.sc.nextLine();
    setNgheNghiep(sm.inputString("nghề nghiệp"));
  }

  public void display() {
    System.out.printf("%-30s%-10d%-10d%-30s\n", getHoTen(), getTuoi(), getNamSinh(), getNgheNghiep());
  }
}
