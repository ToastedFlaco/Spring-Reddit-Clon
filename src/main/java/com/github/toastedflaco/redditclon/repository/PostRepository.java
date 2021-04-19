package com.github.toastedflaco.redditclon.repository;

import com.github.toastedflaco.redditclon.model.Post;
import com.github.toastedflaco.redditclon.model.Subreddit;
import com.github.toastedflaco.redditclon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);
    List<Post> findByUser(User user);
}
