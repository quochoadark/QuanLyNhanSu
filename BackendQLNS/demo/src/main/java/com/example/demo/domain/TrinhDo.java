package com.example.demo.domain;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TrinhDo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maTrinhDo;
    private String tenTrinhDo;
    private String moTa;
    private String nguoiTao;
    private LocalDate ngayTao;

    @OneToMany(mappedBy = "maTrinhDo")
    List<NhanVien> maNhanVienTD;

    public TrinhDo(){

    }

    public TrinhDo(long id, String maTrinhDo, String tenTrinhDo, String moTa, String nguoiTao, LocalDate ngayTao) {
        this.id = id;
        this.maTrinhDo = maTrinhDo;
        this.tenTrinhDo = tenTrinhDo;
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

    public String getMaTrinhDo() {
        return maTrinhDo;
    }

    public void setMaTrinhDo(String maTrinhDo) {
        this.maTrinhDo = maTrinhDo;
    }

    public String getTenTrinhDo() {
        return tenTrinhDo;
    }

    public void setTenTrinhDo(String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
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

    public List<NhanVien> getMaNhanVienTD() {
        return maNhanVienTD;
    }

    public void setMaNhanVienTD(List<NhanVien> maNhanVienTD) {
        this.maNhanVienTD = maNhanVienTD;
    }

    @Override
    public String toString() {
        return "TrinhDo [id=" + id + ", maTrinhDo=" + maTrinhDo + ", tenTrinhDo=" + tenTrinhDo + ", moTa=" + moTa
                + ", nguoiTao=" + nguoiTao + ", ngayTao=" + ngayTao + "]";
    }

    
}
