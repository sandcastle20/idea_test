package cn.tjax.mapper;

import cn.tjax.pojo.Users;

import java.util.List;

/**
 * @Author:洛上云雾
 * @Date:2019/7/30
 * @Description:cn.tjax.mapper
 * @Version:1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
