package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NhanVien {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ho;
    private String ten;
    private boolean  gioiTinh;
    private int dienThoai; 
    private String diaChi;
    private String danToc;
    private String queQuan; 
    private TrinhDo maTrinhDo; 
    private ChucVu maChucVu;
    private PhongBan maPhongBan; 
    private BangCap maBangCap;
    private ChuyenMon maChuyenMon; 
    private String maNhanVien; 
    
    public NhanVien(){

    }

    public NhanVien(long id, String ho, String ten, boolean gioiTinh, int dienThoai, String diaChi, String danToc,
            String queQuan, TrinhDo maTrinhDo, ChucVu maChucVu, PhongBan maPhongBan, BangCap maBangCap,
            ChuyenMon maChuyenMon, String maNhanVien) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.danToc = danToc;
        this.queQuan = queQuan;
        this.maTrinhDo = maTrinhDo;
        this.maChucVu = maChucVu;
        this.maPhongBan = maPhongBan;
        this.maBangCap = maBangCap;
        this.maChuyenMon = maChuyenMon;
        this.maNhanVien = maNhanVien;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(int dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public TrinhDo getMaTrinhDo() {
        return maTrinhDo;
    }

    public void setMaTrinhDo(TrinhDo maTrinhDo) {
        this.maTrinhDo = maTrinhDo;
    }


    public ChucVu getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(ChucVu maChucVu) {
        this.maChucVu = maChucVu;
    }

    public PhongBan getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(PhongBan maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public BangCap getMaBangCap() {
        return maBangCap;
    }

    public void setMaBangCap(BangCap maBangCap) {
        this.maBangCap = maBangCap;
    }

    public ChuyenMon getMaChuyenMon() {
        return maChuyenMon;
    }

    public void setMaChuyenMon(ChuyenMon maChuyenMon) {
        this.maChuyenMon = maChuyenMon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    @Override
    public String toString() {
        return "NhanVien [id=" + id + ", ho=" + ho + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", dienThoai="
                + dienThoai + ", diaChi=" + diaChi + ", danToc=" + danToc + ", queQuan=" + queQuan + ", maTrinhDo="
                + maTrinhDo + ", maBoPhan="  + ", maChucVu=" + maChucVu + ", maPhongBan=" + maPhongBan
                + ", maBangCap=" + maBangCap + ", maChuyenMon=" + maChuyenMon + ", maNhanVien=" + maNhanVien + "]";
    }

    
}
