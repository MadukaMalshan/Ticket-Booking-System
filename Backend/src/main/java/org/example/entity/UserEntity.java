package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import utill.UserTypes;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private UserTypes userTypes;
}
