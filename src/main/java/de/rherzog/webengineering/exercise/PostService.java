package de.rherzog.webengineering.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ralf on 25.04.17.
 */
@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    private int maxPostId = 1;
    private List<Post> posts = new LinkedList<>();

    public Iterable<Post> getPostList() {
        return repository.findAll();
    }

    public Long addPost(Post post) {
        repository.save(post);
        return post.getId();
    }

    public void deletePost(Long postId) {
        repository.delete(postId);
    }

    public Post getPost(Long id) {
        return repository.findOne(id);
    }
}
