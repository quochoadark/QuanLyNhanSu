package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.BangCap;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface BangCapRepository extends JpaRepository<BangCap,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    BangCap save(BangCap eric);
    List<BangCap> findAll();
    BangCap findById(long id); // null
    void deleteById(long id);
}

