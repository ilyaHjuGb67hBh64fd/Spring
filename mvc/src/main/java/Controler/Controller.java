package com.example.servingwebcontent;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }

//    @GetMapping("/listUser")
//    public String greeting(@RequestParam(name="name", required=false) String name, Model model) {
//        model.addAttribute("name", name);
//        return "listUser";
//    }

//    @PutMapping("/welcome")
//    public String greeting(@RequestParam(name="name", required=false) String name, Model model) {
//        model.addAttribute("name", name);
//        return "welcome";
//    }

//    @DeleteMapping
//    public String greeting(@RequestParam(name="name", required=false) String name, Model model) {
//        model.addAttribute("name", name);
//        return "none";
//    }
}