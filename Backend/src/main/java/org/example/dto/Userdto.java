package org.example.dto;

import lombok.*;
import utill.UserTypes;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Userdto {
    private Long id;
    private String name;
    private String email;
    private UserTypes userTypes;
}
