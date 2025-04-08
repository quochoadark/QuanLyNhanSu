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

import com.example.demo.domain.TrinhDo;
import com.example.demo.service.TrinhDoService;



@Controller
public class TrinhDoController {
    
    private final TrinhDoService TrinhDoService;
    public TrinhDoController(TrinhDoService TrinhDoService) {
        this.TrinhDoService = TrinhDoService;
    }   
    
    @RequestMapping("/admin/trinhdo")
    public String getTrinhDoPage(Model model) {    
        List<TrinhDo> TrinhDos = this.TrinhDoService.getAllTrinhDos();
        model.addAttribute("TrinhDo1", TrinhDos);
        // Đường dẫn đến thư mục đến file
        return "admin/trinhdo/table-trinhdo";
    }
    // Xem thông tin nhân viên
    @RequestMapping("/admin/xemtrinhdo")
    public String XemTrinhDo(Model model) {    
        List<TrinhDo> TrinhDos = this.TrinhDoService.getAllTrinhDos();
        model.addAttribute("TrinhDo1", TrinhDos);
        // Đường dẫn đến thư mục đến file
        return "client/xemtrinhdo";
    }
    @RequestMapping("/admin/trinhdo/create")
    public String getCreateTrinhDoPage(Model model) {
        model.addAttribute("newTrinhDo", new TrinhDo());
        // Đường dẫn đến thư mục đến file
        return "admin/trinhdo/create";
    }

    @RequestMapping(value = "/admin/trinhdo/create", method = RequestMethod.POST)
    public String createTrinhDoPage(Model model, @ModelAttribute("newTrinhDo") TrinhDo hoidanit) {   
        this.TrinhDoService.handleSaveTrinhDo(hoidanit);
        return "redirect:/admin/trinhdo";
    } 

    // Xem chi tiết TrinhDo
    @RequestMapping("/admin/trinhdo/{id}")
    public String getTrinhDoDetailPage(Model model, @PathVariable long id) {   
        TrinhDo TrinhDo = this.TrinhDoService.getTrinhDoById(id);
        model.addAttribute("TrinhDo", TrinhDo);
        model.addAttribute("id", id);
        return "admin/trinhdo/show";
    }
    // Update TrinhDo 
    @RequestMapping("/admin/trinhdo/update/{id}")
    public String getUpdateTrinhDolPage(Model model, @PathVariable long id) {   
        TrinhDo currentTrinhDo = this.TrinhDoService.getTrinhDoById(id);
        model.addAttribute("newTrinhDo", currentTrinhDo);
        return "admin/trinhdo/update";
    }
    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/trinhdo/update")
    public String postUpdateTrinhDo(Model model, @ModelAttribute("newTrinhDo") TrinhDo hoidanit) {   
        TrinhDo currentTrinhDo = this.TrinhDoService.getTrinhDoById(hoidanit.getId());
        if (currentTrinhDo != null) {
            currentTrinhDo.setMaTrinhDo(hoidanit.getMaTrinhDo());
            currentTrinhDo.setTenTrinhDo(hoidanit.getTenTrinhDo());
            currentTrinhDo.setMoTa(hoidanit.getMoTa());
            currentTrinhDo.setNguoiTao(hoidanit.getNguoiTao());
            currentTrinhDo.setNgayTao(hoidanit.getNgayTao());
            this.TrinhDoService.handleSaveTrinhDo(currentTrinhDo);
        }
        return "redirect:/admin/trinhdo";
    }

    // Delete TrinhDo 
    @GetMapping("/admin/trinhdo/delete/{id}")
    public String getDeleteTrinhDoPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // TrinhDo TrinhDo = new TrinhDo();
        // TrinhDo.setId(id);
        model.addAttribute("newTrinhDo", new TrinhDo());
        return "admin/trinhdo/delete";
    }
    @PostMapping("/admin/trinhdo/delete")
    public String postDeleteTrinhDo(Model model, @ModelAttribute("newTrinhDo") TrinhDo eric) {
        this.TrinhDoService.deleteATrinhDo(eric.getId());
        return "redirect:/admin/trinhdo";
    }
}


