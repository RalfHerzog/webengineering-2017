package de.rherzog.webengineering.exercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ralf on 26.04.17.
 */
@Entity
public class Post {
    private static AtomicLong nextId = new AtomicLong();
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Post() {
        this.id = nextId.getAndIncrement();
        this.createdAt = new Date();
    }
}
