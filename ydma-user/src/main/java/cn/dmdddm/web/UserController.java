package cn.dmdddm.web;

import cn.dmdddm.entity.YdmaResult;
import cn.dmdddm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/register")
    public YdmaResult register(String name, String password ){

        return userService.addUser(name, password);
    }
    @PostMapping("/user/login")
    public YdmaResult login(String name, String password){
        return userService.checkUser(name,password);
    }
}
