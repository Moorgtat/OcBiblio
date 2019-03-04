package org.ocbiblio.userservice.service;

import org.ocbiblio.userservice.entities.User;

public interface AccountService {
    public User saveUser(String mail, String pseudo, String password, String role);
    public User loadUserByUsername(String pseudo);
}
