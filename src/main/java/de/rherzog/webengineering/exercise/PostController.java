package de.rherzog.webengineering.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ralf on 25.04.17.
 */
@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public List<String> getPostList() {
        return postService.getPostList();
    }

    @RequestMapping(value = "/post/add", method = RequestMethod.PUT)
    public void addPost(@RequestParam("title") String title) {
        postService.addPost(title);
    }
}
