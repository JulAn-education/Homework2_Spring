package ru.gb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.domain.User;
import ru.gb.servises.UserService;

import java.util.List;

@Controller
public class UserController {
@Autowired
    private UserService userService;

 @GetMapping("/users")
    public String findAll(Model model){
     List<User> usersList = userService.findAll();
     model.addAttribute("users", usersList);
     return "user-list";
 }



    @GetMapping("/user-create")
    public String createUserForm(User user){
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user){
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable("id") int id){


     userService.deleteById(id);
        return "redirect:/users";

    }

}
