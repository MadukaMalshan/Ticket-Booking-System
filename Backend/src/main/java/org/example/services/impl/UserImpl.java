package org.example.services.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Userdto;
import org.example.entity.UserEntity;
import org.example.repository.UserRepositary;
import org.example.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import utill.UserTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepositary userRepositary;
    @Override
    public List<Userdto> getAllUsers() {
        List<Userdto> userdtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepositary.findAll();
        userEntities.forEach(userEntity -> {
            userdtos.add(modelMapper.map(userEntity, Userdto.class));
        });
        return userdtos;
    }

    @Override
    public Userdto getUserById(Long id) {
        return modelMapper.map(userRepositary.findById(id), Userdto.class);
    }

    @Override
    public void createUser(Userdto userdto) {
        userRepositary.save(modelMapper.map(userdto, UserEntity.class));
    }

    @Override
    public void updateUser(Userdto userdto) {
        userRepositary.save(modelMapper.map(userdto, UserEntity.class));
    }

    @Override
    public void deleteUser(Long id) {
        userRepositary.deleteById(id);
    }

    @Override
    public List<Userdto> getUsersByName(String name) {
        List<Userdto> userdtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepositary.findByName(name);
        userEntities.forEach(userEntity -> {
            userdtos.add(modelMapper.map(userEntity, Userdto.class));
        });
        return userdtos;
    }

    @Override
    public List<Userdto> getUsersByEmail(String email) {
        List<Userdto> userdtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepositary.findByEmail(email);
        userEntities.forEach(userEntity -> {
            userdtos.add(modelMapper.map(userEntity, Userdto.class));
        });
        return userdtos;
    }

    @Override
    public List<Userdto> getUsersByType(UserTypes type) {
        List<Userdto> userdtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepositary.findByUserTypes(type);
        userEntities.forEach(userEntity -> {
            userdtos.add(modelMapper.map(userEntity, Userdto.class));
        });
        return userdtos;
    }
}
