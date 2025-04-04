package com.example.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

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
    @ManyToOne
    @JoinColumn(name = "maTrinhDo_id")
    private TrinhDo maTrinhDo; 
    @ManyToOne
    @JoinColumn(name = "maChucVu_id")
    private ChucVu maChucVu;
    @ManyToOne
    @JoinColumn(name = "maPhongBan_id")
    private PhongBan maPhongBan; 
    @ManyToOne
    @JoinColumn(name = "maBangCap_id")
    private BangCap maBangCap;
    @ManyToOne
    @JoinColumn(name = "maChuyenMon_id")
    private ChuyenMon maChuyenMon; 

    private String maNhanVien; 

      @OneToMany(mappedBy = "maNhanVien")
    List<KhenThuong> maKhenThuongNV;
    @OneToMany(mappedBy = "maNhanVien")
    List<KyLuat> maKyLuatNV;
    @OneToMany(mappedBy = "maNhanVien")
    List<BangCongTac> maCongTacNV;
    @OneToMany(mappedBy = "maNhanVien")
    List<ChamCong> maChamCongNV;
    @OneToMany(mappedBy = "maNhanVien")
    List<BangLuong> maLuongNV;
    
    public NhanVien(){

    }

    public NhanVien(long id, String ho, String ten, boolean gioiTinh, int dienThoai, String diaChi, String danToc,
            String queQuan) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.danToc = danToc;
        this.queQuan = queQuan;
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

    public boolean isGioiTinh() {
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

    public List<KhenThuong> getMaKhenThuongNV() {
        return maKhenThuongNV;
    }

    public void setMaKhenThuongNV(List<KhenThuong> maKhenThuongNV) {
        this.maKhenThuongNV = maKhenThuongNV;
    }

    public List<KyLuat> getMaKyLuatNV() {
        return maKyLuatNV;
    }

    public void setMaKyLuatNV(List<KyLuat> maKyLuatNV) {
        this.maKyLuatNV = maKyLuatNV;
    }

    public List<BangCongTac> getMaCongTacNV() {
        return maCongTacNV;
    }

    public void setMaCongTacNV(List<BangCongTac> maCongTacNV) {
        this.maCongTacNV = maCongTacNV;
    }

    public List<ChamCong> getMaChamCongNV() {
        return maChamCongNV;
    }

    public void setMaChamCongNV(List<ChamCong> maChamCongNV) {
        this.maChamCongNV = maChamCongNV;
    }

    public List<BangLuong> getMaLuongNV() {
        return maLuongNV;
    }

    public void setMaLuongNV(List<BangLuong> maLuongNV) {
        this.maLuongNV = maLuongNV;
    }

    @Override
    public String toString() {
        return "NhanVien [id=" + id + ", ho=" + ho + ", ten=" + ten + ", gioiTinh=" + gioiTinh + ", dienThoai="
                + dienThoai + ", diaChi=" + diaChi + ", danToc=" + danToc + ", queQuan=" + queQuan + "]";
    }

    
}
