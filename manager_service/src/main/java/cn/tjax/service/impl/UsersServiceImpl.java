package cn.tjax.service.impl;


import cn.tjax.mapper.UsersMapper;
import cn.tjax.pojo.Users;
import cn.tjax.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:洛上云雾
 * @Date:2019/8/1
 * @Description:cn.tjax.service.impl
 * @Version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
