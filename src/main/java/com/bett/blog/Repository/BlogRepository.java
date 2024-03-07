package com.bett.blog.Repository;

import com.bett.blog.Model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {

    Blog findByTitle(String title);
}
