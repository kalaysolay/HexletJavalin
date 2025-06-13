package org.example.hexlet.repository;

import org.example.hexlet.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> entities = new ArrayList<User>();


    public static void save(User user) {
        user.setId((long) entities.size() + 1);
        entities.add(user);
    }

    public static List<User> getEntities() {
        return entities;
    }
}
