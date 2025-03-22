package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;



@Controller
public class UserController {
    
  private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }   
    @RequestMapping("/")
    public String getHomePage(Model model){   // Model là 1 thư viện 
        List <User> arrUsers = this.userService.getAllUsers();
        System.out.println(arrUsers);
        model.addAttribute("eric","test");   // addAttribute (khởi tạo biến, nội dung hoặc hàm)
        model.addAttribute("hoidanit","from controller with model");
        return "hello";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {    
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("users1", users);
        // Đường dẫn đến thư mục đến file
        return "admin/user/table-user";
    }
    @RequestMapping("/admin/user/create")
    public String getCreateUserPage(Model model) {
        model.addAttribute("newUser", new User());
        // Đường dẫn đến thư mục đến file
        return "admin/user/create";
    }

    // Tạo 1 đường dẫn để kết nối client với sever 
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    // Lấy ra dữ liệu của client (ModelAttribute("lấy ra tên User" User + tên))  
    public String createUserPage(Model model, @ModelAttribute("newUser") User hoidanit) {   
        // Khi người dùng nhập vào những gì nó sẽ hiển thị ở terminal
        // System.out.println("Run here" + hoidanit);  // + cho tên đã tạo ở trên
        // Lấy ra hàm ở bên repository để lưu dữ liệu vào database 
        this.userService.handleSaveUser(hoidanit);
        return "redirect:/admin/user";
    } 

    // Xem chi tiết user
    @RequestMapping("/admin/user/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id) {   
        User user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "admin/user/show";
    }
    // Update user 
    @RequestMapping("/admin/user/update/{id}")
    public String getUpdateUserlPage(Model model, @PathVariable long id) {   
        User currentUser = this.userService.getUserById(id);
        model.addAttribute("newUser", currentUser);
        return "admin/user/update";
    }
    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/user/update")
    public String postUpdateUser(Model model, @ModelAttribute("newUser") User hoidanit) {   
        User currentUser = this.userService.getUserById(hoidanit.getId());
        if (currentUser != null) {
            currentUser.setAddress(hoidanit.getAddress());
            currentUser.setFullName(hoidanit.getFullName());
            currentUser.setPhone(hoidanit.getPhone());
            this.userService.handleSaveUser(currentUser);
        }
        return "redirect:/admin/user";
    }

    // Delete user 
    @GetMapping("/admin/user/delete/{id}")
    public String getDeleteUserPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // User user = new User();
        // user.setId(id);
        model.addAttribute("newUser", new User());
        return "admin/user/delete";
    }
    @PostMapping("/admin/user/delete")
    public String postDeleteUser(Model model, @ModelAttribute("newUser") User eric) {
        this.userService.deleteAUser(eric.getId());
        return "redirect:/admin/user";
    }
}


