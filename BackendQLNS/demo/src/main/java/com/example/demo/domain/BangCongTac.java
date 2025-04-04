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
public class BangCongTac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maCongTac; 
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc; 
    private String diaDiem; 
    private String mucTieu;
    private String nguoiTao;
    private LocalDate ngayTao;
       @ManyToOne
    @JoinColumn(name = "maNhanVien_id")
    private NhanVien maNhanVien;

        @OneToMany(mappedBy = "maCongTac")
    List<TinhTrangCongTac> maTinhTrangCongTacBCT;

    @OneToMany(mappedBy = "maCongTac")
    List<PhiCongTac> maPhiCongTacBCT;

    public BangCongTac(){
        
    }

    public BangCongTac(long id, String maCongTac, LocalDate ngayBatDau, LocalDate ngayKetThuc, String diaDiem,
            String mucTieu, String nguoiTao, LocalDate ngayTao) {
        this.id = id;
        this.maCongTac = maCongTac;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.diaDiem = diaDiem;
        this.mucTieu = mucTieu;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaCongTac() {
        return maCongTac;
    }

    public void setMaCongTac(String maCongTac) {
        this.maCongTac = maCongTac;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getMucTieu() {
        return mucTieu;
    }

    public void setMucTieu(String mucTieu) {
        this.mucTieu = mucTieu;
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

    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public List<TinhTrangCongTac> getMaTinhTrangCongTacBCT() {
        return maTinhTrangCongTacBCT;
    }

    public void setMaTinhTrangCongTacBCT(List<TinhTrangCongTac> maTinhTrangCongTacBCT) {
        this.maTinhTrangCongTacBCT = maTinhTrangCongTacBCT;
    }

    public List<PhiCongTac> getMaPhiCongTacBCT() {
        return maPhiCongTacBCT;
    }

    public void setMaPhiCongTacBCT(List<PhiCongTac> maPhiCongTacBCT) {
        this.maPhiCongTacBCT = maPhiCongTacBCT;
    }

    @Override
    public String toString() {
        return "BangCongTac [id=" + id + ", maCongTac=" + maCongTac + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc="
                + ngayKetThuc + ", diaDiem=" + diaDiem + ", mucTieu=" + mucTieu + ", nguoiTao=" + nguoiTao
                + ", ngayTao=" + ngayTao + "]";
    }

    
}
