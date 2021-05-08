package com.aman.exam7.controllers;

import com.aman.exam7.dto.LoginUserIdDto;
import com.aman.exam7.dto.UserDto;
import com.aman.exam7.entity.User;
import com.aman.exam7.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    private UserService userService;

    @PostMapping("/registration")
    public UserDto login(@RequestBody LoginUserIdDto userDto){
        User user = User.builder()
                .name(userDto.getName())
                .build();
        this.userService.save(user);

        final User logined = this.userService.save(user);
        return UserDto.builder()
                .name(logined.getId())
                .build();
    }
}
