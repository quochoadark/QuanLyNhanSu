package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KhenThuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private int maKhenThuong;
    private Date ngayKhenThuong;
    private int loai;
    private NhanVien maNhanVien;
    private float soTien;
    
    public KhenThuong(){

    }

    public KhenThuong(long id, int maKhenThuong, Date ngayKhenThuong, int loai, NhanVien maNhanVien, float soTien) {
        this.id = id;
        this.maKhenThuong = maKhenThuong;
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
        return "KhenThuong [id=" + id + ", maKhenThuong=" + maKhenThuong + ", ngayKhenThuong=" + ngayKhenThuong
                + ", loai=" + loai + ", maNhanVien=" + maNhanVien + ", soTien=" + soTien + "]";
    }
    
    
}
