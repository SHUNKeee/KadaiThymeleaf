package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {


    @GetMapping("/input")
    public String getInput(@RequestParam(required = false) String previous, Model model) {
        model.addAttribute("task");
        if (previous != null) {
            model.addAttribute("previous", previous);
        }
        return "input";
    }
}