package de.rherzog.webengineering.exercise;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ralf on 25.04.17.
 */
@Service
public class PostService {
    private int maxPostId = 1;
    private List<Post> posts = new LinkedList<>();

    public List<Post> getPostList() {
        return getPostList(10);
    }

    public List<Post> getPostList(int size) {
        return posts.subList(0, Math.min(posts.size(), size));
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Boolean deletePost(Long postId) {
        return posts.remove(getPost(postId));
    }

    public Post getPost(Long id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}
