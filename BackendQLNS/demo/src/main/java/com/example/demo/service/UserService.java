package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Hàm lấy ra danh sách tất cả users
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }


    // Láy ra danh sách email tất cả users
    public List <User> getAllUsersByEmail(String email){
        return this.userRepository.findOneByEmail(email);
    }
    
    // Hàm lưu thông tin user
    public User handleSaveUser(User user){
        User eric =  this.userRepository.save(user);
        System.out.println(eric);
        return eric;
    }

    
    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }
}
