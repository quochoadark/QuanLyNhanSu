package com.example.demo.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class PhongBan {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maPhongBan; 
    private String tenPhongBan;
    private String moTa;
    private String ngươiTao; 
    private LocalDate ngayTao;
     @OneToMany(mappedBy = "maPhongBan")
    List<NhanVien> maNhanVienPB; 
    
    public PhongBan(){

    }

    public PhongBan(long id, String maPhongBan, String tenPhongBan, String moTa, String ngươiTao, LocalDate ngayTao) {
        this.id = id;
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.moTa = moTa;
        this.ngươiTao = ngươiTao;
        this.ngayTao = ngayTao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgươiTao() {
        return ngươiTao;
    }

    public void setNgươiTao(String ngươiTao) {
        this.ngươiTao = ngươiTao;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public List<NhanVien> getMaNhanVienPB() {
        return maNhanVienPB;
    }

    public void setMaNhanVienPB(List<NhanVien> maNhanVienPB) {
        this.maNhanVienPB = maNhanVienPB;
    }

    @Override
    public String toString() {
        return "PhongBan [id=" + id + ", maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", moTa=" + moTa
                + ", ngươiTao=" + ngươiTao + ", ngayTao=" + ngayTao + "]";
    }

    
}
