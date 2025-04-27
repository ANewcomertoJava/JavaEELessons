package ru.itis.lessonservlet.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminInfoController {

    @GetMapping("/main")
    public String getMainPape() {
        return "main";
    }
}
