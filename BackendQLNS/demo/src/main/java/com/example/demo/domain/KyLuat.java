package com.example.demo.domain;

import java.sql.Date;

public class KyLuat {
    private int maKyLuat;
    private Date ngayKhenThuong;
    private int loai;
    private NhanVien maNhanVien;
    private float soTien;
    public KyLuat(int maKyLuat, Date ngayKhenThuong, int loai, NhanVien maNhanVien, float soTien) {
        this.maKyLuat = maKyLuat;
        this.ngayKhenThuong = ngayKhenThuong;
        this.loai = loai;
        this.maNhanVien = maNhanVien;
        this.soTien = soTien;
    }
    public int getMaKyLuat() {
        return maKyLuat;
    }
    public void setMaKyLuat(int maKyLuat) {
        this.maKyLuat = maKyLuat;
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
        return "KyLuat [maKyLuat=" + maKyLuat + ", ngayKhenThuong=" + ngayKhenThuong + ", loai=" + loai
                + ", maNhanVien=" + maNhanVien + ", soTien=" + soTien + "]";
    }

        
}
