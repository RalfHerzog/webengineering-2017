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

    @GetMapping(value = "/posts")
    public List<Post> getPostList() {
        return postService.getPostList(10);
    }

    @GetMapping(value = "/posts/{id}")
    public Post getPostList(@RequestParam("id") Integer id) {
        return postService.getPost(id);
    }

    @PostMapping(value = "/posts")
    public void addPost(@RequestParam("title") String title) {
        postService.addPost(title);
    }

    @DeleteMapping(value = "/posts/{id}")
    public void deletePost(@RequestParam("id") Integer postId) {
        postService.deletePost(postId);
    }
}
