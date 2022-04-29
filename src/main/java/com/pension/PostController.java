package com.pension;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class PostController {

	@Autowired
	PostService postService;
	
	@PostMapping
	void addPost(@RequestBody Post post) {
		System.out.println(post.getContent());
		postService.savePost(post);
	}
	
	@GetMapping("/{postId}")
	Optional<Post> getPostById(@PathVariable int postId) {
		System.out.println(postId);
		return postService.getPost(postId);
	}
}
