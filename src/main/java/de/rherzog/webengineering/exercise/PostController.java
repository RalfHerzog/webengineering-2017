package de.rherzog.webengineering.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ralf on 25.04.17.
 */
@RestController
public class PostController {
    private final String endpoint = "/post";

    @Autowired
    private PostService postService;

    @GetMapping(value = endpoint)
    public Iterable<Post> getPostList() {
        return postService.getPostList();
    }

    @GetMapping(value = endpoint + "/{id}")
    public Post getPostList(@PathVariable Long id) {
        return postService.getPost(id);
    }

    @PostMapping(value = endpoint)
    public void addPost(@RequestBody Post post, HttpServletResponse response) throws IOException {
        Long postId = postService.addPost(post);
        response.setHeader("Location", endpoint + "/" + postId);
        response.sendError(201);
    }

    @DeleteMapping(value = endpoint + "/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
