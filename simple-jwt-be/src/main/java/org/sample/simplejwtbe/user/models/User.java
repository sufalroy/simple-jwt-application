package org.sample.simplejwtbe.user.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    private UUID id;
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_authorities",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "authorityId")
    )
    private Set<Authority> authorities;
}
