package com.example.demo.domain;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BangCap {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maBangCap; 
    private String tenBangCap;
    private String moTa; 
    private String nguoiTao;  
    private LocalDate ngayTao;
     @OneToMany(mappedBy = "maBangCap")
    List<NhanVien> maNhanVienBC;
    public BangCap(){

    }
    public BangCap(long id, String maBangCap, String tenBangCap, String moTa, String nguoiTao, LocalDate ngayTao) {
        this.id = id;
        this.maBangCap = maBangCap;
        this.tenBangCap = tenBangCap;
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
    public String getMaBangCap() {
        return maBangCap;
    }
    public void setMaBangCap(String maBangCap) {
        this.maBangCap = maBangCap;
    }
    public String getTenBangCap() {
        return tenBangCap;
    }
    public void setTenBangCap(String tenBangCap) {
        this.tenBangCap = tenBangCap;
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
    public List<NhanVien> getMaNhanVienBC() {
        return maNhanVienBC;
    }
    public void setMaNhanVienBC(List<NhanVien> maNhanVienBC) {
        this.maNhanVienBC = maNhanVienBC;
    }
    @Override
    public String toString() {
        return "BangCap [id=" + id + ", maBangCap=" + maBangCap + ", tenBangCap=" + tenBangCap + ", moTa=" + moTa
                + ", nguoiTao=" + nguoiTao + ", ngayTao=" + ngayTao + "]";
    }
    
}
