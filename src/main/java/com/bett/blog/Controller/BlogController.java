package com.bett.blog.Controller;

import com.bett.blog.Model.Blog;
import com.bett.blog.Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;

    @GetMapping(value = "/post")
    public List<Blog> FindBlogs(){
       return blogRepository.findAll();
    }
    @PostMapping(value = "/post",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Blog save(@RequestBody Blog blog){
        return blogRepository.save(blog);
    }

}
