package com.github.toastedflaco.redditclon.repository;

import com.github.toastedflaco.redditclon.model.Comment;
import com.github.toastedflaco.redditclon.model.Post;
import com.github.toastedflaco.redditclon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
}
