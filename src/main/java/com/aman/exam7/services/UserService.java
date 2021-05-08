package com.aman.exam7.services;


import com.aman.exam7.entity.User;
import com.aman.exam7.repositories.UserRepositories;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepositories userRepositories;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optUser = userRepositories.getByEmail(username);
        if(optUser.isEmpty()){
            throw new UsernameNotFoundException("Not found");
        }
        return optUser.get();
    }

    public User save(User user) {
        final Optional<User> byName= this.userRepositories.findByName(user.getUsername());

        return byName.orElseGet(() -> this.userRepositories.save(user));
    }

}
