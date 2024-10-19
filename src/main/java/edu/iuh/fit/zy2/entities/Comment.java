/*
 * @ (#) Comment.java   1.0     19/10/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package edu.iuh.fit.zy2.entities;

import edu.iuh.fit.zy2.entities.compositeKey.CommentKeyID;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 19/10/2024
 * @version: 1.0
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @EmbeddedId
    private CommentKeyID commentKeyID;
    private String contents;
    private int likes;

}
