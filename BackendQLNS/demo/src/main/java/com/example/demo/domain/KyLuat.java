package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KyLuat {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private int maKyLuat;
    private LocalDate ngayKhenThuong;
    private int loai;
    private NhanVien maNhanVien;
    private float soTien;
    
    public KyLuat(){

    }

    public KyLuat(long id, int maKyLuat, LocalDate ngayKhenThuong, int loai, NhanVien maNhanVien, float soTien) {
        this.id = id;
        this.maKyLuat = maKyLuat;
        this.ngayKhenThuong = ngayKhenThuong;
        this.loai = loai;
        this.maNhanVien = maNhanVien;
        this.soTien = soTien;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMaKyLuat() {
        return maKyLuat;
    }

    public void setMaKyLuat(int maKyLuat) {
        this.maKyLuat = maKyLuat;
    }

    public LocalDate getNgayKhenThuong() {
        return ngayKhenThuong;
    }

    public void setNgayKhenThuong(LocalDate ngayKhenThuong) {
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
        return "KyLuat [id=" + id + ", maKyLuat=" + maKyLuat + ", ngayKhenThuong=" + ngayKhenThuong + ", loai=" + loai
                + ", maNhanVien=" + maNhanVien + ", soTien=" + soTien + "]";
    }
    
    
}
