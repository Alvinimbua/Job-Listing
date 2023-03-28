package com.imbuka.joblisting.controller;

import com.imbuka.joblisting.model.Post;
import com.imbuka.joblisting.repository.PostRepository;
import com.imbuka.joblisting.repository.SearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor

/*
To disallow the CORS error on th client side.
@CrossOrigin(origins = "http://localhost:300")
if it persists you can use @CrossOrigin on every Http Method
 */
public class PostController {

    private final PostRepository postRepository;

    private final SearchRepository searchRepository;

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    @ResponseStatus(HttpStatus.OK)
    public List<Post> search(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

    @PostMapping("/addPosts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post addPost(@RequestBody Post post)  {
        return postRepository.save(post);
    }


}
