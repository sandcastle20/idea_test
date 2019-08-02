package cn.tjax.web.controller;

import cn.tjax.pojo.Users;
import cn.tjax.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:洛上云雾
 * @Date:2019/8/1
 * @Description:cn.tjax.web.controller
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";

    }
}
