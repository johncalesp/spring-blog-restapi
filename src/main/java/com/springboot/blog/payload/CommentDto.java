package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    // name should not be null
    @NotEmpty(message="Name should not be empty")
    private String name;
    // email should not be empty
    // email field validation
    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Enter valid email address")
    private String email;

    // body should not be empty
    // body must be minimum 10 characters
    @NotEmpty(message = "Body should not be empty")
    @Size(min=10,message = "Body must be minimum 10 characters")
    private String body;
}
