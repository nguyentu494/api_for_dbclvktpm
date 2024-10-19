package edu.iuh.fit.zy2.controllers;

import edu.iuh.fit.zy2.entities.Post;
import edu.iuh.fit.zy2.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping
    public ResponseEntity<Post> register(@RequestBody Post post) {
        return ResponseEntity.ok(postService.createPost(post));
    }

    @GetMapping
    public ResponseEntity<List<Post>> getAll() {
        return ResponseEntity.ok(postService.getAll());
    }

}
