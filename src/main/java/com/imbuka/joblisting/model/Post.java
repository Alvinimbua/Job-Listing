package com.imbuka.joblisting.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@ToString
@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;
}
