package org.example.repository;

import org.example.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import utill.UserTypes;

import java.util.List;

public interface UserRepositary extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByName(String name);
    List<UserEntity> findByEmail(String email);
    List<UserEntity> findByUserTypes(UserTypes type);

}
