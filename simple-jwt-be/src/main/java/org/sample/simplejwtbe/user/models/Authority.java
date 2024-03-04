package org.sample.simplejwtbe.user.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "authorities")
@Getter
@Setter
public class Authority {

    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    private UUID id;
    private String name;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;
}
