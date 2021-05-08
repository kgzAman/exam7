package com.aman.exam7.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {

    private String name;
    private String email;

}
