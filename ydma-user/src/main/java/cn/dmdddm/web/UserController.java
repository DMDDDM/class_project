package cn.dmdddm.web;

import cn.dmdddm.entity.UserDTO;
import cn.dmdddm.entity.YdmaResult;
import cn.dmdddm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/register")
    public YdmaResult register(UserDTO user ){

        String name = user.getName();
        String password = user.getPassword();
        return userService.addUser(name, password);
    }
    @PostMapping("/user/login")
    public YdmaResult login(UserDTO user){
        String name = user.getName();
        String password = user.getPassword();
        return userService.checkUser(name,password);
    }

    @PostMapping("/user/get")
    public YdmaResult load(int userId) {
        return userService.loadUser(userId);
    }
}
