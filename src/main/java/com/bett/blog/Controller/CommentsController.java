package com.bett.blog.Controller;

import com.bett.blog.Model.Comments;
import com.bett.blog.Repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentsController {
    @Autowired
    private CommentsRepository commentsRepository;

    @PostMapping(value = "/comment",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comments PostComment(@RequestBody Comments comments){
        return commentsRepository.save(comments);
    }

    @GetMapping("/comment/{id}")
    public Comments GetCommentsWithID(@PathVariable Integer id){
        return commentsRepository.findById(id);
    }
}
