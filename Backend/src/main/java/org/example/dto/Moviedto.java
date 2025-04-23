package org.example.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Moviedto {
    private Long Id;
    private String name;
    private String genre;
    private String description;
}
