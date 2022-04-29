package com.pension;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;
	
	public void savePost(Post post) {
		postRepository.save(post);
	}

	Optional<Post> getPost(int postId) {
		return postRepository.findById(postId);
	}
	
	
}
