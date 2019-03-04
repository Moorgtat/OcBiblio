package org.ocbiblio.userservice.service;

import org.ocbiblio.userservice.dao.UserRepository;
import org.ocbiblio.userservice.entities.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AccountServiceImpl(UserRepository appUserRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = appUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public User saveUser(String mail, String pseudo, String password, String role) {
        User user = userRepository.findByUsername(pseudo);
        if(user!=null) throw new RuntimeException("User already exists");
        User user2 = new User(mail, pseudo, password, role);
        user2.setMail(mail);
        user2.setPseudo(pseudo);
        user2.setPassword(bCryptPasswordEncoder.encode(password));
        user2.setRole("USER");
        userRepository.save(user2);
        return user2;
    }

    @Override
    public User loadUserByUsername(String pseudo) {
        return userRepository.findByUsername(pseudo);
    }
}
