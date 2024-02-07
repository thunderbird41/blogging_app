package com.example.bloggingapp.Users;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter(AccessLevel.NONE)
public class CreateUserDTO {
    private String username;
    private String password;
    private String email;
}
