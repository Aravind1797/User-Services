package com.example.demo.modal;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class UpdateUser {
        private String firstName;
        private String middleName;
        private String lastName;
        private String phoneNumber;
        private LocalDate dateOfBirth;
        private String gender;
        private String maritalStatus;
        private String employeeNumber;
        private String bloodGroup;
        private String email;
        private String password;
    }


