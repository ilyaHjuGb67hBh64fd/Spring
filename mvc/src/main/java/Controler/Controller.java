package Controler;

import Data.Message.Users;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "/welcome";
    }
    @GetMapping("/index")
    public String getIndexOfPage(@RequestParam(name="index",required = false, defaultValue = "Page")String name, Model model){
        model.addAttribute("name", name);
        return "/index";
    }

    @GetMapping("/users")
    public String getUsers(@RequestParam(name="user",required = false, defaultValue = "UserDefault")String user, Model model){
        //model.addAttribute("name", name);
        List<Users> userList = new ArrayList<>();

        return "/users";
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