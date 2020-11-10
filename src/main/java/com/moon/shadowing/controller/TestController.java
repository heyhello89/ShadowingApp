package com.moon.shadowing.controller;

import com.moon.shadowing.domain.UserMaster;
import com.moon.shadowing.repository.UserMasterRepository;
import com.moon.shadowing.service.UserMasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@SessionAttributes("userMaster")
public class TestController {

    @Autowired
    private UserMasterService userMasterService;

    @Autowired
    private UserMasterRepository userMasterRepository;

    @ModelAttribute("userMaster")
    private UserMaster openapiMaster() {
        return new UserMaster();
    }

    @GetMapping("/")
    public String home(Model model) {

        return "index.html";
    }

    @PostMapping("/")
    public String home(Model model, @ModelAttribute("userMaster") UserMaster master, BindingResult bindingResult, HttpServletRequest request, SessionStatus sessionStatus, RedirectAttributes redirectAttributes) {

//        String id = request.getParameter("id");
//        String passwd = request.getParameter("passwd");
//        String username = request.getParameter("username");
//        String birthday = request.getParameter("birthday");
//
//        model.addAttribute("id", id);
//        model.addAttribute("passwd", passwd);
//        model.addAttribute("user_name", username);
//        model.addAttribute("birthday", birthday);

        if(bindingResult.hasErrors()) {
            model.addAttribute("errorMessage", "입력값을 확인해주세요.");
            return "/";
        }

        System.out.println(model.toString());
        System.out.println(master.getId());

        UserMaster saved = userMasterRepository.save(master);
        log.info("[saved master] {}", saved.toString());
        sessionStatus.setComplete();
        redirectAttributes.addFlashAttribute("resultMessage", "등록되었습니다.");

        return "redirect:/";
    }

    // TODO: User 정보를 리스트로 확인할 수 있도록 API 구현
}
