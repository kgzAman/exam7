package com.aman.exam7.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LoginUserIdDto {
    private String name;
    private String email;

    private LocalDateTime localDateTime;

}
