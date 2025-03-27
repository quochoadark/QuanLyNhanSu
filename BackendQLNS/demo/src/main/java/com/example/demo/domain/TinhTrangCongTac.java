package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TinhTrangCongTac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maTinhTragnCongTac; 
    private BangCongTac maCongTac; 
    private String trangThai; 
    private Date ngayCapNhat;

    public TinhTrangCongTac(){

    }

    public TinhTrangCongTac(long id, String maTinhTragnCongTac, BangCongTac maCongTac, String trangThai,
            Date ngayCapNhat) {
        this.id = id;
        this.maTinhTragnCongTac = maTinhTragnCongTac;
        this.maCongTac = maCongTac;
        this.trangThai = trangThai;
        this.ngayCapNhat = ngayCapNhat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaTinhTragnCongTac() {
        return maTinhTragnCongTac;
    }

    public void setMaTinhTragnCongTac(String maTinhTragnCongTac) {
        this.maTinhTragnCongTac = maTinhTragnCongTac;
    }

    public BangCongTac getMaCongTac() {
        return maCongTac;
    }

    public void setMaCongTac(BangCongTac maCongTac) {
        this.maCongTac = maCongTac;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public String toString() {
        return "TinhTrangCongTac [id=" + id + ", maTinhTragnCongTac=" + maTinhTragnCongTac + ", maCongTac=" + maCongTac
                + ", trangThai=" + trangThai + ", ngayCapNhat=" + ngayCapNhat + "]";
    }
    
    
}
