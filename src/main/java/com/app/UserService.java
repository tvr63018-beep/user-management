package com.app;

import java.util.*;

public class UserService {
    private Map<Integer, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public void updateUser(int id, String name) {
        if(users.containsKey(id)) {
            users.get(id).setName(name);
        }
    }

    public void deleteUser(int id) {
        users.remove(id);
    }

    public int getUserCount() {
        return users.size();
    }
}
