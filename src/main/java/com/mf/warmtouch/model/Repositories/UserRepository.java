package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.News;
import com.mf.warmtouch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByUserName(String userName);
}