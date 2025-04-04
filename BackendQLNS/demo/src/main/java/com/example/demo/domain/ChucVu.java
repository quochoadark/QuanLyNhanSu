package com.example.demo.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ChucVu {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maChucVu;
    private String tenChucVu; 
    private String moTa;
    private String nguoiTao; 
    private LocalDate ngayTao;

    @OneToMany (mappedBy="maChucVu")
    List<NhanVien> maNhanVienCV;
    
    public ChucVu(){

    }

    public ChucVu(long id, String maChucVu, String moTa, LocalDate ngayTao, String nguoiTao, String tenChucVu) {
        this.id = id;
        this.maChucVu = maChucVu;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.tenChucVu = tenChucVu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
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

    public List<NhanVien> getMaNhanVienCV() {
        return maNhanVienCV;
    }

    public void setMaNhanVienCV(List<NhanVien> maNhanVienCV) {
        this.maNhanVienCV = maNhanVienCV;
    }

    @Override
    public String toString() {
        return "ChucVu [id=" + id + ", maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + ", moTa=" + moTa
                + ", nguoiTao=" + nguoiTao + ", ngayTao=" + ngayTao + "]";
    }

    
}
