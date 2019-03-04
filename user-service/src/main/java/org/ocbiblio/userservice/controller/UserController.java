package org.ocbiblio.userservice.controller;

import lombok.Data;
import org.ocbiblio.userservice.entities.User;
import org.ocbiblio.userservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public User register(@RequestBody  UserForm userForm){
        return  accountService.saveUser(
                userForm.getMail(),userForm.getPseudo(),userForm.getPassword(), userForm.getRole());
    }
}
@Data
class UserForm{
    private String mail;
    private String pseudo;
    private String password;
    private String role;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}