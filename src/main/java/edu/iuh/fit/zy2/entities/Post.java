package edu.iuh.fit.zy2.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post
{
    @Id
    @Column(name = "post_id")
    private String id;
    private String title;
    private String content;
    private int views;
    private int likes;
    private int shares;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;
}
