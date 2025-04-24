package org.example.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Theaterdto {
    private Long id;
    private String name;
    private String location;
    private int capacity;
}
