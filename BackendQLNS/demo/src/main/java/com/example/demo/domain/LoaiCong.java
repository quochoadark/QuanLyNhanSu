package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LoaiCong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maLoaiCong;
    private String tenLoaiCong;
    private double heSoCong;

        @ManyToOne
    @JoinColumn(name = "maChamCong_id")
    private ChamCong maChamCong;

    public LoaiCong(){

    }

    public LoaiCong(long id, String maLoaiCong, String tenLoaiCong, double heSoCong) {
        this.id = id;
        this.maLoaiCong = maLoaiCong;
        this.tenLoaiCong = tenLoaiCong;
        this.heSoCong = heSoCong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaLoaiCong() {
        return maLoaiCong;
    }

    public void setMaLoaiCong(String maLoaiCong) {
        this.maLoaiCong = maLoaiCong;
    }

    public String getTenLoaiCong() {
        return tenLoaiCong;
    }

    public void setTenLoaiCong(String tenLoaiCong) {
        this.tenLoaiCong = tenLoaiCong;
    }

    public double getHeSoCong() {
        return heSoCong;
    }

    public void setHeSoCong(double heSoCong) {
        this.heSoCong = heSoCong;
    }

    public ChamCong getMaChamCong() {
        return maChamCong;
    }

    public void setMaChamCong(ChamCong maChamCong) {
        this.maChamCong = maChamCong;
    }

    @Override
    public String toString() {
        return "LoaiCong [id=" + id + ", maLoaiCong=" + maLoaiCong + ", tenLoaiCong=" + tenLoaiCong + ", heSoCong="
                + heSoCong + "]";
    }
    
    
}
