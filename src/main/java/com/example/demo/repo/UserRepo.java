package com.example.demo.repo;


import com.example.demo.modal.User;
import com.example.demo.modal.UserResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository <User, String> {

    UserResponse findByUser(String userId);


    User findByuserId(String userId);
}
