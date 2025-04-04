package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TinhTrangCongTac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maTinhTrangCongTac; 
    private String trangThai; 
    private LocalDate ngayCapNhat;

       @ManyToOne
    @JoinColumn(name = "maCongTac_id")
    private BangCongTac maCongTac;

    public TinhTrangCongTac(){

    }

    public TinhTrangCongTac(long id, String maTinhTrangCongTac, String trangThai, LocalDate ngayCapNhat) {
        this.id = id;
        this.maTinhTrangCongTac = maTinhTrangCongTac;
        this.trangThai = trangThai;
        this.ngayCapNhat = ngayCapNhat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaTinhTrangCongTac() {
        return maTinhTrangCongTac;
    }

    public void setMaTinhTrangCongTac(String maTinhTrangCongTac) {
        this.maTinhTrangCongTac = maTinhTrangCongTac;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public LocalDate getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(LocalDate ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public BangCongTac getMaCongTac() {
        return maCongTac;
    }

    public void setMaCongTac(BangCongTac maCongTac) {
        this.maCongTac = maCongTac;
    }

    @Override
    public String toString() {
        return "TinhTrangCongTac [id=" + id + ", maTinhTrangCongTac=" + maTinhTrangCongTac + ", trangThai=" + trangThai
                + ", ngayCapNhat=" + ngayCapNhat + "]";
    }

    
}
