package com.moon.shadowing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "password");

        return "index.html";
    }


    @PostMapping("/")
//    public String home(Model model, @ModelAttribute("openapiMaster") String username, @ModelAttribute("passwd") String password) {
    public String home(Model model, HttpServletRequest request) {

        String username = request.getParameter("username");
        String password = request.getParameter("passwd");

        model.addAttribute("username", username);
        model.addAttribute("password", password);

        System.out.println(username);
        System.out.println(password);
        System.out.println(model.toString());

        return "redirect:/";
    }
}
