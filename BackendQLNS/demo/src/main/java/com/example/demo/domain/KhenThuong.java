package com.example.demo.domain;

import java.sql.Date;

public class KhenThuong {
    private int maKhenThuong;
    private Date ngayKhenThuong;
    private int loai;
    private NhanVien maNhanVien;
    private float soTien;
    public KhenThuong(int maKhenThuong, Date ngayKhenThuong, int loai, NhanVien maNhanVien, float soTien) {
        this.maKhenThuong = maKhenThuong;
        this.ngayKhenThuong = ngayKhenThuong;
        this.loai = loai;
        this.maNhanVien = maNhanVien;
        this.soTien = soTien;
    }
    public int getMaKhenThuong() {
        return maKhenThuong;
    }
    public void setMaKhenThuong(int maKhenThuong) {
        this.maKhenThuong = maKhenThuong;
    }
    public Date getNgayKhenThuong() {
        return ngayKhenThuong;
    }
    public void setNgayKhenThuong(Date ngayKhenThuong) {
        this.ngayKhenThuong = ngayKhenThuong;
    }
    public int getLoai() {
        return loai;
    }
    public void setLoai(int loai) {
        this.loai = loai;
    }
    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    public float getSoTien() {
        return soTien;
    }
    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }
    @Override
    public String toString() {
        return "KhenThuong [maKhenThuong=" + maKhenThuong + ", ngayKhenThuong=" + ngayKhenThuong + ", loai=" + loai
                + ", maNhanVien=" + maNhanVien + ", soTien=" + soTien + "]";
    }
    
        
}
