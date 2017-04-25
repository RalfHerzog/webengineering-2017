package de.rherzog.webengineering.exercise;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ralf on 25.04.17.
 */
@Service
public class PostService {
    private List<String> posts = new LinkedList<>();

    @RequestMapping("/posts")
    public List<String> getPostList() {
        return posts;
    }

    @RequestMapping(value = "/posts/add")
    public void addPost(@RequestParam("title") String title) {
        posts.add(title);
    }
}
