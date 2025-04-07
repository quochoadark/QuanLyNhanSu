package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.BangCongTac;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface BangCongTacRepository extends JpaRepository<BangCongTac,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    BangCongTac save(BangCongTac eric);
    List<BangCongTac> findAll();
    BangCongTac findById(long id); // null
    void deleteById(long id);
}

