package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.BangCongTac;
import com.example.demo.repository.BangCongTacRepository;

@Service
public class BangCongTacService {

    private final BangCongTacRepository BangCongTacRepository;

    public BangCongTacService(BangCongTacRepository BangCongTacRepository) {
        this.BangCongTacRepository = BangCongTacRepository;
    }

    // Hàm lấy ra danh sách tất cả BangCongTacs
    public List<BangCongTac> getAllBangCongTacs(){
        return this.BangCongTacRepository.findAll();       
    }
    
    // Hàm lưu thông tin BangCongTac
    public BangCongTac handleSaveBangCongTac(BangCongTac BangCongTac){
        BangCongTac eric =  this.BangCongTacRepository.save(BangCongTac);
        System.out.println(eric);
        return eric;
    }

    
    public BangCongTac getBangCongTacById(long id) {
        return this.BangCongTacRepository.findById(id);
    }

    public void deleteABangCongTac(long id) {
        this.BangCongTacRepository.deleteById(id);
    }
}
