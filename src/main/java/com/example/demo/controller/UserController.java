package com.example.demo.controller;

import com.example.demo.modal.UpdateUser;
import com.example.demo.modal.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(path = "/users")

public class UserController {


        @Autowired
        private UserService userService;
        @PostMapping(path = "/user-new")
        public ResponseEntity<User> createUser(@RequestBody User user){
            return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
        }

        @GetMapping(path = "/{userId}")
        public ResponseEntity<User> getUser(@PathVariable("userId") String userId){
            return new ResponseEntity<User>(userService.getUser(userId), HttpStatus.OK);
        }

        @GetMapping("/user")
        public ResponseEntity<List<User>> getAllUsers(){
            return new ResponseEntity<List<User>>(userService.getUser(), HttpStatus.OK);
        }

        @DeleteMapping(path="/{userId}")
        public ResponseEntity<String> deleteUser(@PathVariable("userId") String userId) {
            return new ResponseEntity<>(userService.deleteUser(userId), HttpStatus.OK);
        }

        @PutMapping(path="/{userId}")
        public ResponseEntity<User> updateUserDetails(@PathVariable("userId") String userId,  @RequestBody UpdateUser user) {
            return new ResponseEntity<User>((MultiValueMap<String, String>) userService.updateUser(userId,user), HttpStatus.OK);
        }

    }


}
