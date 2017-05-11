package de.rherzog.webengineering.exercise;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ralf on 12.05.17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
