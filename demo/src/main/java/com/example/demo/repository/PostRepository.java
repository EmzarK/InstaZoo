package com.example.demo.repository;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> finAllByUserOrderByCreatedDateDesc(User user);

    List<Post> finAllByOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);

}
