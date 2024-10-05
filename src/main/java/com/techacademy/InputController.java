package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @Value("${thymeleaf.task}")
    private String taskText;

    @GetMapping("/input")
    public String getInput(@RequestParam(required = false) String previous, Model model) {
        model.addAttribute("task", taskText);
        if (previous != null) {
            model.addAttribute("previous", previous);
        }
        return "input";
    }
}