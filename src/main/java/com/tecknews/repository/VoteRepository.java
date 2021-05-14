package com.tecknews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    @Query("SELECT count(*) FROM Vote v where v.postId = :id")
    int countVotesByPostId(@Param("id") Integer id);
}
