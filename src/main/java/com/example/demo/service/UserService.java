package com.example.demo.service;

import com.example.demo.modal.UpdateUser;
import com.example.demo.modal.User;
import com.example.demo.modal.UserResponse;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    public UserResponse getUserDetails(String userId);

    public UserResponse updateUser(String userId, UpdateUser updateUser);
    public String deleteUser(String userId);

 public    User getUser(String userId);

  public String  getDateOfBirth();
}
