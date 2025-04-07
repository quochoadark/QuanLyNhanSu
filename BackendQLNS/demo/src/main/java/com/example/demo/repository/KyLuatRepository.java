package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.KyLuat;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface KyLuatRepository extends JpaRepository<KyLuat,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    KyLuat save(KyLuat eric);
    List<KyLuat> findAll();
    KyLuat findById(long id); // null
    void deleteById(long id);
}

