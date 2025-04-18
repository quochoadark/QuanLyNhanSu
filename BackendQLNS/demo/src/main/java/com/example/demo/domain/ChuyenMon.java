package com.example.demo.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class ChuyenMon {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maChuyenMon;
    private String tenChuyenMon; 
    private String moTa;
    private String nguoiTao;
    private LocalDate ngayTao;
     @OneToMany(mappedBy = "maChuyenMon")
    List<NhanVien> maNhanVienCM; 
    
    public ChuyenMon(){

    }

    public ChuyenMon(long id, String maChuyenMon, String tenChuyenMon, String moTa, String nguoiTao,
            LocalDate ngayTao) {
        this.id = id;
        this.maChuyenMon = maChuyenMon;
        this.tenChuyenMon = tenChuyenMon;
        this.moTa = moTa;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaChuyenMon() {
        return maChuyenMon;
    }

    public void setMaChuyenMon(String maChuyenMon) {
        this.maChuyenMon = maChuyenMon;
    }

    public String getTenChuyenMon() {
        return tenChuyenMon;
    }

    public void setTenChuyenMon(String tenChuyenMon) {
        this.tenChuyenMon = tenChuyenMon;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public List<NhanVien> getMaNhanVienCM() {
        return maNhanVienCM;
    }

    public void setMaNhanVienCM(List<NhanVien> maNhanVienCM) {
        this.maNhanVienCM = maNhanVienCM;
    }

    @Override
    public String toString() {
        return "ChuyenMon [id=" + id + ", maChuyenMon=" + maChuyenMon + ", tenChuyenMon=" + tenChuyenMon + ", moTa="
                + moTa + ", nguoiTao=" + nguoiTao + ", ngayTao=" + ngayTao + "]";
    }

       
}
