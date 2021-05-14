package com.tecknews.repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findAllPostsByUserId(Integer id) throws Exception;
}
