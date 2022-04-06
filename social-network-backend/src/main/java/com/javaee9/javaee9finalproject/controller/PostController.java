package com.javaee9.javaee9finalproject.controller;

import com.javaee9.javaee9finalproject.dto.PostDto;
import com.javaee9.javaee9finalproject.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // /readRecentPosts - never ever!!!!
    // /posts?boundary= vs /posts/recent
    @GetMapping("/recent")
    public List<PostDto> readRecentPosts() {
        log.info("reading recent posts");

        return postService.readRecentPosts();
    }

    @GetMapping("/recent/{id}")
    public PostDto readRecentPostById(@PathVariable("id") Long postId) {
        // TODO: finish implementation
        // Read Post by id from database
        // Convert Post int o PostDTO
        // return to user

        return new PostDto(
                1L,
                "My post",
                "My content",
                "Just me",
                "1998",
                "1988"
        );
    }

    @PostMapping()
    public PostDto createNewPost(@RequestBody PostDto postDto) {
        log.info("Trying to store new post: [{}]", postDto);
        return postService.createNewPost(postDto);
    }
}
