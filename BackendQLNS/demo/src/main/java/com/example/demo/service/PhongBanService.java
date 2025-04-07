package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.PhongBan;
import com.example.demo.repository.PhongBanRepository;

@Service
public class PhongBanService {

    private final PhongBanRepository PhongBanRepository;

    public PhongBanService(PhongBanRepository PhongBanRepository) {
        this.PhongBanRepository = PhongBanRepository;
    }

    // Hàm lấy ra danh sách tất cả PhongBans
    public List<PhongBan> getAllPhongBans(){
        return this.PhongBanRepository.findAll();       
    }
    
    // Hàm lưu thông tin PhongBan
    public PhongBan handleSavePhongBan(PhongBan PhongBan){
        PhongBan eric =  this.PhongBanRepository.save(PhongBan);
        System.out.println(eric);
        return eric;
    }

    
    public PhongBan getPhongBanById(long id) {
        return this.PhongBanRepository.findById(id);
    }

    public void deleteAPhongBan(long id) {
        this.PhongBanRepository.deleteById(id);
    }
}
