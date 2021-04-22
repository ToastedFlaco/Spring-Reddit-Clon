package com.github.toastedflaco.redditclon.repository;

import com.github.toastedflaco.redditclon.model.Post;
import com.github.toastedflaco.redditclon.model.User;
import com.github.toastedflaco.redditclon.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
