package com.bett.blog.Repository;

import com.bett.blog.Model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comments,Long> {

    Comments findById(Integer id);
}
