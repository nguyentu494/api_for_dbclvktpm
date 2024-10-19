/*
 * @ (#) CommentRepository.java   1.0     19/10/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package edu.iuh.fit.zy2.repositories;

import edu.iuh.fit.zy2.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 19/10/2024
 * @version: 1.0
 */
public interface CommentRepository extends JpaRepository<Comment, String> {
}
