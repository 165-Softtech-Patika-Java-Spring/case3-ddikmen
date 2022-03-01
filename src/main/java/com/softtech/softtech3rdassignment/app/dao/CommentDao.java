package com.softtech.softtech3rdassignment.app.dao;

import com.softtech.softtech3rdassignment.app.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {
}
