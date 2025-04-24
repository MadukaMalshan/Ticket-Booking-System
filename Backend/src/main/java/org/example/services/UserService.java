package org.example.services;

import org.example.dto.Userdto;
import utill.UserTypes;

import java.util.List;

public interface UserService {
    List<Userdto> getAllUsers();
    Userdto getUserById(Long id);
    void createUser(Userdto userdto);
    void updateUser(Userdto userdto);
    void deleteUser(Long id);
    List<Userdto> getUsersByName(String name);
    List<Userdto> getUsersByEmail(String email);
    List<Userdto> getUsersByType(UserTypes type);
}
