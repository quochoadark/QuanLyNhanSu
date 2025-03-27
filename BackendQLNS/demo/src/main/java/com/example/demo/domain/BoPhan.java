package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class BoPhan {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maBoPhan;
    private String tenBoPhan;
    private String moTa;
    private String nguoiTao;
    private Date ngayTao;

    public BoPhan(){

    }

    public BoPhan(long id, String maBoPhan, String tenBoPhan, String moTa, String nguoiTao, Date ngayTao) {
        this.id = id;
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
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

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "BoPhan [id=" + id + ", maBoPhan=" + maBoPhan + ", tenBoPhan=" + tenBoPhan + ", moTa=" + moTa
                + ", nguoiTao=" + nguoiTao + ", ngayTao=" + ngayTao + "]";
    }
    
    
}
