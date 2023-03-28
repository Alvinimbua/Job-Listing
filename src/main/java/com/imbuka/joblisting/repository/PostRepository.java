package com.imbuka.joblisting.repository;

import com.imbuka.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

}
