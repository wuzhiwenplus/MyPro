package com.example.mypro.dao;

import com.example.mypro.domain.User;

public interface UserDao {
    // 增加用户
    public int addUser(int id, String name, String password);
    // 根据ID删除用户
    public int deleteUserById(int id);
    // 根据ID查询用户
    public int queryUserById(int id);
    // 修改用户
    public int updateUser(User user);
}
