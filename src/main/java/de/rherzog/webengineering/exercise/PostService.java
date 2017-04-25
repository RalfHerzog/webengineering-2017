package de.rherzog.webengineering.exercise;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ralf on 25.04.17.
 */
@Service
public class PostService {
    private List<String> posts = new LinkedList<>();

    @GetMapping("/posts")
    public List<String> getPostList() {
        return posts;
    }

    @PostMapping(value = "/posts/add")
    public void addPost(@RequestParam("title") String title) {
        posts.add(title);
    }
}
