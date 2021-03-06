package com.nsg.boardingfinder.Response.AuthResponse;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private long id;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("role")
    private String role;
    @SerializedName("avatar")
    private String avatar;

    public User() {
    }

    public User(long id, String name, String email, String role, String avatar) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.avatar = avatar;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
