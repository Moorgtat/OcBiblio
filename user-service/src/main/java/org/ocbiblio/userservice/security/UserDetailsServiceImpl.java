package org.ocbiblio.userservice.security;

import org.ocbiblio.userservice.entities.User;
import org.ocbiblio.userservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String pseudo) throws UsernameNotFoundException {
        User user=accountService.loadUserByUsername(pseudo);
        if(user==null) throw new UsernameNotFoundException("invalid user");
        return loadUserByUsername(pseudo);
    }
}