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
    public List<String> getPostList() {
        return postService.getPostList();
    }

    @PostMapping(value = "/posts")
    public void addPost(@RequestParam("title") String title) {
        postService.addPost(title);
    }
}
