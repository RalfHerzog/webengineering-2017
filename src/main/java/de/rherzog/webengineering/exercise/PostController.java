package de.rherzog.webengineering.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ralf on 25.04.17.
 */
@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping(value = "/post")
    public List<Post> getPostList() {
        return postService.getPostList();
    }

    @GetMapping(value = "/post/{id}")
    public Post getPostList(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PostMapping(value = "/post")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @DeleteMapping(value = "/post/{id}")
    public Boolean deletePost(@PathVariable Long id) {
        return postService.deletePost(id);
    }
}
