package com.team.snackpedia.repository;

import com.team.snackpedia.model.Allergy;
import com.team.snackpedia.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
