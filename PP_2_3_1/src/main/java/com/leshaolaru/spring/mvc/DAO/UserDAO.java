package com.leshaolaru.spring.mvc.DAO;

import com.leshaolaru.spring.mvc.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
