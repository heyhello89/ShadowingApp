package com.moon.shadowing.controller;

import com.moon.shadowing.domain.UserMaster;
import com.moon.shadowing.service.UserMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("userMaster")
public class TestController {

    @Autowired
    private UserMasterService userMasterService;

    @ModelAttribute("userMaster")
    private UserMaster openapiMaster() {
        return new UserMaster();
    }

    @GetMapping("/")
    public String home(Model model) {

        return "index.html";
    }

    // TODO: html과 mapping하여 데이터 저장할 수 있도록 구현
    @PostMapping("/")
    public String home(Model model, HttpServletRequest request) {

        String id = request.getParameter("id");
        String passwd = request.getParameter("passwd");
        String username = request.getParameter("username");
        String birthday = request.getParameter("birthday");

        model.addAttribute("id", id);
        model.addAttribute("passwd", passwd);
        model.addAttribute("user_name", username);
        model.addAttribute("birthday", birthday);

        System.out.println(model.toString());

        return "redirect:/";
    }

    // TODO: User 정보를 리스트로 확인할 수 있도록 API 구
}
