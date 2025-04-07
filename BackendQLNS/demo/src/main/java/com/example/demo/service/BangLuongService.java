package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.BangLuong;
import com.example.demo.repository.BangLuongRepository;

@Service
public class BangLuongService {

    private final BangLuongRepository BangLuongRepository;

    public BangLuongService(BangLuongRepository BangLuongRepository) {
        this.BangLuongRepository = BangLuongRepository;
    }

    // Hàm lấy ra danh sách tất cả BangLuongs
    public List<BangLuong> getAllBangLuongs(){
        return this.BangLuongRepository.findAll();       
    }
    
    // Hàm lưu thông tin BangLuong
    public BangLuong handleSaveBangLuong(BangLuong BangLuong){
        BangLuong eric =  this.BangLuongRepository.save(BangLuong);
        System.out.println(eric);
        return eric;
    }

    
    public BangLuong getBangLuongById(long id) {
        return this.BangLuongRepository.findById(id);
    }

    public void deleteABangLuong(long id) {
        this.BangLuongRepository.deleteById(id);
    }
}
