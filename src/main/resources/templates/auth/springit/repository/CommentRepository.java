package com.aleks.springit.repository;

import com.aleks.springit.domain.Comment;
import com.aleks.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
