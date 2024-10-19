package edu.iuh.fit.zy2.services;

import edu.iuh.fit.zy2.entities.Post;
import edu.iuh.fit.zy2.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> getAll (){
        return postRepository.findAll();
    }

}
