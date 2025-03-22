package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    User save(User eric);
    List<User> findOneByEmail(String email);
    List<User> findAll();
    User findById(long id); // null
    void deleteById(long id);
}

