package edu.iuh.fit.zy2.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String username;
    private String password;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Post> posts;
}
