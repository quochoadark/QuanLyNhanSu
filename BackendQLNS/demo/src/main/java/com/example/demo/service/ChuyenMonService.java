package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.ChuyenMon;
import com.example.demo.repository.ChuyenMonRepository;

@Service
public class ChuyenMonService {

    private final ChuyenMonRepository ChuyenMonRepository;

    public ChuyenMonService(ChuyenMonRepository ChuyenMonRepository) {
        this.ChuyenMonRepository = ChuyenMonRepository;
    }

    // Hàm lấy ra danh sách tất cả ChuyenMons
    public List<ChuyenMon> getAllChuyenMons(){
        return this.ChuyenMonRepository.findAll();       
    }
    
    // Hàm lưu thông tin ChuyenMon
    public ChuyenMon handleSaveChuyenMon(ChuyenMon ChuyenMon){
        ChuyenMon eric =  this.ChuyenMonRepository.save(ChuyenMon);
        System.out.println(eric);
        return eric;
    }

    
    public ChuyenMon getChuyenMonById(long id) {
        return this.ChuyenMonRepository.findById(id);
    }

    public void deleteAChuyenMon(long id) {
        this.ChuyenMonRepository.deleteById(id);
    }
}
