package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.TrinhDo;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface TrinhDoRepository extends JpaRepository<TrinhDo,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    TrinhDo save(TrinhDo eric);
    List<TrinhDo> findAll();
    TrinhDo findById(long id); // null
    void deleteById(long id);
}

