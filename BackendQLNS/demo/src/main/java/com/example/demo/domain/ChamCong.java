package com.example.demo.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ChamCong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maChamCong; 
    private LocalDate ngayCong;  
    
        @ManyToOne
    @JoinColumn(name = "maNhanVien_id")
    private NhanVien maNhanVien;

       @OneToMany(mappedBy = "maChamCong")
    List<LoaiCong> maLoaiCongCC;

    @OneToMany(mappedBy = "maChamCong")
    List<TangCa> maTangCaCC;

    public ChamCong(){

    }

    public ChamCong(long id, String maChamCong, LocalDate ngayCong) {
        this.id = id;
        this.maChamCong = maChamCong;
        this.ngayCong = ngayCong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaChamCong() {
        return maChamCong;
    }

    public void setMaChamCong(String maChamCong) {
        this.maChamCong = maChamCong;
    }

    public LocalDate getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(LocalDate ngayCong) {
        this.ngayCong = ngayCong;
    }

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public List<LoaiCong> getMaLoaiCongCC() {
        return maLoaiCongCC;
    }

    public void setMaLoaiCongCC(List<LoaiCong> maLoaiCongCC) {
        this.maLoaiCongCC = maLoaiCongCC;
    }

    public List<TangCa> getMaTangCaCC() {
        return maTangCaCC;
    }

    public void setMaTangCaCC(List<TangCa> maTangCaCC) {
        this.maTangCaCC = maTangCaCC;
    }

    @Override
    public String toString() {
        return "ChamCong [id=" + id + ", maChamCong=" + maChamCong + ", ngayCong=" + ngayCong + "]";
    }

    
}
