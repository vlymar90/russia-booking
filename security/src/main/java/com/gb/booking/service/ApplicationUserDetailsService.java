package com.gb.booking.service;

import com.gb.booking.entity.User;
import com.gb.booking.pepository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
@Data
public class ApplicationUserDetailsService implements UserDetailsService {
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final Optional<User> user = userRepository.findByName(username);
        if(user.isEmpty()) {
            throw new UsernameNotFoundException("пользователь с именем = " + username + " не найден");
        }
        return new org.springframework.security.core.userdetails.User(user.get().getName(), user.get().getPassword(), Collections.emptyList());

    }
}
