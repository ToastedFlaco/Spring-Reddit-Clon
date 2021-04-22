package com.github.toastedflaco.redditclon.repository;

import com.github.toastedflaco.redditclon.model.Comment;
import com.github.toastedflaco.redditclon.model.Post;
import com.github.toastedflaco.redditclon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
}
