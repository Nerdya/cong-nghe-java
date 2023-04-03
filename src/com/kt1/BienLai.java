package com.kt1;

public class BienLai extends KhachHang {
  private int chiSoCu;
  private int chiSoMoi;

  public BienLai() {
  }

  public BienLai(String hoTen, String soNha, int maSoCongTo, int chiSoCu, int chiSoMoi) {
    super(hoTen, soNha, maSoCongTo);
    this.chiSoCu = chiSoCu;
    this.chiSoMoi = chiSoMoi;
  }

  public int getChiSoCu() {
    return chiSoCu;
  }

  public void setChiSoCu(int chiSoCu) {
    this.chiSoCu = chiSoCu;
  }

  public int getChiSoMoi() {
    return chiSoMoi;
  }

  public void setChiSoMoi(int chiSoMoi) {
    this.chiSoMoi = chiSoMoi;
  }

  public int soDien() {
    return chiSoMoi - chiSoCu;
  }

  public int thanhTien() {
    return soDien() * 750;
  }

  @Override
  public void input() {
    super.input();
    setChiSoCu(inputInt("chỉ số cũ", "whole"));
    sc.nextLine();
    setChiSoMoi(inputInt("chỉ số mới", "whole"));
    sc.nextLine();
  }

  @Override
  public void print() {
    super.print();
    System.out.println("Chỉ số cũ: " + getChiSoCu());
    System.out.println("Chỉ số mới: " + getChiSoMoi());
    System.out.println("Thành tiền: " + thanhTien());
  }
}
