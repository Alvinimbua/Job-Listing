package com.imbuka.joblisting.repository;

import com.imbuka.joblisting.model.Post;

import java.util.List;


public interface SearchRepository {

    List<Post> findByText(String Text);
}
