package com.pessoal.library.entities.DTO;

import com.pessoal.library.enums.UserType;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private UserType type;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, UserType type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}
