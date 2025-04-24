package org.example.services.impl;

import org.example.dto.Userdto;
import org.example.services.UserService;
import utill.UserTypes;

import java.util.List;

public class UserImpl implements UserService {
    @Override
    public List<Userdto> getAllUsers() {
        return List.of();
    }

    @Override
    public Userdto getUserById(Long id) {
        return null;
    }

    @Override
    public void createUser(Userdto userdto) {

    }

    @Override
    public void updateUser(Userdto userdto) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<Userdto> getUsersByName(String name) {
        return List.of();
    }

    @Override
    public List<Userdto> getUsersByEmail(String email) {
        return List.of();
    }

    @Override
    public List<Userdto> getUsersByType(UserTypes type) {
        return List.of();
    }
}
