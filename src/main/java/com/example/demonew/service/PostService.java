package com.example.demonew.service;

import com.example.demonew.model.Post;
import com.example.demonew.model.User;

import java.util.List;

public interface PostService {

    Post createPost(Long id, String body);

    List<Post> getAllPost();
}
