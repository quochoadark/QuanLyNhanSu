package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LoaiCong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maLoaiCong;
    private String tenLoaiCong;
    private float heSoCong;

    public LoaiCong(){

    }

    public LoaiCong(float heSoCong, long id, String maLoaiCong, String tenLoaiCong) {
        this.heSoCong = heSoCong;
        this.id = id;
        this.maLoaiCong = maLoaiCong;
        this.tenLoaiCong = tenLoaiCong;
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

    public float getHeSoCong() {
        return heSoCong;
    }

    public void setHeSoCong(float heSoCong) {
        this.heSoCong = heSoCong;
    }

    @Override
    public String toString() {
        return "LoaiCong [id=" + id + ", maLoaiCong=" + maLoaiCong + ", tenLoaiCong=" + tenLoaiCong + ", heSoCong="
                + heSoCong + "]";
    }

    
}
