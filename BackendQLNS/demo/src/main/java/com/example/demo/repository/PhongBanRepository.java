package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.PhongBan;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    PhongBan save(PhongBan eric);
    List<PhongBan> findAll();
    PhongBan findById(long id); // null
    void deleteById(long id);
}

