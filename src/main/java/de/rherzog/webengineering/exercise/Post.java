package de.rherzog.webengineering.exercise;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by ralf on 26.04.17.
 */
public class Post {
    private Integer id;
    private String title;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    public Post(Integer id, String title) {
        this.id = id;
        this.title = title;
        this.date = new Date();
    }
}
