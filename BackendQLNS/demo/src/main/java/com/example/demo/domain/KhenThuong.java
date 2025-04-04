package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class KhenThuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private int maKhenThuong;
    private LocalDate ngayKhenThuong;
    private int loai;
    private double soTien;

     @ManyToOne
    @JoinColumn(name = "maNhanVien_id")
    private NhanVien maNhanVien;
    
    public KhenThuong(){

    }

    public KhenThuong(long id, int maKhenThuong, LocalDate ngayKhenThuong, int loai, double soTien) {
        this.id = id;
        this.maKhenThuong = maKhenThuong;
        this.ngayKhenThuong = ngayKhenThuong;
        this.loai = loai;
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

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "KhenThuong [id=" + id + ", maKhenThuong=" + maKhenThuong + ", ngayKhenThuong=" + ngayKhenThuong
                + ", loai=" + loai + ", soTien=" + soTien + "]";
    }

    
}
