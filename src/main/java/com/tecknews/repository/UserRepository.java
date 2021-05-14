package com.tecknews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;
}
