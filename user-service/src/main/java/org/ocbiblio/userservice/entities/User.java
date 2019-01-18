package org.ocbiblio.userservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Size(min = 10, max = 50)
    private String mail;
    @Size(min = 4, max = 50)
    private String pseudo;
    @Size(min = 4, max = 20)
    private String password;
    @Size(min = 4, max = 20)
    private String role;

    public User(@Size(min = 10, max = 50) String mail, @Size(min = 4, max = 50) String pseudo, @Size(min = 4, max = 20) String password, @Size(min = 4, max = 20) String role) {
        this.mail = mail;
        this.pseudo = pseudo;
        this.password = password;
        this.role = role;
    }
}
