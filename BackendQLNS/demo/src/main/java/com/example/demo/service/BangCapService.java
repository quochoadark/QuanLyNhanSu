package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.BangCap;
import com.example.demo.repository.BangCapRepository;

@Service
public class BangCapService {

    private final BangCapRepository BangCapRepository;

    public BangCapService(BangCapRepository BangCapRepository) {
        this.BangCapRepository = BangCapRepository;
    }

    // Hàm lấy ra danh sách tất cả BangCaps
    public List<BangCap> getAllBangCaps(){
        return this.BangCapRepository.findAll();       
    }
    
    // Hàm lưu thông tin BangCap
    public BangCap handleSaveBangCap(BangCap BangCap){
        BangCap eric =  this.BangCapRepository.save(BangCap);
        System.out.println(eric);
        return eric;
    }

    
    public BangCap getBangCapById(long id) {
        return this.BangCapRepository.findById(id);
    }

    public void deleteABangCap(long id) {
        this.BangCapRepository.deleteById(id);
    }
}
