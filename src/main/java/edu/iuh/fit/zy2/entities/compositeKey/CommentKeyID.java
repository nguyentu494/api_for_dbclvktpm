/*
 * @ (#) CommentKeyID.java   1.0     19/10/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package edu.iuh.fit.zy2.entities.compositeKey;

import edu.iuh.fit.zy2.entities.Post;
import edu.iuh.fit.zy2.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 19/10/2024
 * @version: 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class CommentKeyID implements Serializable {
    @Column(name = "comment_id")
    private LocalDateTime commentDate;
    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
