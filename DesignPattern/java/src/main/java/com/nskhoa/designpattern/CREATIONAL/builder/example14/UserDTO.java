package com.nskhoa.designpattern.CREATIONAL.builder.example14;

import java.util.List;
import java.util.ArrayList;

public class UserDTO {
    private final Long id;         // Bắt buộc
    private final String name;     // Bắt buộc
    private String email;          // Tùy chọn
    private List<String> roles = new ArrayList<>();  // Tùy chọn

    private UserDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.roles = builder.roles;
    }

    public static class Builder {
        private final Long id;
        private final String name;
        private String email;
        private List<String> roles = new ArrayList<>();

        public Builder(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder role(String role) {
            roles.add(role);
            return this;
        }

        public UserDTO build() {
            return new UserDTO(this);
        }
    }

    // Getters...
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public static void main(String[] args) {
        // Sử dụng trong Spring Boot controller:
        UserDTO user = new UserDTO.Builder(1L, "John Doe")
                .email("john@example.com")
                .role("ADMIN")
                .role("USER")
                .build();

        System.out.println("User ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Roles: " + String.join(", ", user.getRoles()));
    }
}

