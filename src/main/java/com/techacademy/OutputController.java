package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @Value("${thymeleaf.task}")
    private String taskText;

    @PostMapping("/output")
    public String postOutput(@RequestParam String inputValue, Model model) {
        model.addAttribute("inputValue", inputValue);
        model.addAttribute("task", taskText);
        return "output";
    }
}